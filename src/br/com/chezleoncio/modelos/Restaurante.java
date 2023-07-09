package br.com.chezleoncio.modelos;

public class Restaurante {
    private String prato;
    private String bebida;
    private String sobremesa;
    private double valorPrato;
    private double valorBebida;
    private double valorsobremesa;
    private double valorTotal;

    public Restaurante(int prato, int bebida, int sobremesa) {
        if(prato == 1){
            this.prato = "ITALIANO - Ravioli";
            this.valorPrato = 35.89;
        } else if(prato == 2){
            this.prato = "COREANO - Tteokbokki";
            this.valorPrato = 39.90;
        } else if(prato == 3){
            this.prato = "AMERICANO - Hambúrguer";
            this.valorPrato = 42.89;
        } else if(prato == 4){
            this.prato = "BRASILEIRA - Feijoada";
            this.valorPrato = 62.30;
        } else{
            this.prato = "RUSSO - Frango à Kiev";
            this.valorPrato = 54.75;
        }
        if(bebida == 1){
            this.bebida = "RUSSO- kompot";
            this.valorBebida = 15.90;
        } else if(bebida == 2){
            this.bebida = "COREANO - Makgeolli";
            this.valorBebida = 24.99;
        } else if(bebida == 3){
            this.bebida = "BRASILEIRO - Suco de Laranja";
            this.valorBebida = 10.00;
        } else if(bebida == 4){
            this.bebida = "AMERICANO - Dr Pepper";
            this.valorBebida = 14.49;
        } else {
            this.bebida = "ITALIANO - Aperol Spritz";
            this.valorBebida = 32.89;
        }
        if(sobremesa == 1){
            this.sobremesa = "COREANO - Tteok";
            this.valorsobremesa = 39.90;
        } else if(sobremesa == 2){
            this.sobremesa = "AMERICANO - Cheesecake";
            this.valorsobremesa = 65.00;
        } else if(sobremesa == 3){
            this.sobremesa = "ITALIANO - Zabaglione";
            this.valorsobremesa = 26.90;
        } else if(sobremesa == 4){
            this.sobremesa = "RUSSO - Medovik";
            this.valorsobremesa = 38.75;
        } else {
            this.sobremesa = "BRASILEIRA - Brigadeiro";
            this.valorsobremesa = 23.65;
        }
    }

    public String getPrato() {
        return prato;
    }

    public String getBebida() {
        return bebida;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public double getValorPrato() {
        return valorPrato;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public double getValorsobremesa() {
        return valorsobremesa;
    }
    public double getValorTotal() {
        return valorPrato + valorBebida + valorsobremesa;
    }

    @Override
    public String toString() {
        return "prato = " + prato + " - Valor: " + valorPrato + "\n" +
                "bebida = " + bebida + " - Valor: " + valorBebida + "\n" +
                "sobremesa = " + sobremesa + " - Valor: " + valorsobremesa +"\n";
    }
}