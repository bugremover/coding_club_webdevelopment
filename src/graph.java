import java.util.ArrayList;

public class graph {
    static class edge{
        int src;
        int des;
        edge(int s,int d){
            this.src=s;
            this.des=d;
        }
    }
    public static void creategraph(ArrayList<edge> graph1[]){
        for(int i=0;i<graph1.length;i++){
            graph1[i]=new ArrayList<edge>();
        }
        graph1[0].add(new edge(0,2));
        graph1[1].add(new edge(1,2));
        graph1[1].add(new edge(1,3));
        graph1[2].add(new edge(2,0));
        graph1[2].add(new edge(2,1));
        graph1[2].add(new edge(2,3));
        graph1[3].add(new edge(3,2));
        graph1[3].add(new edge(3,1));



    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph1[]=new ArrayList[v];
        creategraph(graph1);
        for(int i=0;i<graph1[2].size();i++){
            edge e=graph1[2].get(i);
            System.out.println(e.des+ " ");

        }
    }
    
}
