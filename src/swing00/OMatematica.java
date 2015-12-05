/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing00;

/**
 *
 * @author ricardo
 */
public class OMatematica {
    int n1;
    int n2;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getMultiplicacion(){
        int resultado=this.getN1()*this.getN2();
        return resultado;        
    }
     public int getDivision(){
        int resultado=this.getN1()/this.getN2();
        return resultado;        
    }
      public int getSuma(){
        int resultado=this.getN1()+this.getN2();
        return resultado;        
    }
    public int getResta(){
        int resultado=this.getN1()-this.getN2();
        return resultado;        
    }
    
}
