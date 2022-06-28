/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appchoicesdirectiongame;

/**
 *
 * @author andre
 */
public class cComponent {
    private int level;
    private final int ConstantNextLevel;
    private int cost;
    private final char simbolo;
    
    public cComponent(char Simbolo, int ConstantNextLevel, int Cost){
        this.level = 1;
        this.simbolo = Simbolo;
        this.ConstantNextLevel = ConstantNextLevel;
        this.cost = Cost;
    }
    
    public char getSimbolo(){
        return this.simbolo;
    }
    
    public int getCost(){
        return this.cost;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public int getPricetoBuy(){
        return (this.cost+ConstantNextLevel^this.level);
    }
    
    public int getPricetoSell(){
        return ((this.cost)-ConstantNextLevel^this.level);
    }
    
    public void buy(){
        this.level ++;
        this.cost = getPricetoBuy();
    }
    
    public void sell(){
        if (this.level>1){
            this.level --;
            this.cost = getPricetoSell();
        }
    }
}
