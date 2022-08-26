# Switch/Case
Quanto ao switch/case não houve nenhuma mudança, continua igual ao C
<br><br>
Exemplo:

```javascript
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
```