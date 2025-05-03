# exercicios-monitoria-java-fbuni-2025
Repositório com exercícios práticos em Java para cadeira de Técnicas de Programação (2025.1)

## Exercício 1 - Métodos Getter e Setters + Encapsulamento

Crie uma classe chamada `Produto` com os seguintes atributos privados:
- nome (String)
- preco (double)
- quantidade (int)

Implemente métodos públicos getter e setter para cada atributo, obedecendo as seguintes condições lógicas:
- O preço **nunca** pode ser negativo (caso seja, defina como zero no setter).
- A quantidade **não pode** ser negativa (caso seja, defina como zero no setter).

No método `main`, crie um objeto da classe `Produto`, utilize os setters para definir os valores dos atributos (incluindo tentativas de valores negativos) e, em seguida, use os getters para exibir os valores finais de cada atributo.
