import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nodo nodoCasa = new Nodo("Casa");
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        Nodo nodoE = new Nodo("E");
        Nodo nodoUfficio = new Nodo("Ufficio");

        nodoCasa.link(nodoA, 2);
        nodoCasa.link(nodoD, 8);

        nodoA.link(nodoC, 2);
        nodoA.link(nodoB, 6);

        nodoD.link(nodoC,2);
        nodoD.link(nodoE, 3);

        nodoC.link(nodoD,2);
        nodoC.link(nodoE,9);

        nodoB.link(nodoUfficio,5);

        nodoE.link(nodoUfficio,1);

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.shortestPath(nodoCasa);

        System.out.println("Percorso più breve dalla casa all'ufficio: ");
        System.out.println(nodoUfficio.percorso());
        System.out.println("Costo totale: " + nodoUfficio.getPeso());
    }
}