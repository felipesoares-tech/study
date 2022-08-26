let nome = 'Felipe', sobrenome = 'Soares'

//let nomeCompleto = nome + ' ' + sobrenome //este seria a forma de fazer sem o template string
let nomeCompleto = `${nome} ${sobrenome} Santana`
console.log('Nome: '+ nomeCompleto)

let idade = 22

let idadeString = `Idade: ${idade+1} anos` //exemplo com expressões imbutidas
console.log(idadeString)