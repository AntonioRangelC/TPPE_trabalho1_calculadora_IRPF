Correção Tp1
--

|   |Critério                                             |Nota(%) |Nota(ptos)|
|---|-----------------------------------------------------|--------|----------|  
| 1 |Ref.1: Extrair método (10 pts)                       |   100  |    10    |  
| 2 |Ref.2: Substituir método por objeto-método (15 pts)  |   80   |    12    |  
| 3 |Ref.3: Extrair constante (5 pts)                     |   00   |    00    |  
|   |**Total**                                            |        |    22    |  

* Observações:
  Refatoração 2: o método-objeto instancia novo objeto para chamar os métodos
estaNaFaixaX. Errado, o objeto-método é quem deve ser instanciado pela classe
Calculo, utilizado (chamada ao metodo computar) e logo em seguida ser
descartado. (-20%)
  Refatoracao 3: as constantes VALOR_LIMITE_FAIXAX e as variaveis
porcentagemFaixaX foram movidas de lugar, simplesmente. De resto, continuam como
nas definições anteriores.
