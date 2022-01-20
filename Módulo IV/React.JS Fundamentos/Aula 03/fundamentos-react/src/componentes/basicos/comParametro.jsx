import React from "react"
export default function comParametro(props){  
    
    const status = props.nota >=7 ? 'aprovado' : 'em recuperação'
    const notaInt = Math.ceil(props.nota)
return(
    <div>
        <h2>{props.titulo}</h2>
        <h2>{props.aluno} possui nota {notaInt} e está {status}</h2>
    </div>
)
}