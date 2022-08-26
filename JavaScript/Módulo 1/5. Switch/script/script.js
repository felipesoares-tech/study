let profession = 'policial'

console.log('Profissão: '+profession)

switch(profession){
    case 'fiscal':
        console.log('Sua camisa será VERDE')
        break;
    case 'bombeiro':
        console.log('Sua camisa será VERMELHA')
        break;
    case 'policial':
        console.log('Sua camisa será AZUL')
        break;
    default:
        console.log('Sua camisa será PRETA')
        break;
}