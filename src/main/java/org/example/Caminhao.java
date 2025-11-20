package org.example;

public class Caminhao implements Veiculo {

    private String placa;
    private String modelo;
    private float cargaMaxima;

    public Caminhao(String placa, String modelo, float cargaMaxima) {
        this.placa = placa;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCaminhao(this);
    }
}
