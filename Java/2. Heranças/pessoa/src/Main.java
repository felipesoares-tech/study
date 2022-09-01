import br.com.felipeltda.exemplos.*;

public class Main {
    public static void main(String[] args) {
        Professor professorOO = new Professor("Josimar",29);
        Professor professorPW = new Professor("Danilo",35);
        Pessoa pessoa = new Pessoa("Felipe",23);

        pessoa.andar();
        pessoa.falarIdade();
        pessoa.falarNome();

        professorOO.andar();
        professorOO.falarIdade();
        professorOO.falarNome();
        professorOO.darAula();

        professorPW.andar();
        professorPW.falarIdade();
        professorPW.falarNome();
        professorPW.darAula();

    }
}
