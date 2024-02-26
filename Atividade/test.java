package Atividade;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Chevrolet", "Onix", 15, "gasolina", 50, 10);
        Veiculo v2 = new Veiculo("Volkswagen", "Gol", 14, "flex", 40, 15);
        Veiculo v3 = new Veiculo("Fiat", "Uno", 13, "diesel", 45, 20);
        Veiculo v4 = new Veiculo("Ford", "Fiesta", 16, "eletrico", 60, 5);
        Veiculo v5 = new Veiculo("Toyota", "Corolla", 18, "flex", 40, 25);
        Veiculo v6 = new Veiculo("Honda", "Civic", 17, "diesel", 45, 10);
        Veiculo v7 = new Veiculo("Hyundai", "HB20", 14, "eletrico", 50, 30);
        Veiculo v8 = new Veiculo("Renault", "Sandero", 14, "gasolina", 40, 20);
        Veiculo v9 = new Veiculo("Nissan", "Kicks", 16, "flex", 45, 10);
        Veiculo v10 = new Veiculo("Jeep", "Renegade", 15, "diesel", 50, 15);

        List<Veiculo> frota = new ArrayList<>();
        frota.add(v1);
        frota.add(v2);
        frota.add(v3);
        frota.add(v4);
        frota.add(v5);
        frota.add(v6);
        frota.add(v7);
        frota.add(v8);
        frota.add(v9);
        frota.add(v10);

        Frota frotaInstanciada = new Frota(frota);

        System.out.println("Listagem de veículos a gasolina:");
        List<Veiculo> gasolina = frotaInstanciada.listarPorMotorizacao("gasolina");
        for (Veiculo veiculo : gasolina) {
            System.out.println(veiculo.getModelo());
        }

        System.out.println("\nListagem de veículos a diesel:");
        List<Veiculo> diesel = frotaInstanciada.listarPorMotorizacao("diesel");
        for (Veiculo veiculo : diesel) {
            System.out.println(veiculo.getModelo());
        }

        System.out.println("\nListagem de veículos flex:");
        List<Veiculo> flex = frotaInstanciada.listarPorMotorizacao("flex");
        for (Veiculo veiculo : flex) {
            System.out.println(veiculo.getModelo());
        }

        System.out.println("\nListagem de veículos elétricos:");
        List<Veiculo> eletricos = frotaInstanciada.listarPorMotorizacao("eletrico");
        for (Veiculo veiculo : eletricos) {
            System.out.println(veiculo.getModelo());
        }

        System.out.println("\nAbastecendo a frota:");
        frotaInstanciada.abastecerFrota();

        System.out.println("\nListagem dos veículos com menor autonomia:");
        List<Veiculo> menorAutonomia = frotaInstanciada.listarDezMenorAutonomia();
        for (Veiculo veiculo : menorAutonomia) {
            System.out.println(veiculo.getModelo() + " - Autonomia: " + veiculo.getAutonomia());
        }

        System.out.println("\nListagem dos veículos com maior autonomia:");
        List<Veiculo> maiorAutonomia = frotaInstanciada.listarDezMaiorAutonomia();
        for (Veiculo veiculo : maiorAutonomia) {
            System.out.println(veiculo.getModelo() + " - Autonomia: " + veiculo.getAutonomia());
        }

        System.out.println("\nListagem dos veículos com autonomia inferior a 20%:");
        List<Veiculo> baixaAutonomia = frotaInstanciada.listarPorcontagem(20);
        for (Veiculo veiculo : baixaAutonomia) {
            System.out.println(veiculo.getModelo() + " - Autonomia: " + veiculo.getAutonomia());
        }
    }
}
