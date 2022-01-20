import React from "react";


  export function Footer(props){
    return(
  <footer>
  <p>
    Copyrigth Recode {props.dados.mes}-{props.dados.ano}
  </p>
  </footer>
    );
  }
  export function Header(){
    return(
  <footer>
  <p>
    Copyrigth Recode
  </p>
  </footer>
    );
  }
  export function Left(){
    return(
  <Footer dados={{ano:1993 , mes: '08'}}/>
    );
  }
  function Right(){
    return(
  <footer>
  <p>
    Copyrigth Recode
  </p>
  </footer>
    );
  }









 // export default Footer;