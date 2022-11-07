# Melhorando a visualização
- Há um módulo externo chamado **chalk**;
- Ele pode deixar a **visualização do console** mais agradável;
- Fazendo com que seja possível expressa um **feedback com base em cores**;

### Primeiro deveremos iniciar o npm na pasta do nosso projeto
```bash
$ npm init
```

### Instalação do minimist
```bash
$ npm install chalk@4.1.2
```

## Código Exemplo:
```JS
const chalk = require('chalk')

const nota = 8

nota >= 7 ? console.log(chalk.bgGreen.white(`Parabéns! Você está aprovado, nota: ${nota}`)) : console.log(chalk.bgRed.white('Você precisa fazer a prova de recuperação!'))
```