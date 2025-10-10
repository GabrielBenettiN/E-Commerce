<%-- 
    Document   : Login
    Created on : 10 de out. de 2025, 17:17:33
    Author     : GABRIELBENETTINOGUEI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página de Login</title>
</head>
<body>

    <h2>Login</h2>

    <form action="/login" method="POST">
        <div>
            <label for="username">Usuário:</label>
            <input type="text" id="username" name="username" placeholder="Digite seu usuário" required>
        </div>

        <div>
            <label for="password">Senha:</label>
            <input type="password" id="password" name="password" placeholder="Digite sua senha" required>
        </div>

        <div>
            <button type="submit">Entrar</button>
        </div>
    </form>

    <div>
        <a href="#">Esqueceu a senha?</a>
    </div>

</body>
</html>
