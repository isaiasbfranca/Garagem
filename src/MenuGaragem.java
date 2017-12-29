import java.util.Scanner;

public class MenuGaragem {
    public void Menu() {
        Scanner option = new Scanner(System.in);
        int op;

        do {
            System.out.println("#########################");
            System.out.println("######## GARAGEM ########");
            System.out.println("##### 1 - CADASTRAR  ####");
            System.out.println("##### 2 - LISTAR     ####");
            System.out.println("##### 3 - EDITAR     ####");
            System.out.println("##### 4 - EXCLUIR    ####");
            System.out.println("##### 5 - ALTERAR    ####");
            System.out.println("##### 6 - CARROS     ####");
            System.out.println("##### 7 - VOLTAR     ####");
            System.out.println("#########################");

            System.out.println("Digite uma opção: ");
            op = Integer.parseInt(option.next());

            switch (op) {
                case 1:
                    System.out.println("Entre aqui");
                    break;
                case 2:
                    System.out.println("Entre no segundo");
                    break;
                case 3:
                    System.out.println("Entre no terceiro");
                    break;
                case 4:
                    System.out.println("Entre no quarto");
                    break;
                case 5:
                    System.out.println("Entre no quinto");
                    break;
                case 6:
                    System.out.println("Entre no sexto");
                    break;
                case 7:
                    System.out.println("Voltando");
                    break;
                default:
                    System.out.println("Opção invalida!!");
            }
        } while (op != 7);{
            System.out.println("Voltando!!");
        }
    }
}
