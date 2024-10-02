package controller;

import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.util.Scanner;
import java.awt.Toolkit;

public class ElogiosController {

    private String[] elogiosVetor = { "atenciosa", "agradável", "adorável", "amável", "amorosa",
            "autêntica", "animada", "alegre", "amigável", "afetiva", "acolhedora", "atraente",
            "atrativa", "altruísta", "atenta", "admirável", "angelical", "bondosa", "bonita",
            "bela", "bacana", "benevolente", "brilhante", "benigna", "bem apessoada",
            "camarada", "carinhosa", "carismática", "cativante", "celestial", "charmosa", "companheira",
            "confiável", "criativa", "divertida", "dedicada", "doce", "deslumbrante", "elegante", "eloquente",
            "estilosa", "encantadora", "engraçada", "entusiasmada", "esforçada", "especial", "esperta",
            "espetacular", "esplêndida", "excelente", "extraordinária", "exuberante", "fantástica",
            "fenomenal", "fabulosa", "fascinante", "formidável", "formosa", "fofa", "gentil", "generosa",
            "graciosa", "genial", "gata", "glamorosa", "inteligente", "importante", "incrível",
            "interessante", "impressionante", "impecável", "irresistível", "inigualável", "iluminada",
            "indispensável", "legal", "linda", "maravilhosa", "magnifica", "majestosa", "perfeita",
            "parceira", "querida", "radiante", "simpática", "sensacional", "talentosa", "única", "valiosa" };
    private String[] elogiosEscolhidos;
    private Scanner scanner = new Scanner(System.in);

    public ElogiosController() {
        super();
    }

    public void mostrarTitulo(int tituloEscolhido) {
        if (tituloEscolhido == 0) {
            System.out.println("                           __              __        \r\n" + //
                    "     ___ ____ _______ ____/ /__  ____  ___/ /__      \r\n" + //
                    "    / _ `/ -_) __/ _ `/ _  / _ \\/ __/ / _  / -_)     \r\n" + //
                    "    \\_, /\\__/_/  \\_,_/\\_,_/\\___/_/    \\_,_/\\__/      \r\n" + //
                    "   /___/ __          _            ____ ___  ___  ___ \r\n" + //
                    "    ___ / /__  ___ _(_)__  ___   |_  // _ \\/ _ \\/ _ \\\r\n" + //
                    "   / -_) / _ \\/ _ `/ / _ \\(_-<  _/_ </ // / // / // /\r\n" + //
                    "   \\__/_/\\___/\\_, /_/\\___/___/ /____/\\___/\\___/\\___/ \r\n" + //
                    "             /___/                                   \r\n" + //
                    "   \r\n" + //
                    "");
        } else if (tituloEscolhido == 1) {
            System.out.println("\r\n" + //
                    "         ███████╗░██████╗░█████╗░  ██╗░██████╗\r\n" + //
                    "         ██╔════╝██╔════╝██╔══██╗  ██║██╔════╝\r\n" + //
                    "         █████╗░░╚█████╗░██║░░╚═╝  ██║╚█████╗░\r\n" + //
                    "         ██╔══╝░░░╚═══██╗██║░░██╗  ██║░╚═══██╗\r\n" + //
                    "         ███████╗██████╔╝╚█████╔╝  ██║██████╔╝\r\n" + //
                    "         ╚══════╝╚═════╝░░╚════╝░  ╚═╝╚═════╝░\r\n" + //
                    "\r\n" + //
                    "    ░██████╗░██╗░░░░░░░██╗███████╗███████╗████████╗\r\n" + //
                    "    ██╔════╝░██║░░██╗░░██║██╔════╝██╔════╝╚══██╔══╝\r\n" + //
                    "    ╚█████╗░░╚██╗████╗██╔╝█████╗░░█████╗░░░░░██║░░░\r\n" + //
                    "    ░╚═══██╗░░████╔═████║░██╔══╝░░██╔══╝░░░░░██║░░░\r\n" + //
                    "    ██████╔╝░░╚██╔╝░╚██╔╝░███████╗███████╗░░░██║░░░\r\n" + //
                    "    ╚═════╝░░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░░░╚═╝░░░\n");
        }
        System.out.print(":Quantos elogios você precisa? (1-90)\n-");
    }

    public String[] gerarElogios(int quantidadeElogios) {
        int maxElogios = elogiosVetor.length;
        if (quantidadeElogios > maxElogios) {
            System.out.println(":Quantidade máxima excedida, gerando " + maxElogios + " elogios\n");
            quantidadeElogios = maxElogios;
        }
        if (quantidadeElogios > 0) {
            boolean[] elogiosGerados = new boolean[maxElogios];
            String[] elogiosEscolhidos = new String[quantidadeElogios];
            for (int i = 0; i < quantidadeElogios;) {
                int numeroGerado = (int) (Math.random() * maxElogios);
                if (!elogiosGerados[numeroGerado]) {
                    elogiosGerados[numeroGerado] = true;
                    elogiosEscolhidos[i] = elogiosVetor[numeroGerado];
                    i++;
                }
            }
            for (String elogio : elogiosEscolhidos) {
                System.out.print("[" + elogio + "]");
            }
            System.out.println("");
            System.out.println("");
            return elogiosEscolhidos;
        } else {
            System.out.println(":Não é possível gerar 0 elogios, use /gerar e a quantidade para gerar"
                    + " outros elogios.\n");
            return null;
        }
    }

    public void iniciarGerador(int tituloEscolhido){
        int quantidadeElogios = 0;
        boolean checarDados = false;
        mostrarTitulo(tituloEscolhido);
        while (checarDados == false) {
            try {
                quantidadeElogios = Integer.parseInt(scanner.nextLine());
                checarDados = true;
            } catch (Exception e) {
                trocarTema(tituloEscolhido);
            }
        }
        System.out.println("\n:Gerando...\n");
        elogiosEscolhidos = gerarElogios(quantidadeElogios);
        iniciarComandos();
    }

    public void iniciarComandos(){
        String linhaComando = "";
        while (!linhaComando.contains("/sair")) {
            linhaComando = scanner.nextLine();
            if (linhaComando.contains("/copiar")) {
                copiarElogios(elogiosEscolhidos);
            } else if (linhaComando.contains("/gerar")) {
                int numeroGerar = 0;
                String vetorLinha[] = linhaComando.split("/gerar");
                try {
                    numeroGerar = Integer.parseInt(vetorLinha[1].trim());
                    elogiosEscolhidos = gerarElogios(numeroGerar);
                } catch (Exception e) {
                    System.out.println(":Comando inválido.\n");
                }
            } else if (linhaComando.contains("/listar")){
                System.out.println(":Comandos do gerador\n./gerar numero, gera novos elogios\n"
                +"./copiar, copia os elogios para a área de transferência\n./sair, sai o gerador\n");
            } else if (linhaComando.contains("/esc")){
                trocarTema(1);
                return;
            }
        }
        System.out.println(":Saindo.");
        scanner.close();
    }
    public void copiarElogios(String[] elogiosEscolhidos) {
        String elogiosCopia = "";
        for (String elogio : elogiosEscolhidos) {
            elogiosCopia += elogio;
            elogiosCopia += ", ";
        }
        elogiosCopia = elogiosCopia.substring(0, elogiosCopia.length() - 2);
        StringSelection stringSelection = new StringSelection(elogiosCopia);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println(":Elogios copiados para a área de transferência.\n");
    }

    public void trocarTema(int temaEscolhido) {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            iniciarGerador(temaEscolhido);
        } catch (Exception e) {
            System.out.println(":Erro ao tentar trocar o tema.");
        }
    }
}