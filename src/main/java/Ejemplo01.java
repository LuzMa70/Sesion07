import java.util.PriorityQueue;
import java.util.Queue;

public class Ejemplo01 {
    public static void main(String[] args) {
        Queue<String>cola =new PriorityQueue<>();

        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");

        String valor = null;

        while ((valor  = cola.poll()) !=null){
        System.out.println(valor);
        }

        Queue<Integer> colaI = new PriorityQueue<>();
        colaI.add(5);
        colaI.add(3);
        colaI.add(1);

        Integer i = null;
        while ((i  = colaI.poll()) !=null) {
            System.out.println(i);
        }
    }
}
