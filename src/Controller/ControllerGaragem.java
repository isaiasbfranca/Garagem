package Controller;

import Services.Garagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerGaragem {
    Garagem novaGaragem;
    List<Garagem> garagemList = new ArrayList<Garagem>();
    Scanner leitura = new Scanner(System.in);
    int i;

    public void inserirGaragem() {
        novaGaragem = new Garagem();
        System.out.println("Nome: ");
        novaGaragem.setNome(leitura.nextLine());
        System.out.println("Endereço: ");
        novaGaragem.setEndereco(leitura.nextLine());
        System.out.println("Telefone: ");
        novaGaragem.setTelefone(leitura.nextLine());
        System.out.println("CNPJ: ");
        novaGaragem.setCnpj(leitura.nextLine());

        garagemList.add(novaGaragem);

        System.out.println("Pressione uma tecla para continuar!");
        leitura.nextLine();
    }

    public void listarGaragem() {
        if (garagemList.isEmpty()) {
            System.out.println("Não existe garagens cadastradas!!");
            leitura.nextLine();
        } else {
            for (i = 0; i < garagemList.size(); i++) {
                System.out.printf("ID: %d- %s\n", i + 1, garagemList.get(i));
            }
        }

    }

    public void editarGaragem() {
        System.out.printf("\nInforme o ID do item a ser alterado :\n");
        i = leitura.nextInt();
        for (i = 0; i < garagemList.size(); i++){
            //if(i ==  )
        }

    }

    public void excluirGaragem() {
        System.out.printf("\nInforme a posição a ser excluída:\n");
        i = leitura.nextInt();
        try {
            // [ D ] remove o i-ésimo contato da agenda
            garagemList.remove(i - 1);
        } catch (IndexOutOfBoundsException e) {
            // exceção lançada para indicar que um índice (i)
            // está fora do intervalo válido (de 0 até agenda.size()-1)
            System.out.printf("\nErro: posição inválida (%s).",
                    e.getMessage());
        }

    }

    public void buscarGaragem() {

    }

    public void listarcarros() {

    }
}
