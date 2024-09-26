package view;

import java.util.Scanner;

import controller.ElogiosController;

public class Main {
    public static void main(String[] Args) {
        ElogiosController elogiosController = new ElogiosController();
        Scanner scanner = new Scanner(System.in);
        elogiosController.mostrarTitulo();
        System.out.print(":Quantos elogios você precisa? (1-90)\n-");
        int quantidadeElogios = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("\n:Gerando...\n");
        elogiosController.gerarElogios(quantidadeElogios);
    }
}
