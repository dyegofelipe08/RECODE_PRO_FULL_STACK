import React from "react";


export class Footer extends React.Component {
  constructor(props) {
    super(props);
    this.state = props;
  }
  componentDidMount() {
    console.log('Conectando ao banco de dados...')
    setInterval(() => {
      this.atualizar();
    }, 2000);
  }

  atualizar() {
    this.setState(
      {
        dados: { ano: this.state.dados.ano + 1 }
      }
    );
  }

  componentWillUnmount() {
    console.log('Desconectando do banco de dados...')

  }
  render() {
    return (
      <footer>
        <p>
          Copyrigth Recode {this.state.dados.mes}-{this.state.dados.ano}
        </p>
      </footer>
    );

  }
}


export class Relogio extends React.Component {
  constructor(props) {
    super(props);
    this.state = props;
  }
  componentDidMount() {
    setInterval(() => {
this.atualizarSeg();
    }, 1000);

    if(this.state.dados.seg == 5){
      this.atualizarMin();
    }
    if(this.state.dados.min == 60){
      this.atualizarHora();
    }
  }

  atualizarSeg() {
    this.setState(
      {
        dados: {seg: this.state.dados.seg +1}
      }
    )
  }
  atualizarMin(){
    
      this.setState(
        {
          dados: { min: this.state.dados.min + 1, seg: this.state.dados.seg = 0 }
        }
      )
  }
  atualizarHora(){
      this.setState(
        {
          dados: { hora: this.state.dados.hora + 1, min: this.state.dados.min = 0, seg: this.state.dados.seg = 0 }
        }
      )
  }


  render() {
    return (
      <footer>
        <p>
          Relógio: {this.state.dados.hora} : {this.state.dados.min} : {this.state.dados.seg}
        </p>
      </footer>
    );

  }



}

export function Header() {
  return (
    <footer>
      <p>
        Copyrigth Recode
      </p>
    </footer>
  );
}

export function Left() {
  return (
    <Footer dados={{ ano: 1993, mes: '08' }} />
  );
}
function Right() {
  return (
    <footer>
      <p>
        Copyrigth Recode
      </p>
    </footer>
  );
}









 // export default Footer;