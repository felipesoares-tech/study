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