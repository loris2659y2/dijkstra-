import java.util.TreeMap;

public class Nodo {

    private String label;
    private int peso = Integer.MAX_VALUE;
    private TreeMap<Nodo, Integer> links;
    private Nodo prev = null;
    private Nodo next;
    private int nNodi = 0;
    public Nodo [] nodiCollegati = new Nodo[100];

    public Nodo(String label, int peso){
        this.label=label;
        this.peso=peso;
    }

    public void aggiungiNodo(Nodo nuovo){
        //links.put(nuovo, peso);
        nodiCollegati[nNodi] = nuovo;
        nNodi ++;
    }

   /* public int peso(Nodo n){
        return peso+links.get(n);
    }*/

    public String percorso(){
        String path = new String();

        path = label + "->";
        return path;
    }

    public int compareTo(Nodo nodo){
        return Integer.compare(this.peso, nodo.getPeso());
    }

    public Nodo[] getNodiCollegati() {
        return nodiCollegati;
    }

    public String getLabel() {
        return label;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
