package org.example;

public class Carro implements Veiculo {

    private String placa;
    private String modelo;
    private int portas;

    public Carro(String placa, String modelo, int portas) {
        this.placa = placa;
        this.modelo = modelo;
        this.portas = portas;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCarro(this);
    }
}
