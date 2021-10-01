Algoritmo "AT5_preco_produto_mooodle"

Var
classe: caractere
preco, precoFinal:real


Inicio
escreva ("Digite o preço do produto (R$): ")
leia (preco)
precoFinal <- preco*0.85
escreval ("Você teve um desconto de 15% e pagará: R$", precoFinal," neste produto.")
         se (precoFinal<=500) entao
         escreval("Este produto se classifica como BARATO.")
         senao
         escreval ("Este produto se cllassifica como CARO.")
         fimse


Fimalgoritmo