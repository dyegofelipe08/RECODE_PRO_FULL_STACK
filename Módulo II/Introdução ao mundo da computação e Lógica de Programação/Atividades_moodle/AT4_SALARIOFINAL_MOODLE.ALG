Algoritmo "AT4_salarioFinal_moodle"

Var
salarioAtual, taxa, salarioFinal: real

Inicio

escreva("Digite o sal�rio mensal atual deste trabalhador (R$): ")
leia (salarioAtual)
escreva("Digite a taxa de reajuste a ser aplicada (%): ")
leia (taxa)
salarioFinal <- ((taxa/100)+1)*salarioAtual
escreva ("Ao ser aplicado o reajuste, o trabalhador receber�: R$",salarioFinal,"/m�s.")




Fimalgoritmo