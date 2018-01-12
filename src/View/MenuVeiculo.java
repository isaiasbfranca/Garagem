package View;

import java.util.Scanner;

public class MenuVeiculo {

    public void menu() {
        Scanner leitura = new Scanner(System.in);
        int op;


        while (true) {
            System.out.println("###############################");
            System.out.println("########### VEICULO ###########");
            System.out.println("#####    1 - CADASTRAR  #######");
            System.out.println("#####    2 - LISTAR     #######");
            System.out.println("#####    3 - EDITAR     #######");
            System.out.println("#####    4 - EXCLUIR    #######");
            System.out.println("#####    5 - BUSCAR     #######");
            System.out.println("#####    6 - VOLTAR     #######");
            System.out.println("##### 7 - Sair do programa ####");
            System.out.println("###############################");
            System.out.println("Escolha uma opção: \n");

            op = Integer.parseInt(leitura.nextLine());

            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("\n Voltando \n");
                    return;
                case 7:
                    System.exit(7);
                default:
                    System.out.println("\n Opção invalida \n");
            }
        }
    }
}
