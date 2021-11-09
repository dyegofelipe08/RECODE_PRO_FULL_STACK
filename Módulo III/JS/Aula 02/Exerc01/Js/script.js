function tabuada(){
let num = prompt("Digite um número:");
let cont = 1;
let tab = document.getElementById("tab");
let text = "";

while (cont<=9) {
    text += (num+" x "+cont+" = "+(num*cont)+"<br>");
    cont++;  
}
tab.innerHTML = text;
}

