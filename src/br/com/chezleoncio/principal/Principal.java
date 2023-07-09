package br.com.chezleoncio.principal;

import br.com.chezleoncio.calculos.SomaValores;
import br.com.chezleoncio.modelos.Restaurante;
import br.com.chezleoncio.pagamentos.CartaoCredito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSejam bem vindos ao Chez Leôncio, o restaurante mais" +
                " sofisticado de todos!\n");

        List<Restaurante> compras = new ArrayList<>();
        SomaValores somaCompras = new SomaValores();

        System.out.println("Informe o limite do seu cartão crédito: ");
        double limite = sc.nextDouble();

        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while(sair !=0) {
            System.out.println("Escolha os pratos:\n 1. ITALIANO - Ravioli - Valor: 35.89\n 2. COREANO - " +
                    "Tteokbokki - Valor: 39.90\n 3. AMERICANO - Hambúrguer - Valor: 42.89\n 4. BRASILEIRA - " +
                    "Feijoada - Valor: 62.30\n 5. RUSSO - Frango à Kiev - Valor: 54.75\n");
            System.out.println("Informe o número do prato: ");
            int prato = sc.nextInt();

            System.out.println("Escolha as bebidas:\n 1. RUSSO- kompot - Valor: 15.90\n 2. COREANO - Makgeolli - " +
                    "Valor: 24.99\n 3. BRASILEIRO - Suco de Laranja - valor: 10.00\n 4. AMERICANO - Dr Pepper - " +
                    "Valor: 14.49\n 5. ITALIANO - Aperol Spritz - Valor: 32.89\n");
            System.out.println("Informe o número da bebida: ");
            int bebida = sc.nextInt();

            System.out.println("Escolha as Sobremesas:\n 1. COREANO - Tteok - Valor: 39.90\n 2. AMERICANO - Cheesecake" +
                    " - Valor: 65.00\n 3. ITALIANO - Zabaglione - Valor: 26.90\n 4. RUSSO - Medovik - Valor: 38.75\n" +
                    " 5. BRASILEIRA - Brigadeiro - Valor: 23.65");
            System.out.println("Informe o número da sobremesa: ");
            int sobremesa = sc.nextInt();

            Restaurante compra = new Restaurante(prato, bebida, sobremesa);
            somaCompras.somando(compra);
            boolean compraRealizada = cartao.lancaCompra(compra);

            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            int numero = sc.nextInt();
            compras.add(compra);

            if(compraRealizada){
                System.out.println(String.format("\nValor total desta compra: R$%.2f\nCompra realizada com sucesso!\n",
                         compra.getValorTotal()));
            } else {
                System.out.println("Saldo insuficiente!\n");
                break;
            }

            if(numero == 0){
                break;
            }
        }
        System.out.println("Compras: ");
        for(Restaurante item: compras){
            System.out.println(item);
        }
        System.out.println(String.format("\nValor total das compras: R$ %.2f", somaCompras.getValorCompras()));
        System.out.println(String.format("\nLimite do cartão de crédito: R$ %.2f", cartao.getSaldo()));

    }
}