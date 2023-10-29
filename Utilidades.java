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

    public void Exercicio_11(Scanner scan) {
        int max = 0;
        int min = 0;
        System.out.println("Introduza limite:");
        int lim = scan.nextInt();
        int total = lim;
        int soma = 0;
        int prim = 1;

        while (lim>0){
            System.out.println("Introduza Proximo numero:");
            int num = scan.nextInt();
            if (prim == 1) {
                max=num;
                min=num;
                prim=0;
            } else if (max<num){
                 max = num;
            } else if (min>num) {
                 min=num;
            }
            soma += num;
            lim --;

        }
        int med=soma/total;
        System.out.printf("Min %d, Max%d, Soma %d, Media %d", min, max,soma, med);
    }


    public void Exercicio_12(Scanner scan) {
        System.out.println("introduza número");
        int num;
        int rlst = 0;
        num = scan.nextInt();
        int original = num;

        if (num>0) {
            rlst = 0;

        } do {
            int r = num % 10;
            num = num / 10;
            rlst = rlst * 10 +r;
        } while (num>0);
         if (rlst==original) {
             System.out.println("capicua");
         } else {
             System.out.println("Não é capicua");
         };
    }

    public void Exercicio_13(Scanner scan) {
        System.out.println("Introduza número:");
        int n;
        n = scan.nextInt();
        int fat=1;
        while (n>1) {
            fat *= n;
            n--;
        }
        System.out.printf("Fatorial: %d", fat  );
    }

    public void Exercicio_14(Scanner scan){
 // Perguntar ao Gabriel o que é a recursividade
    }

    public void Exercicio_15(Scanner scan) {
        System.out.println("Base:");
        int base;
        base = scan.nextInt();
        System.out.println("expoente");
        int expo;
        expo = scan.nextInt();
        int pot = 1;
        while (expo>0) {
            pot *=base;
            expo--;
        } if (expo==0) {
            System.out.printf("Potencia: %d", pot);
        } else {
            System.out.println("Erro");
        }
    }

    public void Exercicio_16(Scanner scan) {
        System.out.println("Introduza a:");
        int r;
        int maior;
        int menor;
        int a;
        a = scan.nextInt();
        System.out.println("Introduza b:");
        int b;
        b = scan.nextInt();
        if (a>b){
            maior =a;
            menor =b;
        } else {
            maior=b;
            menor=a;
        } do {
            r= maior % menor;
            maior = menor;
        } while (menor == r);
        System.out.printf("Maior: %d", maior);
    }

    public void Exercicio_17(Scanner scan) {
        System.out.println("Quantos Euros:");
        int euros = scan.nextInt();
        int quoc, r, s5=0, s3=0;
        if(euros>8) {
            quoc= euros/8;
            r=euros%8;
            switch (r) {
                case 0: s3=quoc;s5=quoc;break;
                case 1: s3=quoc+2;s5=quoc-1;break;
                case 2: s3=quoc-1;s5=quoc+1;break;
                case 3: s3=quoc+1;s5=quoc;break;
                case 4: s3=quoc+3;s5=quoc-1;break;
                case 5: s3=quoc;s5=quoc+1;break;
                case 6: s3=quoc+2;s5=quoc+2;break;
                case 7: s3=quoc-1;s5=quoc+2;break;
                //default: s3=0; s5=0; break;
            }
        } else {
            if(euros==3){s3=1;s5=0;}
            else if(euros==5) {s3=0; s5=1;}
            else if(euros==6) {s3=2; s5=0;}
            else System.out.println("\r \n Quantia Inválida :: Devolução");
        }
        System.out.printf("selos de três %d Selos de cinco %d", s3, s5);
    }


    public void Exercicio_18(Scanner scan) {
        System.out.println("Introduza número");
        int num;
        int r;
        int quoc;
        num = scan.nextInt();
        int div = 2;
        do {
            r=num%div;
            quoc = num/div;
            div ++;
        } while (r!=0 && quoc >= div);
        if (num==2 ||  r!=0) {
            System.out.println("True");
        } else System.out.println("False");
    }

    public void Exercicio_19(Scanner scan) {
        System.out.println("Limite:");
        int lim = scan.nextInt();
        int num = 2;

        while (lim > 0) {
            boolean isPrime = true;

            for (int div = 2; div <= Math.sqrt(num); div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d: ", num);
                lim--;
            }
            num++;
        }
    }
}
