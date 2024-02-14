## Factory method

O Padrão Factory Method define uma interface para criar um objeto,
mas permite que a subclasses possam decidir qual classe instanciar,
possibilitando que uma classe seja capaz de prorrogar a instanciação de uma classe para subclasses.

### Motivação (Por que utilizar?)

Ao criar sistemas orientados a objetos não há como deixar de
instanciar classes concretas, não existe nenhum problema nisso, porém como
e onde tais objetos são instanciados pode criar um forte acoplamento entre
classes de um sistema. Instanciar um objeto pode requerer processos
complexos para que ele seja construído corretamente. Também pode causar
uma significativa duplicação de código em diferentes classes onde ele é
utilizado.

### Aplicabilidade (Quando utilizar?)

- Quando uma classe não sabe antecipar qual tipo de objeto deve criar,
  ou seja, entre várias classes possíveis, não é possível prever qual
  delas deve ser utilizada.


- Quando se precisa que uma classe delegue para suas subclasses especificação dos objetos que instanciam.


- Quando classes delegam responsabilidade a uma dentre várias
  subclasses auxiliares, se deseja manter o conhecimento nelas e ainda
  saber qual subclasse foi utilizada em determinado contexto.

### Consequências

- O padrão Factory Method elimina o forte acoplamento entre classes
  concretas. O código lida apenas com a interface do Produto, portanto,
  ele pode funcionar com qualquer classe ProdutoConcreto definida no
  sistema.


- Uma desvantagem potencial do Factory Method é que os clientes podem
  ter que subclassificar a classe Criador apenas para criar um objeto
  produtoConcreto específico. Subclassificar é bom quando o cliente
  precisa subclassificar a classe Creator de qualquer maneira, mas,
  caso contrário, o cliente agora deve lidar com outro problema.


- Criar objetos dentro de uma classe com um método factoryMethod() é
  sempre mais flexível do que criar um objeto diretamente. O padrão
  Factory Method fornece às subclasses um gancho (hook) para fornecer
  uma versão diferente de um objeto.

- No exemplo que consideramos até agora, o método fábrica criarBoleto()
  é chamado apenas pelos criadores concretos. Mas isso não precisa ser
  sempre assim. Os clientes podem achar os métodos de fábrica úteis, e
  os utilizar de forma direta, especialmente no caso de hierarquias de
  classes paralelas.


- Hierarquias de classe paralelas resultam quando uma classe delega
  algumas de suas responsabilidades a uma outra classe separada.