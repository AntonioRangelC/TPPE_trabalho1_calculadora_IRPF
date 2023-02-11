# Trabalho 3 - Técnicas de Programação Para Plataformas Emergentes

## **Professor**: André Luiz Peron Lanna

## **Grupo**: 10

## **Alunos**:
- Ana Carolina Rodrigues Leite - 190101792
- Antonio Rangel Chaves - 180098021
- João Paulo Coelho de Souza - 160127327
- Lameque Fernandes Azevedo - 180104390
- Rafael Leão Teixeira de Magalhães - 190019158
- Vitor Diniz Pagani Vieira Ribeiro - 180132385


## Característica 1 - Simplicidade

A simplicidade no contexto de um código ou algoritmo está ligado diretamente com a facilidade de compreender, modificar e manter o código. Um código claro inclui coisas como usar nomes de variáveis descritivos, seguir uma estrutura lógica simples de ler, evita duplicação de código, comentar o código de forma apropriada, etc. Além disto, um código simples também deve ser otimizado para ser eficiente em termos de tempo de execução e uso de recursos.

Algumas características comuns de um código simples:
- Fácil de entender: O código é claro e conciso, e usa nomes de variáveis descritivos e comentários para tornar sua funcionalidade claramente compreendida.
- Mantenível: É fácil fazer alterações no código sem causar efeitos colaterais indesejados.
- Organizado: O código segue uma estrutura lógica e está organizado de forma a tornar a leitura e manutenção fáceis.
- Reutilizável: O código pode ser facilmente reaproveitado em outros projetos.
- Eficiente: O código é otimizado para ser rápido e usar recursos de forma eficiente.
- Seguro: O código é protegido contra vulnerabilidades de segurança e erros de lógica.
- Testável: O código é escrito de forma a permitir testes automatizados.
- Documentado: O código é acompanhado por documentação clara e detalhada para orientar o usuário e futuros mantenedores.

Segue um trecho de código escrito em java que calcula a média de três números inteiro e atende as características da simplicidade:
```java
public class AverageCalculator {
    public static void main(String[] args) {
        // Declaração das variáveis
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
        // Cálculo da média
        int average = (num1 + num2 + num3) / 3;
        
        // Saída do resultado
        System.out.println("A média dos números é: " + average);
    }
}
```
Este código segue as boas práticas de codificação, como usar nomes de variáveis descritivos (num1, num2, num3), seguir uma estrutura lógica e ser curto e claro. O código também produz uma saída fácil de ler e entender. Além disto, os comentários ajudam a explicar a funcionalidade do código e tornam mais fácil para outros desenvolvedores entender e manter o código, assim, colaborando na simplicidade do código.


## Característica 2 - Elegância

A elegância no contexto de projeto de código refere-se a simplicidade, clareza e eficiência no design e implementação do código. Isso inclui a escolha de soluções apropriadas para problemas, a organização do código em módulos claros e fáceis de entender, e a evitação de código redundante ou ineficiente. A elegância é importante porque torna o código mais fácil de manter, testar e expandir ao longo do tempo.
A elegância não é apenas sobre como o código parece, mas também sobre como ele é projetado e funciona. O objetivo é criar código que seja fácil de entender, usar e manter, além de ser eficiente e escalável.

Algumas características que fazem parte da elegância de um projeto de código:
- Simplicidade: o código é simples e direto, sem a presença de soluções complexas ou ineficientes que possam dificultar a compreensão e a manutenção.
- Legibilidade: o código é bem organizado e estruturado, com nomes de variáveis e funções descritivos e comentários claros e concisos.
- Reutilização: o código é modular e pode ser facilmente reutilizado em outras partes do projeto ou em projetos futuros.
- Manutenibilidade: o código é projetado de forma a permitir mudanças e correções fáceis no futuro, sem afetar outras partes do sistema.
- Eficiência: o código é otimizado para ser executado rapidamente e com eficiência, sem desperdiçar recursos do sistema.
- Estrutura: o código elegante tem estrutura clara e bem e consistente, com classes e métodos bem definidos e organizados.

A elegância de um projeto de código está diretamente relacionada com os maus-cheiros de código. A elegância em programação se refere à escrita clara, concisa e fácil de manter do código, como apresentado anteriormente, enquanto o mau-cheiro de código se refere à presença de problemas estruturais, como duplicação de código, falta de clareza e dificuldade de manutenção. Uma boa elegância de código é importante para tornar o código mais fácil de compreender e manter, e para evitar problemas futuros, enquanto o mau-cheiro de código pode levar a problemas de desempenho, correção de bugs e dificuldades na manutenção do software. Em resumo, a elegância e o mau-cheiro de código são conceitos opostos na programação, e a elegância é uma das características usada para corrigir e evitar problemas de mau-cheiro de código.

Alguns maus-cheiros de código relacionados com a elegância do código incluem:
- Duplicação de código: repetição desnecessária de código, que pode ser consolidado em uma única função ou método.
- Nomeação confusa: uso de nomes confusos para variáveis, métodos ou classes, o que pode tornar o código difícil de compreender.
- Comentários desnecessários: comentários que não acrescentam informações úteis, mas sim apenas repetem o que já está claramente escrito no código.
- Código desorganizado: falta de estruturação lógica e ordenada do código, o que pode torná-lo difícil de entender e manter.
- Métodos extensos: métodos muito longos e complexos, que realizam muitas tarefas diferentes, o que pode torná-los difíceis de compreender e manter.

Para melhorar a elegância de código de um projeto, é preciso:
- Manter o código simples: Escreva código que seja fácil de entender e compreender. Mantenha as coisas simples e evite soluções complexas.
- Utilizar nomes claros: Escolha nomes claros e descritivos para variáveis, métodos e classes para torná-los fáceis de entender.
- Ser consistente: Siga uma convenção de codificação e mantenha-a consistente ao longo do código.
- Refatorar o código: Refatore o código periodicamente para remover duplicação de código e torná-lo mais claro e conciso.
- Comente o código, quando necessário: Adicione comentários para explicar o que o código está fazendo e como ele está funcionando.
- Manter o código organizado: Mantenha o código organizado em métodos e classes separadas para torná-lo mais fácil de manter e entender.
- Evite código espaguetado: Evite escrever código que é difícil de entender e compreender, como código com muitos if/else aninhados ou laços.



## Característica 3 - Moduralidade
**Descrição**: Segundo Pete Goodliffe (2007), a modularidade surge a partir do momento em que dividimos o projeto em módulos, e elementos chave para a modularidade são o baixo acoplamento e alta coesão. O acoplamento diz respeito a interdependência entre módulos (GOODLIFFE, 2007), por exemplo, observe o seguinte método em `Java`:
```java
public static void fazerSaudacao(String nomePessoa){
    
    nomePessoa = nomePessoa.toLowerCase(); //Colocando em minusculo
    String[] nomesLista = nomePessoa.split(" "); //Separando os nomes

    String nomeFormatado = "";
    
    for (String nome : nomesLista) { //Colocando o primeiro caractere de cada nome como maiusculo
      nomeFormatado += Character.toUpperCase(nome.charAt(0)) + nome.substring(1) + " ";
    }

    nomeFormatado = nomeFormatado.trim(); //Tirando espacos em branco no comeco e final da string

    System.out.println("Olá " + nomeFormatado); //Imprimindo saudacao
      
  }
``` 
É possível obervar que esse método possui um alto acoplamento, pois várias tarefas diferentes estão presentes em sua implementação. O alto acoplamento acaba influenciando na duplicação de código, pois caso outro método desse projeto fictício precise colocar a primeira letra de cada caractere como maiúsculo, terá que copiar o código do método acima. Mas caso os desenvolvedores resolvam refatorar-lo e criar novos métodos para cada tarefa como por exemplo `imprimirSaudacao(String saudacao, String nomePessoa)`, será possível outros módulos do projeto reaproveitarem as funcionalidades presentes nesse método `fazerSaudacao()`. Com isso, seria alcançado o baixo acoplamento, pois um método não teria tantas responsabilidades diferentes.
Já a coesão diz respeito a o quão bem as partes dos módulos trabalham entre si (GOODLIFFE, 2007). Se uma classe Carro possui um método `calcularImpostoDeRenda()` , a coesão é baixa pois não cabe ao Carro fazer esse tipo de cálculo, fazendo com que as partes desse projeto não trabalhem de forma coerente.

Segundo Martin Fowler, autor do livro "Refactoring: Improving the Design of Existing Code", a modularidade é uma característica importante do código bem escrito e ajuda a evitar maus-cheiros de código. Em seu livro, Fowler define maus-cheiros de código como padrões no código que indicam que ele precisa ser refatorado. Alguns dos maus-cheiros de código relacionados à modularidade incluem:
- Acoplamento excessivo entre módulos: Isso significa que os módulos estão fortemente ligados uns aos outros, o que torna difícil mudar ou manter um sem afetar o outro.
- Responsabilidade única excessiva: Isso ocorre quando um módulo tem muitas responsabilidades, o que torna difícil entender e manter o código.
- Código duplicado: Isso ocorre quando o mesmo código é repetido em diferentes partes do sistema, o que aumenta o tamanho e a complexidade do código.

A boa modularidade permite que o código seja facilmente mantido e testado, além de ser fácil de ser entendido por outros desenvolvedores. Em resumo, segundo Fowler, a modularidade é uma característica importante do código bem escrito que ajuda a evitar maus-cheiros de código.

Uma operação de refatoração que pode ajudar a melhorar a modularidade de um projeto de código é a extração de método. Essa operação consiste em remover uma parte do código repetido ou complexo e colocá-lo em um método separado com um nome significativo. Isso torna o código mais legível e fácil de entender, além de tornar mais fácil manter e testar o código. Além disso, a extração de método também pode ajudar a reduzir o acoplamento entre módulos, pois permite que cada módulo tenha uma única responsabilidade claramente definida. Em resumo, a extração de método é uma operação de refatoração útil para melhorar a modularidade do código.



## Característica 4 - Idiomático

Uma programação idiomática é a prática de escrever código que é natural e eficiente para uma determinada linguagem de programação. Isso envolve o uso de padrões, convenções e recursos que são específicos da linguagem e que foram incorporados ao longo do tempo pelos desenvolvedores da comunidade. A programação idiomática ajuda a tornar o código mais fácil de entender, manter e melhorar para outros desenvolvedores que estão familiarizados com as convenções da linguagem.

No livro “Clean Code: A Handbook of Agile Software Craftsmanship” de Robert Martin, o autor fala sobre a temática no capítulo 2, “Meaningful Names”, argumentando que escrever códigos idiomáticos é uma prática importante para manter o código limpo, fácil de entender, ler e facilitar também a manutenabilidade. Ele discute sobre vários aspectos de programação idiomática, incluindo nomenclatura, formatos, estruturas de dados, algoritmos e outros.

Alguns exemplos incluem:

- Nomes de variáveis ou funções que não são significativas ou descritivas.
- Uso excessivo de abreviações ou siglas, tornando o código difícil de entender.
- Uso de comentários para explicar o que o código está fazendo, ao invés de usar nomes significativos e descritivos para variáveis e funções.
- Escrita de código com uma quantidade excessiva de ifs, elses e laços, tornando o código confuso e difícil de entender.
- Não seguir as convenções e boas práticas da linguagem de programação, como indentação ou estrutura de dados inadequada.

Além disso, Martin fornece vários exemplos de como nomear corretamente as coisas, incluindo regras e dicas para escolher nomes claros, curtos e descritivos. Ele também discute como evitar nomes confusos, ambíguos e irrelevantes.

Um exemplo presente no livro do Martin:

- Qual é a finalidade deste código?
```java
public List<int[]> getThem() {
     List<int[]> list1 = new ArrayList<int[]>();
     for (int[] x : theList)
         if (x[0] == 4)
             list1.add(x);
     return list1;
 }
```
Qual foi a sua dificuldade em poder entender sobre o que ele faz? Ele não é um método de alta complexidade, apenas um método simples, com variáveis simples. Martin nos diz que o problema não está na simplicidade do código e sim na linguagem implicíta que ele nos representa. O código requer implicitamente que saibamos as respostas para perguntas como:

1. Que tipos de coisas estão na lista?
2. Qual é o significado do subscrito zero de um item na Lista?
3. Qual é o significado do valor 4?
4. Como eu usaria a lista que está sendo retornada?

Entendemos que a forma como o código foi escrito, mesmo sendo simples trouxe dificuldades que não deveriam estar presentes nele. E que seguindo o padrão da programação idiomática, com nomes claros, nomeclaturas simples e objetivas o código permanece simples mas explicíto para quem o lê, como esse:

```java
 public List<Cell> getFlaggedCells() {
     List<Cell> flaggedCells = new ArrayList<Cell>();
     for (Cell cell : gameBoard)
         if (cell.isFlagged())
             flaggedCells.add(cell);
     return flaggedCells;
 }
```

Esse mesmo tema é tratado de maneira parecida nos livro "Refactoring: Improving the Design of Existing Code" de Martin Fowler, que aborda a mesma importância em poder escrever de maneira simples e de alta qualidade aplicando os conceitos de refatoração que deixam o código mais claro e legível. Destacando a frequência da manutenibilidade do código sem que os mantenedores possam adicionar bugs naquela parte de código. E mencionando também a importância de seguir as boas práticas das linguagens de programação.

Já no livro “Design Patterns: Elements of Reusable Object-Oriented Software” de Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides apresenta uma variedade de padrões de design que podem ser usados para resolver problemas comuns no desenvolvimento de software. Incluindo sempre a ideia de manter e escrever códigos claros, concisos, limpos e fáceis de entender.

E por último, o livro “The Pragmatic Programmer: From Journeyman to Master” de Andrew Hunt e David Thomas apresenta uma ampla variedade de técnicas e práticas para ajudar os programadores a escrever software de alta qualidade e garantir a procedência da programação idiomática.


## Característica 5 - Portabilidade

Portabilidade em um código é descrita como a capacidade de um programa ser executado em diferentes sistemas operacionais ou plataformas sem a necessidade de modificações significativas no código-fonte criado primariamente. Isso é importante para garantir a compatibilidade do software em diferentes ambientes. Para que um software seja considerado altamente portável, ele deve depender apenas de bibliotecas e recursos que são amplamente disponíveis em diferentes plataformas. Além disso, o código-fonte do software deve ser escrito de forma clara e abstrata, evitando a dependência de recursos específicos de uma plataforma.

Martin Fowler aborda esse tema em seu livro "Code Craft : The Practice of Writing Excellent Code", entre outras coisas ele cita em específico que um bom design de código não significa que esse código é neccessariamente portável, um bom design deve ser apropriadamente portável quando isso é uma necessidade especificada durante seu processo de desenvolvimento.

A seguir podemos ver dois exemplos de um simples código de "Hello World" em java, sendo um deles com alta portabilidade e outro com baixa portabilidade:

```java
import java.awt.*;

public class HelloWorld {
   public static void main(String[] args) {
      Frame frame = new Frame("Hello World!");
      frame.setSize(300, 200);
      frame.setVisible(true);
   }
}

```

O código acima está completamente dependente da biblioteca java.awt que só é disponível em sistemas operacionais que possuem suporte ao Java SE. Ao ser executado em qualquer outra plataforma sem suporte, ele não irá funcionar. Já o exemplo a seguir é indepentende de bibliotecas específicas e será executado de forma muito mais consistente, sem a necessidade de grandes mudanças.

```java
public class HelloWorld {
   public static void main(String[] args) {
      System.out.println("Hello World!");
   }
}

```

Alguns problemas recorentes que atrapalham a compatibilidade de uma aplicação são:
1. Código hardcoded
2. Uso de muitos recursos específicos a uma plataforma
3. Ausência de suporte a um grupo diferente de caracteres
4. Utilização de caminhos absolutos ao invés de caminhos relativos
5. Bibliotecas de classes incompletas, como descrito por Fowler