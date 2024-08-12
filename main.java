import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe os dados para o primeiro boneco:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Data de Fabricação: ");
        int dataFabricacao1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor: ");
        String cor1 = scanner.nextLine();
        System.out.print("Altura: ");
        double altura1 = scanner.nextDouble();
        System.out.print("Peso: ");
        double peso1 = scanner.nextDouble();
        scanner.nextLine();

        Boneco boneco1 = new Boneco(nome1, dataFabricacao1, cor1, altura1, peso1);

        System.out.println("Meu nome é " + boneco1.nome + ", minha data de fabricação é " + boneco1.dataFabricacao + ", a minha cor é " + boneco1.cor + ", meu peso é " + boneco1.peso + " gramas e a minha altura é " + boneco1.altura + "centímetros");

        boneco1.andar();
        boneco1.pular();
        boneco1.atacar();
        boneco1.defender();
        boneco1.falar();
        boneco1.falar("Eu sou o " + boneco1.nome + "!!");


        System.out.println("\nInforme os dados para o segundo boneco:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Data de Fabricação: ");
        int dataFabricacao2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor: ");
        String cor2 = scanner.nextLine();
        System.out.print("Altura: ");
        double altura2 = scanner.nextDouble();
        System.out.print("Peso: ");
        double peso2 = scanner.nextDouble();

        Boneco boneco2 = new Boneco(nome2, dataFabricacao2, cor2, altura2, peso2);

        System.out.println("Meu nome é " + boneco2.nome + ", minha data de fabricação é " + boneco2.dataFabricacao + " , a minha cor é " + boneco2.cor + ", meu peso é " + boneco2.peso + " gramas e a minha altura é " + boneco2.altura + "centímetros");

        boneco2.andar();
        boneco2.pular();
        boneco2.atacar();
        boneco2.defender();
        boneco2.falar();
        boneco2.falar("Ao infinito e além!");

        scanner.close();
    }
}
