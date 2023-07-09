package br.com.chezleoncio.pagamentos;

import br.com.chezleoncio.modelos.Restaurante;

public class CartaoCredito {
    private double limite;
    private double saldo;

    public CartaoCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
    }
    public boolean lancaCompra(Restaurante compra){
        if(this.saldo >= compra.getValorTotal()){
            this.saldo -= compra.getValorTotal();
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
}