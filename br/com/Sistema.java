package br.com;

public class Sistema {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setVelocidade(100);
        System.out.println("Velocidade: " + meuCarro.getVelocidade());
    }
}
