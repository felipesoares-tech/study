package br.com.felipeltda.example;

public class Pen {
    private boolean capped; //Recomendado sempre deixar todos os atributos da classe privado
    private final String color; // O "final" é como se fosse uma constante, um valor que não poderá ser alterado...
    private final String mark;

    public Pen(String mark, String color){ //Criado um construtor, onde será obrigatório no momento o qual for criar a caneta especificar, marca e cor!
        this.mark = mark; //atualizações dos atributos da classe para a marca
        this.color = color; //atualizações dos atributos da classe para cor
    }

    public void capPen(){ //Método publico, pois é um método da caneta
        if(!isCapped()){
            setCapped(true);
            System.out.println("Caneta tampada!");
            return;
        }
        System.out.println("A caneta ja esta tampada!");
    }

    public void uncappPen(){ //Método publico, pois é um método da caneta
        if(isCapped()){
            setCapped(false);
            System.out.println("Caneta destampada!");
            return;
        }
        System.out.println("A caneta ja esta destampada!");
    }

    public void wirte(){ //Método publico, pois é um método da caneta
        if(!isCapped())
            System.out.println("Estou escrevendo..");
        else
            System.out.println("Caneta esta tampada, nao posso escrever");
    }

    public String checkColor(){ //Método publico, pois é um método da caneta
        return getColor();
    }

    public String checkMark(){ //Método publico, pois é um método da caneta
        return  getMark();
    }
    /***********************************GETTERS/SETTERS************************************************/
    /*Neste exemplo, todos os getters e setters gerados estão em private, pois é interessante que eles sejam acessados somente através dos seus respectivos métodos
    Por exemplo, se eu deixou todos com public, dentro da minha "Main" eu consegueria usar algo como " pen.getColor() ", sendo que já temos um método específico para
    verificar a cor da caneta, que neste exemplo seria o pen.checkColor() .
     */
    private boolean isCapped() {  //Por padrão, sempre que um get é gerado para um atributo boolean, a palavra get é substituida por "is"
        return capped;
    }

    private void setCapped(boolean capped) {
        this.capped = capped;
    }

    private String getColor() {
        return color;
    }

    private String getMark() {
        return mark;
    }
}

