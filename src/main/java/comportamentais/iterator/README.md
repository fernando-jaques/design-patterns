## Interator

O padrão de projeto Iterator fornece uma maneira de acessar,
sequencialmente, os elementos de um objeto agregado sem expor a sua
representação subjacente.

### Motivação (Por que utilizar?)

Um grupo de objetos pode ser chamado de coleção ou agregados. Tais
objetos podem estar armazenados em diferentes estruturas de dados, como
listas, matrizes, pilhas, árvores entre outras.

É interessante que forneçam uma maneira de acessar seus elementos sem
expor sua estrutura de dados interna. O padrão de projeto Iterator torna
isso possível. A idéia principal deste padrão é assumir a responsabilidade
pela iteração de ponta a ponta sobre os elementos de objetos agregados.
Isso é feito por meio de uma classe Iterator. Tal classe implementa uma
interface que dita quais métodos são necessários para acessar os elementos
de diferentes objetos agregados.

### Aplicabilidade (Quando utilizar?)

* Quando é necessário acessar o conteúdo de um objeto agregado sem
  expor sua representação interna.


* Quando é preciso agregados. suportar vários tipos de iteração em objetos agregados.


* Quando é necessário fornecer uma interface uniforme para iterar sobre
  diferentes estruturas agregadas (ou seja, para suportar iteração
  polimórfica).

### Consequências

* Suporte a variações no percurso de um agregado: Agregados complexos podem ser percorridos de várias maneiras,
  encapsulando e simplificando sua iteração para objetos externos (Clientes).
* Simplificação da interface dos agregados: Já que os Iterators são os
  responsáveis pelas iterações, os agregados não precisam implementar
  métodos para tal finalidade.


* Padronização da forma como é feita a iteração em objetos agregados de
  diferentes tipos (iteração polimórfica).


* Um agregado pode sofrer mais de uma iteração ao mesmo tempo: Um
  iterator controla seu próprio estado de iteração. Portanto, podem
  existir mais de uma iteração sendo executada sobre o mesmo objeto
  agregado ao mesmo tempo.


* O código passa a seguir o “princípio de responsabilidade única”. Toda
  a responsabilidade de como iterar sobre os elementos é da classe que
  implementa o Iterator. Essa responsabilidade deixa de ser do cliente
  e do agregado.


* O código também passa a seguir o “Princípio Aberto/Fechado”. É
  possível implementar novos tipos de agregados/coleções seguindo o
  padrão Iterator, ao passá-los para o cliente existente nada precisará
  ser modificado nele.