function numPares(){
    let cont = 100;
    let numPares = document.getElementById("numPares");
    let text = "";
    
    do{
        if(cont%2==0 && cont>0){
            text += (cont+", ")
             
        }
        cont--;
        if(cont%2==0 && cont==0){
            text += (cont+".")
        }
    
    }while (cont>=0) {
        
    }
    numPares.innerHTML = text;
    }