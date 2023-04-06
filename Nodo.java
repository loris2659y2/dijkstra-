import java.util.TreeMap;

public class Nodo implements Comparable<Nodo>{

    private String label;
    private int peso = Integer.MAX_VALUE;
    private TreeMap<Nodo, Integer> links;
    private Nodo prev = null;


    public Nodo(String label){
        this.label=label;
        links = new TreeMap<>((a,b) -> a.label.compareTo(b.label));
    }

    public void link(Nodo nuovo, int costo){
        links.put(nuovo, costo);
        nuovo.links.put(this, costo);
    }

    @Override
    public int compareTo(Nodo nodo){
        return Integer.compare(this.peso, nodo.getPeso());
    }

    public TreeMap<Nodo, Integer> getLinks() {
        return links;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int weightTo(Nodo n){
        return peso + links.get(n);
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public String percorso(){
        String peso = "";
        String out = "";

        if(this.peso<Integer.MAX_VALUE){
            peso+=this.peso;
        }else{
            peso="inf";
        }
        out = "(" + label + "-" + peso + ")";

        if(prev!=null){
            out= prev.percorso() + "-" + prev.links.get(this) + "->" + out;
        }
        return out;
    }


}
