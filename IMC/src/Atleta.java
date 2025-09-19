public class Atleta extends Pessoa{
    private String esporte_Praticado;

    //construct do atleta
    public Atleta(String nome, double peso, double altura, String esporte_Praticado){
        super(nome, peso, altura);
        this.esporte_Praticado = esporte_Praticado;
    }
    public String getEsporte_Praticado() {
        return esporte_Praticado;
    }
    public void setEsporte_Praticado(String esporte_Praticado) {
        this.esporte_Praticado = esporte_Praticado;
    }
    @Override
    //chama metodo da classe pessoa(classe mae)
    public double calcularIMC(){
        double imc_base = super.calcularIMC();

        double imc_ajustado = imc_base * 0.95;
        return imc_ajustado;
    }
}
