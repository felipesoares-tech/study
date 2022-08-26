# Template string
Template Strings são strings que permitem expressões embutidas. Você pode utilizar string multi-linhas e interpolação de string com elas. Basicamente é uma nova forma de criar strings e tornar o seu código um pouco mais legível
<br>
Exemplo:

```javascript
let nome = 'Felipe', sobrenome = 'Soares'

//let nomeCompleto = nome + ' ' + sobrenome //este seria a forma de fazer sem o template string
let nomeCompleto = `${nome} ${sobrenome} Santana`
console.log('Nome: '+ nomeCompleto)

let idade = 22

let idadeString = `Idade: ${idade+1} anos` //exemplo com expressões imbutidas
console.log(idadeString)
```