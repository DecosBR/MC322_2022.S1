/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appchoicesdirectiongame;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Controller {
    View view;
    Scanner scan;
    dataCompany data;
    
    
    public Controller(){
        this.view = new View(); 
        this.scan = new Scanner(System.in);
        this.data = new dataCompany();
    }
    
    public char readKeyboard(){
        return scan.nextLine().charAt(0);
    }
    
    public boolean jogar(){
        view.desenhaJogo();
        data.plotData();
        data.msgOption(view.getAvatarPlace());
        
        switch (readKeyboard()) {
            case 'w' -> {
                view.moveUp();
            }
            case 'a' -> {
                view.moveLeft();
            }
            case 's' -> {
                view.moveDown();
            }
            case 'd' -> {
                view.moveRight();
            }
            case 'c' -> {
                data.buyAction(view.getAvatarPlace());
                data.nextWeek();
            }
            case 'v' -> {
                data.sellAction(view.getAvatarPlace());
                data.nextWeek();
            }
            case 'n' -> {
                data.nextWeek();
            }
            case 'p' -> {
                return false;
            }
            default -> {
                System.out.println("Comando invalido");
            }
        }

        if(data.verifyEndGame()){
            System.out.println("Voce quebrou a empresa...");
            return false;
        }
        
        return true;
    }
    
}
