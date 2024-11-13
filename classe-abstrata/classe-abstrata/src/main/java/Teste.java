public class Teste {
    public static void main(String[] args) {
        Carro carro01 = new Carro("Bob da Silva", "Fiat", 2013, 0.8, false);
        Bicicleta bike01 = new Bicicleta("Xampson", "Caloi", 2022, 0.1);
        Moto moto01 = new Moto("Mel", "Top", 2023, false);

        carro01.exibirRelatorio();
        bike01.exibirRelatorio();
        moto01.exibirRelatorio();

    }
}
