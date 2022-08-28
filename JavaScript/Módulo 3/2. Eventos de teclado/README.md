# Eventos de teclado ⌨️
Quanto aos eventos de teclado, temos os 3 principais que são:
- `onkeyup`
- `onkeydown`
- `onkeypress`

De forma bem resumida, com cada um desses três atributos conseguimos monitorar oque foi digitado pelo usuário!

> A diferença primordial entre eles é relacionado a quando os eventos são disparados. O `onkeydown` é disparado assim que a tecla é pressionada, sendo assim o primeiro entre os eventos a ser disparado. Em seguida é a vez do `onkeypress` e por último, quando a tecla é solta, o evento `onkeyup` é executado.

| EVENTO | ORDEM DE DISPARO	| CARACTRERES ASCII | TECLAS NÃO-ASCII |TECLA MANTIDA PRESSIONADA
| ----------- | ----------- | ----------- | ----------- | ----------- |
| onkeydown | 1 | Sim | Sim | N ocorrências
| onkeypress | 2 | Sim | Não | N ocorrências
| onkeyup | 3 | Sim | Sim | 1 ocorrência

**HTML**
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <h1 id="title">Seja bem vindo!!</h1>
    <input onkeyup="digitou(event)" id="campo" type="text" name="usuario" placeholder="Nome do usuário">
    <script src="script/script.js"></script>
</body>
</html>
```
**JavaScript**
```javascript
function digitou(e){
    if(e.keyCode == 13){ //keyCode == 13, seria o código de que quando o usuário aperta o "enter"
        let texto = document.getElementById("campo").value;
        console.log(texto)
    }
}
```
>Quanto ao código acima, estamos armazendando os dados que o usuário digitou após apertar a tecla "enter" , onde utilizamos do atributo `onkeyup` e realizamos a chamada da função passando o `event` como parâmetro.
