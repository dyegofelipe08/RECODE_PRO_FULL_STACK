Algoritmo "calculadora"

Var
   operador : inteiro
   num1, num2, result : real
Inicio
   escreval ("Vamos fazer um opera��o matem�tica.")
   escreva ("Digite o primeiro n�mero: ")
   leia (num1)
   escreva ("Digite o segundo n�mero: ")
   leia (num2)
   escreval()
   escrevaL ("ESCOLHA UMA DAS OP��ES ABAIXO DIGITANDO O   N�MERO DA OP��O: ")
   escreval()
   escrevaL ("(1)SOMAR   (2)SUBTRAIR  (3)MULTIPLICAR (4)DIVIDIR")
   leia (operador)
   escolha operador
   caso 1
      result <- num1+num2
      escreval("SOMA: O RESULTADO DA OPERA��O �: ", result)
   caso 2
      result <- num1-num2
      escreval("SUBTRA��O: O RESULTADO DA OPERA��O �: ", result)
   caso 3
      result <- num1*num2
      escreval("MULTIPLICA��O: O RESULTADO DA OPERA��O �: ", result)
   caso 4
      result <- num1/num2
      escreval("DIVIS�O: O RESULTADO DA OPERA��O �: ", result)
   outrocaso
      escreval("Op��o inv�lida!")
   fimescolha

Fimalgoritmo