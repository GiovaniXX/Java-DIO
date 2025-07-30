public class ForcaVisual {
    public static void desenhar(int tentativas) {
        System.out.println("-------");
        System.out.println("|     |");

        System.out.println("|     " + (tentativas <= 5 ? "O" : ""));
        System.out.println("|    " + (tentativas <= 3 ? "/" : "") + (tentativas <= 4 ? "|" : "") + (tentativas <= 2 ? "\\" : ""));
        System.out.println("|    " + (tentativas <= 1 ? "/" : "") + " " + (tentativas == 0 ? "\\" : ""));
        System.out.println("|");
        System.out.println("=========");
    }
}

