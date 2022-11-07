# Módulos externos
- Os módulos externos podem ser instalados via **npm**;
- Para isso precisamos inicalizar o npm no projeto, com: **npm init**;
- A partir daí os módulos ficam mapeados e podemos instalar módulos;
- Que são salvos na pasta **node_modules**;
- Podemos instalar módulos com **npm instal -nome-**;

### Primeiro deveremos iniciar o npm na pasta do nosso projeto
```bash
$ npm init
```
>Após isto, serão realizados algumas perguntas sobre o projeto em si

### Instalação do minimist
```bash
$ npm install minimist
```
> O Minimist é um módulo para leitura de argumentos via CLI

> Outro detalhe interessante, é que todos os pacotes que forem isntalados pelo npm, serão colocados no nosso arquivo "package.json" em "dependências", sempre que formos instalar em outro lugar o package.json irá ler as dependências e instalar todas as que estiverem listada por lá

## Código Exemplo
```JS
const minimist = require('minimist') //Usando o require para trazer o módulo

const args = minimist(process.argv.slice(2)) //utilizando o process.argv.slice para pegar o terceiro argumento

console.log(args)

const nome = args['nome']
const profissao = args['profissao']

console.log(nome, profissao)

console.log(`Meu nome é ${nome} e a minha profissão é ${profissao}`)
```

## Execução:
```bash
$ node index.js --nome=Felipe --profissao=Programador
```