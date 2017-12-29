import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerGaragem {
    Garagem novaGaragem;
    List<Garagem> garagemList = new ArrayList<Garagem>();
    Scanner leitura = new Scanner(System.in);
    int i;

    public void inserirGaragem(){
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
    public void listarGaragem(){
        if(garagemList.isEmpty()){
            System.out.println("Não existe garagens cadastradas!!");
            leitura.nextLine();
        }else {
            for (i = 1; i < garagemList.size(); i++){
                System.out.printf("Posição %d- %s\n", i, garagemList.get(i));
            }
        }

    }
    public void editarGaragem(){

    }
    public void excluirGaragem(){
        try {
            // [ D ] remove o i-ésimo contato da agenda
            garagemList.remove(i);
        } catch (IndexOutOfBoundsException e) {
            // exceção lançada para indicar que um índice (i)
            // está fora do intervalo válido (de 0 até agenda.size()-1)
            System.out.printf("\nErro: posição inválida (%s).",
                    e.getMessage());
        }

    }
    public void alterarGaragem(){

    }
    public void listarcarros(){

    }
}
