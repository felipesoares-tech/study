# Algo prático com argumentos
- Podemos **utilizar os argumentos recebidos** para aplicar no nosso programa alguma lógica;
- Basta **encapsular em variáveis** e depois utilizá-los;
- Ou seja, podemos a partir do terminal, **executar também uma função de um módulo interno nosso**, por exemplo;

### Primeiro deveremos iniciar o npm na pasta do nosso projeto
```bash
$ npm init
```

### Instalação do minimist
```bash
$ npm install minimist
```

## Código Exemplo:
```JS
const minimist = require('minimist')

//externo
const args = minimist(process.argv.slice(2)) /*Capturando terceiro argumentosm, que serão informados pelo usuário */

//interno
const soma = require('./soma').soma //Trazendo o método soma

/* Utilização do parseInt para transformar os resultados de string para inteiro! */
const a = parseInt(args['a']) 
const b = parseInt(args['b'])

soma(a, b)
```