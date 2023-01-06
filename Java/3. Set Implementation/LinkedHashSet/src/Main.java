import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>(); //Linked mantém a ordem de inserção

        //Adiciona os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(15);
        sequenciaNumerica.add(23);

        System.out.println(sequenciaNumerica);

        // Remove o número do set
        sequenciaNumerica.remove(1);

        System.out.println(sequenciaNumerica);

        //Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }

        //Retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}