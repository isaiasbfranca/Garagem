package Controller;

import Services.Garagem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                System.out.println((i + 1));
                System.out.println("NOME: " + garagemList.get(i).getNome());
                System.out.println("CNPJ: " + garagemList.get(i).getCnpj());
                System.out.println("ENDEREÇO: " + garagemList.get(i).getEndereco());
                System.out.println("TELEFONE: " + garagemList.get(i).getTelefone());
            }
        }

    }

    public void editarGaragem() {

        try {
            listarGaragem();
            System.out.printf("\nInforme o ID do item a ser alterado :\n");
            i = Integer.parseInt(leitura.nextLine()) - 1;
            System.out.println("Nome: ");
            novaGaragem.setNome(leitura.nextLine());
            System.out.println("Endereço: ");
            novaGaragem.setEndereco(leitura.nextLine());
            System.out.println("Telefone: ");
            novaGaragem.setTelefone(leitura.nextLine());
            System.out.println("CNPJ: ");
            novaGaragem.setCnpj(leitura.nextLine());
        }catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }

        garagemList.set(i,novaGaragem);

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
