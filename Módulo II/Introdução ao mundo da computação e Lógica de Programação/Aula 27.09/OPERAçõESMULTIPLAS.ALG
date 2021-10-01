Algoritmo "operaçõesMultiplas"

// Escreva um algoritmo que faça o somatório de dois números a
//serem informados pelo usuário, na sequencia o usuário deverá
//informar mais dois novos números e o programa deverá fazer agora
//uma subtração com estes novos dois valores e por último fazer a
// multiplicação entre os resultados da soma e subtração.

Var
   a,b,c,d, res1, res2: real
   
Inicio

      escreval("Digite  o primeiro valor: ")
      leia (a)
      escreval("Digite  o segundo valor: ")
      leia (b)
      res1 <- a + b
      escreval("O resultado da primeira operação (soma) é: ", res1)
      escreval("Digite  o terceiro valor: ")
      leia (c)
      escreval("Digite  o quarto valor: ")
      leia (d)
      res2 <- c - d
      escreval("O resultado da segunda operação (subtração) é: ", res2)
      escreval ("O produto dos dois resultado acima é = ", res1 * res2)

      
      
      
      


Fimalgoritmo