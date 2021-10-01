Algoritmo "AT6_moodle_Peso_ideal"

Var
sexo: inteiro
altura, peso, pesoIdeal: real

Inicio
escreval ("Digite o seu sexo:")
escreval ("(1) - Masculino       (2) - Feminino ")
leia(sexo)

     se (sexo=1)entao
        escreva ("Digite seu peso (Kg): ")
        leia (peso)
        escreva ("Digite sua altura (m): ")
        leia (altura)
        pesoIdeal<- (72*altura)-58
        escreval ("Seu peso atual é: ",peso,"  Kg, mas o ideal seria: ",pesoIdeal," Kg.")
     senao
          se (sexo=2) entao
          escreva ("Digite seu peso (Kg): ")
          leia (peso)
          escreva ("Digite sua altura (m): ")
          leia (altura)
          pesoIdeal<- (62*altura)-44
          escreval ("Seu peso atual é: ",peso," Kg, mas o ideal seria: ",pesoIdeal," Kg.")
     senao
          escreval ("Opção de sexo inválida!")
     fimse
fimse



     



Fimalgoritmo