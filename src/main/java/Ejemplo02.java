import java.util.*;

public class Ejemplo02 {
    public static void main(String[] args) {
        Queue<Libro> colaL = new PriorityQueue<>();

        Libro l1 = new Libro("uno", 100);
        Libro l2 = new Libro("dos", 76);
        Libro l3 = new Libro("tres", 600);

        colaL.add(l1);
        colaL.add(l2);
        colaL.add(l3);

        Libro l = null;

        while ((l = colaL.poll()) != null){

            System.out.println(l.getTitulo());
        }

        List<Libro> ListaL = new LinkedList<>();

        ListaL.add(l1);
        ListaL.add(l2);
        ListaL.add(l3);
        System.out.println("------------");

        //for (Libro libro : ListaL) {
          //  System.out.println(libro.getTitulo());

            Collections.sort(ListaL);
            System.out.println("------------");

            for (Libro libro : ListaL) {
                System.out.println(libro.getTitulo());
            }
        }
}
