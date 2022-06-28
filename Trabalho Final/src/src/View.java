/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appchoicesdirectiongame;

/**
 *
 * @author andre
 */
public class View {

    private final char Tabuleiro[][];
    private final int p[];


    public View(){
        this.p=new int[2];
        this.p[0]=2;
        this.p[1]=2;

        this.Tabuleiro = new char[5][5];
        for(int l=0; l<5;l++){
            for(int c=0;c<5;c++){
              this.Tabuleiro[l][c] = ' ';
            }
        }
        this.Tabuleiro[0][0]=('a');//mkt
        this.Tabuleiro[2][0]=('b');//pdt
        this.Tabuleiro[4][0]=('c');//qld
        this.Tabuleiro[0][2]=('d');//ctr
        this.Tabuleiro[4][2]=('e');//ben
        this.Tabuleiro[0][4]=('f');//tec
        this.Tabuleiro[2][4]=('g');//est
        this.Tabuleiro[4][4]=('h');//cap
    }  
    
    public char getAvatarPlace(){
        return this.Tabuleiro[this.p[0]][this.p[1]];
    }
    
    public static void limparTela(){
        for(int cont=0;cont<100;cont++){
          System.out.println("");
        }
    }
    
    public void desenhaJogo(){
        limparTela();
        for(int l=0; l<5;l++){
          for(int c=0;c<5;c++){
            if(l == this.p[0] && c == this.p[1]){
                System.out.printf("| P |");
            }else{
                System.out.printf("| %c |",this.Tabuleiro[l][c]);
            }
          }
          System.out.println("");
          System.out.println("-------------------------");
        }
    }
    
    public void moveRight(){
        if(this.p[1]<4){
            this.p[1] = this.p[1] +1;
        }
    }
    
    public void moveLeft(){
        if(this.p[1]>0){
            this.p[1] = this.p[1] -1;
        }
    }
    
    public void moveUp(){        
        if(this.p[0]>0){
            this.p[0] = this.p[0] -1;
        }
    }
    
    public void moveDown(){
        if(this.p[0]<4){
            this.p[0] = this.p[0] +1;
        }
    }
    
}

