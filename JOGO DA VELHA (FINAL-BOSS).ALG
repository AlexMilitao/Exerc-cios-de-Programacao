algoritmo "JOGO DA VELHA (FINAL-BOSS)"
var
   Num:Vetor[1..3,1..3] De Caracter
   Linha,Coluna,Resp,Recomeco,Rodada:Inteiro
   XO:Caracter
   Moveok,Endgame:logico

Procedimento Telain ()
Inicio
   Escreval (" JOGO DA VELHA")  // Tela inicial que sempre será mostrada atualizada
   Escreval ()
   Escreval (" +---+---+---+")
   Escreval (" | ",Num[1,1]," | ",Num[1,2]," | ",Num[1,3]," |")
   Escreval (" +---+---+---+")
   Escreval (" | ",Num[2,1]," | ",Num[2,2]," | ",Num[2,3]," |")
   Escreval (" +---+---+---+")
   Escreval (" | ",Num[3,1]," | ",Num[3,2]," | ",Num[3,3]," |")
   Escreval (" +---+---+---+")
   Escreval ()
Fimprocedimento

Funcao Win ():logico
Var
ganho:logico
Inicio

      ganho <- Falso
      Para Coluna <- 1 Ate 3 Faca    // Verifica Ganhador na vertical
            Se (Num[1,Coluna] = XO) E (Num[2,Coluna] = XO) E (Num[3,Coluna] = XO) Entao
                Ganho <- Verdadeiro
            Fimse
      Fimpara
      
      Para Linha <- 1 Ate 3 Faca    // Verifica Ganhador na Horizontal
            Se (Num[Linha,1] = XO) E (Num[Linha,2] = XO) E (Num[Linha,3] = XO) Entao
                Ganho <- Verdadeiro
            Fimse
      Fimpara

      Para Linha <- 1 Ate 3 Faca     // Verifica a diagonal principal
           Se (Num[1,1] = XO) E (Num[2,2] = XO) E (Num[3,3] = XO) Entao
              Ganho <- Verdadeiro
           Fimse
      Fimpara
      
      Para Linha <- 1 Ate 3 Faca     // Verifica a diagonal Segundaria
          Se (Num[1,3] = XO) E (Num[2,2] = XO) E (Num[3,1] = XO) Entao
                 Ganho <- Verdadeiro
              Fimse
      Fimpara
      
      Retorne Ganho
Fimfuncao

Inicio
   Num[1,1] <- "1"
   Num[1,2] <- "2"
   Num[1,3] <- "3"
   Num[2,1] <- "4"
   Num[2,2] <- "5"              // alimentando a matriz :) *Dlc*
   Num[2,3] <- "6"
   Num[3,1] <- "7"
   Num[3,2] <- "8"
   Num[3,3] <- "9"
   
   Endgame <- Falso
   Recomeco <- 0
Repita
   Telain
   Repita
      XO <- "X"          // JOGADA DO X
      Moveok <- Falso
      
      //se a "casa" da matriz estiver com numero ("1" EX.) significa
      //que não foi jogado nem X ou O nela então ela aceita a jogada
      // e o Moveok <- Verdadeiro para poder sair do ciclo
      Escreval ("Vai jogar ",XO," em qual posicao?")
      Leia (Resp)
      Enquanto (Resp < 1) Ou (Resp > 9) Faca // Não permite digitar outros numeros
         Escreval ("Digite um numero entre 1 e 9:" )
         Leia (Resp)
      Fimenquanto
      
           Se (Resp = 1) E (Num[1,1] = "1") Entao
              Num[1,1] <- XO
              Moveok <- Verdadeiro                        // 1-1
              Limpatela
           Senao
              Se (Resp = 2) E (Num[1,2] = "2") Entao
                 Num[1,2] <- XO
                 Moveok <- Verdadeiro                        // 1-2
                 Limpatela
              Senao
                 Se (Resp = 3) E (Num[1,3] = "3") Entao
                    Num[1,3] <- XO
                    Moveok <- Verdadeiro                        // 1-3
                    Limpatela
                 Senao
                    Se (Resp = 4) E (Num[2,1] = "4") Entao
                       Num[2,1] <- XO
                       Moveok <- Verdadeiro                        // 2-1
                       Limpatela
                    Senao
                      Se (Resp = 5) E (Num[2,2] = "5") Entao
                       Num[2,2] <- XO
                       Moveok <- Verdadeiro                        // 2-2
                       Limpatela
                      Senao
                         Se (Resp = 6) E (Num[2,3] = "6") Entao
                            Num[2,3] <- XO
                            Moveok <- Verdadeiro                        // 2-3
                            Limpatela
                         Senao
                            Se (Resp = 7) E (Num[3,1] = "7") Entao
                               Num[3,1] <- XO
                               Moveok <- Verdadeiro                        // 3-1
                               Limpatela
                            Senao
                               Se (Resp = 8) E (Num[3,2] = "8") Entao
                                  Num[3,2] <- XO
                                  Moveok <- Verdadeiro                        // 3-2
                                 Limpatela
                               Senao
                                  Se (Resp = 9) E (Num[3,3] = "9") Entao
                                     Num[3,3] <- XO
                                     Moveok <- Verdadeiro                        // 3-3
                                     Limpatela
                                  Senao
                                       Escreval ("POSICAO OCUPADA!!")
                                       Moveok <- Falso
                                     Fimse
                                  Fimse
                               Fimse
                            Fimse
                         Fimse
                       Fimse
                    Fimse
                Fimse
            Fimse
   Ate Moveok = Verdadeiro
      Endgame <- Win ()
      Se Endgame = verdadeiro entao
         Telain
         Escreval ("Jogador Xis Venceu!")
      Fimalgoritmo
      Fimse
      Rodada <- Rodada + 1    // Caso Haja 9 rodada e nenhum vencedor, Da velha
      Se (Rodada = 9) Entao
         Telain
         Escreval ("Deu velha - Fim De Jogo")
         Fimalgoritmo
      Fimse
   Telain
   Repita
      XO <- "O"          // JOGADA DO O
      Moveok <- Falso
      Escreval ("Vai jogar ",XO," em qual posicao?")
      Leia (Resp)
      Enquanto (Resp < 1) Ou (Resp > 9) Faca // Não permite digitar outros numeros
         Escreval ("Digite um numero entre 1 e 9:" )
         Leia (Resp)
      Fimenquanto
      
           Se (Resp = 1) E (Num[1,1] = "1") Entao
              Num[1,1] <- XO
              Moveok <- Verdadeiro                        // 1-1
              Limpatela
           Senao
              Se (Resp = 2) E (Num[1,2] = "2") Entao
                 Num[1,2] <- XO
                 Moveok <- Verdadeiro                        // 1-2
                 Limpatela
              Senao
                 Se (Resp = 3) E (Num[1,3] = "3") Entao
                    Num[1,3] <- XO
                    Moveok <- Verdadeiro                        // 1-3
                    Limpatela
                 Senao
                    Se (Resp = 4) E (Num[2,1] = "4") Entao
                       Num[2,1] <- XO
                       Moveok <- Verdadeiro                        // 2-1
                       Limpatela
                    Senao
                      Se (Resp = 5) E (Num[2,2] = "5") Entao
                       Num[2,2] <- XO
                       Moveok <- Verdadeiro                        // 2-2
                       Limpatela
                      Senao
                         Se (Resp = 6) E (Num[2,3] = "6") Entao
                            Num[2,3] <- XO
                            Moveok <- Verdadeiro                        // 2-3
                            Limpatela
                         Senao
                            Se (Resp = 7) E (Num[3,1] = "7") Entao
                               Num[3,1] <- XO
                               Moveok <- Verdadeiro                        // 3-1
                               Limpatela
                            Senao
                               Se (Resp = 8) E (Num[3,2] = "8") Entao
                                  Num[3,2] <- XO
                                  Moveok <- Verdadeiro                        // 3-2
                                 Limpatela
                               Senao
                                  Se (Resp = 9) E (Num[3,3] = "9") Entao
                                     Num[3,3] <- XO
                                     Moveok <- Verdadeiro                        // 3-3
                                     Limpatela
                                  Senao
                                       Escreval ("POSICAO OCUPADA!!")
                                       Moveok <- Falso
                                     Fimse
                                  Fimse
                               Fimse
                            Fimse
                         Fimse
                       Fimse
                    Fimse
                Fimse
            Fimse
   Ate Moveok = Verdadeiro
   Endgame <- Win ()
   
   Se Endgame = verdadeiro entao
      Telain
      Escreval ("Jogador BOLINHA Venceu!")
      Recomeco <- 1
   Senao
        Recomeco <- 0
   Fimse
   Rodada <- Rodada + 1
Ate Recomeco = 1
fimalgoritmo