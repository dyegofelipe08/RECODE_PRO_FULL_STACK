import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import { ListItems, NumberList } from './ListItems';

const numbers = [1,2,3,4,5]
ReactDOM.render(
  
    <NumberList numbers={numbers} />
  ,
  document.getElementById('root')
);

