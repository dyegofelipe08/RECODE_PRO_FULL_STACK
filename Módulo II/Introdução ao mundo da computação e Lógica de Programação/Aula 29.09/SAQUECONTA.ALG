Algoritmo "saqueConta"
   Var
   saldo, quantia: real
   Inicio
      saldo <- 1000.00
      escreva ("Quanto você deseja sacar: ")
      leia (quantia)
           se (quantia<=saldo) entao
              escreval ("Saque realizado com sucesso! Aguarde para retirar o dinheiro.")
              escreval ("Você sacou R$", quantia,".")
           senao
                escreval("Saldo indisponível!")
           fimse
Fimalgoritmo