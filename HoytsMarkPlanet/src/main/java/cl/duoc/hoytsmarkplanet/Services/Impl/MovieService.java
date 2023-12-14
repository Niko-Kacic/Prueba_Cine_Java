package cl.duoc.hoytsmarkplanet.Services.Impl;

import cl.duoc.hoytsmarkplanet.DAO.ConexionDB;
import cl.duoc.hoytsmarkplanet.DTO.MovieDTO;
import cl.duoc.hoytsmarkplanet.Services.IMovie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MovieService implements IMovie {

    @Override
    public void agregarPelicula(MovieDTO pelicula) {
        String query = "INSERT INTO movie (titulo, director, anno, duracion, genero) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = ConexionDB.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pelicula.getTitulo());
            statement.setString(2, pelicula.getDirector());
            statement.setInt(3, pelicula.getAnno());
            statement.setInt(4, pelicula.getDuracion());
            statement.setString(5, pelicula.getGenero());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }

    @Override
    public boolean modificarPelicula(MovieDTO pelicula) {
        try (Connection connection = ConexionDB.getConnection()) {
            String query = "UPDATE movie SET titulo=?, director=?, anno=?, duracion=?, genero=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, pelicula.getTitulo());
            statement.setString(2, pelicula.getDirector());
            statement.setInt(3, pelicula.getAnno());
            statement.setInt(4, pelicula.getDuracion());
            statement.setString(5, pelicula.getGenero());
            statement.setInt(6, pelicula.getId());

            int rowsUpdated = statement.executeUpdate();

            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        return false;
        }
    }

    @Override
    public void eliminarPelicula(int id) {
        try (Connection connection = ConexionDB.getConnection()) {
            String query = "DELETE FROM movie WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "La película con ID: " + id + " se ha eliminado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La película con ID: " + id + " no existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<MovieDTO> filtrarPeliculas(String genero, int annoInicio, int annoFin) {
        List<MovieDTO> listaFiltrada = new ArrayList<>();
        String query = "SELECT * FROM movie WHERE genero = ? AND anno BETWEEN ? AND ?";

        try (Connection connection = ConexionDB.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, genero);
            statement.setInt(2, annoInicio);
            statement.setInt(3, annoFin);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                MovieDTO movie = new MovieDTO();
                movie.setId(resultSet.getInt("id"));
                movie.setTitulo(resultSet.getString("titulo"));
                movie.setDirector(resultSet.getString("director"));
                movie.setAnno(resultSet.getInt("anno"));
                movie.setDuracion(resultSet.getInt("duracion"));
                movie.setGenero(resultSet.getString("genero"));
                listaFiltrada.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();        
        }
        return listaFiltrada;
    }

    @Override
    public MovieDTO buscarPeliculaPorTitulo(String titulo) {
        try (Connection connection = ConexionDB.getConnection()) {
            String query = "SELECT * FROM movie WHERE titulo = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, titulo);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                MovieDTO peliculaEncontrada = new MovieDTO();
                peliculaEncontrada.setId(resultSet.getInt("id"));
                peliculaEncontrada.setTitulo(resultSet.getString("titulo"));
                peliculaEncontrada.setDirector(resultSet.getString("director"));
                peliculaEncontrada.setAnno(resultSet.getInt("anno"));
                peliculaEncontrada.setDuracion(resultSet.getInt("duracion"));
                peliculaEncontrada.setGenero(resultSet.getString("genero"));
                
                return peliculaEncontrada; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
    }
    
    public List<MovieDTO> obtenerTodasLasPeliculas() {
    List<MovieDTO> listaPeliculas = new ArrayList<>();
    String query = "SELECT * FROM movie";

    try (Connection connection = ConexionDB.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            MovieDTO movie = new MovieDTO();
            movie.setId(resultSet.getInt("id"));
            movie.setTitulo(resultSet.getString("titulo"));
            movie.setDirector(resultSet.getString("director"));
            movie.setAnno(resultSet.getInt("anno"));
            movie.setDuracion(resultSet.getInt("duracion"));
            movie.setGenero(resultSet.getString("genero"));
            listaPeliculas.add(movie);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return listaPeliculas;
}

}

    
