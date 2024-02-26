package Atividade;
public class Veiculo {
    private String marca;
    private String modelo;
    private float autonomia;
    private String motorizacao;
    private float capacidade;
    private float combDisponivel; 

    public Veiculo(String marca, String modelo, float autonomia, String motorizacao, float capacidade, float combDisponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.autonomia = autonomia;
        this.motorizacao = motorizacao;
        this.capacidade = capacidade;
        this.combDisponivel = combDisponivel;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setAutonomia (float autonomia) {
        this.autonomia = autonomia;
    }

    public float getAutonomia() {
        return this.autonomia;
    }

    public void setMotorizacao (String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public String getMotorizacao() {
        return this.motorizacao;
    }

    public void setCapacidade (float capacidade) {
        this.capacidade = capacidade;
    }

    public float getCapacidade() {
        return this.capacidade;
    }

    public void setCombDisponivel (float combDisponivel) {
        this.combDisponivel = combDisponivel;
    }

    public float getCombDisponivel() {
        return this.combDisponivel;
    }

    public void abastecer(float quantidade, String combustivel) throws Exception{
        if (!this.motorizacao.equalsIgnoreCase(combustivel)) {
            throw new Exception("Combustível informado incompatível com o veículo");
        }
        float quantMax = this.capacidade - this.combDisponivel;
        if (quantidade > this.capacidade) {
            throw new Exception("Quantidade superior à suportada no tanque do veículo. Informe um valor de até " + quantMax);
        }
        if (quantidade > quantMax) {
            throw new Exception("Quantidade superior à suportada no tanque do veículo neste momento. Informe um valor de até " + quantMax);
        }
        this.combDisponivel = quantidade;
    }

    public void verificarModelo() throws Exception {
        if (this.marca.equalsIgnoreCase("Chevrolet") && !this.modelo.equalsIgnoreCase("Onix")) {
            throw new Exception("Modelo inválido para a marca Chevrolet: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Volkswagen") && !this.modelo.equalsIgnoreCase("Gol")) {
            throw new Exception("Modelo inválido para a marca Volkswagen: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Fiat") && !this.modelo.equalsIgnoreCase("Uno")) {
            throw new Exception("Modelo inválido para a marca Fiat: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Ford") && !this.modelo.equalsIgnoreCase("Fiesta")) {
            throw new Exception("Modelo inválido para a marca Ford: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Toyota") && !this.modelo.equalsIgnoreCase("Corolla")) {
            throw new Exception("Modelo inválido para a marca Toyota: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Honda") && !this.modelo.equalsIgnoreCase("Civic")) {
            throw new Exception("Modelo inválido para a marca Honda: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Hyundai") && !this.modelo.equalsIgnoreCase("HB20")) {
            throw new Exception("Modelo inválido para a marca Hyundai: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Renault") && !this.modelo.equalsIgnoreCase("Sandero")) {
            throw new Exception("Modelo inválido para a marca Renault: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Nissan") && !this.modelo.equalsIgnoreCase("Kicks")) {
            throw new Exception("Modelo inválido para a marca Nissan: " + this.modelo);
        } else if (this.marca.equalsIgnoreCase("Jeep") && !this.modelo.equalsIgnoreCase("Renegade")) {
            throw new Exception("Modelo inválido para a marca Jeep: " + this.modelo);
        }
    }
}