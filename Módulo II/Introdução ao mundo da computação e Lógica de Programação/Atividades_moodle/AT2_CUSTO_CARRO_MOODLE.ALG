Algoritmo "AT2_custo_carro_moodle"

Var
custoInicial,custoFinal : real
percDistribuidor: real
percImpostos: real

Inicio
percDistribuidor<- 0.28
percImpostos <- 0.45

      escreva ("Digite o valor inicial do veículo(R$): ")
      leia (custoInicial)

      custoFinal <- (custoInicial + (percDistribuidor * custoInicial) + (percImpostos * custoInicial))

      escreval("Com as taxas atribuídas, o consumidor pagará: R$",custoFinal," pelo veículo.")


Fimalgoritmo