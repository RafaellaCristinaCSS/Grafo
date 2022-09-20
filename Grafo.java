import java.util.ArrayList;

public class Grafo<TIPO>{
    private ArrayList<Vertice<TIPO>> vertice;
    private ArrayList<Aresta<TIPO>> aresta;

    public Grafo(){
        this.vertice = new ArrayList<Vertice<TIPO>>();
        this.aresta = new ArrayList<Aresta<TIPO>>();
    }

    public void adicionar_verice(TIPO dado){
        Vertice<TIPO> vertice = new Vertice<TIPO>(dado); 
        this.vertice.add(vertice);
    }
    public void adicionar_aresta(double peso, TIPO dadoInicio, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
    }
    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for(int i = 0; i < this.vertice.size(); i++ ){
            if(this.vertice.get(i).getDado().equals(dado)){
                vertice = this.vertice.get(i);
                break;
            }
        }
        return vertice;
    } 
}