## Template Mehtod

O padrão Template Method define o esqueleto de um algoritmo dentro de
um método, transferindo alguns de seus passos para subclasses. O Template
Method permite que as subclasses redefinam certos passos de um algoritmo
sem alterar a estrutura do mesmo.

### Motivação (Por que utilizar?)

O padrão Template Method auxilia na definição de um algoritmo que
contém algumas de suas partes definidas por métodos abstratos. Subclasses
são responsáveis por implementar as partes abstratas deste algoritmo. Tais
partes poderão ser implementadas de formas distintas, ou seja, cada
subclasse irá implementar conforme sua necessidade. Deste modo a
superclasse posterga algumas implementações para que sejam feitas por suas
subclasses.
Este padrão ajuda na reutilização de código e no controle de como o
código deve ser executado.

### Aplicabilidade (Quando utilizar?)

* Para implementar partes invariantes de um algoritmo apenas uma vez,
  deixando para as subclasses apenas a implementação daquilo que pode
  variar.


* Controlar extensões de subclasses, sabendo o que as subclasses devem
  implementar e até onde devem implementar.


* Evitar duplicação de código entre classes comuns.

### Consequências

* É técnica fundamental para a reutilização de código. São
  particularmente importantes em bibliotecas de classes, pois são os
  meios para definir o comportamento comum nas classes das bibliotecas.


* Proporcionam a inversão de dependência. Isso se refere a como uma
  classe pai chama as operações de uma subclasse e não o contrário.

* Permitem controlar a sequência da execução de métodos das subclasses.

* Possibilitam ter pontos que chamam código ainda não implementado.