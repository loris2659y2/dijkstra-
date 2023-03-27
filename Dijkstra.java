import java.util.*;

public class Dijkstra {

    Nodo nodoCorrente;
    int pesoTotale;
    private Nodo [] nodiCollegati = new Nodo[100];
    Nodo nodoMinore;
    public void shortestPath(Nodo partenza){
        partenza.setPeso(0);
        nodiCollegati = partenza.nodiCollegati;
        nodoCorrente = partenza;
        String percorso;
        int i=1;
        int j=1;

        System.out.println("Percorso piu breve: A-> " );
        nodoMinore = nodiCollegati[0];
        while(nodoCorrente.getLabel()!= "F"){
            j=0;
            //while(nodoCorrente.nodiCollegati[j]!=null){
                for(int y=1; y<nodoCorrente.nodiCollegati.length; y++){
                    if(nodoCorrente.nodiCollegati[y].getPeso()<nodoMinore.getPeso()){
                        nodoMinore=nodiCollegati[y];
                    }
                }
                j++;
                System.out.println(nodoCorrente.percorso());
                nodoCorrente = nodoMinore;
            //}

        }
    }
}
