const chalk = require('chalk')

const nota = 8

nota >= 7 ? console.log(chalk.bgGreen.white(`Parabéns! Você está aprovado, nota: ${nota}`)) : console.log(chalk.bgRed.white('Você precisa fazer a prova de recuperação!'))