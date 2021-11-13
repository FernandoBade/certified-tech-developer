// Capítulo 1: Fundamentos de programação

// 1.Primeiros Programas
// Exercícío 1
//Next

// Exercícío 2
//Next

// Exercícío 3
program {
  Mover(Norte)
}

// Exercícío 4
program {
  Mover(Norte)
  Mover(Norte)
  Mover(Norte)
}

// Exercícío 5
program{
  Mover(Leste)
  Mover(Leste)
  Mover(Sul)
}

// Exercícío 6
program {
  Mover(Norte)
  Mover(Leste)
}

// Exercícío 7
program{
  Mover(Norte)  
  Mover(Norte)  
  Mover(Norte)  
  Mover(Norte)  
}

// Exercícío 8
program {
  Colocar(Vermelho)    
}

// Exercícío 9
program {
  Colocar(Vermelho)
  Colocar(Vermelho)
  Colocar(Azul)
  Colocar(Verde)
  Colocar(Vermelho)
}

// Exercícío 10
program {
  Colocar(Vermelho)
  Colocar(Vermelho)
  Colocar(Vermelho)
  Colocar(Vermelho)
  Colocar(Preto)
  Colocar(Preto)
  Colocar(Preto)
}

// Exercícío 11
program {
  Mover(Sul)
  Retirar(Vermelho)
}

// Exercícío 12
program {
  Retirar(Verde)
}

// Exercícío 13
program {
  Retirar(Vermelho)
  Retirar(Preto)
  Retirar(Azul)
  Retirar(Verde)
}


// 2.Prática Primeiros Programas
// Exercícío 1
program {
  Colocar(Vermelho)
  Mover(Leste)
  Colocar(Preto)
}

// Exercícío 2
program {
  Colocar(Vermelho)
  Colocar(Vermelho)
  Mover(Leste)
  Colocar(Vermelho)
  Colocar(Vermelho)
 }

// Exercícío 3
program {
  Colocar(Vermelho)
  Mover(Leste)
  Colocar(Vermelho)
  Mover(Leste)
  Colocar(Vermelho)
  Mover(Leste)
  Colocar(Vermelho)
 }

// Exercícío 4
program {
  Colocar(Azul)
  Mover(Leste)
  Colocar(Azul)
  Mover(Leste)
  Colocar(Azul)
  Mover(Norte)
  Mover(Oeste)
  Colocar(Azul)
  Mover(Oeste)
  Colocar(Azul)
  Mover(Norte)
  Colocar(Azul)
}

// Exercícío 5
program {
  Colocar(Verde)
  Mover(Leste)
  Colocar(Vermelho)
  Mover(Leste)
  Colocar(Vermelho)
  Mover(Norte)
  Colocar(Vermelho)
  Mover(Oeste)
  Colocar(Vermelho)
  Mover(Oeste)
  Colocar(Verde)
}

// Exercícío 6
program {
  Mover(Leste)
  Mover(Norte)
  Colocar(Vermelho)
  Mover(Leste)
  Colocar(Vermelho)
  Mover(Leste)
  Colocar(Vermelho)
  Mover(Oeste)
  Mover(Norte)
  Colocar(Vermelho)
}

// Exercícío 7
program {
  Retirar(Verde)
  Mover(Leste)
  Retirar(Verde)
  Mover(Leste)
  Retirar(Verde)
  Mover(Norte)
  Retirar(Verde)
  Mover(Norte)
  Retirar(Verde)
  Mover(Oeste)
  Retirar(Verde)
  Mover(Oeste)
  Retirar(Verde)
  Mover(Sul)
  Retirar(Verde)
}

// Exercícío 8
program {
  Retirar(Vermelho)
  Colocar(Verde)
  Mover(Leste)
  Retirar(Vermelho)
  Colocar(Verde)
  Mover(Norte)
  Retirar(Vermelho)
  Colocar(Verde)
  Mover(Oeste)
  Retirar(Vermelho)
  Colocar(Verde)
}

// 3.Procedimentos
// Exercícío 1
program {
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  Mover(Norte)
  Colocar(Preto)
  Mover(Oeste)
  Colocar(Preto)
  Mover(Oeste)
  Colocar(Preto)
  Mover(Norte)
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
}

// Exercícío 2
procedure DesenharQuadradoPretoDeLado3() {
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  Mover(Norte)
  Colocar(Preto)
  Mover(Oeste)
  Colocar(Preto)
  Mover(Oeste)
  Colocar(Preto)
  Mover(Norte)
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)    
}
program {
  DesenharQuadradoPretoDeLado3()   
}

// Exercícío 3
procedure Colocar3Verdes() {
  Colocar(Verde)
  Colocar(Verde)
  Colocar(Verde)
}
program {
  Colocar3Verdes()   
}

// Exercícío 4
procedure Colocar3Vermelhas() {
  Colocar(Vermelho)
  Colocar(Vermelho)
  Colocar(Vermelho)
}
program {
  Colocar3Vermelhas()   
}

// Exercícío 5
program {
  Colocar3Verdes()  
  Colocar3Verdes()   
  Colocar3Verdes()   
}

// Exercícío 6
procedure DesenharLinhaPreta3() {
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
}

// Exercícío 7
procedure DesenharLinhaPreta3() {
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  Mover(Leste)
  Colocar(Preto)
  VoltarAtras()
}

// Exercícío 8
procedure DesenharQuadradoPretoDeLado3 (){
  DesenharLinhaPreta3()
  Mover(Norte)
  DesenharLinhaPreta3()
  Mover(Norte)
  DesenharLinhaPreta3()
}

// Exercícío 9
procedure Colocar3(cor) {
  Colocar(cor)
  Colocar(cor)
  Colocar(cor)
}
program {
  Colocar3(Preto)
  Colocar3(Vermelho)
}

// Exercícío 10
procedure Colocar3(cor) {
  Colocar(cor)
  Colocar(cor)
  Colocar(cor)
}
program{
  Colocar3(Verde)
}

// Exercícío 11
procedure DesenharLinha3(cor) {
  Colocar(cor)
  Mover(Leste)
  Colocar(cor)
  Mover(Leste)
  Colocar(cor)
  VoltarAtras()
}

// Exercícío 12
procedure DesenharQuadradoDeLado3(cor) {
  DesenharLinha3(cor)    
  Mover(Norte)
  DesenharLinha3(cor)    
  Mover(Norte)
  DesenharLinha3(cor)    
}

// Exercícío 13

program {
  DesenharLinha3(Verde, Leste)
  Mover(Leste)
  DesenharLinha3(Vermelho, Norte)
  Mover(Norte)
  DesenharLinha3(Preto, Oeste)
  Mover(Oeste)
  DesenharLinha3(Azul, Sul)
}

// Exercícío 14
program {
  DesenharLinha3(Leste, Vermelho)
}

// Exercícío 15
program {
  DesenharLinha3(Verde)
}

// Exercícío 16
procedure Triade(corX, corY, corZ) {
  Colocar(corX)
  Mover(Leste)
  Colocar(corY)
  Mover(Leste)
  Colocar(corZ)
}

// 4.Prática Procedimentos
// Exercícío 1
procedure ColocarUmaDeCada() {
  Colocar(Vermelho);
  Colocar(Verde);
  Colocar(Azul);
  Colocar(Preto)
}

procedure MoverOeste3() {
  repeat(3){
    Mover(Oeste) }
}

procedure ColocarLinhaMulticolorida4() {
  ColocarUmaDeCada();
  Mover(Leste)
  ColocarUmaDeCada();
  Mover(Leste)
  ColocarUmaDeCada();
  Mover(Leste)
  ColocarUmaDeCada();
  MoverOeste3()
}

// Exercícío 2
procedure ColocarQuadradoMulticolorido4(){
  ColocarLinhaMulticolorida4()
  Mover(Norte)
  ColocarLinhaMulticolorida4()
  Mover(Norte)
  ColocarLinhaMulticolorida4()
  Mover(Norte)
  ColocarLinhaMulticolorida4()
  Mover(Sul)
  Mover(Sul)
  Mover(Sul)
 }

// Exercícío 3
procedure  ColocarADistancia3(x, y){
  repeat(3) { Mover(y) }
  Colocar(x)
}

// Exercícío 4
procedure  ColocarPontos3 (cor){
  Colocar(cor);
  ColocarADistancia3(cor, Leste)
  ColocarADistancia3(cor, Leste)
  repeat(6) {Mover(Oeste)}
}

// Exercícío 5
procedure ColocarPontos3Recarregado(cor){
  Colocar(cor)
  ColocarADistancia3(cor, Leste)
  Colocar(cor)
  ColocarADistancia3(cor, Leste)
  Colocar(cor)
  Colocar(cor)
}

// Exercícío 6
program {
  ColocarADistancia3(Verde, Sul)
  Mover3(Oeste)
  ColocarADistancia3(Azul, Norte)
  Mover3(Norte)
  ColocarADistancia3(Preto, Leste)
  Mover3(Leste)
  ColocarADistancia3(Vermelho, Sul)
  Mover3(Oeste)
}

// Exercícío 7
program {
  ColocarPontos3(Azul)
  Mover(Leste)
  ColocarPontos3(Preto)
  Mover(Leste)
  ColocarPontos3(Verde)
  Mover(Norte)
  Mover(Oeste)
  ColocarPontos3(Vermelho)
  Mover(Oeste)
  Mover(Sul)
}

// Exercícío 8
procedure Aspas(cor, direcao) {
  Mover(direcao)
  Colocar(cor)
  Mover(direcao)
  Colocar(cor)
  Colocar(cor)
  Mover(direcao)
  Colocar(cor)
  Colocar(cor)
  Colocar(cor)
}

procedure VoltarMeio(direcao){
  repeat (3) {Mover(direcao)}
}

program {
  Aspas(Preto, Leste)
  VoltarMeio(Oeste)
  Aspas(Preto, Norte)
  VoltarMeio(Sul)
  Aspas(Preto, Oeste)
  VoltarMeio(Leste)
  Aspas(Preto, Sul)
  VoltarMeio(Norte)
}

// Exercícío 9
procedure VermelhoABorda (){
  IrABorda(Norte)
  IrABorda(Oeste)
  Colocar(Vermelho)
}

// Exercícío 10
procedure CriarVaso(cor){
  Colocar(cor)
  Mover(Leste)
  Colocar(cor)
  Mover(Norte)
  Colocar(cor)
  Mover(Oeste)
  Colocar(cor)
  Mover(Sul)
}

program{
  CriarVaso(Vermelho)
  IrABorda(Leste)
  Mover(Oeste)
  CriarVaso(Azul)
  IrABorda(Norte)
  Mover(Sul)
  CriarVaso(Verde)
  IrABorda(Oeste)
  CriarVaso(Preto)
}

// 5.Repetição Simples
// Exercícío 1
procedure MoverOeste10() {
  repeat(10) {
    Mover(Oeste)
  }
}

// Exercícío 2
procedure MoverOeste10() {
  repeat(10) {
    Mover(Oeste)
  }
}

// Exercícío 3
procedure MoverOeste5() {
  repeat(5) {
    Mover(Oeste)
  }
}

// Exercícío 4
procedure Colocar3AoNordeste(){
  Mover(Norte)
  Mover(Leste)
  repeat(3) {
   Colocar(Preto)
  }
}

// Exercícío 5
procedure ColocarAzulLonge(){
  repeat(4) {
    Mover(Leste)
  }
  Colocar(Azul)
}

// Exercícío 6
procedure DesenharLinhaPreta6(){
  repeat(6){
    Colocar(Preto)
    Mover(Leste)
  }
}

// Exercícío 7
procedure LinhaVermelha4() {
  repeat(4) {
   Colocar(Vermelho)
   Mover(Norte)
  }
}

// Exercícío 8
procedure Diagonal4Azul (){
  repeat(4) {
   Colocar(Azul)
   Mover(Norte)
   Mover(Leste)
  }
}

// Exercícío 9
procedure DiagonalPesada4Azul  (){
  repeat(4) {
   repeat(21){Colocar(Azul)}
   Mover(Norte)
   Mover(Leste)
  }
}

// Exercícío 10
procedure LinhaPreta4Leste() {
  repeat(3) {
    Colocar(Preto)
    Mover(Leste)
  } 
    Colocar(Preto)
}

// Exercícío 11
procedure QuadradoPreto4 (){
  repeat(3){
     LinhaPreta4Leste()
     repeat(3) {Mover(Oeste)}
     Mover(Norte)
} LinhaPreta4Leste()
}

// 6. Prática da Repetição Simples
// Exercícío 1
procedure Diagonal4AzulVoltando(){
   Diagonal4Azul()
   repeat(4){
     Mover(Sul)
     Mover(Oeste)
  }
}

// Exercícío 2
procedure BandaDiagonal4(){
  repeat(3){
  Diagonal4AzulVoltando()
  Mover(Norte)
} repeat(3){Mover(Sul)}
}

// Exercícío 3
procedure ColocarN(quantidade, cor){
  repeat(quantidade){
    Colocar(cor)
}
}

// Exercícío 4
procedure FimDaDitaduraMilitar (){
  ColocarN(15, Azul)
  Mover(Leste)
  ColocarN(1, Verde)
  Mover(Leste)
  ColocarN(1985, Preto)
}


// Exercícío 5
procedure Data(dia, mes, ano){
  ColocarN(dia, Azul)
  Mover(Leste)
  ColocarN(mes, Verde)
  Mover(Leste)
  ColocarN(ano, Preto)
}

// Exercícío 6
procedure MoverN(quantidade, direcao){
  repeat(quantidade){
    Mover(direcao)
  }
}

// Exercícío 7
procedure DesenharRelogio(raio){
  MoverN(raio, Norte)
  ColocarN(12, Vermelho)  
  MoverN(2*raio, Sul)
  ColocarN(6, Vermelho)
  MoverN(raio, Norte)
  ColocarN(0, Vermelho) 
  MoverN(raio, Oeste)
  ColocarN(9, Vermelho)  
  MoverN(2*raio, Leste)
  ColocarN(3, Vermelho)
  MoverN(raio, Oeste)
}

// Exercícío 8
procedure LinhaLestePesada(peso, cor, comprimento){
  repeat(comprimento){
    ColocarN(peso, cor)
    MoverN(1,Leste)
 }
  repeat(comprimento){
  Mover(Oeste)
  }
}

// Exercícío 9
procedure Azulejo(){
  ColocarN(1, Verde)
  ColocarN(5, Preto)
  ColocarN(9, Vermelho)
 }

procedure GuardaDe5(){
  repeat(4){
    Azulejo()
    Mover(Leste)
  } Azulejo()
}

// Exercícío 10
procedure GuardaEmL(){
  repeat(2){
  ColocarAzulejo()
  MoverN (1, Leste)
} ColocarAzulejo()
  MoverN(2, Oeste)
  MoverN(1, Norte)  
  ColocarAzulejo()
  MoverN(1, Norte)  
  ColocarAzulejo()
  MoverN(2, Sul)  
}

// 7. Expressões
// Exercícío 1
// Exercícío 2
// Exercícío 3
// Exercícío 4
// Exercícío 5
// Exercícío 6
// Exercícío 7
// Exercícío 8
// Exercícío 9
// Exercícío 10
// Exercícío 11


// 8. Alternativa Condicional
// Exercícío 1
// Exercícío 2
// Exercícío 3
// Exercícío 4
// Exercícío 5
// Exercícío 6
// Exercícío 7
// Exercícío 8
// Exercícío 9


// 9. Funções
// Exercícío 1
// Exercícío 2
// Exercícío 3
// Exercícío 4
// Exercícío 5
// Exercícío 6
// Exercícío 7
// Exercícío 8
// Exercícío 9
// Exercícío 10
// Exercícío 11
// Exercícío 12
// Exercícío 13
// Exercícío 14


// 10. Prática de Distribuir Livros
// Exercícío 1
// Exercícío 2
// Exercícío 3
// Exercícío 4
// Exercícío 5
// Exercícío 6
// Exercícío 7
// Exercícío 8
// Exercícío 9


// 11. Repetição condicional
// Exercícío 1
// Exercícío 2
// Exercícío 3
// Exercícío 4
// Exercícío 5
// Exercícío 6
// Exercícío 7
// Exercícío 8
// Exercícío 9
// Exercícío 10
// Exercícío 11
// Exercícío 12


// 12. Variáveis
// Exercícío 1
// Exercícío 2
// Exercícío 3
// Exercícío 4
// Exercícío 5
// Exercícío 6
// Exercícío 7
// Exercícío 8
// Exercícío 9
// Exercícío 10
// Exercícío 11
// Exercícío 12
