Algoritmo "func"
Var
n, m, x, y, res : inteiro // variáveis globais.......



// início da minha função
funcao soma : inteiro
var
aux: inteiro // variável local.........
inicio
aux <- n + m
retorne aux
fimfuncao



funcao subtract : inteiro
var
aux: inteiro // variável local.........
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
res <- soma // chama a função soma
escreval("O resultado da soma é: ", res)

res <- subtract // chama a função subtract
escreva("O resultado da subtração: ", res)



Fimalgoritmo