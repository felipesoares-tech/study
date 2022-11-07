# Ler argumentos
- O Node permite o **envio de argumentos via CLI**;
- Passamos eles após a intrução de execução do arquivo;
- Os argumentos ficam em um array chamado: **process.argv**
- Onde podemos **fazer um loop e resgatar os valores** enviados;

## Código Exemplo:
```JS
console.log(process.argv) /*Primeiro argumento por padrão é o caminho de instalação do nodeJS, o segundo é o caminho que leva ao arquivo o qual está sendo executado, e o terceiro serão os argumentos que o usuário passar */

const args = process.argv.slice(2) //Busca o terceiro indice dos argumentos

console.log(args) // Mostrando o terceiro argumento!
/* usando o método split para obter todos os caracteres após o sinal de = 
*/
const nome = args[0].split('=')[1] 
const idade = args[1].split('=')[1]

console.log(`Meu nome é ${nome} e tenho ${idade} anos`) //Exibindo nome e idade que foram passados via CLI
```
## Como executar:
```bash
$ node index.js nome=Felipe idade=23
```