Algoritmo "NumeroExistenteVetor"
//Fa�a um algoritmo que preencha um vetor de at� 6 posi��es.
//Na sequ�ncia o usu�rio dever� digitar um n�mero qualquer e por
// �ltimo o programa dever� verificar no vetor se este n�mero existe.
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
   escreva ("Digite um n�mero inteiro para verificarmos se existe no vetor: ")
   leia (numUsuario)

   para i de 1 ate 6 faca
      se (num[i] = numUsuario) entao
         escreval ("O n�mero que voc� digitou ",num[i], " encontra-se na ", i, "� posi��o do vetor.")
      senao
         cont <- cont + 1
      fimse
      se cont>=6 entao
         escreva ("O n�mero que voc� digitou n�o est� contido no vetor. ")
      fimse
   fimpara
Fimalgoritmo