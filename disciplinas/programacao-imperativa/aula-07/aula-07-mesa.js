// // Ex1. O que cada expressão retorna?
// // Dê uma olhada nestes exemplos e pense sobre o que cada um retorna:

// console.log (!true)
// // retorna "false"

// // !false
// console.log (!false)
// //retorna "true"

// // !!false
// console.log (!!false)
// // retorna "false"

// // !!true
// console.log (!!true)
// //retorna "true"

// // !1
// console.log  (!1)
// // retorna "false"

// // !!1
// console.log  (!!1)
// //retorna "true"

// // !0
// console.log  (!0)
// //retorna "true"

// // !!0
// console.log  (!!0)
// // retorna "false"

// // !!"" 
// console.log  (!!"")
// // retorna "false"

// let x = 5 ;
// let y = 9;
// // a
// x < 10 && x!==5
// console.log(x < 10 && x!==5)
// // retorna "false"

// // b
// x>9 || x===5
// console.log(x>9 || x===5)
// //retorna "true"

// // c
// !(x===y)
// console.log(!(x===y))
// //retorna "true"

// // Ex2. O que cada expressão retorna?
// // Sem testar no console, o que você acha que cada uma destas expressões irá retornar? Elas são true ou false?

// let x =10
// let y ="a"
// y==="b" || x >= 10

// console.log(y==="b" || x >= 10) 
// //retorna "true"

// let x=3
// let y=8
// !(x == "3" || x === y) && !(y !== 8 && x <= y)
// console.log(!(x == "3" || x === y) && !(y !== 8 && x <= y))
// // // retorna "false"

// let str = ""
// let msg = "haha!"
// let eBonito = "false"
// !((str || msg) && eBonito)
// console.log(!((str || msg) && eBonito))
// //  retorna "false"