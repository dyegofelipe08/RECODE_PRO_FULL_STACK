import logo from './logo.svg';
import './App.css';
import {Footer, Left, Relogio} from './Footer';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <Footer dados={{ano:2021, mes:10 }}/>
      <Left/>
      <Relogio dados={{hora: 0, min: 0 , seg: 0}} />
    </div>
  );
}

export default App;
