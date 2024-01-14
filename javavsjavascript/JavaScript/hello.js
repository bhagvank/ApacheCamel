/**
 * 
 */

var http = require("http");

http.createServer(function (request, response) {

   response.writeHead(200, {'Content-Type': 'text/plain'});
   
   response.end('Greetings \n');
}).listen(8091);


console.log('You can access the server at http://127.0.0.1:8091/');