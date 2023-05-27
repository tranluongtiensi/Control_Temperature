const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.json());

let temperature = 30;
let light = 80;


// GET method
app.get('/api', (req, res) => {
  res.json({
    error: true,
    message: "This is a message of API",
    data: {
      temperature: temperature,
      light: light
    }
  });
});

// POST method
app.post('/api', (req, res) => {
  temperature = req.body.temperature;
  light = req.body.light;
  
  res.json({
    error: true,
    message: "Data updated successfully"
  });
});

// PUT method
app.put('/api', (req, res) => {
  temperature = req.body.temperature;
  light = req.body.light;

  res.json({
    error: true,
    message: "Data updated successfully"
  });
});

// DELETE method
app.delete('/api', (req, res) => {
  temperature = 0;
  light = 0;

  res.json({
    error: true,
    message: "Data deleted successfully"
  });
});

// Start the server
app.listen(3000, () => {
  console.log('Server listening on port 3000');
});

// Localhost: http://localhost:3000/api/
