import react from "react"

export default  function Primeiro(){
const msg = 'Seja bem-vindo!'
const valorTotal =13*10

    return(
        <div>
            <h2>Primeiro componente</h2>
            <p> {msg}</p>
            <p>O valor total é R$ {valorTotal}</p>           
            
        </div>
    )
}