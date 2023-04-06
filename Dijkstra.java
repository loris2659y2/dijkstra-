import java.util.*;

public class Dijkstra {
    public void shortestPath(Nodo partenza){
        PriorityQueue<Nodo> coda = new PriorityQueue<Nodo>(Nodo::compareTo);
        Set<Nodo> codaVisistati = new HashSet<>();

        partenza.setPeso(0);
        coda.offer(partenza);

        while(!coda.isEmpty()){
            Nodo nodoCorrente = coda.poll();
            codaVisistati.add(nodoCorrente);

            int peso;
            for( Nodo n : nodoCorrente.getLinks().keySet() ) {
                peso = nodoCorrente.getLinks().get(n);
                int nuovopeso = nodoCorrente.getPeso() + peso;
                if (n.getPeso() > nuovopeso ) {
                    n.setPeso(nuovopeso);
                    n.setPrev(nodoCorrente);
                    coda.offer(n);
                }
            }
        }
    }
}
