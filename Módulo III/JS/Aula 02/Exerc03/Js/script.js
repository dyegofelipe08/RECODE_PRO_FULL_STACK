function somatorio(){
    let i;
    let somatorio = document.getElementById("somatorio");
    let text = "";
    let soma = 0;
    let x=0;
    let impar=0;
    let par=0;
    
    for(i=1; i<=5;i++ ){

        x =(prompt("Digite o "+i+"º número:"))
        if(x%2==0){
            par++;
        }else{
            impar++;
        }
        soma += Number(x);

    }
    text = "O somatório dos números digitados é: "+soma+". Foram digitados "+par+" números pares e "+impar+" números ímpares."
        
    somatorio.innerHTML = text;
    }