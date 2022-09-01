import br.com.felipeltda.example.Pen;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen("BIC","Vermelha");

        pen.wirte();
        System.out.println("Cor da caneta: "+pen.checkColor());
        pen.uncappPen();
        pen.capPen();
        pen.wirte();
        System.out.println("Marca da caneta: "+pen.checkMark());

    }
}
