# Módulos internos
- Os **módulos internos** são criados nas pastas do nosso projeto;
- Precisamos **exportar** o módulo;
- Podemos utilizar a instrução **module.exports**;
- E importar onde precisamos utilizar;
- Para importar vamos utilizar a instrução **require**;

### Módulo:
```JS
module.exports = {
     soma(a, b){ //Não precisa usar o "function"
        console.log(a+b)
    },
}

```

### Index:
```JS
const meuModulo = require('./meu_modulo') /*não é necessário passar a extensão .js, e também é necessário utilizar o ./ para que o node entenda que este não é um core module, precisamos dizer que é um modulo interno*/

const soma = meuModulo.soma /*encapsulando função em uma variável para simplificar sintaxe*/

soma(2,3)
soma(5,10)
```