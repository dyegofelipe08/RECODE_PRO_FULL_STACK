Algoritmo "AT2_custo_carro_moodle"

Var
custoInicial,custoFinal : real
percDistribuidor: real
percImpostos: real

Inicio
percDistribuidor<- 0.28
percImpostos <- 0.45

      escreva ("Digite o valor inicial do ve�culo(R$): ")
      leia (custoInicial)

      custoFinal <- (custoInicial + (percDistribuidor * custoInicial) + (percImpostos * custoInicial))

      escreval("Com as taxas atribu�das, o consumidor pagar�: R$",custoFinal," pelo ve�culo.")


Fimalgoritmo