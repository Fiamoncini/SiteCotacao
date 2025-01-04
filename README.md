<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - Cotação de Dólar</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #3498db;
            color: white;
            padding: 20px;
            text-align: center;
        }
        .content {
            padding: 20px;
            max-width: 800px;
            margin: 0 auto;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #333;
        }
        pre {
            background-color: #f4f4f4;
            border-radius: 5px;
            padding: 10px;
            overflow-x: auto;
        }
        a {
            color: #3498db;
            text-decoration: none;
        }
        .cta-button {
            background-color: #2ecc71;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
            display: inline-block;
            margin-top: 20px;
        }
        .cta-button:hover {
            background-color: #27ae60;
        }
    </style>
</head>
<body>
    <header>
        <h1>Cotação de Dólar - Integração com API da CurrencyLayer</h1>
    </header>

    <div class="content">
        <h2>Descrição</h2>
        <p>Exibe a cotação do dólar (USD) em reais (BRL) utilizando a API da CurrencyLayer.</p>

        <h2>Funcionalidades</h2>
        <ul>
            <li>Exibição da cotação em tempo real.</li>
            <li>Facilidade para adicionar outras moedas.</li>
        </ul>

        <h2>Tecnologias</h2>
        <ul>
            <li>Java 17</li>
            <li>Spring Boot</li>
            <li>Thymeleaf</li>
            <li>CurrencyLayer API</li>
        </ul>

        <h2>Como Usar</h2>
        <pre><code>git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
mvn install
mvn spring-boot:run</code></pre>
        <p>Acesse <strong>http://localhost:8080/</strong> no navegador.</p>

        <h2>API CurrencyLayer</h2>
        <p>Obtenha uma chave de API e substitua na variável <strong>API_KEY</strong> no código-fonte.</p>

        <h2>Contribuindo</h2>
        <ul>
            <li>Faça um fork e crie uma branch.</li>
            <li>Commit suas mudanças e envie um pull request.</li>
        </ul>

        <h2>Licença</h2>
        <p>MIT</p>

        <a href="https://github.com/seu-usuario/nome-do-repositorio" class="cta-button">Visite o Repositório no GitHub</a>
    </div>
</body>
</html>
