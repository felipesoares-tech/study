import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>(); //Menos performático em relação as modificações realizadas devido a forma de ordenação

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, remvendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String capital: treeCapitais){
            System.out.println(capital);
        }
    }
}