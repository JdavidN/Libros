public class Libro {
    private String titulo;
    private int copias;
    private String autor;
    protected int anio;
    private String edicion;
    private String edicionEspecial;
    private String coleccion;
    protected int aniocoleccion;

    //constructor por defecto
    public Libro() {
    }

    //Parametros
    public Libro(String titulo, int copias, String autor, int anio, String edicion,  String edicionEspecial String coleccion) {                                    
        this.titulo = titulo;
        this.copias = copias;
        this.autor = autor;
        this.anio = anio;
        this.edicion = edicion;
        this.edicionEspecial= edicionEspecial
        this.coleccion = coleccion
        this.aniocoleccion = aniocoleccion;
    }


    //Metodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEdicionEspecial() {
        return edicionEspecial;
    }

    public void setEdicionEspecial(String edicionEspecial) {
        this.edicionEspecial = edicionEspecial;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public int getNumColeccion() {
        return numcoleccion;
    }

    public void setnumcoleccion(int numcoleccion) {
        this.numcoleccion = numcoleccion;
    }

    //método para realizar edicion especial
    public boolean edicion() {
      boolean edicion = true;
        if (copias < 100) 
        {
            edicion = edicionEspecial
        } 
        else {
           edicion = false;
        }
        return edicion;
    }

    //método para saber si es de coleccion
    public boolean coleccion() {
      boolean coleccion = true;
        //if (prestados == 0) {
          //  devuelto = false;
        //} else {
          //  prestados--;
       // }
       // return devuelto;
    //}

    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nanio: " + anio + "\nedicion: " + edicion + "\ncoleccion: " + coleccion;                                    
    }
   
}//Fin de la clase Fraccion