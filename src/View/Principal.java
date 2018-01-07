package View;

import View.MenuGaragem;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Scanner option = new Scanner((System.in));
        MenuGaragem menu = new MenuGaragem();
        int escolha = 0;

        do {
            System.out.println("######################");
            System.out.println("######## MENU ########");
            System.out.println("#### 1 - GARAGEM  ####");
            System.out.println("#### 2 - CARRO    ####");
            System.out.println("#### 3 - CLIENTE  ####");
            System.out.println("#### 4 - SAIR     ####");
            System.out.println("######################");

            System.out.println("Digite uma opção: ");
            escolha = Integer.parseInt(option.next());


            switch (escolha) {
                case 1:
                    menu.Menu();
                    continue;
                case 2:
                    System.out.println("Entre no segundo");
                    break;
                case 3:
                    System.out.println("Entre no terceiro");
                    break;
                case 4:
                    System.out.println("Saindo do Programa");
                    System.exit(4);
                    break;
                default:
                    System.out.println("Opção invalida!!");
            }
        }while (escolha != 4);
    }
}
