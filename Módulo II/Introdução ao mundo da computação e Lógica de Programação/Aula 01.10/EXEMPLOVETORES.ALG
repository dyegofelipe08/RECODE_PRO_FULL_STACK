Algoritmo "ExemploVetores"

Var
   numeros : vetor [1..10] de inteiro
   i: inteiro

Inicio

   para i de 1 ate 10 faca
      escreva ("Digite um valor: ")
      leia (numeros[i])
   fimpara
   escreval ()
   para i de 10 ate 1 passo -1 faca
      escreval ("O valor na posição ", i," do vetor é ", numeros[i], ".")
      escreval()
   fimpara
Fimalgoritmo