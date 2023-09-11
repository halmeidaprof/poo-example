# Guia de estudos para Programação Orientada a Objetos (POO)

Este guia de estudos serve para exemplificar e compactar conceitos de Programação Orientada a Objetos. Não utilize esses exemplos de código na avaliação, pois o objetivo é que você seja capaz de pensar e codificar!

#### Paradigma de Programação
- Forma / abordagem de desenvolvimento de software que define a estrutura e organização do código.
- Conjunto de conceitos e princípios que norteiam os programadores para resolver problemas específicos.

#### Programação Orientada a Objetos
- Principais conceitos: Classes e Objetos.
- Facilita o reuso e manutenção de código.
- Possui características de um objeto da “vida real” (abstração do mundo real).

#### Classes e Objetos
- `Classe`: É a representação abstrata (modelo) de um objeto da vida real. Normalmente possui atributos, métodos, construtores e conceitos como encapsulamento, polimorfismo e herança.
- `Objeto`: É a instância concreta de uma classe. É uma representação real de um conceito do mundo real que a classe descreve.
- `Atributos`: características
- `Métodos`: comportamentos / ações

- [Exemplo](https://github.com/halmeidaprof/poo-example/tree/main/src/main/java/halmeida/classeandobjeto)


#### Herança `(extends)`
- Permite criar uma nova classe baseada em uma classe existente. A nova classe herda os atributos e métodos da classe pai (ou classe base), podendo também adicionar seus próprios atributos e métodos.

- [Exemplo com classe concreta](https://github.com/halmeidaprof/poo-example/tree/main/src/main/java/halmeida/heranca)
- [Exemplo com classe abstrata](https://github.com/halmeidaprof/poo-example/tree/main/src/main/java/halmeida/herancaabstract)


#### Interface `(implements)`
- É uma espécie de “contrato” que define um conjunto de métodos que uma classe deve implementar, trazendo modularidade e um bom nível de abstração.

- [Exemplo](https://github.com/halmeidaprof/poo-example/tree/main/src/main/java/halmeida/interfacepolimorfismo)


#### Polimorfísmo
- `Grego`  -> poli = muitas, morphos = forma.
- É uma técnica da POO onde em tempo de execução o software é capaz de saber qual a classe será executada com seus respectivos métodos.

- [Exemplo](https://github.com/halmeidaprof/poo-example/tree/main/src/main/java/halmeida/interfacepolimorfismo)


#### Encapsulamento
- Colocar em cápsula.


#### Coesão
- Coerência de um pensamento, ou seja, os nomes,  métodos e atributos devem fazer sentido para a classe.

- [Exemplo](https://github.com/halmeidaprof/poo-example/tree/main/src/main/java/halmeida/coesao)

#### Acoplamento
- Nível de dependência entre as classes.


#### Enum
- Conjunto especial no Java, onde é possível utilizar como constante e pode possuir atributos e métodos.
- [Exemplos de enums](https://github.com/halmeidaprof/poo-example/tree/main/src/main/java/halmeida/enums)
- [Exemplos de enums com métodos abstratos](https://github.com/halmeidaprof/poo-example/tree/main/src/main/java/halmeida/enums/metodos)


#### Gerenciador de dependências
- É uma ferramenta utilizada para automatizar o processo de dependências de bibliotecas, frameworks ou módulos externos que são utilizados no projeto, utilizando um arquivo de configuração para estes controles.

- [Exemplo](https://github.com/halmeidaprof/poo-example/blob/main/pom.xml)




