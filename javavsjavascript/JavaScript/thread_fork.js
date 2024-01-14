const { fork } = require('child_process');
var express = require('express');
var app = express();
app.get('/endpoint', (request, response) => {
  
   const process = fork('./mail.js');
   const mail_messages = request.body.emails;

   process.send({ mail_messages });
   process.on('sendmail', (message) => {
     log.info(` mail count  ${message.counter}`);
   });
   return response.json({ status: true, sent: true });
});