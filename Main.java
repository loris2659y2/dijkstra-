public class Main {
    public static void main(String[] args) {
        Nodo nodoA = new Nodo("A", 2);
        Nodo nodoB = new Nodo("B",3);
        Nodo nodoC = new Nodo("C",4);
        Nodo nodoD = new Nodo("D",2);
        Nodo nodoE = new Nodo("E",1);
        Nodo nodoF = new Nodo("F",5);

        nodoA.aggiungiNodo(nodoB);
        nodoA.aggiungiNodo(nodoC);

        nodoB.aggiungiNodo(nodoC );
        nodoB.aggiungiNodo(nodoD);
        nodoB.aggiungiNodo(nodoE);

        nodoC.aggiungiNodo(nodoD);

        nodoD.aggiungiNodo(nodoE);
        nodoD.aggiungiNodo(nodoF);

        nodoE.aggiungiNodo(nodoF);

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.shortestPath(nodoA);

    }
}