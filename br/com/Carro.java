package br.com;

public class Carro {
    private int velocidade;
    
    public void setVelocidade(int v) {
        if (v < 0) {
            v = 0;
        }
        this.velocidade = v;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
}
