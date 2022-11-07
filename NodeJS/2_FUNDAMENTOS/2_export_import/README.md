# Export e Import
- Com o Node.js também é possível utilizar o **export e import do ES6**;
- São funcionalidades mais modernas de **importação e exportação**;
- Com **mais recursos** do que as que vimos anteriormente;
- Para isso precisamos modificar os nossos arquivos para a extensão **.mjs**;
- E então podemos exportar uma com **export default**;
- E importar com **import**, uma única função, caso seja necessário;

## Módulo:
```JS
function soma(a,b){
    console.log(a+b)
}

export default soma
```

## Index:
```JS
import soma from './meu_modulo.mjs'

soma(2,3)
soma(6,6)
```