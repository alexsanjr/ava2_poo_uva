package entities;

import java.util.Scanner;

public class Aviao extends Transporte {
    private String prefixo;
    private String dataRevisao;

    public Aviao() {
        super();
    }

    public Aviao(Integer capacidadeTanque, Integer numeroPassageiros, Double preco, String prefixo, String dataRevisao) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public void adicionarValores(int capacidadeTanque, int numeroPassageiros, double preco, String prefixo, String dataRevisao) {
        setCapacidadeTanque(capacidadeTanque);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
        setPrefixo(prefixo);
        setDataRevisao(dataRevisao);
    }

    @Override
    public void entrada(int n) {

        Scanner sc = new Scanner(System.in);
        System.out.println("AVIÃO #" + n + ":");
        System.out.print("Digite o prefixo: ");
        String prefixo = sc.next();
        System.out.print("Capacidade do tanque: ");
        int capacidadeTanque = sc.nextInt();
        System.out.print("Numero de passageiros: ");
        int numeroPassageiros = sc.nextInt();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Data de revisão(dd/mm/aaaa): ");
        String dataRevisao = sc.next();
        adicionarValores(capacidadeTanque, numeroPassageiros, preco, prefixo, dataRevisao);
        System.out.println();
    }

    @Override
    public void imprimir(int n) {
        System.out.printf("Avião #%d%n", n);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "- Prefixo: " + prefixo +
                "; Capacidade de tanque: " + getCapacidadeTanque() +
                "; Numero de passageiros: " + getNumeroPassageiros() +
                "; Preco: " + getPreco() +
                "; Data de revisão: " + dataRevisao;
    }
}
