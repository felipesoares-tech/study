# Condicionais e operadores `==` e `===`

## If e else
Quanto ao if e else, não houve nenhum tipo de mudança, irá continuar da mesma maneira que o C e o Java !
<br><br>
Exemplo:

```javascript
let idade = 18

if(idade > 17)
    console.log('Você é maior de idade') //if e else padrão, sem chaves tbm funcionam
else
    console.log('Você é menor de idade')
    
```
Com o operador ternário, também não houve mudanças !
<br><br>
Exemplo:

```javascript
idade > 17 ? console.log('Você é maior de idade'): console.log('Você é menor de idade')

```

## Operadores `==` e `===`
Quanto aos operadores, teremos uma diferença de restrição, onde o operador `==` é mais "liberal", e quando o utilizamos para diferenciar string de número, ele acaba fazendo com que os dados sejam "iguais".
<br><br>
Exemplo:

```javascript
let idade = "20"

if (idade == 20){ // o == é menos rigoroso, desde que os valores de strings e number sejam iguais a condição irá funcionar
    console.log(`Você tem ${idade} anos`)
}
```
<br>

Já o operador `===` é mais restrito ao tipo de dado, logo se tentarmos igualar uma string com um número a condicional não irá funcionar 
<br><br>
Exemplo:

```javascript
let idade = "20"

if (idade === 20){ // o == é mais rigoroso, logo a condição aqui seria falsa, e o console.log não seria executado
    console.log(`Você tem ${idade} anos`)
}
```