# Getters and Setters

**Getters** e **setters** são usados para proteger seus dados, especialmente na criação de classes.

>Para cada instância de variável, um método getter retorna seu valor, enquanto um método setter o define ou atualiza. Com isso em mente, getters e setters também são conhecidos como métodos de acesso e de modificação, respectivamente.

Quanto a deixar um getter/setter em private, irá depender muito do conexto e da aplicação, pois em alguns casos simples onde eles não precisam ser acessados por outras classes, pode ser que seja interessante deixa-los como **private**.

## Tabela dos modificadores de acesso

|                 | private | default    | protected | public |
| :---        |    :----:   |   :----: |          :----: |  :----: |
| mesma classe    | sim       | sim   | sim | sim |
| mesmo pacote    | não        | sim      | sim | sim |
| pacotes diferentes (subclasses) | não | não | sim | sim |
| pacotes diferentes (sem subclasses) | não | não | não | sim |

### Exemplo

```java
/***********************************GETTERS/SETTERS************************************************/
    /*Neste exemplo, todos os getters e setters gerados estão em private, pois é interessante que eles sejam acessados somente através dos seus respectivos métodos Por exemplo, se eu deixou todos com public, dentro da minha "Main" eu consegueria usar algo como " pen.getColor() ", sendo que já temos um método específico para verificar a cor da caneta, que neste exemplo seria o pen.checkColor() .
     */
    private boolean isCapped() {  //Obs: Por padrão, sempre que um get é gerado para um atributo boolean, a palavra get é substituida por "is".
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
```
### Exemplo dentro da main

![demonstrativo](https://cdn.discordapp.com/attachments/968606239409979462/1014952695485956176/unknown.png "imagem exibindo metodos")
