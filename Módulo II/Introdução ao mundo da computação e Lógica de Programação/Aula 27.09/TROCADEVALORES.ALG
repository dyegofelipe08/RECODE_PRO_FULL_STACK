Algoritmo "trocaDeValores"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
      a, b, c: inteiro
Inicio
     a <- 10
     b <- 20
     c <- 0
     
     escreval ("A inicia com o valor: ",a," e B inicia com o valor: ",b,".")
     c <- b
     b <- a
     a <- c
     
     escreval ("Agora A tem o valor: ", a, " e B tem o valor: ", b,".")
     
//Usando está lógica é possível fazer sem variável coringa.
//A<- A+B
//B<- A-B
//A<- A-B


Fimalgoritmo