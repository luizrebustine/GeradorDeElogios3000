package controller;

public class ElogiosController {

    public ElogiosController(){
        super();
    }

    public void mostrarTitulo() {
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
    }

    public void gerarElogios(int quantidadeElogios) {
        String[] elogios = {"atenciosa", "agradável", "adorável", "amável", "amorosa",
        "autêntica", "animada", "alegre", "amigável", "afetiva", "acolhedora", "atraente",
        "atrativa", "altruísta", "atenta", "admirável", "angelical", "bondosa", "bonita",
        "bela", "bacana", "benevolente", "brilhante", "beldade", "benigna", "bem-apessoada",
        "camarada", "carinhosa", "carismático", "cativante", "celestial", "charmosa", "companheira",
        "confiável", "criativa", "divertida", "dedicada", "doce", "deslumbrante", "elegante", "eloquente",
        "estilosa", "encantadora", "engraçada", "entusiasmada", "esforçada", "especial", "esperta",
        "espetacular", "esplêndido", "excelente", "extraordinária", "exuberante", "fantástica",
        "fenomenal", "fabulosa", "fascinante", "formidável", "formosa", "fofa", "gentil", "generosa",
        "graciosa", "genial", "gata", "glamorosa", "inteligente", "importante", "incrível", 
        "interessante", "impressionante", "impecável", "irressistível", "inigualável", "iluminada",
        "indispensável", "legal", "linda", "maravilhosa", "magnifica", "mejastosa", "perfeita", 
        "parceira", "querida", "radiante", "simpática", "sensacional", "talentosa", "única",
        "valiosa"};
        int maxElogios = elogios.length;
        if(quantidadeElogios > maxElogios){
            System.out.println(":Quantidade máxima excedida, gerando " + maxElogios + " elogios\n");
        }
        boolean[] elogiosGerados = new boolean[maxElogios];
        for(int i = 0; i < quantidadeElogios; i++){
            int numeroGerado = (int)(Math.random()*maxElogios);
            if(!elogiosGerados[numeroGerado]){
                elogiosGerados[numeroGerado] = true;
                System.out.print("[" + elogios[numeroGerado] + "]");
            }
        }
        System.out.println("");

    }
}