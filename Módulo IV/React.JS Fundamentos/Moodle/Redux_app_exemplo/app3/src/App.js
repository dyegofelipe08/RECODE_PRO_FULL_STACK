import React, { Component } from 'react';
import { connect } from 'react-redux';
import './App.css';
import { bindActionCreators } from 'redux';
import { clickButton } from './actions';

class App extends Component {
  state = {
    inputValue: ''
  }
  inputChange = event => {
    this.setState({
      inputValue: event.target.value
    })
  }

  render() {
    const {
      clickButton,
      newValue } = this.props;
    const { inputValue } = this.state;
    return (
      <div className="App" style={{ paddingTop: '10px' }}>
        <h2>App3: React com Redux</h2>
        <input type='text'
          onChange={this.inputChange}
          value={inputValue}
        />
        <button onClick={() => clickButton(inputValue) } >
          Enviar
        </button>
        <h3>{newValue}</h3>
      </div>
    );
  }

}

const mapStateToProps = store => ({
  newValue: store.clickState.newValue
});
const mapDispatchToProps = dispatch => 
bindActionCreators({clickButton}, dispatch)

export default connect(mapStateToProps, mapDispatchToProps)(App);
