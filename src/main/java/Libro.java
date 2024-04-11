public class Libro implements Comparable<Libro>{
    String titulo;

    int paginas;
    public Libro (String t, int n){
        titulo = t;
        paginas = n;
    }
    public String getTitulo(){
        return titulo;
    }
    // -1 si el libro es menor a l
    // 0 si son iguales
    // 1 si el libro es mayor a l
    @Override
    public int compareTo(Libro l) {
        if (paginas < l.paginas) {
            return -1;
        }
        if (paginas > l.paginas) {
            return 1;
        }
        return 0;
    }
}