package View;

import View.MenuGaragem;

import java.util.Scanner;

public class Principal {

    public static void menu(){
        System.out.println("######################");
        System.out.println("######## MENU ########");
        System.out.println("#### 1 - GARAGEM  ####");
        System.out.println("#### 2 - CARRO    ####");
        System.out.println("#### 3 - CLIENTE  ####");
        System.out.println("#### 4 - SAIR     ####");
        System.out.println("######################");

        System.out.println("Digite uma opção: ");
    }


    public static void main(String[] args) {
        Scanner option = new Scanner((System.in));
        MenuGaragem menu1 = new MenuGaragem();
        MenuCliente menu2 = new MenuCliente();;
        int escolha = 0;

        do {
            menu();
            escolha = Integer.parseInt(option.next());


            switch (escolha) {
                case 1:
                    menu1.Menu();
                    break;
                case 2:
                    menu2.menu();
                    break;
                case 3:
                    continue;
                case 4:
                    System.out.println("Saindo do Programa");
                    System.exit(4);
                    continue;
                default:
                    System.out.println("Opção invalida!!");
            }
        } while (escolha != 4);




    }
}

