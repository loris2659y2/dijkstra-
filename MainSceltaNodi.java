import java.util.Scanner;

public class MainSceltaNodi {

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

        System.out.println("Scegliere il nodo da cui si vuole partire: " +
                "\n1-> nodo casa" +
                "\n2-> nodo a" +
                "\n3->nodo b" +
                "\n4->nodo c" +
                "\n5->nodo d" +
                "\n6->nodo e" +
                "\n7->nodo ufficio");

        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        Nodo nodoPartenza = null;

        switch (num){
            case 1:
                nodoPartenza = nodoCasa;
                break;
            case 2:
                nodoPartenza = nodoA;
                break;
            case 3:
                nodoPartenza = nodoB;
                break;
            case 4:
                nodoPartenza = nodoC;
                break;
            case 5:
                nodoPartenza = nodoD;
                break;
            case 6:
                nodoPartenza = nodoE;
                break;
            case 7:
                nodoPartenza = nodoUfficio;
                break;
        }

        System.out.println("E quello a cui si vuole arrivare: " +
                "\n1-> nodo casa" +
                "\n2-> nodo a" +
                "\n3->nodo b" +
                "\n4->nodo c" +
                "\n5->nodo d" +
                "\n6->nodo e" +
                "\n7->nodo ufficio");

        num= input.nextInt();
        Nodo nodoDestinazione = null;

        switch (num){
            case 1:
                nodoDestinazione = nodoCasa;
                break;
            case 2:
                nodoDestinazione = nodoA;
                break;
            case 3:
                nodoDestinazione = nodoB;
                break;
            case 4:
                nodoDestinazione = nodoC;
                break;
            case 5:
                nodoDestinazione = nodoD;
                break;
            case 6:
                nodoDestinazione = nodoE;
                break;
            case 7:
                nodoDestinazione = nodoUfficio;
                break;
        }

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.shortestPath(nodoPartenza);

        System.out.println("Percorso più breve da " + nodoPartenza.getLabel() + " a " + nodoDestinazione.getLabel() + ":");
        System.out.println(nodoDestinazione.percorso());
        System.out.println("Costo totale: " + nodoDestinazione.getPeso());
    }
}
