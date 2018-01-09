package Controller;

import Services.Cliente;

import java.io.*;

public class ControllerCliente {
    private int top = 0;
    //Número constante que indica o número máximo de registro do cadastro
    private static final int MAXENTRIES = 100;
    private Cliente[] list;
    private int i;

    public void addEntry(){
        BufferedReader keyIn = new BufferedReader (new InputStreamReader(System.in));
        String nome = "";
        String endereco = "";
        String cep = "";
        String cpf = "";
        String telefone = "";
        if (top == MAXENTRIES){
            System.out.println ( " O cadastro está cheio ");
            return;
        }
        //Pede ao usuário a digitação dos dados
        try {
            System.out.print (" Nome : ");
            nome = keyIn.readLine();
            System.out.print (" Endereço : ");
            endereco = keyIn.readLine();
            System.out.print (" CEP : ");
            cep = keyIn.readLine();
            System.out.print (" CPF : ");
            cpf = keyIn.readLine();
            System.out.print (" Telefone : ");
            telefone = keyIn.readLine();
        } catch (Exception e){
            System.out.println (e);
            System.exit(0);
        }
        Cliente entradaDado = new Cliente(nome, endereco, cep, cpf, telefone);
        list[top] =entradaDado;
        top++;
    }

    //Método que altera dados dos clientes
    public void updateEntry(){
        BufferedReader keyIn = new BufferedReader (new InputStreamReader(System.in));
        int index = 0;
        String nome = "";
        String endereco = "";
        String cep = "";
        String cpf = "";
        String telefone = "";
        //Solicita a digitação dos dados
        try {
            System.out.print (" Número do cadastro : ");
            index = Integer.parseInt(keyIn.readLine())-1;
            System.out.print (" Nome : ");
            nome = keyIn.readLine();
            System.out.print (" Endereço : ");
            endereco = keyIn.readLine();
            System.out.print (" CEP : ");
            cep = keyIn.readLine();
            System.out.print (" CPF : ");
            cpf = keyIn.readLine();
            System.out.print (" Telefone : ");
            telefone = keyIn.readLine();
        }catch (Exception e){
            System.out.println (e);
            System.exit(0);
        }
        //Atualizar cadastro
        Cliente entraDados = new Cliente(nome, endereco, cep, cpf, telefone);
        list [index] = entraDados;
    }

    //Método que deleta um cliente cadastrado
    public void delEntry(){
        BufferedReader keyIn = new BufferedReader(new InputStreamReader (System.in));
        int index = 0;
        //Verifica se o cadastro está vazio
        if (top == 0){
            System.out.println (" O cadastro está vazio ");
            return;
        }
        //Solicita o registro a ser deletado
        try {
            //Exibe os registros do cadastro
            viewEntries();
            System.out.println ("\n Solicte o registro a ser deletado : ");
            index = Integer.parseInt(keyIn.readLine())-1;
        }catch (Exception e){
        }
        //Verifica se o índice está dentro do limite
        if (index < 0 || index >= top){
            System.out.println (" Índice fora dos limites ");
            return;
        } else {
            for (int i = index; i < top; i++) {
//                list<i>=list[i + 1];
//                list[top] = null;
//                top--;
            }
            }
        }

    //Mètodo que imprime todos os registros do cadastro
    public void viewEntries(){
        for (int index = 0; index < top; index++){
            System.out.println ((index+1) + " Nome: " + list[index].getNome());
            System.out.println (" Endereço : " + list[index].getEndereco());
            System.out.println (" CEP : " + list[index].getCep());
            System.out.println (" CPF : " + list[index].getCpf());
            System.out.println (" Telefone : " + list[index].getTelefone());
        }

}

    //Cria o registro de cadastro
    public ControllerCliente() {
        list = new Cliente[MAXENTRIES];
    }
}
