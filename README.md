# Java Tutorial
#### *Um estudo sobre a linguagem Java seguindo o curso "Java COMPLETO Programação Orientada a Objetos + Projetos" ministrado pelo Prof. Dr. Nélio Alves.*

---

## **Classe:** 
É um tipo estruturado que pode conter: 

- Atributos (dados/campos)
- Métodos (funções/operações)

A palavra **classe** vem da taxonomia da biologia. Todos os seres vivos de uma mesma **classe** biológica têm uma série de **atributos** e **comportamentos** em comum, mas não são iguais, pois podem variar nos valores desses **atributos** e como realizam esses **comportamentos**.
[`Practice1`](src/application/Practice1.java)
[`Triangle`](src/entities/Triangle.java)

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
