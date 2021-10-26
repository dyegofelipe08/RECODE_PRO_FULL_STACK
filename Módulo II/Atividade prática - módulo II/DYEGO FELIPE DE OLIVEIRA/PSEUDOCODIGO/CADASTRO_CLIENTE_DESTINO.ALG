Algoritmo "cadastro_cliente_destino"

Var

   menu : inteiro
   nome: vetor [1..10] de caractere
   cpf: vetor [1..10] de caractere
   local: vetor [1..10] de caractere
   preco: vetor [1..10] de real
   i: inteiro
   qtdClientes: inteiro
   qtdDestinos: inteiro
   menu2 : inteiro

Inicio
   escreval ("==== SISTEMA DE CADASTRAMENTO DE CLIENTES E DESTINOS ====")
   escreval()
   escreval("-------------- O QUE VOCÊ DESEJA? ------------------")
   escreval("(1) CADASTRAR CLIENTES/DESTINOS")
   escreval("(0) FINALIZAR PROGRAMA")
   escreval("----------------------------------------------------")
   escreval("Digite uma das opções numéricas acima: ")
   leia(menu)
   limpatela()
   se ((menu<>1) e (menu<>0))entao
      repita
         escreval ("Você digitou uma opção inválida! ")
         escreval("-------------- O QUE VOCÊ DESEJA? ------------------")
         escreval("(1) CADASTRAR CLIENTES/DESTINOS")
         escreval("(0) FINALIZAR PROGRAMA")
         escreval("----------------------------------------------------")
         escreval("Digite uma das opções numéricas acima: ")
         leia (menu)
         limpatela()
      ate ((menu=1) ou (menu=0))
   fimse
   escolha (menu)
   caso 1
      escreval("QUANTIDADE DE CLIENTES QUE DESEJA CADASTRAR(*entre 1 e 10):")
      leia (qtdClientes)
      se ((qtdClientes<0) ou (qtdClientes>10)) entao
         repita
            escreval ("Você digitou uma quantidade inválida! ")
            escreval("Escolha entre 1 e 10 clientes para realizar o cadastro:")
            leia (qtdClientes)
         ate ((qtdClientes>=0) e (qtdClientes<=10))
         se (qtdClientes=0)  entao
            escreval("Ok. Você não deseja cadastrar clientes.")
         fimse
      senao
         se ((qtdClientes>0) e (qtdClientes<=10)) entao
            i<-1
            enquanto (i<=qtdClientes) faca
               escreval ("Digite  o nome do ",i,"º cliente:")
               leia(nome[i])
               escreval ("Digite o CPF deste cliente:")
               leia(cpf[i])
               i<- i + 1
            fimenquanto
            escreval(qtdClientes," cliente(s) cadastrado(s) com sucesso!")
         senao
            escreval("Ok. Você não deseja cadastrar clientes.")
         fimse
      fimse
      escreval("-----------------------------------------------------------")
      escreval("QUANTIDADE DE DESTINOS QUE DESEJA CADASTRAR(*entre 1 e 10):")
      leia(qtdDestinos)
      se ((qtdDestinos<0) ou (qtdDestinos>10)) entao
         repita
            escreval ("Você digitou uma quantidade  inválida! ")
            escreval("Escolha entre 1 e 10 destinos para realizar o cadastro:")
            leia (qtdDestinos)
         ate ((qtdDestinos>=0) e (qtdDestinos<=10))
         se (qtdDestinos=0)  entao
            escreval("Ok. Você não deseja cadastrar destinos.")
         fimse
      senao
         se ((qtdDestinos>0) e (qtdDestinos<=10)) entao
            i<-1
            enquanto (i<=qtdDestinos) faca
               escreval ("Digite  o nome do ",i,"º destino:")
               leia(local[i])
               escreval ("Digite o preço  (R$)")
               leia(preco[i])
               i<- i + 1
            fimenquanto
            escreval(qtdDestinos," destino(s) cadastrado(s) com sucesso!")
         senao
            escreval("Ok. Você não deseja cadastrar destinos.")
         fimse
      fimse
      escreval("---------------------------------------------------")
      escreval("DESEJA CONSULTAR AS INFORMAÇÕES CADASTRADAS?")
      escreval("           (1) SIM          (0) NÃO  ")
      escreval("----------------------------------------------------")
      escreval("Digite uma das opções numéricas acima: ")
      leia(menu2)
      se ((menu2<>1) e (menu2<>0))entao
         repita
            escreval ("Você digitou uma opção inválida! ")
            escreval("-----DESEJA CONSULTAR AS INFORMAÇÕES CADASTRADAS?----")
            escreval("           (1) SIM          (0) NÃO  ")
            escreval("----------------------------------------------------")
            escreval("Digite uma das opções numéricas acima: ")
            leia (menu2)
            limpatela()
         ate ((menu2=1) ou (menu2=0))
      fimse
      limpatela()
      escolha (menu2)
      caso 1
         escreval("------------------- CLIENTES ----------------------")
         se (qtdClientes=0) entao
            escreval ("NÃO EXISTEM CLIENTES CADASTRADOS")
         senao
            para i de 1 ate qtdClientes passo 1 faca
               escreval("- Cliente ",i,":")
               escreval ("NOME: ",nome[i])
               escreval ("CPF: ",cpf[i])
               escreval("---------------------------------------------------")
            fimpara
         fimse
         escreval("------------------- DESTINOS ----------------------")
         se (qtdDestinos=0) entao
            escreval ("NÃO EXISTEM DESTINOS CADASTRADOS")
         senao
            para i de 1 ate qtdDestinos passo 1 faca
               escreval("- Destino ",i,":")
               escreval ("LOCAL: ",local[i])
               escreval ("PREÇO: R$",preco[i])
               escreval("---------------------------------------------------")
            fimpara
         fimse
      caso 0
         escreval("Ok. Você não deseja consultar os dados. Até a próxima. Obrigado!")
      fimescolha

   caso 0
      escreval("Você finalizou o programa. Até a próxima!")
   fimescolha


Fimalgoritmo