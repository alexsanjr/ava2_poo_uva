package entities;

import java.util.Scanner;

public class Navio extends Transporte {
    private String nome;
    private String dataLancamento;
    private Integer numeroTripulantes;

    public Navio() {}

    public Navio(Integer capacidadeTanque, Integer numeroPassageiros, Double preco, String nome,
                 String dataLancamento, Integer numeroTripulantes) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.numeroTripulantes = numeroTripulantes;
    }

    public Navio(Integer capacidadeTanque, Integer numeroPassageiros, Double preco, String nome,
                 String dataLancamento) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.dataLancamento = dataLancamento;
    }

    public Navio(Integer capacidadeTanque, Integer numeroPassageiros, Double preco, String nome) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
    }

    public Navio(Integer numeroPassageiros, Double preco, String nome) {
        super(numeroPassageiros, preco);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(Integer numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public int passageirosPorTripulantes() {
        return getNumeroPassageiros() / numeroTripulantes;
    }

    public void adicionarValores(int capacidadeTanque, int numeroPassageiros, double preco, String nome, int
            numeroTripulantes, String dataLancamento) {
        setCapacidadeTanque(capacidadeTanque);
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
        setNome(nome);
        setNumeroTripulantes(numeroTripulantes);
        setDataLancamento(dataLancamento);
    }

    @Override
    public void entrada( int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NAVIO #" + n + ":");
        System.out.print("Digite o nome: ");
        String nome = sc.next();
        System.out.print("Capacidade do tanque: ");
        int capacidadeTanque = sc.nextInt();
        System.out.print("Numero de passageiros: ");
        int numeroPassageiros = sc.nextInt();
        System.out.print("Numero de tripulantes: ");
        int numeroTripulantes = sc.nextInt();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Data de lançamento(dd/mm/aaaa): ");
        String dataLancamento = sc.next();
        adicionarValores(capacidadeTanque, numeroPassageiros, preco, nome, numeroTripulantes, dataLancamento);
        System.out.println();
    }

    @Override
    public void imprimir(int n) {
        System.out.printf("Navio #%d%n", n);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "- Nome: " + nome +
                "; Capacidade de tanque: " + getCapacidadeTanque() +
                "; Numero de passageiros: " + getNumeroPassageiros() +
                "; Numero de tripulantes: " + numeroTripulantes +
                "; Preco: " + getPreco() +
                "; Data de lançamento: " + dataLancamento;
    }
}
