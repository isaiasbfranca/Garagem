package View;

import View.MenuGaragem;

import java.util.Scanner;

public class Principal {

    public static void menu(){
        System.out.println("######################");
        System.out.println("######## MENU ########");
        System.out.println("#### 1 - GARAGEM  ####");
        System.out.println("#### 2 - VEICULO  ####");
        System.out.println("#### 3 - CLIENTE  ####");
        System.out.println("#### 4 - SAIR     ####");
        System.out.println("######################");

        System.out.println("Digite uma opção: ");
    }


    public static void main(String[] args) {
        Scanner option = new Scanner((System.in));
        MenuGaragem menu1 = new MenuGaragem();
        //MenuVeiculo menu2 = new MenuVeiculo();
        MenuCliente menu3 = new MenuCliente();;
        int escolha = 0;

        while (true){
            menu();
            escolha = Integer.parseInt(option.next());


            switch (escolha) {
                case 1:
                    menu1.menu();
                    break;
                case 2:
                    //menu2.menu();
                    break;
                case 3:
                    menu3.menu();
                    break;
                case 4:
                    System.out.println("Saindo do Programa");
                    System.exit(4);
                    break;
                default:
                    System.out.println("Opção invalida!!");
            }
        }




    }
}

