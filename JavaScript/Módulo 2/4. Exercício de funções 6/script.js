function validar(user, pass) {
    if (user === 'felipe' && pass === 123)
        return true
    else
        return false
}

let usuario = 'felipe'
let senha = 1234

if (validar(usuario, senha))
    console.log('Acesso concedido!!')
else
    console.log('Acesso negado!!')