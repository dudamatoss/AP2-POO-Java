# AP2-POO-Java


🚀 Funcionalidades

Cadastrar um novo carro (POST)

Listar todos os carros (GET)

Consultar um carro por ID (GET)

Atualizar um carro existente (PUT)

Remover um carro (DELETE)


📝 Rotas da API

GET /carros - Retorna todos os carros cadastrados.

GET /carros/{id} - Retorna o carro pelo ID.

POST /carros - Adiciona um novo carro.

PUT /carros/{id} - Atualiza um carro existente.

DELETE /carros/{id} - Remove um carro pelo ID.


⚡ Como Executar o Projeto

Clone o repositório e abra o projeto em sua IDE (IntelliJ, Eclipse, etc.).

Certifique-se de ter o Java e o Spring Boot configurados corretamente.

Execute o projeto (diretamente pela IDE).

A API estará disponível em http://localhost:8085/carros.

🚀 Testando com Postman

Aplique o JSON nas requisições que forem necessárias(POST, PUT).
 ```
  EXEMPLO:
{
  "id": 1,
  "modelo": "Corolla",
  "marca": "Toyota",
  "ano": 2023
}
 ```
Realize requisições de acordo com as rotas descritas.



📌 Observações

A API é apenas uma simulação e não utiliza banco de dados, apenas uma lista local (List).

Os dados são reiniciados a cada execução do projeto.

