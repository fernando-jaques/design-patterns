## Memento

O padrão Memento permite capturar e externalizar um estado interno de
um objeto sem violar o encapsulamento, deste modo, o objeto pode ser
restaurado no futuro para este estado capturado.

### Motivação (Por que utilizar?)

Às vezes é necessário registrar o estado interno de um objeto. Isso é
necessário ao implementar pontos de verificação (checkpoints) que
possibilitam operações de retroceder (conhecidas pelo atalho de teclado
Ctrl + Z) e operações para recuperação de erros ocorridos após a criação
do checkpoint. Tais informações devem ser armazenadas em em algum lugar,
de modo que seja possível restaurar objetos aos seus estados prévios. Em
programação orientada a objetos é muito comum a criação de atributos
privados, que são inacessíveis de fora do objeto, isso impossibilita que
tais atributos sejam salvos externamente, e os expor violaria o
encapsulamento, uma vez que tal exposição pode comprometer a
confiabilidade e a extensibilidade da classe em questão.

A situação descrita acima poderia ser resolvida com o padrão Memento.
Um Memento é um objeto que armazena um checkpoint do estado de um objeto,
este objeto é chamado de Originador. Sempre que for necessário restaurar o
estado interno de um Originador um Memento será utilizado para isso.
Podemos dizer que um Memento é uma recordação do estado de um objeto
originador no passado.

### Aplicabilidade (Quando utilizar?)

* Quando uma captura instantânea (screenshot), total ou parcial, do
  estado de um objeto deve ser salva para que no futuro tal objeto
  possa ser restaurado para este estado salvo.


* Quando se deseja evitar uma interface direta para obtenção do estado
  atual do objeto, de modo que ela exponha os detalhes de sua
  implementação e quebre o encapsulamento.

### Consequências

* O Memento preserva o encapsulamento evitando a exposição de
  informações que somente um originador deveria gerenciar, mas que,
  contudo, devem ser armazenadas nele.


* Em outras metodologias de preservação de encapsulamento, o objeto
  Originator mantém as versões do estado interno que os clientes
  solicitaram. Isso coloca toda a carga de gerenciamento de
  armazenamento no Originator. O fato de os clientes gerenciarem o
  estado que solicitam simplifica o Originador e impede que os clientes
  notifiquem os originadores quando terminarem.


* Usar Mementos pode ser custoso. Mementos podem sofrer uma sobrecarga
  considerável se o Originador precisar copiar grandes quantidades de
  informações para armazenar no Memento ou se os clientes criarem e
  retornarem Mementos ao originador com muita frequência. A menos que
  encapsular e restaurar o estado do Originador seja barato, o padrão
  pode não ser apropriado.


* Definindo interfaces estreitas e amplas. Em algumas liguagens, pode
  ser difícil garantir que apenas o originador possa acessar o estado
  do memento.


* Um Cuidador é responsável por excluir os Mementos os quais ele tem
  custódia. No entanto, o cuidador não tem idéia do volume ocupado pelo
  estado do memento. Portanto, um Cuidador de peso leve pode se tornar
  custoso ao armazenar muitos mementos.