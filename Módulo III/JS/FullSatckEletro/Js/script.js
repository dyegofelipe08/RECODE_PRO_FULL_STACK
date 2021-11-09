function exibirCategoria(categoria) {

    let elementos = document.getElementsByClassName("box_produto");
    //console.log(elementos);

    for (let i = 0; i < elementos.length; i++) {
        console.log(elementos[i].id);
        if (categoria == elementos[i].id) {
            elementos[i].style = "display:block";
        } else {
            elementos[i].style = "display:none";
        }
    }


}
let exibirTodos = () => {
    let elementos = document.getElementsByClassName("box_produto");
    for (let i = 0; i < elementos.length; i++) {

        elementos[i].style = "display:block";
    }
}
let destaque = (elemento) => {
    
       
        if (elemento.width==120) elemento.width=240
        else elemento.width=120
   
    

}