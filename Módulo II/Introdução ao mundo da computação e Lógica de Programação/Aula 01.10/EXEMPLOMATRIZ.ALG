Algoritmo "exemploMatriz"

Var
   numeros : vetor [1..3,1..2] de inteiro
   i, j : inteiro
Inicio
   para i de 1 ate 3 faca
        para j de 1 ate 2 faca
      escreva ("Digite  o valor na posição ",i,",", j," :")
      leia (numeros [i,j])
      fimpara
   fimpara
   para i de 1 ate 3 faca
        para j de 1 ate 2 faca
      escreva (numeros [i,j])
      escreva (" ")
      fimpara
      escreval()
   fimpara

Fimalgoritmo