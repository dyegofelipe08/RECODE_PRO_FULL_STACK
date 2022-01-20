import React from "react";
import Primeiro from './primeiro';
import ComParametro from './ComParametro'
import Fragmento from './Fragmento';
import ParOuImpar from "./ParOuImpar";
import Card from './Card';
import './App.css';

export default () => (
    <div className="App" >
        <h1>Fundamentos React</h1>

        <div className="Cards" >
        <Card titulo='Renderização  condicional'>
            <ParOuImpar numero={21} ></ParOuImpar>
        </Card>


        <Card titulo='Fragmento' >
            <Fragmento></Fragmento>
        </Card>

        <Card titulo='Com parâmetro' >
            <ComParametro
                titulo='Situação do aluno'
                aluno='Dyego'
                nota={6.5}
            ></ComParametro>
        </Card>

        <Card titulo='Primeiro componente' >
            <Primeiro></Primeiro>
        </Card>

        </div>

    </div>


)



