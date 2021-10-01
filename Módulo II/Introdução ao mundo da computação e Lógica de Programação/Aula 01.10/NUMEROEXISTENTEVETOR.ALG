Algoritmo "NumeroExistenteVetor"
//Faça um algoritmo que preencha um vetor de até 6 posições.
//Na sequência o usuário deverá digitar um número qualquer e por
// último o programa deverá verificar no vetor se este número existe.
//Caso positivo, exibir uma mensagem para o usuario.
Var
   num : vetor [1..6] de inteiro
   i : inteiro
   numUsuario: inteiro
   cont : inteiro

Inicio
   cont<- 0
   para i de 1 ate 6 faca
      leia (num [i])
   fimpara
   escreva ("Digite um número inteiro para verificarmos se existe no vetor: ")
   leia (numUsuario)

   para i de 1 ate 6 faca
      se (num[i] = numUsuario) entao
         escreval ("O número que você digitou ",num[i], " encontra-se na ", i, "ª posição do vetor.")
      senao
         cont <- cont + 1
      fimse
      se cont>=6 entao
         escreva ("O número que você digitou não está contido no vetor. ")
      fimse
   fimpara
Fimalgoritmo