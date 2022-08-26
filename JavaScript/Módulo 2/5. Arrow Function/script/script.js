/*function somar(a,b){
    return a+b
}*/

/*const somar = (a, b) => { ---> essa forma é para mais de uma instrução
    return a + b
} */
const somar = (a, b) => a + b //para menos que uma instrução não precisamos do return nem das chaves

//() =>{}     ---> Isso é uma arrow function

console.log(somar(10, 5))

const sobreNome = sob => 'Felipe ' + sob
console.log(sobreNome('Soares'))