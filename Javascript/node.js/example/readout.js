var express = require('express');
var app = express();

// respond with "hello world" when a GET request is made to the homepage
app.get('/readtimeout', function(req, res) {
  console.log('get request, not response');
  //res.send('hello world');
});

app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});