# Tipos de variáveis
No JavaScript, temos basicamente 3 tipos de variáveis, `let`,`var` e `const`.
## Var
No tipo `var`, o escopo abrangente é global, logo caso eu queria acessar essa minha variável dentro de outros escopos, como por exemplo dentro de uma função, então eu usaria o tipo `var`.<br><br>
Exemplo:<br>
```javascript
var contador = 1
```
## Const
No tipo `const`, a variável não poderá sofrer nenhum tipo de alteração em seu valor, então para situações onde queremos que o valor não seja alterado, iremos utilizar o tipo const.<br><br>
Exemplo:<br>
```javascript
const cpf = 02187354644
```
## Let
No tipo `let`, o escopo abrangente é o local, logo consigo acessa-la somente estando em seu escopo .<br><br>
Exemplo:<br>
```javascript
let x = 30
```
*Obs: Outro detalhe importante, é sobre a utilização do ponto e vírgula, no JavaScript o ponto e vírgula não é obrigatório.*