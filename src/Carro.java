public class Carro {
    // atributos da classe
    private String combustivel;
    private double peso;
    private String marca;
    private int anofabricacao;

    // Métodos modificadores (setters)
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnoFabricacao(int anofabricacao) {
        this.anofabricacao = anofabricacao;}

    // Métodos seletores (getters)
    public String getCombustivel() {
        return combustivel;}

    public double getPeso() {
        return peso;}

    public String getMarca() {
        return marca;}

    public int getAnoFabricacao() {
        return anofabricacao;
    }
}