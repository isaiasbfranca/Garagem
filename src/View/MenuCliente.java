package View;

import Controller.ControllerCliente;
import Services.Cliente;

import java.io.*;

public class MenuCliente {
    //Índice do último registro
    private int top = 0;
    //Array de registros do cadastro
    private Cliente[] list;
    ControllerCliente add = new ControllerCliente();

    public void menu() {
        BufferedReader keyIn = new BufferedReader
                (new InputStreamReader(System.in));

        int act = 0;
        while (true) {
            //Mostra as opções
            System.out.println("#########################");
            System.out.println("######## CLIENTE ########");
            System.out.println("##### 1 - CADASTRAR  ####");
            System.out.println("##### 2 - LISTAR     ####");
            System.out.println("##### 3 - EDITAR     ####");
            System.out.println("##### 4 - EXCLUIR    ####");
            System.out.println("##### 5 - BUSCAR     ####");
            System.out.println("##### 6 - VOLTAR     ####");
            System.out.println("#########################");
            System.out.println("Escolha uma opção: \n");

            try {
                //Obter a escolha
                act = Integer.parseInt(keyIn.readLine());
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
                case 0:
                    return;
                default:
                    System.out.println(" Comando desconhecido ");
            }


        }

    }

}

