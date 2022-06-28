/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appchoicesdirectiongame;

/**
 *
 * @author andre
 */
public class dataMoney {
    
    private int Juros;
    private int Caixa; //Broken if Caixa < -10*12*(Lucro)
    private int Faturamento;
    private int Impostos;
    private int Servicos;
    private int Estrutura;
    private int Vendas;
    private int Retencao;
    private int Equipe;
    private int Motivacao;
    private int Produtividade;

    
    public dataMoney(){
        this.Juros = 10;
        this.Caixa = 200000;
    }

    public boolean verifyEndGame(){
        return (this.Caixa < -10*this.Faturamento);
    }
    
    public int getJuros(){
      return this.Juros;
    }
    
    public void setJuros(int value){
        this.Juros=value;
    }
    
    public int getCaixa(){
      return this.Caixa;
    }
    
    public void setCaixa(int value){
        this.Caixa=value;
    }
    
    public int getFaturamento(){
      return this.Faturamento;
    }
    
    public void setFaturamento(int value){
        this.Faturamento=value;
    }
  
    public int getImpostos(){
      return this.Impostos;
    }
    
    public void setImpostos(int value){
        this.Impostos=value;
    }
    
    public int getServicos(){
      return this.Servicos;
    }
    
    public void setServicos(int value){
        this.Servicos=value;
    }
    
    public int getEstrutura(){
      return this.Estrutura;
    }
    
    public void setEstrutura(int value){
        this.Estrutura=value;
    }
    
    public int getVendas(){
      return this.Vendas;
    }
    
    public void setVendas(int value){
        this.Vendas=value;
    }
    
    public int getRetencao(){
      return this.Retencao;
    }
    
    public void setRetencao(int value){
        this.Retencao=value;
    }
    
    public int getEquipe(){
      return this.Equipe;
    }
    
    public void setEquipe(int value){
        this.Equipe=value;
    }
    
    public int getMotivacao(){
      return this.Motivacao;
    }
    
    public void setMotivacao(int value){
        this.Motivacao=value;
    }
    
    public int getProdutividade(){
      return this.Produtividade;
    }
    
    public void setProdutividade(int value){
        this.Produtividade=value;
    }
    
    public void plotData(){
        
        System.out.println("-------------------------");
        System.out.printf("Caixa: R$%d,00 %n",this.Caixa);
        System.out.printf("Lucro: R$%d,00%n",this.Faturamento-this.Impostos-this.Servicos-this.Estrutura+this.Caixa*((this.Juros)/100)/12);
        System.out.println("-------------------------");
        System.out.printf("Faturamento: R$%d,00%n",this.Faturamento);
        System.out.printf("Impostos: R$%d,00%n",this.Impostos);
        System.out.printf("Servicos: R$%d,00%n",this.Servicos);
        System.out.printf("Estrutura: R$%d,00%n",this.Estrutura);
        System.out.printf("Vendas: %d%n",this.Vendas);
        System.out.printf("Retencao: %d%n",this.Retencao);
        System.out.printf("Equipe: %d%n",this.Equipe);
        System.out.printf("Motivacao: %d%n",this.Motivacao);
        System.out.printf("Produtividade: %d%n",this.Produtividade);
        
    }
}
