console.log(" try-catch statement");

try {
  console.log("running try block");
  throw "exception message";
  console.log("this block will not be execute");
}
catch (exception) {
  console.log("running catch block");
  console.log(exception);
  console.log("exiting catch block");
}
finally {
  console.log("running  the finally block");
}

console.log("exiting try-catch statement");