import java.util.Map;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Agenda {
    public static void main(String[] args) {

        Map<String, Queue<Telefono>> agenda = new TreeMap<>();

        agenda.put("Carlos", new PriorityQueue<Telefono>());
        agenda.put("Beto", new PriorityQueue<Telefono>());
        agenda.put("Abigail", new PriorityQueue<Telefono>());
        agenda.put("César", new PriorityQueue<Telefono>());
        agenda.put("Mónica", new PriorityQueue<Telefono>());
        agenda.put("Fernando", new PriorityQueue<Telefono>());


        for (String nombre : agenda.keySet()) {
                Queue<Telefono> telefonos = agenda.get(nombre);

                System.out.print(nombre + ": ");

                Telefono tel = null;

                while ((tel = telefonos.poll()) != null){
                    System.out.print("\t" + tel.getNumero() + "\n");
                }
            }
       }
}
