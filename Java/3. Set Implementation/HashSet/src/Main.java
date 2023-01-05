import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        //Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(3.5);
        notasAlunos.add(1.8);
        notasAlunos.add(13.2);

        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        //Remove a nota do set
        notasAlunos.remove(5.8);

        System.out.println(notasAlunos);

        //Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        // Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        //Navegando usando iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Navegando usando for
        for(Double nota: notasAlunos){
            System.out.println(nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos);

        System.out.println(notasAlunos.isEmpty());

    }
}