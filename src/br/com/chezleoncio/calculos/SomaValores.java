package br.com.chezleoncio.calculos;

import br.com.chezleoncio.modelos.Restaurante;

public class SomaValores {
    private double valorCompras = 0;

    public void somando(Restaurante compra){
        valorCompras += compra.getValorTotal();
    }
    public double getValorCompras(){
        return valorCompras;
    }
}