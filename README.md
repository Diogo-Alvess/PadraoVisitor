Este repositório apresenta a implementação do padrão de projeto Visitor em um cenário de gerenciamento de veículos.
Foram criados três tipos de veículos, Carro, Moto e Caminhão, e um visitante concreto (VeiculoVisitor) responsável por exibir as informações específicas de cada tipo de forma organizada e desacoplada.

A interface Veiculo define o método aceitar(Visitor visitor), permitindo que qualquer classe que a implemente seja visitada sem que o Visitor precise conhecer sua implementação interna. Já a interface Visitor declara os métodos especializados para cada tipo de veículo, garantindo que novas operações possam ser adicionadas sem alterar as classes concretas.

O padrão Visitor possibilita separar o comportamento dos objetos da sua estrutura, facilitando a manutenção e a expansão do sistema. Neste projeto, o visitante concreto implementa as regras de exibição para cada veículo, demonstrando na prática como o padrão permite adicionar funcionalidades sem modificar as classes originais.

O projeto reforça a importância do Visitor em sistemas que possuem múltiplas classes com interfaces semelhantes, proporcionando um mecanismo flexível para estender funcionalidades e manter um baixo acoplamento entre operações e estruturas de dados.
