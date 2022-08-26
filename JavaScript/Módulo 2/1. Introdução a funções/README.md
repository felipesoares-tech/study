# Funções
Quanto as funções, não é necessário definir o tipo de função, como `void` ,`boolean` , `int` etc.. basta  usar a palavra reservada `function` , e caso seja uma função que contenha algum parâmetro, também não será necessário usar `let` ou `var` em sua passagem de parâmetros, basta escrever o nome da variável.
<br><br>
Exemplo:

```javascript
function somar(n1, n2) { //Função com retorno
    return n1 + n2
}

function nomeCompleto(nome, sobrenome) { //Função sem retorno void
    console.log(`${nome} ${sobrenome}`)
}

function maiorIdade(idade) { //Função com retorno boolean
    if (idade >= 18)
        return true
    else
        return false
}

console.log('Resultado da soma: ' + somar(10, 15))
nomeCompleto('Felipe', 'Soares')

let idade = 14

if (maiorIdade(idade))
    console.log('Maior de idade')
else
    console.log('Menor de idade')
```
