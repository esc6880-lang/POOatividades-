package br.com;
import  br.com.meusistema.model.Carro; //citando a classe de outro bairo
//parte 4 
package br.com.meusistema.main;//bairo que classe sistema.java mora 
public class Sistema {
    public static void main(String[] args) {
        System.out.println("iniciando sistema ...");
        //cria objeto
       Carro meuCarro = new Carro();
       meuCarro.modelo="fusca_trubinado";
       meuCarro.cor="roxo_uva";
        Carro meuCarro2 = new Carro();
       meuCarro2.modelo="fiat_uno";
       meuCarro2.cor="azul_marinho";

       //chamado de funçoes
        System.out.println("Velocidade: " + meuCarro);
        meuCarro.buzinar();

    }
}

