console.log(window.innerWidth);
console.log(screen.width);

window.onresize = function(){
    console.log(window.innerWidth);
    window.scroll(0,window.innerWidth);
}
document.onscroll = function(){
    console.log("rolando...")
    document.getElementsByTagName("li")[6].innerHTML="teste2";

}

