package cl.duoc.hoytsmarkplanet.DTO;

public class MovieDTO {
    
    private int id;
    private String titulo;
    private String director;
    private int anno;
    private int duracion;
    private String genero;

    public MovieDTO(int id, String titulo, String director, int anno, int duracion, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.anno = anno;
        this.duracion = duracion;
        this.genero = genero;
    }
    
    public MovieDTO() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
