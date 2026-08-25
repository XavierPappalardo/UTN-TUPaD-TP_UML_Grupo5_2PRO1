package Entidades;

public abstract class ObjetoArte {

    //Atributos

    protected int idObjeto;

    protected String titulo;

    protected String descripcion;

    protected int anioCreacion;

    protected String pais;

    protected String cultura;

    protected String epoca;

    protected Artista creador;

    //Getters

    public String getTitulo() {
        return titulo;
    }


    //Constructor

    public ObjetoArte(int idObjeto, String titulo, Artista creador) {
            this.idObjeto = idObjeto;
            this.titulo = titulo;
            this.creador = creador;
    }

}
