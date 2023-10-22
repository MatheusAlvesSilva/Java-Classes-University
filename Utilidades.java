import java.util.Scanner;
public  class Utilidades {

public int menu(Scanner scan) {
        System.out.println("\nMENU\n");
        System.out.println("Sair <- 0");
        System.out.println("Exercicio 1 <- 1");
        System.out.println("Exercicio 2 <- 2");
        System.out.println("Exercicio 3 <- 3");
        System.out.println("Exercicio 4 <- 4");
        System.out.println("Exercicio 5 <- 5");
        System.out.println("Exercicio 6 <- 6");
        System.out.print(". . . Escolha uma opção -> ");
        return scan.nextInt();
        }

    public void Exercicio_1(Scanner scan) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário para inserir um número
        System.out.print("Por favor, insira um número: ");

        // Leia o número inserido pelo usuário
        int numero = scanner.nextInt();

        // Calcule o dobro
        int dobro = numero * 2;

        // Exiba o resultado
        System.out.println("O dobro de " + numero + " é " + dobro);

    }


    public void Exercicio_2(Scanner scan) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário para inserir um número
        System.out.print("Por favor, insira um número: ");

        // Leia o número inserido pelo usuário
        int numero = scanner.nextInt();

        // Calcule o dobro
        int dobro = numero * 2;

        // Verifique se o número é par ou ímpar
        String paridade = (numero % 2 == 0) ? "par" : "ímpar";

        // Exiba o resultado
        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("O número " + numero + " é " + paridade + ".");
    }


    public void Exercicio_3(Scanner scan){

        Scanner NumeroUtilizador = new Scanner(System.in); // input para o utilizador colocar
        System.out.print("Digite o valor de n: "); //Escreve na tela
        int n = NumeroUtilizador.nextInt(); //pega variavel e tranforma em numero funçáo do nextInt()

        int soma = 0; // Contador começa no zero.
        for (int i = 1; i <= n; i++) { // Em quanto a variavel i for menor ou igual a n icrementa mais um.
            soma += i;
        }

        System.out.println("A soma dos primeiros " + n + " números inteiros é: " + soma); // Introduz o resultado

    }

    public void Exercicio_4(Scanner scan) {
        int soma = 0;
        int n;
        do {
            System.out.println("Digite -1 para cancelar o programa");
            System.out.println("Digite um numero");
            n = scan.nextInt();
            if (n>=0) {
                soma +=n;
            }
        } while( n!= -1);
        System.out.printf("A soma dos números é: %d", soma);
    }

    public void Exercicio_5(Scanner scan) {
        System.out.println("Escreva um numero de 100 a 999");
        int num = scan.nextInt();
        if (num >100 && num <999) {
            int u = num%10;
            int d = (num/10)%10;
            int c = num /100;
            int rslt = u*100 + d*10 + c;
            System.out.println(rslt);
        } else {
            System.out.println("Erro");
        }
    }

    public void Exercicio_6(Scanner scan) {
        System.out.println("Introduza um número:");
        int n;
        n = scan.nextInt();
        if (n > 0) {
                int rslt=0;
            do {
                int r = n % 10;
                n = n/10;
                rslt = rslt * 10 +r;
            } while (n>0);
            System.out.println(rslt);
        }
        else {
            System.out.println("Erro");
        }
    }

    public void Exercicio_7(Scanner scan) {
        System.out.println("Introduza um número");
        int n;
        n = scan.nextInt();
        if (n >= 100 && n <=999) {
            int u = n%10;
            int d = (n /10) % 10;
            int c =  n /100;
            int dc= (u*5 + d*3 + c )%7;
            int rslt = n*10 +dc;
            System.out.println(rslt);
        } else {
        System.out.println("Erro");
        }
    }


    public void Exercicio_8(Scanner scan){
        System.out.println("a:");
        int a = scan.nextInt();
        System.out.println("b:");
        int b = scan.nextInt();
        System.out.println("c:");
        int c = scan.nextInt();
        if (a>b){
            if (b>c){
                System.out.printf("%d %d %d",c,b,a);
            } else if (a>c) {
                System.out.printf("%d %d %d",b,c,a);
            } else {
                System.out.printf("%d %d %d",b,a,c);
            }
        }
        else if (b>c) {
            if (a>c) {
                System.out.printf("%d %d %d",c,a,b);
            } else {
                System.out.printf("%d %d %d",a,c,b);
            }
        }
        else {
            System.out.printf("%d %d %d",a,b,c);
        }
    }


    public void Exercicio_9(Scanner scan){
        System.out.println("Introduza salário Bruto");
        int sb;
        float tx;
        sb = scan.nextInt();
        if (sb<0) {
             tx= 0.0F;
        } if (sb<1000) {
             tx= 0.10F;
        } if (sb<1500) {
             tx= 0.15F;
        } if (sb<2000) {
             tx= 0.20F;
        } else {
             tx= 0.30F;
        }
        float sl;
         sl = sb*(1-tx);
        System.out.printf("Salario Líquido:%.2f", sl );
    }


    public void Exercicio_10(Scanner scan) {
        System.out.println("Decimal:");
        int dec = scan.nextInt();
        int bin = 0;
        int fator=1;
        do {
            int r = dec % 2;
              dec /= 2;
            bin = bin + (r*fator);
            fator *=10;
        } while (dec > 0);
        System.out.println(bin);
    }
}


