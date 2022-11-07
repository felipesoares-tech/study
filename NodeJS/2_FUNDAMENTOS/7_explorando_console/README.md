# Explorando o console
- Temos uma grande variedade de métodos no **console**, como o `console.log`;
- Podemos **imprimir mais de uma variável** por vez;
- Inserir **variáveis entre strings**;
- Há um método para limpar as mensagens de console;

## Código Exemplo:
```JS
//mais de um valor
const x = 10
const y = 'texto'
const z = [1,2]

console.log(x,y,z) //Imprimindo tudod e uma vez só

//contagem de impressões
console.count(`O valor de x é: ${x}, contagem`)
console.count(`O valor de x é: ${x}, contagem`)
console.count(`O valor de x é: ${x}, contagem`)
console.count(`O valor de x é: ${x}, contagem`)

// variavel entre string
console.log('O nome é %s',y)

// limpar o console
setTimeout(() =>{
    console.clear()
}, 2000)
```