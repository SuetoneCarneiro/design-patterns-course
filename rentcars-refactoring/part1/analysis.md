# Classe Cliente

Ainda no enunciado, é possível perceber que o princípio de single responsability é quebrado.
A classe cliente deveria ser responsável apenas por guardar os atributos do cliente, mas aqui
ela é utilizada para guardar a lógica de desconto, as locações e emitir o extrato de aluguéis.

A lógica do extrato está na classe Cliente e a lógica de pontos está dentro do método de gerar extrato

A classe cliente guarda também uma lógica de desconto.

# Perguntas
### 1) O sistema está pronto quando uma nova classificação de carro for adicionada? (exemplo: premium)

NÃO. Apenas adicionar uma nova classificação de carro não resolverá os diversos problemas do sistema.
Além disso, com uma nova classificação, seria necessário criar uma nova lógica de pontuação na classe cliente

### 2) E quando houver reajuste de preço? O código está pronto para executar facilmente um novo esquema de pontos de alugador frequente?

NÃO. Um novo esquema de pontos requer criação manual da lógica dentro da classe cliente.
