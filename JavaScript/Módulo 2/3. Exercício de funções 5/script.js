/*
Calcule o preço do imóvel
- m2 = 3.000
- Se tiver 1 quarto, o m2 é 1x
- Se tiver 2 quartos, o m2 é 1.2x
- Se tiver 3 quartos, o m2 é 1.5x
*/

function calcularImovel(a, b) {
    let m2 = 3000
    switch (b) {
        case 1:
        default:
            return a * m2
            break;
        case 2:
            return a * (m2*1.2)
            break;
        case 3:
            return a * (m2*1.5)
            break;
    }
}
let metragem = 123
let quartos  = 2
console.log(`A casa custa R$ ${calcularImovel(metragem,quartos)}`)