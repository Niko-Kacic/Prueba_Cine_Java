package cl.duoc.hoytsmarkplanet.Services;

import cl.duoc.hoytsmarkplanet.DTO.MovieDTO;
import java.util.List;

public interface IMovie {
    
    void agregarPelicula(MovieDTO pelicula);
    boolean modificarPelicula(MovieDTO pelicula);
    MovieDTO buscarPeliculaPorTitulo(String titulo);
    void eliminarPelicula(int id);
    List<MovieDTO> filtrarPeliculas(String genero, int annoInicio, int annoFin);
    public List<MovieDTO> obtenerTodasLasPeliculas();
}
