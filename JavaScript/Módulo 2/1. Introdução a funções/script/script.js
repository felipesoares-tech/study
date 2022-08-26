function somar(n1, n2) { //Função com retorno
    return n1 + n2
}

function nomeCompleto(nome, sobrenome) { //Função sem retorno void
    console.log(`${nome} ${sobrenome}`)
}

function maiorIdade(idade) { //Função com retorno boolean
    if (idade >= 18)
        return true
    else
        return false
}

console.log('Resultado da soma: ' + somar(10, 15))
nomeCompleto('Felipe', 'Soares')

let idade = 14

if (maiorIdade(idade))
    console.log('Maior de idade')
else
    console.log('Menor de idade')