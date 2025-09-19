public class Pessoa {

    //atributos privados
    private String nome;
    private double peso;
    private double altura;
    public double IMC;

    //construct que inicia os atributos
    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    //Metodos para pegar os atributos
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

    //Metodos para definir atributos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        if (peso > 0){ this.peso = peso;}
    }
    public void setAltura(double altura) {
        if (altura > 0){this.altura = altura;}
    }
    //Metodo para carregar IMC (p/(a*a))
    public double calcularIMC(){
       IMC = this.peso/(this.altura*this.altura);

       return IMC;
    }
}
