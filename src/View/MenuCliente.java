package View;

import Controller.ControllerCliente;
import Services.Cliente;

import java.util.Scanner;

public class MenuCliente {

    ControllerCliente add = new ControllerCliente();

    public void menu() {
        Scanner opcao = new Scanner(System.in);

        int act = 0;
        while (true) {
            //Mostra as opções
            System.out.println("###############################");
            System.out.println("########### CLIENTE ###########");
            System.out.println("#####    1 - CADASTRAR  #######");
            System.out.println("#####    2 - LISTAR     #######");
            System.out.println("#####    3 - EDITAR     #######");
            System.out.println("#####    4 - EXCLUIR    #######");
            System.out.println("#####    5 - BUSCAR     #######");
            System.out.println("#####    6 - VOLTAR     #######");
            System.out.println("##### 7 - Sair do programa ####");
            System.out.println("###############################");
            System.out.println("Escolha uma opção: \n");

            try {
                //Obter a escolha
                act = Integer.parseInt(opcao.nextLine());
            } catch (Exception e) {
                System.out.println(" Erro ");
            }

            //Verifica a escolha do usuário
            switch (act) {
                case 1:
                    add.addEntry();
                    break;
                case 2:
                    add.viewEntries();
                    break;
                case 3:
                    add.updateEntry();
                    break;
                case 4:
                    add.delEntry();
                    break;
                case 5:
                    add.search();
                    break;
                case 6:
                    return;
                case 7:
                    System.exit(7);
                default:
                    System.out.println(" Comando desconhecido ");
            }


        }

    }

}

