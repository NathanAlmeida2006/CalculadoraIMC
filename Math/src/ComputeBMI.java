import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();

        System.out.print("Informe seu peso em quilogramas: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Valor arredondado: " + Math.round(imc));
        sc.close();
    }
}
