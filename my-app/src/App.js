import Box from '@mui/material/Box';
import Item from '@mui/material/Item';
import React, { Component } from 'react';
import './App.css';

class App extends Component {
  render() {
    return (
      <Box sx={{ display: 'grid', gridTemplateRows: 'repeat(3, 1fr)' }}>
        <Item>1</Item>
        <Item>2</Item>
        <Item>3</Item>
      </Box>
    );
  }
}

export default App;
