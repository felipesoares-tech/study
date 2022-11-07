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