# Lendo entrada de dados
- Podemos ler dados do usuário com o módulo **readline**, um Core Module;
- Neste caso utilizamos o método **question**, que faz uma pergunta a ser respondida pelo usuário;
- Depois podemos **processar a resposta** e entregar um retorno;

## Código Exemplo
```JS
const readLine = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout,
})

readLine.question('Qual a sua linguagem preferida? ', (language) =>{

    if(language == 'Python')
        console.log('Essa é toppp')
    else
        console.log(`A minha linguagem preferida é: ${language}`)

    readLine.close()
})

```