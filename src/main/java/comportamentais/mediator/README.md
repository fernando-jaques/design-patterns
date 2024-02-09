## Mediator

O padrão Mediator é um padrão de projeto que serve para encapsular a
maneira que um conjunto de objetos interage, ou seja, a comunicação entre
os objetos é estabelecida através de um objeto mediador (Mediator). Este
padrão de projeto promove o fraco acoplamento ao evitar que objetos se
refiram uns aos outros de forma explícita e permite variar suas intenções
independentemente.

### Motivação (Por que utilizar?)

O paradigma de desenvolvimento de software orientado a objetos
incentiva a distribuição do comportamento entre objetos. Essa distribuição
pode resultar em uma estrutura onde objetos possuem muitas conexões entre
si, na pior das hipóteses, todo objeto acaba conhecendo um ao outro.

O particionamento de um sistema em muitos objetos visa melhorar a
capacidade de reutilização de código, porém, a proliferação de
interconexões entre estes objetos tende a voltar a reduzir o reúso de
código. Muitas interconexões tornam menos provável que um objeto possa
funcionar corretamente sem o apoio de outros, desta forma o sistema passa
a agir como se fosse monolítico.

### Aplicabilidade (Quando utilizar?)

* Quando um conjunto de objetos se comunica de maneiras bem definidas,
  porém complexas. As interdependências resultantes são desestruturadas
  e difíceis de entender.


* Quando reutilizar um objeto é difícil por estar fazendo referência e
  se comunicando com muitos outros objetos.


* Quando um comportamento distribuído entre várias classes deve ser
  personalizável sem que seja necessário criar muitas subclasses.

### Consequências

* Um mediador centraliza o comportamento que seria distribuído entre
  vários colegas. Para alterar esse comportamento é preciso alterar
  apenas o mediador. As classes colegas podem ser reutilizadas como
  estão.


* Segue o princípio Aberto/Fechado. Promove um acoplamento flexível
  entre colegas. É possível introduzir, variar e reutilizar as classes
  Colega e Mediador de forma independente.


* Segue o princípio da responsabilidade única. O Mediator extrai as
  comunicações entre vários colegas. Isso simplifica os protocolos
  entre objetos, pois, o Mediator substitui uma comunicação do tipo
  muitos-para-muitos por uma comunicação um-para-muitos, entre ele e os
  objetos do tipo Colega. Os relacionamentos um-para-muitos são mais
  fáceis de entender e manter.


* Abstrai a forma como os objetos cooperam. Tornar a mediação um
  conceito independente e encapsula-la em um objeto permite o foco em
  como os objetos interagem independentemente de seu comportamento
  individual. Deste modo fica mais fácil entender como os objetos
  interagem em um sistema.


* O padrão Mediador troca complexidade de interação por complexidade no
  mediador. Como um mediador encapsula protocolos, ele pode se tornar
  mais complexo do que qualquer colega individual. Isso pode tornar o
  mediador um monolito difícil de manter.