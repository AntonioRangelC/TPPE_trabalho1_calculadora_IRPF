
# **Trabalho 1 da disciplina TPPE**

## Integrantes

| Nome | Matrícula |
| - | - |
| Antonio Rangel Chaves | 180098021 |
| Ana Carolina Rodrigues leite | 190101792 |
| Vitor Diniz Pagani Vieira Ribeiro | 180132385 |
| Rafael Leao Teixeira de Magalhaes | 190019158 |
| Lameque Fernandes Azevedo | 180104390 |
| João Paulo Coelho de Souza  | 160127327 |


## Sobre

O projeto consiste em fazer um simulador parecido ao simulador disponibilizado pela RFB, sendo o  cálculo do  Imposto de Renda de Pessoa Física (IRPF). Esse simulador será construído através do método de TDD utilizando, as técnicas de falsificação, duplicação e triangulação de testes.

O projeto resultante do desenvolvimento através de TDD será capaz de fazer o:

- Cadastro de rendimentos:
  - Cadastrar rendimentos com a descrição (salario, aluguel, etc...) e valor
  - Não permitir descrição em branco (nesse caso lançar uma exceção do tipo DescricaoEmBrancoException
  - Não permitir informar valores de rendimentos em branco ou inválidos (negativos por exemplo). Nesses casos lançar exceção do tipo ValorRendimentoInvalidoException
- Cadastro de deduções:
  - Cadastrar deduções através de sua descrição (Previdencia privada, Funpresp, etc...) e valor.
  - Cadastrar uma ou mais contribuição previdenciária oficial, informando descrição e valores.
  - Cadastrar uma ou mais pensão alimentícia, informando valores.
  - Cadastrar dependentes (zero ou mais), informando o nome e a data de nascimento de cada dependente.
- Cálculo dos impostos das faixas de impostos.
- Calcular a alíquota efetiva

## Uso

Para utilizar o projeto com o IntelliJ IDEA, basta:

- Clonar o repositório
`git clone https://github.com/AntonioRangelC/TPPE_trabalho1_calculadora_IRPF.git`

- Entrar no diretório criado:
`cd TPPE_trabalho1_calculadora_IRPF`

- Abra o projeto com o IntelliJ.

O projeto foi desenvolvido no IntelliJ IDEA. Caso tenha a necessidade de utiliza-lo em uma IDE distinta, recomenda-se utilizar o Eclipse, há um passo a passo dísponivel na [documentação](https://www.jetbrains.com/help/idea/exporting-an-intellij-idea-project-to-eclipse.html) do IntelliJ.

## Trabalho Prático
- [X] [Trabalho Prático 1 - Test-Driven Development](https://github.com/andrelanna/fga0242/tree/master/tp1). 
