package Controller;

import Services.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ControllerCliente {
    //Número constante que indica o número máximo de registro do cadastro

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
        int i = 0;
        String nome = "";
        String endereco = "";
        String cep = "";
        String cpf = "";
        String telefone = "";
        //Solicita a digitação dos dados
        try {
            viewEntries();
            System.out.print(" Número do cadastro : ");
            i = Integer.parseInt(leitura.nextLine()) - 1;
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
        clienteList.set(i, entraDados);
    }

    //Método que deleta um cliente cadastrado
    public void delEntry() {
        Scanner leitura = new Scanner(System.in);
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
            i = Integer.parseInt(leitura.nextLine()) - 1;
        } catch (Exception e) {
        }
        //Verifica se o índice está dentro do limite
        if (i < 0 || i >= clienteList.size()) {
            System.out.println(" Índice fora dos limites ");
            return;
        } else {
            clienteList.remove(i);
        }
    }

    //Mètodo que imprime todos os registros do cadastro
    public void viewEntries() {
        for (int i = 0; i < clienteList.size(); i++) {
            System.out.println((i + 1) + "\n Nome: " + clienteList.get(i).getNome());
            System.out.println(" Endereço : " + clienteList.get(i).getEndereco());
            System.out.println(" CEP : " + clienteList.get(i).getCep());
            System.out.println(" CPF : " + clienteList.get(i).getCpf());
            System.out.println(" Telefone : " + clienteList.get(i).getTelefone() + "\n");
        }
    }

    public void search() {
        String busca;
        Scanner entrada = new Scanner(System.in);
        if (clienteList.isEmpty()) {
            System.out.println(" O cadastro está vazio ");
            return;
        }
        System.out.println("Digite o CPF ou Nome do cliente para pesquisar: ");
        busca = entrada.next();
        for (i = 0; i < clienteList.size(); i++) {
            if (clienteList.get(i).getNome().contains(busca) || clienteList.get(i).getCpf().contains(busca)) {
                System.out.println("Resultado: ");
                System.out.println((i + 1) + "\n Nome: " + clienteList.get(i).getNome());
                System.out.println(" Endereço : " + clienteList.get(i).getEndereco());
                System.out.println(" CEP : " + clienteList.get(i).getCep());
                System.out.println(" CPF : " + clienteList.get(i).getCpf());
                System.out.println(" Telefone : " + clienteList.get(i).getTelefone() + "\n");

            }
        }

    }

}
