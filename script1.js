// local Storage
let a = 10;
localStorage.setItem("val", a);
let value = localStorage.getItem("val");
console.log(value);

// Session storage
let b = 20;
sessionStorage.setItem("val1", b);
let value2 = sessionStorage.getItem("val1");
console.log(value2);