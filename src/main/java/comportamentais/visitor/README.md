## Visitor

O padrão Visitor representa uma operação a ser executada nos membros
de uma estrutura de objetos. Ele permite definir uma nova operação sem
mudar as classes dos membros sobre os quais opera.

### Motivação (Por que utilizar?)

O padrão Visitor é uma solução para separar algoritmos da estrutura
dos objetos. Uma das vantagens desse padrão é a possibilidade de adicionar
novas operações a uma estrutura de objetos já existente. Durante o
desenvolvimento de software é comum encontrar funcionalidades que não são
exatamente parte de um objeto ou outro, colocar tais funcionalidades
dentro da classe dos próprios objetos poderia poluir o código das classes
e abrir brechas para o surgimento de bugs.

### Aplicabilidade (Quando utilizar?)

* Quando uma estrutura de objetos contém muitas classes com interfaces
  diferentes e é necessário executar operações nas instâncias dessas
  classes, que por sua vez dependem de suas classes concretas.


* Quando muitas operações distintas e não relacionadas precisam ser
  executadas em objetos que compõem uma estrutura de objetos e não é
  desejável criar responsabilidades adicionais a tais objetos por conta
  de tais operações. O Visitor permite manter juntas as operações
  relacionadas, definindo-as em uma única classe. Quando a estrutura do
  objeto for compartilhada por muitas aplicações, use o Visitor para
  por operações apenas nas aplicações que precisam delas.


* Quando as classes que definem a estrutura do objeto raramente mudam,
  mas geralmente é preciso definir novas operações sobre tal estrutura.
  Alterar as classes da estrutura do objeto requer redefinir a
  interface para todos os Visitors, o que é muito trabalhoso e pode
  criar oportunidades para surgimentos de bugs. Se as classes de
  estrutura dos objetos mudam com frequência, provavelmente é melhor
  definir as operações nessas classes.

### Consequências

* O padrão Visitor facilita a adição de operações que dependem dos
  componentes de objetos complexos. Pode-se definir uma nova operação
  sobre uma estrutura de objeto simplesmente criando um novo Visitor.
  Caso muitos Visitors sejam criados, as funcionalidades ficarão
  espalhadas por muitas classes.


* Um Visitor reúne operações relacionadas e separa as não relacionadas.
  O comportamento relacionado não está espalhado pelas classes que
  definem a estrutura dos objetos, mas sim, centralizados em um
  Visitor.
  Conjuntos de comportamento não relacionados são particionados em suas próprias subclasses de Visitor. Isso simplifica
  as classes que definem os Elementos e os algoritmos definidos nos
  Visitors.
  Qualquer estrutura de dados específica de algoritmo pode
  ser ocultada no Visitor.


* Adicionar novas classes ElementoConcreto é difícil. O padrão Visitor
  torna difícil adicionar novas subclasses de Elemento. Cada novo
  ElementoConcreto gera uma nova operação abstrata na interface Visitor
  e uma implementação correspondente em todas as classes VisitanteConcreto.

  Portanto, o principal fator a ser analisado antes da aplicação do
  padrão Visitor:

    * Se é mais provável que se altere o algoritmo aplicado sobre uma
      estrutura de objetos, o padrão Visitor é uma boa solução. Neste
      caso a hierarquia de objetos é estável, mesmo que seja preciso
      adicionar operações continuamente ou alterar algoritmos, o
      padrão Visitor ajudará a gerenciar tais alterações.
    * Se é mais provável que se altere as classes de objetos que
      compõem a estrutura (ElementoConcreto) o padrão Visitor poderá
      ser difícil de se manter. Neste caso é melhor adicionar as novas
      funcionalidades na própria classe que compõem a estrutura
      (ElementoConcreto).


* Estado acumulativo. Os Visitors podem acumular estados à medida que
  visitam cada elemento na estrutura do objeto. Sem um Visitor, esse
  estado seria passado como parâmetros extras para operações que
  executam o percurso de visitas a cada objeto da estrutura, ou então,
  tais estados poderiam aparecer como variáveis globais.


* Quebra de encapsulamento. A abordagem do padrão Visitor pressupõe que
  a interface ElementoConcreto seja poderosa o suficiente para permitir
  que os Visitors façam seu trabalho. Como resultado, o padrão
  geralmente obriga os ElementosConcreto a fornecer operações públicas
  que acessam seus estados internos, o que pode comprometer seu
  encapsulamento.