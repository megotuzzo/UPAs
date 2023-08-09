import java.util.*;
public class App
{
    public static void main (String args []) {
        System.out.printf("\f");
        Scanner in = new Scanner(System.in);
        CadastroPacientes cadastro = new CadastroPacientes();
        
        while(true) {
            int op = menu();
            if(op == 0) {break;}
            switch (op){
                case 1: 
                    System.out.println("Digite o nome do paciente: ");
                    String nome = in.nextLine();
                    
                    System.out.println("Digite o CPF do paciente: ");
                    String cpf = in.nextLine();
                    
                    System.out.println("Digite o telefone do paciente: ");
                    String tel = in.nextLine();
                    
                    System.out.println("Digite o diagnóstico do paciente: \n(1)COVID \n(2)Zica \n(3)Chikungunya \n(4)Dengue ");
                    int diag = in.nextInt();
                    while(diag != 1 && diag != 2 && diag != 3 && diag != 4){         //Laço para garantir que o número inserido é válido.
                        System.out.println("Número inválido, digite novamente.");
                        diag = in.nextInt();
                    }
                    in.nextLine();
                    
                    System.out.println("Digite o medicamento utilizado para o tratamento: \n(1)CovixUltra \n(2)Zicox \n(3)ChikTop \n(4)Denguenit ");
                    int medic = in.nextInt();
                    while(diag != 1 && diag != 2 && diag != 3 && diag != 4){          //Laço para garantir que o número inserido é válido.
                        System.out.println("Número inválido, digite novamente.");
                        medic = in.nextInt();
                    }
                    in.nextLine();
                    
                    System.out.println("Digite a quantidade do medicamento: ");
                    int qtd = in.nextInt();
                    in.nextLine();
                    
                    Paciente um = new Paciente(nome, cpf, tel, diag, medic, qtd);  //Criação do paciente com as informações coletadas.
                    cadastro.adicionarPaciente(um);                                //Chamada do método responsável por adicionar um paciente no vetor.
                    System.out.println(um.toString());                             //Impressão do novo paciente.
                    break;
                    
                case 2: 
                    System.out.println("\nDigite o CPF do paciente: ");
                    cpf = in.nextLine();                                //leitura do cpf, que é um dado único, do paciente que deve ser removido.
                    cadastro.removerPaciente(cpf);                      //Chamada do método responsável por remover um paciente do vetor.
                    break;
                    
                case 3: cadastro.escreve();                          //Chamada do método que escreve o vetor inteiro.
                        break;
                    
                case 4: cadastro.escreveOcupadas();                 //Chamada do método que escreve as posições ocupadas do vetor.
                        break;  
                    
                case 5: Paciente ordenado[] = cadastro.ordemAlfabetica() ;  //Criação do vetor de pacientes ordenados.
                        for(int i=0;i< ordenado.length;i++) {               //for que percorre o vetor.
                            System.out.print(ordenado[i]+ " ");             //impressão do vetor.
                        }
                        break;
                    
                case 6: cadastro.porcentagem();     //Chamada do método que exibe a porcentagem de incidência de cada doença e suas posições no vetor.
                        break;
                        
                case 7: cadastro.estoque();         //Chamada do método que exibe o estoque de medicamentos.
                        break;
                        
                case 8:
                    System.out.println("\fQual a posição do paciente que contém a informação a ser corrigida?");
                    cadastro.escreveOcupadas();     //Imprimimos todos os pacientes indicando o número de cada posição
                    int pos = in.nextInt();         //o usuário indica a posição desejada.
                    cadastro.modifica(pos);         //chamamos o método criado para a modificação deinformação.
            }
        }
    }
    public static int menu () {
        Scanner in = new Scanner(System.in);
        System.out.println("\nMenu de opções");
        System.out.println("(0) Sair");
        System.out.println("(1) Adicionar paciente");
        System.out.println("(2) Remover paciente");
        System.out.println("(3) Imprimir todo vetor");
        System.out.println("(4) Imprimir todos os pacientes registrados");
        System.out.println("(5) Nomes em ordem alfabética");
        System.out.println("(6) Porcentagem de cada doença");
        System.out.println("(7) Estoque de medicamentos");
        System.out.println("(8) Modificar informação");
        System.out.println("Digite a opção desejada:");
        int opcao = in.nextInt();
        return opcao;
    }
}
