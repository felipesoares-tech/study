//console.log(process.argv)

const args = process.argv.slice(2) //Busca o terceiro indice dos argumentos

console.log(args)

const nome = args[0].split('=')[1]
const idade = args[1].split('=')[1]

console.log(nome,idade)

console.log(`Meu nome é ${nome} e tenho ${idade} anos`)