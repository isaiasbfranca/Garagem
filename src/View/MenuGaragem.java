package View;

import Controller.ControllerGaragem;


import java.util.Scanner;



public class MenuGaragem {
    ControllerGaragem funcoesGaragem = new ControllerGaragem();
    public void Menu() {
        Scanner option = new Scanner(System.in);
        int op;

        do {
            System.out.println("###############################");
            System.out.println("########### GARAGEM ###########");
            System.out.println("#####    1 - CADASTRAR  #######");
            System.out.println("#####    2 - LISTAR     #######");
            System.out.println("#####    3 - EDITAR     #######");
            System.out.println("#####    4 - EXCLUIR    #######");
            System.out.println("#####    5 - BUSCAR     #######");
            System.out.println("#####    6 - CARROS     #######");
            System.out.println("#####    7 - VOLTAR     #######");
            System.out.println("##### 8 - Sair do programa ####");
            System.out.println("###############################");

            System.out.println("Digite uma opção: ");
            op = Integer.parseInt(option.next());

            switch (op) {
                case 1:
                    funcoesGaragem.inserirGaragem();
                    break;
                case 2:
                    funcoesGaragem.listarGaragem();
                    break;
                case 3:
                    funcoesGaragem.editarGaragem();
                    break;
                case 4:
                    funcoesGaragem.excluirGaragem();
                    break;
                case 5:
                    funcoesGaragem.buscarGaragem();
                    break;
                case 6:
                    funcoesGaragem.listarcarros();
                    break;
                case 7:
                    System.out.println("Deseja realmente voltar? (S/N)");
                    String op2 = option.next();

                    if( op2.equals('n') || op2.equals('N')){
                        break;
                    }else if (op2.equals('s') || op2.equals('S')){
                        continue;
                    }
                    return;
                case 8:
                    System.out.println("Deseja realmente Sair do Programa? (S/N)");
                    String op3 = option.next();
                    if( op3.equals('s') || op3.equals('S')){
                        System.exit('s');
                    }else{
                        continue;
                    }
                    break;

                default:
                    System.out.println("Opção invalida!!");
            }

        }while (op != 8);
    }

}
