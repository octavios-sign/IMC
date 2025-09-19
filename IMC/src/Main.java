public class Main {
    public static void main(String[] args) {

        Pessoa pessoa_comum = new Pessoa("Rosalyne Lohefalter", 72, 1.80);

        Atleta atleta = new Atleta("Ajax", 80,1.82, "Luta livre");

        //calculando e exibindo IMCs
        System.out.println("----Cálculo do IMC----");
        System.out.printf("O IMC de %s é: %.2f\n", pessoa_comum.getNome(), pessoa_comum.calcularIMC());
        System.out.printf("O IMC de %s (Atleta de %s) é %.2f (valor com ajuste)", atleta.getNome(), atleta.getEsporte_Praticado(), atleta.calcularIMC());

    }
}
