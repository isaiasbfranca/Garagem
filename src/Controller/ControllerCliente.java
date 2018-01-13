package Controller;

import Services.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerCliente {
    //Número constante que indica o número máximo de registro do cadastro

    // Cliente novoCliente = new Cliente();
    List<Cliente> clienteList = new ArrayList<>();
    private int i;

    public void addEntry() {
        Scanner leitura = new Scanner(System.in);
        String nome = "";
        String endereco = "";
        String cep = "";
        String telefone = "";
        String cpf = "";
        //Pede ao usuário a digitação dos dados
        try {
            System.out.print(" Nome : ");
            nome = leitura.nextLine();
            System.out.print(" Endereço : ");
            endereco = leitura.nextLine();
            System.out.print(" CEP : ");
            cep = leitura.nextLine();
            System.out.print(" CPF : ");
            cpf = leitura.nextLine();
            System.out.print(" Telefone : ");
            telefone = leitura.nextLine();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        Cliente entradaDado = new Cliente(nome, endereco, cep, telefone, cpf);
        clienteList.add(entradaDado);
    }

    //Método que altera dados dos clientes
    public void updateEntry() {
        Scanner leitura = new Scanner(System.in);
        int index = 0;
        String nome = "";
        String endereco = "";
        String cep = "";
        String cpf = "";
        String telefone = "";
        //Solicita a digitação dos dados
        try {
            viewEntries();
            System.out.print(" Número do cadastro : ");
            index = Integer.parseInt(leitura.nextLine()) - 1;
            System.out.print(" Nome : ");
            nome = leitura.nextLine();
            System.out.print(" Endereço : ");
            endereco = leitura.nextLine();
            System.out.print(" CEP : ");
            cep = leitura.nextLine();
            System.out.print(" CPF : ");
            cpf = leitura.nextLine();
            System.out.print(" Telefone : ");
            telefone = leitura.nextLine();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        //Atualizar cadastro
        Cliente entraDados = new Cliente(nome, endereco, cep, telefone, cpf);
        clienteList.set(index, entraDados);
    }

    //Método que deleta um cliente cadastrado
    public void delEntry() {
        Scanner leitura = new Scanner(System.in);
        int index = 0;
        //Verifica se o cadastro está vazio
        if (clienteList.isEmpty()) {
            System.out.println(" O cadastro está vazio ");
            return;
        }
        //Solicita o registro a ser deletado
        try {
            //Exibe os registros do cadastro
            viewEntries();
            System.out.println("\n Solicte o registro a ser deletado : ");
            index = Integer.parseInt(leitura.nextLine()) - 1;
        } catch (Exception e) {
        }
        //Verifica se o índice está dentro do limite
        if (index < 0 || index >= clienteList.size()) {
            System.out.println(" Índice fora dos limites ");
            return;
        } else {
            clienteList.remove(index);
        }
    }

    //Mètodo que imprime todos os registros do cadastro
    public void viewEntries() {
        for (int index = 0; index < clienteList.size(); index++) {
            System.out.println((index + 1) + "\n Nome: " + clienteList.get(index).getNome());
            System.out.println(" Endereço : " + clienteList.get(index).getEndereco());
            System.out.println(" CEP : " + clienteList.get(index).getCep());
            System.out.println(" CPF : " + clienteList.get(index).getCpf());
            System.out.println(" Telefone : " + clienteList.get(index).getTelefone() + "\n");
        }
    }

    public void search(){
        String busca;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o CPF ou Nome do cliente para pesquisar: ");
        busca = entrada.next();
        clienteList.contains(busca);
        Pattern p = Pattern.compile(busca, Pattern.CASE_INSENSITIVE);
        for (Cliente nome : clienteList) {
            Matcher m = p.matcher((CharSequence) nome);
            if (m.find()) {
                System.out.println("Nome encontrado: " + nome);
            }
        }
    }

}
