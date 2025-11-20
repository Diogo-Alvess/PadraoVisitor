package org.example;

public class VeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "Carro{" +
                "placa='" + carro.getPlaca() + '\'' +
                ", modelo='" + carro.getModelo() + '\'' +
                ", portas=" + carro.getPortas() +
                '}';
    }

    @Override
    public String exibirMoto(Moto moto) {
        return "Moto{" +
                "placa='" + moto.getPlaca() + '\'' +
                ", modelo='" + moto.getModelo() + '\'' +
                ", cilindradas=" + moto.getCilindradas() +
                '}';
    }

    @Override
    public String exibirCaminhao(Caminhao caminhao) {
        return "Caminhao{" +
                "placa='" + caminhao.getPlaca() + '\'' +
                ", modelo='" + caminhao.getModelo() + '\'' +
                ", cargaMaxima=" + caminhao.getCargaMaxima() +
                '}';
    }
}
