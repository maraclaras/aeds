import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int op;
        int limite;

        do {
            System.out.println("Opção 1:");
            System.out.println("Somar números pares");
            System.out.println("Opção 2:");
            System.out.println("Somar todos os elementos de um vetor");
            System.out.println("Opção 3:");
            System.out.println("Contar a quantidade de repetições");
            System.out.println("Opção 4:");
            System.out.println("Sair");
            System.out.println("Escolher opção:");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Opção 1 selecionada");
                    System.out.println("Escolha o limite:");
                    limite = sc.nextInt();
                    System.out.println("Resultado:" + somarPares(limite));
                    break;

                case 2:
                    System.out.println("Opção 2 selecionada");
                    System.out.println("Escolha o tamanho do vetor");
                    int n = leitor.nextInt();
                    double vetor[] = new double[n];
                    for(int j = 0; j < n; j++){
                        vetor[j] = leitor.nextDouble();
                    }
                    System.out.println("Resultado:" + somaElementos(vetor, n));
                    break;

                case 3:
                    System.out.println("Opção 3 selecionada");
                    break;

                case 4:
                    System.out.println("Saindo");
                    break;
            }
        }

        while (op >= 0);

    }

    public static int somarPares(int limite) {
        if (limite == 0) {
            return 0;
        } else if (limite % 2 == 0) {
            return limite + somarPares(limite - 1);
        }
        else{
            return 0 + somarPares(limite - 1);
        }
    }

    public static double somaElementos(double[]v, int i){
        if(i < 0){
            return 0;
        }
        else{
            return v[i] + somaElementos(v, i - 1);
        }
    }

}