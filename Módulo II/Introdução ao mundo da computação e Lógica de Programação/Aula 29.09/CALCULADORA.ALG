Algoritmo "calculadora"

Var
   operador : inteiro
   num1, num2, result : real
Inicio
   escreval ("Vamos fazer um operação matemática.")
   escreva ("Digite o primeiro número: ")
   leia (num1)
   escreva ("Digite o segundo número: ")
   leia (num2)
   escreval()
   escrevaL ("ESCOLHA UMA DAS OPÇÕES ABAIXO DIGITANDO O   NÚMERO DA OPÇÃO: ")
   escreval()
   escrevaL ("(1)SOMAR   (2)SUBTRAIR  (3)MULTIPLICAR (4)DIVIDIR")
   leia (operador)
   escolha operador
   caso 1
      result <- num1+num2
      escreval("SOMA: O RESULTADO DA OPERAÇÃO É: ", result)
   caso 2
      result <- num1-num2
      escreval("SUBTRAÇÃO: O RESULTADO DA OPERAÇÃO É: ", result)
   caso 3
      result <- num1*num2
      escreval("MULTIPLICAÇÃO: O RESULTADO DA OPERAÇÃO É: ", result)
   caso 4
      result <- num1/num2
      escreval("DIVISÃO: O RESULTADO DA OPERAÇÃO É: ", result)
   outrocaso
      escreval("Opção inválida!")
   fimescolha

Fimalgoritmo