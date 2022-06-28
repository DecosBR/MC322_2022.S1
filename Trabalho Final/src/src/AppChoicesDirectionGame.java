/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appchoicesdirectiongame;

/**
 *
 * @author andre
 */


public class AppChoicesDirectionGame {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
               
        Controller controller = new Controller();

        try{
          while(controller.jogar());            
        }catch(Exception e){
            System.out.println("Erro");
        }
        System.out.println("Fim do Jogo");
    }
      
}
     

