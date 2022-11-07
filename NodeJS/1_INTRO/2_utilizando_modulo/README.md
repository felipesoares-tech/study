# Utilizando Módulo

- Importaremos um módulo do Node: o **File System**;
- Este módulo serve para trabalhar com diretórios, arquivos e etc;
- E ele é um **Core Module**, ou seja, não é necessário instalar;


## Código Exemplo:
```JS
const fs = require('fs') // utilizamos o require para importar o módulo

/*utilizando o método "readFile" que lê um arquivo de texto, e passamos como parâmetro o caminho do arquivo, o tipo de codificação, ultimo argumento passamos uma arrow function para receber o retorno, que pode ser um erro ou os dados que precisamos */
fs.readFile('arqv.txt', 'utf8', (err,data) =>{
    if(err)
        console.log(err)
    
    console.log(data)
})
```