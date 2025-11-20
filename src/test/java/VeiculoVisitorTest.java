package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoVisitorTest {

    @Test
    void deveExibirCarro() {
        Carro carro = new Carro("ABC-1234", "Civic", 4);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{placa='ABC-1234', modelo='Civic', portas=4}",
                visitor.exibir(carro));
    }

    @Test
    void deveExibirMoto() {
        Moto moto = new Moto("XYZ-9988", "Hornet", 600);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Moto{placa='XYZ-9988', modelo='Hornet', cilindradas=600}",
                visitor.exibir(moto));
    }

    @Test
    void deveExibirCaminhao() {
        Caminhao caminhao = new Caminhao("JJJ-7777", "Volvo FH", 25000.0f);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Caminhao{placa='JJJ-7777', modelo='Volvo FH', cargaMaxima=25000.0}",
                visitor.exibir(caminhao));
    }
}
