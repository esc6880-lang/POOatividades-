package br.com.meusistema.main;

import br.com.meusistema.model.Carro;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("iniciando sistema ...");

        Carro meuCarro = new Carro();
        meuCarro.modelo = "fusca_trubinado";
        meuCarro.cor = "roxo_uva";

        Carro meuCarro2 = new Carro();
        meuCarro2.modelo = "fiat_uno";
        meuCarro2.cor = "azul_marinho";

        System.out.println("Velocidade: " + meuCarro);
        meuCarro.buzinar();
    }
}
