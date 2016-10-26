/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author Jose Barros
 */
public class Conta {
    private String nome;
    private String numCont;
    private double saldo;

    public Conta() {
    }

    public Conta(String nome, String numCont, double saldo) {
        this.nome = nome;
        this.numCont = numCont;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumCont() {
        return numCont;
    }

    public void setNumCont(String numCont) {
        this.numCont = numCont;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean ingreso(double x){
        boolean ingre=false;
            if(x>0){
                this.saldo=this.saldo+x;
                ingre=true;
            }
        return ingre;
    }
     public boolean reintegro(double x){
        boolean ingre=false;
            if(x>0&&this.saldo>x){
                this.saldo=this.saldo-x;
                ingre=true;
            }
        return ingre;
    }

    
    public String visualizar() {
        return "Conta{" + "nome=" + nome + ", numCont=" + numCont + ", saldo=" + saldo + '}';
    }
    public void transferencia(Conta cont1,double y){
            if(this.getSaldo()>y){
                 this.reintegro(y);
                 cont1.ingreso(y);
                }
    } 
}
