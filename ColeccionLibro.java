public class ColeccionLibro extends Libro
{

    //Constructor nulo
    public ColeccionLibro()
    {
    }

    //Constructor con parametros
    public ColeccionLibro (String titulo, String autor, int anio, String edicion, String coleccion)
    {
        setTitulo(titulo);
        setAutor(autor);
        setAnio(anio);
        setEdicion(edicion)
        setColeccion(coleccion)
        getNumColeccion(numcoleccion)
    }

    public String toString() 
    {   
        return getTitulo() + " del autor " + getAutor() + " publicada el año " + getAnio() + " de la " + getEdicion() + " coleccion N° " + getColeccion(); 
    }
}