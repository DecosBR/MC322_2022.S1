/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appchoicesdirectiongame;

/**
 *
 * @author andre
 */
public class dataCompany {
    
    private int Week;
    private int standardPackage;
    private final dataMoney dataMoney;
    private final cComponent[] arrayComponent;

    
    public dataCompany(){
        this.Week=1;
        this.standardPackage = 50;
        this.dataMoney = new dataMoney();
        this.arrayComponent = new cComponent[8];
        arrayComponent[0] = new cComponent('a',200,1000);   //mkt
        arrayComponent[1] = new cComponent('b',1000,2000);  //pdt
        arrayComponent[2] = new cComponent('c',500,1000);   //qld
        arrayComponent[3] = new cComponent('d',100,5000);   //ctr
        arrayComponent[4] = new cComponent('e',50,500);     //ben
        arrayComponent[5] = new cComponent('f',2000,3000);  //tec
        arrayComponent[6] = new cComponent('g',3000,10000); //est
        arrayComponent[7] = new cComponent('h',200,1500);   //cap
    }

    public int getWeek(){
      return this.Week;
    }
    
    public void nextWeek(){
        this.Week ++;
        if (this.Week % 4 == 0){
            int Lucro, Juros;
            Lucro = dataMoney.getFaturamento()-dataMoney.getImpostos()-dataMoney.getServicos()-dataMoney.getEstrutura();
            Juros = dataMoney.getCaixa()*(((dataMoney.getJuros())/100)/12);
            dataMoney.setCaixa(dataMoney.getCaixa()+Lucro+Juros);
        }
    }
    
    public void msgOption(char Component){
        for(int i=0; i<8; i++){
            if(arrayComponent[i].getSimbolo() == Component){
                System.out.printf("Aperte c para comprar, preco: %d%n",arrayComponent[i].getPricetoBuy());
                System.out.printf("Aperte v para vender, preco: %d%n",arrayComponent[i].getPricetoSell());
                return;
            }        
        }
    }

    public void buyAction(char Component){
        
        for(int i=0; i<8; i++){
            if(arrayComponent[i].getSimbolo() == Component){
                arrayComponent[i].buy();
                return;
            }        
        }
        //Atualizar iCompany
    }
    
    public void sellAction(char Component){
        
        for(int i=0; i<8; i++){
            if(arrayComponent[i].getSimbolo() == Component){
                arrayComponent[i].sell();
                return;
            }        
        } 
    }
    
    public void updataData(){
        
        dataMoney.setRetencao(arrayComponent[1].getLevel()+arrayComponent[2].getLevel()*3+arrayComponent[3].getLevel());
        dataMoney.setMotivacao(arrayComponent[4].getLevel()*3+arrayComponent[5].getLevel()+arrayComponent[6].getLevel()+arrayComponent[7].getLevel());
        dataMoney.setProdutividade(dataMoney.getMotivacao()/2+arrayComponent[3].getLevel()*3+arrayComponent[5].getLevel()*5+arrayComponent[6].getLevel()*2+arrayComponent[7].getLevel()*3);
        dataMoney.setEquipe(arrayComponent[3].getLevel()-arrayComponent[6].getLevel());
        dataMoney.setVendas(dataMoney.getProdutividade()*dataMoney.getRetencao()*dataMoney.getEquipe()*arrayComponent[0].getLevel());
        
        dataMoney.setEstrutura(arrayComponent[2].getCost()+arrayComponent[3].getCost()+arrayComponent[4].getCost()+arrayComponent[5].getCost()+arrayComponent[6].getCost());
        dataMoney.setImpostos(dataMoney.getFaturamento()/3+arrayComponent[6].getCost()/(10*12*4));
        dataMoney.setServicos(arrayComponent[0].getCost()+arrayComponent[1].getCost()+arrayComponent[7].getCost());
        
        dataMoney.setFaturamento(dataMoney.getVendas()*this.standardPackage);
        
    }
    
    public void plotData(){
        updataData();
        System.out.println("-------------------------");
        System.out.printf("Semana: %d%n",this.Week);
        dataMoney.plotData();
    }
    
    public boolean verifyEndGame(){
        return dataMoney.verifyEndGame();
    }
}
