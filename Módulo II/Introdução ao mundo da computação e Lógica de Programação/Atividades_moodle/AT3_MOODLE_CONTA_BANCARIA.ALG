Algoritmo "AT3_moodle_Conta_bancaria"

Var

investimento: inteiro
valor, saldoFinal: real


Inicio
      escreva ("Digite o valor a ser investido (R$): ")
      leia (valor)
      escreval ("Escolha o tipo de investimento: ")
      escreval ("POUPAN�A (1) ou FUNDO DE RENDA FIXA (2)")
      leia (investimento)
      se (investimento = 1)entao
         saldoFinal <-   valor * 1.05
         escreval ("Legal. Voc� ter�: R$", saldoFinal," no final do prazo do investimento.")
      senao
      se (investimento = 2)entao
         saldoFinal <- valor * 1.1
         escreval ("Legal! Voc� ter�: R$", saldoFinal," no final do prazo do investimento.")
      senao
           escreval ("Op��o inv�lida")}
      fimse
fimse
           
      




Fimalgoritmo