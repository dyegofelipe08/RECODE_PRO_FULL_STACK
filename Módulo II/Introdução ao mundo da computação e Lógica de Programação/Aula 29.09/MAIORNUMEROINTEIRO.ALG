Algoritmo "maiorNumeroInteiro"

Var
n1,n2,n3: inteiro
Inicio
   escreva ("Digite tr�s n�meros inteiros distintos: ")
   leia (n1, n2, n3)
   se ((n1<>n2) e (n1<>n3) e (n2<>n3)) entao
      se ((n1>n2) e (n1>n3)) entao
         escreval(n1," foi o maior dos n�meros digitados!")
      senao
           se ((n2>n1) e (n2>n3))  entao
              escreval (n2," foi o maior dos n�meros digitados!")
           senao
                escreval (n3," foi o maior dos n�meros digitados!")
           fimse
      fimse
   senao
        escreval ("Ops! Algum dos n�meros digitados � igual.")
   fimse
Fimalgoritmo