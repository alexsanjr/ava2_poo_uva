package entities;

public abstract class Transporte {
    private Integer capacidadeTanque;
    private Integer numeroPassageiros;
    private Double preco;

    public Transporte() {}

    public Transporte(Integer capacidadeTanque, Integer numeroPassageiros, Double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    public Transporte(Integer capacidadeTanque, Integer numeroPassageiros) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
    }

    public Transporte(Integer capacidadeTanque, Double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.preco = preco;
    }

    public Transporte(Integer capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Integer getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Integer capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Integer getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(Integer numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public abstract void entrada(int n);
    public abstract void imprimir(int n);

}
