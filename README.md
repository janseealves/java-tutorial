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

## **Sobrecarga *(Overload)*:**
A sobrecarga de métodos (overload) é um conceito do polimorfismo que consiste basicamente em criar variações de um mesmo método, ou seja, a criação de dois ou mais métodos com nomes totalmente iguais em uma classe. 

A **Sobrecarga** permite que utilizemos o mesmo nome em mais de um método contanto que suas listas de argumentos sejam diferentes para que seja feita a separação dos mesmos.

## **Encapsulamento:**
É um princípio que co nsiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.

- Um objeto **NÃO** deve expor nenhum atributo (modificador de acesso **private**)
- Os atributos devem ser acessados por meio de métodos **get** e **set** (padrão JavaBeans)