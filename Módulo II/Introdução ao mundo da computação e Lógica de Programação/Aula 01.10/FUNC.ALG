Algoritmo "func"
Var
n, m, x, y, res : inteiro // vari�veis globais.......



// in�cio da minha fun��o
funcao soma : inteiro
var
aux: inteiro // vari�vel local.........
inicio
aux <- n + m
retorne aux
fimfuncao



funcao subtract : inteiro
var
aux: inteiro // vari�vel local.........
inicio
aux <- x - y
retorne aux
fimfuncao



// Programa Principal
Inicio
n <- 15
m <- 13
x <- 15
y <- 12
res <- soma // chama a fun��o soma
escreval("O resultado da soma �: ", res)

res <- subtract // chama a fun��o subtract
escreva("O resultado da subtra��o: ", res)



Fimalgoritmo