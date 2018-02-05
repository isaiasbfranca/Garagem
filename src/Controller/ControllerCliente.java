package Controller;

import Services.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ControllerCliente {
    Cliente novoCliente;
    List<Cliente> clienteList = new ArrayList<>();
    Scanner leitura = new Scanner(System.in);
    private int i;

    public void insereCliente() {
        novoCliente = new Cliente();
        try {
            System.out.print(" Nome : ");
            novoCliente.setNome(leitura.nextLine());
            System.out.print(" Endereço : ");
            novoCliente.setEndereco(leitura.nextLine());
            System.out.print(" CEP : ");
            novoCliente.setCep(leitura.nextLine());
            System.out.print(" CPF : ");
            novoCliente.setCpf(leitura.nextLine());
            System.out.print(" Telefone : ");
            novoCliente.setTelefone(leitura.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        clienteList.add(novoCliente);
    }

    //Método que altera dados dos clientes
    public void editaCliente() {

        //Solicita a digitação dos dados
        try {
            listarCliente();
            System.out.print(" Número do cadastro : ");
            i = Integer.parseInt(leitura.nextLine()) - 1;
            System.out.print(" Nome : ");
            novoCliente.setNome(leitura.nextLine());
            System.out.print(" Endereço : ");
            novoCliente.setEndereco(leitura.nextLine());
            System.out.print(" CEP : ");
            novoCliente.setCep(leitura.nextLine());
            System.out.print(" CPF : ");
            novoCliente.setCpf(leitura.nextLine());
            System.out.print(" Telefone : ");
            novoCliente.setTelefone(leitura.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        //Atualizar cadastro
        clienteList.set(i, novoCliente);
    }

    //Método que deleta um cliente cadastrado
    public void excluiCliente() {
        Scanner leitura = new Scanner(System.in);
        //Verifica se o cadastro está vazio
        if (clienteList.isEmpty()) {
            System.out.println(" O cadastro está vazio ");
            return;
        }
        //Solicita o registro a ser deletado
        try {
            //Exibe os registros do cadastro
            listarCliente();
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
    public void listarCliente() {
        for (int i = 0; i < clienteList.size(); i++) {
            System.out.println((i + 1) + "\n Nome: " + clienteList.get(i).getNome());
            System.out.println(" Endereço : " + clienteList.get(i).getEndereco());
            System.out.println(" CEP : " + clienteList.get(i).getCep());
            System.out.println(" CPF : " + clienteList.get(i).getCpf());
            System.out.println(" Telefone : " + clienteList.get(i).getTelefone() + "\n");
        }
    }

    public void buscaCliente() {
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
