# Como conectar arquivo .js ao html
## Exemplos
### **Conectando arquivos no mesmo diretório**
Para isso, é necessário criar uma tag script, e no atributo "src" especificar onde o arquivo se encontra

Exemplo:

```html
<script src="script.js"></script>
```
### **Conectando arquivos no diretório superior**
Digitando "../" automaticamente o editor irá listar os arquivos que estão no diretório superior 
```html
<script src="../script.js"></script>
```
Obs: ao pressionar **CTRL + ESPAÇO** será listado todos os arquivos contidos no diretório atual, outro fato é que por boa prática, sempre deixar a tag `<script>` dentro do `<body>` , pois dessa forma o script será carregado por ultimo dentro de um site