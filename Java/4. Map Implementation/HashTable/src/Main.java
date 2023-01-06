import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos",21);
        estudantes.put("Felipe",23);
        estudantes.put("Elisa",19);
        estudantes.put("Jhom",20);

        System.out.println(estudantes);

        estudantes.put("Pedro",28);

        System.out.println(estudantes);

        //Remove um estudante no indice 0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        //Recupera um estudante no indice 2
        int idadeEstudante = estudantes.get("Jhom");

        System.out.println(idadeEstudante);

    }
}