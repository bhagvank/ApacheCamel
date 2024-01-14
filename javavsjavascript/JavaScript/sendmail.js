async function sendMultipleMails(mails) {
   let sendMails = 0;
   // code for sending multiple mails
   return sendMails;
}

process.on('sendmail', async (message) => {
  const countOfMailsSent = await sendMultipleMails(message.mails); 
  
  process.send({ counter: countOfMailsSent });
});