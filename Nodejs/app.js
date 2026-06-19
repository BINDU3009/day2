// var a=10
// console.log(a)
// //OS module
// const os = require('os')
// console.log(os.platform())
// console.log(os.arch())
// console.log(os.hostname())
// console.log(os.totalmem())
// console.log(os.freemem())
// //Path module
// const path=require('path')
// console.log(path.basename(__filename))
// console.log(path.basename(__dirname))
// console.log(path.extname(__filename))
// console.log(path.dirname(__filename))
// console.log(path.dirname(__dirname))
// console.log(path.parse('note.txt'))
//FS module
// const fs=require('fs')
//Writing and creating files
// console.log("Creating and writing file")
// fs.writeFileSync('note.txt',"I am already existing one")
// fs.writeFile('note1.txt',"I'm another file",()=>{
//  console.log("Asynchronous")
// });
// console.log("created and written file")
//Reading files
// console.log("Reading file")
// let read=fs.readFileSync('note1.txt','utf-8')
// console.log(read)
// console.log("file was read ")
// console.log("another file reading")
// let read1=fs.readFile('note.txt','utf-8',()=>
// {
//     console.log("yes i am second file which is asynchronously reading")
// })
// console.log("another file also read")
//Appending files
// fs.appendFileSync('note.txt',"\n I'm the one who is appending text")
// fs.appendFile('note1.txt',"I'm appending",()=>{
//     console.log("appended")
// })
//Renaming file
// fs.rename('note.txt','test.txt',()=>{
//     console.log("asynchronous")
// })
// fs.renameSync('note1.txt','test1.txt')
//Deleting the files
// fs.unlinkSync('test.txt')
// fs.unlink('test1.txt',()=>{
//     console.log("File Deleted")
// })
//Checking file Existing
// let val=fs.existsSync('note.txt')
// console.log(val)
//create folder
// fs.mkdir("folder1",()=>{
//     console.log("folder created")
// })
// fs.mkdir("folder2",()=>{
//     console.log("Another folder")
// })
//Reading directories
// fs.readdir('folder1',(err,files)=>{
//     if(err){
//         console.log(err)
//     }
//     console.log(files)
// })
//delete folder
// fs.rmSync('folder1',{recursive:true,force:true})
// fs.rmdirSync('folder2')
//File information
// console.log((fs.statSync('note.txt')).isFile())
// console.log((fs.statSync('note.txt')).isDirectory())
// console.log((fs.statSync('note.txt')).size)
//Copy file
// fs.copyFile('note.txt','note1.txt',()=>{
//     console.log("copied successfully")
// })
//Opening File
// fs.open('note.txt','r',(err,fd)=>{
//     if(err){
//         console.log(err)
//     }
//     console.log(fd)
// })
//http
// const http=require('http')
// const server=http.createServer((req,res)=>{
//     res.write("server created")
//     res.end()
// })
// server.listen(3000,()=>{
//     console.log("server is running on port no 3000")
// })
// const http = require('http');

// const server = http.createServer((req, res) => {

//     if (req.url === '/favicon.ico') {
//         res.end();
//         return;
//     }

//     console.log(req.url);

//     res.end("Hello");
// });

// server.listen(3000);
// const http = require('http')

// const server = http.createServer((req, res) => {
//     console.log(req.method);

//     res.end("method Printed");
// });

// server.listen(3000,()=>console.log("server is running.."));
// Routing
// const http=require('http')
// const server=http.createServer((req,res)=>{
//     if(req.url==='/'){
//         res.end("home page")
//     }
//     else if(req.url==='/about'){
//         res.end("About page")
//     }
//     else if(req.url==='/contact'){
//         res.end("Contact page")
//     }
//     else{
//         res.statusCode(404)
//         res.end("page not found")
//     }
// })
// server.listen(3000)
//sending html
// const http=require('http')
// const server=http.createServer((req,res)=>{
//     res.setHeader(
//         'content-Type',
//         'text/html'
//     )
//     res.end('<h1>Welcome</h1>')
// })
// server.listen(3000)
//sending json
// const http=require('http')
// const server=http.createServer((req,res)=>{
//     res.setHeader('content-type','application/json')
//     res.end(JSON.stringify({msg:"Done"}))
// })
// server.listen(3000)
// //using writeHead()
// const http = require('http')
// const server=http.createServer((req,res)=>{
//     res.writeHead(200,{
//         'content-type':'text/plain'
//     })
//     res.end("success")
// })
// server.listen(3000)
//express
//First Express Server
// const http = require('http');
// const express = require('express');
// const app = express();
// app.get('/', (req, res) => {
//     return res.send("welcome!");
// });
// const server = http.createServer(app);
// server.listen(3000);
//Express Routing
// const express=require('express')
// const app=express()
// app.get('/',(req,res)=>{
//     res.send(`<h1> Home Page</h1>`)
// })
// app.get('/about',(req,res)=>{
//     res.sendFile(__dirname+ '/about.html')
// })
// app.get('/contact',(req,res)=>{
//     res.json({ph1:1234,ph2:3456})
// })
// app.listen(3000)
//Route Parameters
const express=require('express')
const app=express()
app.use(express.json())
let users=[{
    name:"bindu"
}{
    name:"vishnu"
}]
app.get('/users',(req,res)=>{
    res.json(users)
})
app.listen(3000)