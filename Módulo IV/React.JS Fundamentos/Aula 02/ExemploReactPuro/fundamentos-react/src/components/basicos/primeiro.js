import React from "react"
export default function Pirmeiro(){
    const msg = "Seja bem-vindo(a)!"
    let num = prompt('Digite um valor: ')
    return (
        <div>
            <h2>Primeiro componente</h2>
            <p>{msg}</p>
            <p> {num} </p>
        </div>
    )
}