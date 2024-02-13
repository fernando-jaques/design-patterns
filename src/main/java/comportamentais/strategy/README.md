## Strategy

O padrão de projeto Strategy define uma família de algoritmos,
encapsula cada um deles e os torna intercambiáveis. O Strategy permite que
o algoritmo varie independentemente dos clientes que o utilizam.

### Motivação (Por que utilizar?)

O padrão Strategy aprimora a comunicação entre objetos, pois passa a
existir uma distribuição de responsabilidades. O objetivo é representar os
comportamentos de um objeto por meio de uma família de algoritmos que os
implementam.

Em projetos de software orientados a objetos é possível encontrar
objetos semelhantes que variam seu comportamento apenas em alguns pontos
específicos. Cada um destes comportamentos pode ser externalizado em uma
família de algoritmos.

### Aplicabilidade (Quando utilizar?)

* O padrão é aplicado quando muitas classes fazem a mesma coisa de forma diferente.


* Quando se necessita de variantes de um algoritmo.


* Quando é necessário evitar a exposição de dados ou sensíveis os quais clientes não podem ter conhecimento.


* Remoção de operadores condicionais que determinam o comportamento do algoritmo com base em objetos diferentes.

### Consequências

* Família de Algoritmo: Permite a criação de uma hierarquia de classes do tipo Strategy em um mesmo contexto.


* O encapsulamento dos algoritmos nas classes Strategy permite alterar
  o algoritmo independentemente do seu contexto, tornando mais fácil de
  efetuar possíveis alterações no código.


* É uma estratégia para remover operadores condicionais.


* Flexibilidade na escolha de qual strategy (algoritmo) utilizar.


* Clientes devem conhecer as classes Strategy, pois, se o cliente não
  compreender como essas classes funcionam, não poderá escolher o
  melhor comportamento.


* Custo entre a comunicação Strategy e Context: as classes que
  implementam a interface Strategy podem não utilizar as informações
  passadas por ela, ou seja, pode acontecer da classe Contexto criar e
  iniciar parâmetros que não serão utilizados.


* Aumento do número de classes na aplicação.