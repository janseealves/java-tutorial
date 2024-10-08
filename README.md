# Java Tutorial
***Um estudo sobre a linguagem Java seguindo o curso "Java COMPLETO Programação Orientada a Objetos + Projetos" ministrado pelo Prof. Dr. Nélio Alves.***

---

## **Classe:** 
É um tipo estruturado que pode conter: 

- Atributos (dados/campos)
- Métodos (funções/operações)

A palavra **classe** vem da taxonomia da biologia. Todos os seres vivos de uma mesma **classe** biológica têm uma série de **atributos** e **comportamentos** em comum, mas não são iguais, pois podem variar nos valores desses **atributos** e como realizam esses **comportamentos**.

[`Practice1`](src/application/Practice1.java)
[`Triangle`](src/entities/Triangle.java)

## **Listas:** 
Uma lista é uma coleção a qual permite elementos duplicados e mantém uma ordenação específica entre os elementos.

Em outras palavras, você tem a garantia de que, quando percorrer a lista, os elementos serão encontrados em uma ordem pré-determinada, definida na hora das suas inserções. Ela resolve todos os problemas os quais levantamos em relação à array (busca, remoção, tamanho infinito, etc.). Esse código já está pronto!

A implementação mais utilizada da interface List é a ArrayList, que trabalha com uma array interna para gerar uma lista. Portanto, ela é mais rápida na pesquisa do que sua concorrente, a LinkedList, a qual é mais rápida na inserção e remoção de itens nas pontas.

`List<> list = new ArrayList();`

- Tamanho da lista: `size()`
- Insetir elemento na lista: `add(obj)`, `add(int, obj)`
- Remover elementos da lista: `remove(obj)`, `remove(int)`, `removeIf(Predicate)`
- Encontrar posição de elemento: `indexOf(obj)`, `lastIndexOf(obj)`
- Filtrar lista com base em predicado: `List<> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());`
- Encontrar primeira ocorrência com base em predicado: `Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);`

[`Practice8`](src/application/Practice8.java)

## **Membros Estáticos:** 
`public static class Calculator`

São membros que fazem sentido independemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.

Aplicações comuns: 

- Classes utilitárias - `Math.sqrt()`
- Declaração de constantes

Uma classe que possui somente membros estáticos, pode ser uma classe estática também. **Esta classe não poderá ser instanciada.**

## **Encapsulamento:**
É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.

- Um objeto **NÃO** deve expor nenhum atributo (modificador de acesso **private**)
- Os atributos devem ser acessados por meio de métodos **get** e **set** (padrão JavaBeans)

[`Practice2`](src/application/Practice2.java)
[`Product`](src/entities/Product.java)

## **Modificadores de acesso:**

- **private:** o membro só pode ser acessado na **própria classe**
- *(nada)*: o membro só pode ser acessado nas classes do **mesmo pacote**
- **protected:** o membro só pode ser acessado no **mesmo pacote**, bem como em **subclasses de pacotes diferentes**
- **public:** o membro é acessado por todas as classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)

## **Herança:** 
`class A extends B`

É um tipo de associação que permite que uma classe herde ***todos*** os dados e comportamentos de outra.

Vantagens:
- Reuso
- Polimorfismo

[`BusinessAccount`](src/entities/BusinessAccount.java)
[`SavingsAccount`](src/entities/SavingsAccount.java)

### **Upcasting:**

**Upcasting** ocorre quando você converte um objeto de uma classe filha (subclasse) para sua classe pai (superclasse). Ele é feito de forma implícita pelo compilador, ou seja, não é necessário usar um cast explícito. Como a classe filha herda todos os métodos e atributos da classe pai, o compilador sabe que esse tipo de conversão é segura.

[`Practice4`](src/application/Practice4.java)

### **Downcasting:** 

Downcasting é o processo oposto de upcasting. Aqui, convertemos um objeto de uma classe pai para um de uma classe filha. No entanto, ao contrário do upcasting, o downcasting precisa ser feito explicitamente e pode ser perigoso se não for utilizado corretamente, pois nem todo objeto da superclasse é, de fato, uma instância da subclasse.

[`Practice4`](src/application/Practice4.java)

### **Sobrecarga *(Overload)*:**
A **Sobrecarga** de métodos (overload) é um conceito do polimorfismo que consiste basicamente em criar variações de um mesmo método, ou seja, a criação de dois ou mais métodos com nomes totalmente iguais em uma classe.

A **Sobrecarga** permite que utilizemos o mesmo nome em mais de um método contanto que suas listas de argumentos sejam diferentes para que seja feita a separação dos mesmos.

### **Sobreposição *(Override)*:**
A **Sobreposição** de métodos (override) é um conceito do polimorfismo que nos permite reescrever um método, ou seja, podemos reescrever nas classes filhas métodos criados inicialmente na classe pai, os métodos que serão sobrepostos, diferentemente dos sobrecarregados, devem possuir o mesmo nome, tipo de retorno e quantidade de parâmetros do método inicial, porém o mesmo será implementado com especificações da classe atual, podendo adicionar um algo a mais ou não.

## Palavra-chave ***Final*:**
`public final class SavingsAccount`

Uma classe marcada como **final** não pode ser estendida. Isso significa que você não pode criar subclasses dela. Isso é útil quando você deseja garantir que a implementação de uma classe permaneça inalterada.

Um método marcado como **final** não pode ser sobrescrito (overridden) por subclasses. Isso é útil quando você deseja garantir que o comportamento de um método específico não seja alterado por herança.

## **Polimorfismo:**
Em Programação Orientada a Objetos, polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.

[`Practice5`](src/application/Practice5.java)
[`Practice6`](src/application/Practice6.java)
[`Practice7`](src/application/Practice7.java)

## **Classes abstratas:**
São classes que não podem ser instanciadas. É uma forma de garantir herança total: somente sobclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata.

`public abstract class Account`

### **Métodos abstratos:**
São métodos que não possuem implementação. Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação. Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.

Em Java, existe um recurso no qual, em uma classe abstrata, podemos escrever que determinado método será sempre escrito pelas classes filhas. Isto é, um método abstrato. 

`public abstract void method();`

