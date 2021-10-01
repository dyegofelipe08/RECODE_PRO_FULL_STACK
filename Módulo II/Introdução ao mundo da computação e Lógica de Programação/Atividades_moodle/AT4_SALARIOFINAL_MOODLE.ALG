Algoritmo "AT4_salarioFinal_moodle"

Var
salarioAtual, taxa, salarioFinal: real

Inicio

escreva("Digite o salário mensal atual deste trabalhador (R$): ")
leia (salarioAtual)
escreva("Digite a taxa de reajuste a ser aplicada (%): ")
leia (taxa)
salarioFinal <- ((taxa/100)+1)*salarioAtual
escreva ("Ao ser aplicado o reajuste, o trabalhador receberá: R$",salarioFinal,"/mês.")




Fimalgoritmo