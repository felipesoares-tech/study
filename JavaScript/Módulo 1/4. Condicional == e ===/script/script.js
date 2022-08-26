let idade = 18


/*if(idade > 17)
    console.log('Você é maior de idade') //if e else padrão, sem chaves tbm funcionam
else
    console.log('Você é menor de idade')
    */

idade > 17 ? console.log('Você é maior de idade'): console.log('Você é menor de idade') //operador ternario

let idade2 = "20"

if (idade2 == 20){ // o == é menos rigoroso, desde que os valores de strings e number sejam iguais o operador irá funcionar
    console.log(`Você tem ${idade2} anos`)
}
if (idade2 === 20){ // o === é mais restritivo, precisa ser exatamente igual 
    console.log(`Você tem ${idade2} anos`)
}