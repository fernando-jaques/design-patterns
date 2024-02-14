## Abstract method

O padrão Abstract Factory fornece uma interface para criar famílias
de objetos relacionados ou dependentes sem especificar suas classes
concretas.

### Motivação (Por que utilizar?)

O padrão Abstract Factory utiliza a composição para expandir suas
funcionalidades dependendo apenas de supertipos e não de classes
concretas, isso isola a criação de objetos de seu uso e cria famílias de
objetos relacionados que são necessários para compor o objeto que os
utiliza. Isto permite que novos tipos derivados sejam introduzidos sem
qualquer alteração ao código que utiliza a classe base.

### Aplicabilidade (Quando utilizar?)

- Quando um sistema deve ser independente de como seus produtos são
  criados, compostos ou representados.
- Quando um sistema deve ser configurado com uma dentre múltiplas famílias de produtos
- Quando uma família de objetos relacionados foi projetada para ser
  usada em conjunto, e é necessário impor essa restrição.
- Quando se deseja fornecer uma biblioteca de produtos e se deseja
  revelar para o cliente apenas suas interfaces, e não suas
  implementações.

### Consequências

- Promove o isolamento de classes concretas. O padrão Abstract Factory
  ajuda a controlar as classes de objetos que um sistema cria. Como uma
  fábrica encapsula a responsabilidade e o processo de criação de
  produtos concretos, ela isola os clientes de tais responsabilidades.
  Os clientes manipulam instâncias concretas por meio de suas
  interfaces abstratas. Os nomes das classes ProdutoConcreto ficam
  isolados na implementação da fábrica concreta e não chegam no cliente


- Facilita a troca de famílias de produtos. Uma fábrica concreta
  aparece apenas uma vez em um cliente, ou seja, onde é instanciada,
  isso facilita sua alteração. Um cliente pode usar diferentes
  configurações de produtos simplesmente alterando sua fábrica concreta
  em tempo de execução.


- Promove a consistência entre produtos. Quando os objetos são
  projetados para trabalhar juntos em uma família de produto, é
  importante que o cliente seja composto por objetos de apenas uma
  família por vez, ou seja, as famílias não devem se misturar. O padrão
  Abstract Factory facilita tal controle.


- Suportar novos tipos de produtos é difícil. Isso ocorre porque a
  interface AbstractFactory define o conjunto de produtos que podem ser
  criados. O suporte a novos tipos de produtos requer a extensão da
  interface ou classe abstrata AbstractFactory e de todas as suas
  subclasses (FabricaConcreta) também precisarão ser extendidas.

- Embora criar novos tipos de produtos seja difícil, criar novos
  produtos de um tipo já existente é fácil e não causa refatoração no
  Cliente.