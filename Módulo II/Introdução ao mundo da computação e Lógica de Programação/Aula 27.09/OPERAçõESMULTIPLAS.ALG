Algoritmo "opera��esMultiplas"

// Escreva um algoritmo que fa�a o somat�rio de dois n�meros a
//serem informados pelo usu�rio, na sequencia o usu�rio dever�
//informar mais dois novos n�meros e o programa dever� fazer agora
//uma subtra��o com estes novos dois valores e por �ltimo fazer a
// multiplica��o entre os resultados da soma e subtra��o.

Var
   a,b,c,d, res1, res2: real
   
Inicio

      escreval("Digite  o primeiro valor: ")
      leia (a)
      escreval("Digite  o segundo valor: ")
      leia (b)
      res1 <- a + b
      escreval("O resultado da primeira opera��o (soma) �: ", res1)
      escreval("Digite  o terceiro valor: ")
      leia (c)
      escreval("Digite  o quarto valor: ")
      leia (d)
      res2 <- c - d
      escreval("O resultado da segunda opera��o (subtra��o) �: ", res2)
      escreval ("O produto dos dois resultado acima � = ", res1 * res2)

      
      
      
      


Fimalgoritmo