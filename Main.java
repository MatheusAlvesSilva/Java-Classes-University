import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades();
        Scanner scan = new Scanner(System.in);
        int op;
        for (; ; ) {
            op = utilidades.menu(scan);
            if (op == 0) break;
            switch (op) {
                case 1:
                    utilidades.Exercicio_1(scan);
                    break;
                case 2:
                    utilidades.Exercicio_2(scan);
                    break;
                case 3:
                    utilidades.Exercicio_3(scan);
                    break;
                case 4:
                    utilidades.Exercicio_4(scan);
                    break;
                case 5:
                    utilidades.Exercicio_5(scan);
                    break;
                case 6:
                    utilidades.Exercicio_6(scan);
                    break;
                case 7:
                    utilidades.Exercicio_7(scan);
                    break;
                case 8:
                    utilidades.Exercicio_8(scan);
                    break;
                case 9:
                    utilidades.Exercicio_9(scan);
                    break;
                case 10:
                    utilidades.Exercicio_10(scan);
                    break;
            }
        }
    }
}