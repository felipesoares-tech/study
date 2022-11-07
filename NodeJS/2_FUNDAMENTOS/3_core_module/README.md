# Core Modules
- No node temos diversos **Core Modules**, que são os que vêm prontos para serem utilizados;
- Eles resolvem diversos problemas, como: **trabalhar com arquivos e diretórios, servir aplicações** e etc.
- **Precisamos importar** estes módulos no projeto para poder utilizar;

## Código Exemplo:
```JS
const path = require('path')

const extension = path.extname('arqv.php') //Método do módutlo path para verificar a extensão de um arquivo!

console.log(extension)
```