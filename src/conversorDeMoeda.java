import java.util.Scanner;

public class conversorDeMoeda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DadosDaAPI dadosDaAPI = new DadosDaAPI();

        while (true) {
            System.out.println("****************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda");
            System.out.println("1: Dólar =>> Peso argentino");
            System.out.println("2: Peso argentino =>> Dólar");
            System.out.println("3: Dólar => Real brasileiro");
            System.out.println("4: Real brasileiro =>> Dólar");
            System.out.println("5: Dólar =>> Peso colombiano");
            System.out.println("6: Peso colombiano =>> Dólar");
            System.out.println("7: Sair");
            System.out.println("Escolha uma das opções acima: ");
            System.out.println("****************************************************");


            int opcao = scanner.nextInt();
            String moeda1 = "", moeda2 = "";

            switch (opcao) {
                case 1 -> {
                    moeda1 = "USD";
                    moeda2 = "ARS";
                }
                case 2 -> {
                    moeda1 = "ARS";
                    moeda2 = "USD";
                }
                case 3 -> {
                    moeda1 = "USD";
                    moeda2 = "BRL";
                }
                case 4 -> {
                    moeda1 = "BRL";
                    moeda2 = "USD";
                }
                case 5 -> {
                    moeda1 = "USD";
                    moeda2 = "COP";
                }
                case 6 -> {
                    moeda1 = "COP";
                    moeda2 = "USD";
                }
                case 7 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opção inválida! Selecione uma opção válida.");
                    continue;
                }
            }

            System.out.print("Qual valor de " + moeda1 + " gostaria de converter para " + moeda2 + "? ");
            double valor = scanner.nextDouble();

            String resultado = DadosDaAPI.converteMoeda(moeda1, moeda2, valor);
            System.out.println(resultado);
        }
    }
}


