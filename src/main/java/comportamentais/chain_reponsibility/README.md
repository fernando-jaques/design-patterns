## Chain of responsibility

O Padrão Chain of Responsibility evita o acoplamento do remetente de
uma solicitação ao seu receptor, dando a mais de um objeto a oportunidade
de tratar a solicitação. Ele encadeia os objetos receptores, passando a
solicitação ao longo da cadeia até que um objeto a trate.

### Motivação (Por que utilizar?)

Durante o desenvolvimento de software é comum o surgimento de
situações onde é necessário que apenas um tratamento entre muitos seja
aplicado a um determinado fluxo.

### Aplicabilidade (Quando utilizar?)

* Quando mais de um objeto pode tratar uma solicitação e não se sabe
  qual objeto fará tal tratamento. O objeto que trata a solicitação
  deve ser escolhido automaticamente.


* Ao ser necessário fazer uma solicitação para um dentre vários objetos
  sem especificar explicitamente para qual.


* Quando um conjunto de objetos que pode tratar uma solicitação deve
  ser especificado dinamicamente.

### Consequências

* Redução de acoplamento: O padrão permite que um objeto não precise
  saber que outro objeto lida com uma solicitação. Precisando saber
  apenas que uma solicitação será tratada de forma adequada. O receptor
  e o remetente não têm conhecimento explícito um do outro, e um objeto
  na cadeia não precisa conhecer toda a estrutura da cadeia. Deste modo
  a cadeia de responsabilidade simplifica as interconexões de objetos.
  Onde cada objeto mantém uma única referência, ao seu sucessor, ao
  invés de manter referência a todos os receptores candidatos.


* Maior flexibilidade na atribuição de responsabilidades aos objetos: A
  Cadeia de responsabilidade oferece flexibilidade adicional na
  distribuição de responsabilidades entre objetos. Sendo possível
  adicionar ou alterar responsabilidades para manipular uma
  solicitação, adicionando ou alterando a cadeia em tempo de execução.


* A resposta da solicitação não é garantida: Como uma solicitação não
  possui destinatário explícito, não há garantia de que ela será
  tratada. A solicitação pode chegar ao final da cadeia e não ser
  tratada. Uma solicitação também pode não ser tratada quando a cadeia
  estiver configurada de forma incorreta.