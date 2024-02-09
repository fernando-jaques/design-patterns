## Command

O padrão de projeto Command encapsula uma solicitação como um objeto,
isso lhe permite parametrizar clientes com diferentes solicitações,
enfileirar ou registrar _(log)_ solicitações e suportar solicitações que
podem ser desfeitas.

### Motivação (Por que utilizar?)

Considere um cenário onde é necessário emitir diferentes solicitações
para diferentes objetos sem conhecer detalhes da operação que está sendo
solicitada ou o destinatário da solicitação. E que ainda seja possível
que, ao longo do tempo, novas solicitações possam ser suportadas pelo
sistema e por isso ele deve ser expansível.

### Aplicabilidade (Quando utilizar?)

* Quando é preciso parametrizar objetos como ação a ser executada:

    * Tal parametrização pode ser expressada numa linguagem procedural
      através de uma função callback, ou seja, uma função que é
      registrada em algum lugar para ser chamada em um momento mais
      adiante.

    * Os Comandos são uma substituição orientada a objetos para callbacks.


* Quando existe a necessidade de especificar, enfileirar e executar solicitações em tempos diferentes:

    * Um objeto Comando, sabe quais ações executar e conhece o objeto
      receptor capaz de executá-las. Ele pode executar as ações a
      qualquer momento, deste modo, pode ter um tempo de vida
      independente da solicitação original.

    * É possível enfileirar Comandos para serem executados de forma
      controlada.


* Para suportar desfazer operações:

    * Para desfazer seus efeitos, um comando pode armazenar os estados
      em que objeto receptor se encontrava antes da a execução das
      ações (chamada do método execute()).

    * A interface Command pode conter uma operação undo(), que reverte
      os efeitos de uma chamada anterior de execute(). De acordo com a
      complexidade da reversão ela pode ser baseada nos estados em que
      o receptor se encontrava anteriormente.

    * Os comandos executados podem ser armazenados em um histórico.

    * O nível ilimitado de desfazer e refazer operações é obtido
      percorrendo esta lista para trás e para frente, chamando
      operações undo() e execute() respectivamente.


* Para tornar possível que mudanças no sistema sejam recuperadas por
  meio de um registro de mudanças (logging) em caso de queda:

    * Ao aumentar a interface de Command com as operações load() e
      store(), pode-se manter um registro (log) persistente das
      mudanças feitas no objeto receptor.
    * A recuperação de uma queda de sistema envolve a recarga dos
      comandos registrados a partir do disco e sua reexecução com a
      operação execute().


* Se faz necessário estruturar um sistema em torno de operações de alto
  nível construídas sobre operações primitivas:

    * Tal estrutura é comum em sistemas de informação que suportam
      transações.
    * Uma transação encapsula um conjunto de mudanças nos dados.
    * O padrão Command fornece uma maneira de modelar transações, já
      que os comandos podem ser desfeitos para o caso algum deles
      falhar.
    * Os Commands têm uma interface comum, permitindo invocar todas as
      transações da mesma maneira.
    * O padrão também torna mais fácil estender o sistema com novas
      transações.

### Consequências

* Comandos são objetos de primeira classe, ou seja, podem ser manipulados e estendidos como qualquer outro objeto.


* Um comando pode ser composto por outros comandos.


* É fácil acrescentar novos comandos porque não é preciso mudar as
  classes existentes.


* Implementar operações de desfazer fica mais fácil.


* O código pode se tornar mais complexo por existir camadas entre o
  cliente (solicitante) e o objeto recebedor.