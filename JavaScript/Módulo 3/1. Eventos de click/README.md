# Eventos de click e hover
Quanto aos eventos de clicks, podemos realizá-los de duas maneiras diferentes!

Usando JavaScript, ou usando CSS 😉

## Exemplo de utilização:

Aqui, apenas foi criado uma função para que seja trocado o

**Exemplo de função criada no arquivo `JS`**

```javascript
function mudaTexto(){
    document.getElementById('title').innerHTML = 'Hello World!'
}
```

**Chamada da função no arquivo `HTML`**

```html
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body> <!--Basta utilizar o atributo onclick e realizar a chamada da função! -->
    <h1 id="title" onclick="mudaTexto()">Olá mundo!</h1>
</body>
</html>
```

Também é possível utilizar do atributo `onmouseover`, que basicamente irá executar uma ação quando passarmos o mouse encima da tag, podemos replicar esse efeito tanto em `javascript` como no `css` !

## Exemplo com Java Script

```html
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body> <!--Basta utilizar o atributo onmouseover e realizar a chamada da função! -->
    <h1 id="title" onmouseover="mudaTexto()">Olá mundo!</h1>
</body>
</html>
```

## Exemplo com CSS (Trocando a cor do texto pq não dei conta de substuir o texto com css 🥲)
**HTML:**
```html
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body> 
    <h1>Olá mundo!</h1>
</body>
</html>
```
**CSS**
```css
h1:hover{
    color: #f00; /*Trocando a cor para vermelho :D*/
}
```