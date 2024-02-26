package Atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Frota {
    private List<Veiculo> frota = new ArrayList<>();

    public Frota(List<Veiculo> frota) {
        this.frota = frota;
    }

    public List<Veiculo> listarPorMotorizacao(String motorizacao) {
        List<Veiculo> lista = new ArrayList<>();
        for (Veiculo veiculo : frota) {
            if (veiculo.getMotorizacao().equalsIgnoreCase(motorizacao)) {
                lista.add(veiculo);
            }
        }
        return lista;
    }

    public void abastecerFrota() {
        for (Veiculo veiculo : frota) {
            float quantAbastecer = veiculo.getCapacidade() - veiculo.getCombDisponivel();
            veiculo.setCombDisponivel(quantAbastecer);
            System.out.println("Veículo " + veiculo.getModelo() + " abastecido com " + quantAbastecer + " Litros de "
                    + veiculo.getMotorizacao());
        }
    }

    public List<Veiculo> listarPorcontagem(int porcentagem) {
        List<Veiculo> lista = new ArrayList<>();
        for (Veiculo veiculo : frota) {
            float autonomiaAtual = (veiculo.getCombDisponivel() / veiculo.getCapacidade()) * 100;
            if (autonomiaAtual < porcentagem) {
                lista.add(veiculo);
            }
        }
        return lista;
    }

    public List<Veiculo> listarDezMaiorAutonomia() {
        List<Veiculo> lista = new ArrayList<>(frota);

        Collections.sort(lista, (v1, v2) -> Float.compare(v2.getAutonomia(), v1.getAutonomia()));

        return lista.subList(0, Math.min(10, lista.size()));
    }
    
    public List<Veiculo> listarDezMenorAutonomia() {
        List<Veiculo> lista = new ArrayList<>(frota); 

        Collections.sort(lista, (v1, v2) -> Float.compare(v1.getAutonomia(), v2.getAutonomia()));

        return lista.subList(0, Math.min(10, lista.size()));
    }
}
