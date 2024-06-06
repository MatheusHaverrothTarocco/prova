import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {// psvm (tab) ou enter
        int qtd,troca,op = 1,pos1,pos2;
        float soma = 0,somar = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a quantia de vetores");
        qtd = scanner.nextInt();

        int[] temp = new int[qtd];


        while(op > 0){
            int maior = temp[0];
            int menor = temp[0];
            for (int i = 0; i < qtd; i++) {
                System.out.println("Digite o vetor de número: "+ (i+1) );
                temp[i] = scanner.nextInt();

                soma = soma + temp[i];

                maior = temp[0];
                menor = temp[0];

                if (temp[i] > maior) {
                    maior = temp[i];
                }
                if (temp[i] < menor) {
                    menor = temp[i];
                }
            }
            System.out.println("1-Soma\n" + "2-Media\n" + "3-maior e menor\n" +"4-troca\n"+ "0-sair\n" );
            op = scanner.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("A soma é: " + soma);
                    break;
                case 2:
                    System.out.println("A media é: " + soma / qtd);
                    break;
                case 3:
                    System.out.println("O maior é: " + maior);
                    System.out.println("O menor é: " + menor);
                    break;
                case 4:
                    System.out.println("Escolha o vetor 1");
                    pos1 = scanner.nextInt();
                    System.out.println("Escolha o vetor 2");
                    pos2 = scanner.nextInt();

                    troca = temp[pos1];
                    temp[pos1] = temp[pos2];
                    temp[pos2] =troca;

                    System.out.println("vetor 1 igual: "+ temp[pos1]);
                    System.out.println("vetor 2 igual: "+ temp[pos2]);

                    for (int i = 0; i < qtd; i++) {
                        somar = somar + temp[i];
                    }

                    System.out.println("A soma é: " + somar);
                    System.out.println("A media é: " + somar / qtd);

                    if(pos1 < 0 || pos1 > qtd ){
                        System.out.println("Erro");
                    }

                    if(pos2 < 0 || pos2 > qtd ){
                        System.out.println("Erro");
                    }
                    break;
            }

            if(qtd <= 0){
                System.out.println("Erro, a quantidade deve ser maior que 0");
            }


            if (qtd < 1 && op == 4) {
                System.out.println("Erro, a quantidade deve ser maior ou igua a 2");
            }
        }
    }
}