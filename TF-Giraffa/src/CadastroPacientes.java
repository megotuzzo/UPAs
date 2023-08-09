import java.util.*;
public class CadastroPacientes
{
    private Paciente[] vetor = new Paciente[10];
    int proxLivre;
    Paciente p;
    Scanner in = new Scanner(System.in);
    public void adicionarPaciente (Paciente p) { 
        //método baseado no "criarConta" do programa bancoGIRAFFA
        vetor[proxLivre] = p;
        proxLivre++;
        
    }
    public void removerPaciente (String cpf) {  //método baseado no "removerConta", do programa badoGIRAFFA.
        for(int i = 0; i < proxLivre; i++){                 //percorre o vetor até a próxima posição livre.
            if(vetor[i].getCpf().equalsIgnoreCase(cpf)){    //Compara o CPF do paciente na posição i com o do paciente a ser removido.
                for(int j = i; j < proxLivre; j++) {        //Percorre o vetor do ponto em que parou.
                    vetor[j] = vetor[j+1];                  //Como um paciente foi removido, move o sucessor para a sua posição.
                }
                proxLivre--;                                //A próxima posição livre se torna a antecessora.
            }
        }
    }
    public void escreve() {
        for(int i = 0; i < 10; i++) {      //percorre o vetor.
            System.out.println(vetor[i]);  //Imprime o vetor inteiro.
        }
    }
    public void escreveOcupadas() {     //Quando está desocupada, a posição é = a null.
        for (int i = 0; i < proxLivre; i++) { //percorre o vetor;
            if (vetor[i] != null) {System.out.println("\nPosição " + i + ": " + vetor[i]);}  //Compara cada posição do vetor para ver se está ocupada e a imprime se estiver.
        }
    }
    public Paciente[] ordemAlfabetica() {
        Paciente[] ordenado = new Paciente[proxLivre];
        String[] nomes = new String[proxLivre];
        for (int i = 0; i < proxLivre; i++) {                   //Criação de array com os nomes dos pacientes.
            nomes[i] = vetor[i].getNome();
        }
        Arrays.sort(nomes);
        for (int i = 0; i < nomes.length; i++) {               //fixa um elemento para comparar com os nomes do vetor de pacientes (j)
            for (int j = 0; j < proxLivre; j++) {          
                if(nomes[i] == vetor[j].getNome()) {
                    ordenado[i] = vetor[j];
                }
            }
        }
        return ordenado;
    }
    public void porcentagem() {   //Detalhe: indique em que posição do vetor eles estão
        int t = proxLivre;      //Tamanho do vetor.
        int covid = 0;          //Inicializa os contadores de cada uma das doenças.
        int zica = 0;
        int chik = 0;
        int dengue = 0;
        
        int[] posCovid = new int[10];    //Vetores que salvam as posiçoes dos pacientes com cada doença separadamente.
        int[] posZica = new int[10];
        int[] posChik = new int[10];
        int[] posDengue = new int[10];
        int c = 0;                      //contadores para percorrer apenas as posições ocupadas dos vetores acima.
        int z = 0;
        int ck = 0;
        int d = 0;
        
        for (int i = 0; i < proxLivre; i++) {       //Percorre o vetor;
            switch (vetor[i].getDiag()) {   //Switch utilizando contadores para contabilizar quantas pessoas infectadas com cada doença e salvar as posições das respectivas.
                case 1: covid++;
                        posCovid[c] = i;
                        c++;
                        break;
                case 2: zica++;
                        posZica[z] = i;
                        z++;
                        break;
                case 3: chik++;
                        posChik[ck] = i;
                        ck++;
                        break;
                case 4: dengue++;
                        posDengue[d] = i;
                        d++;
                        break;
            }
        }
        
        double porCovid = covid*100/t;       //Porcentagens de cada número.
        double porZica = zica*100/t;
        double porChik = chik*100/t;
        double porDengue = dengue*100/t;
        
        System.out.println("\nCovid: " + porCovid);
        if(covid > 0) {                     //imprime as posições se houver pelo menos 1 infectado com a respectiva doença.
            for (int i = 0; i < c; i++) { //percorre o vetor;
                System.out.println("Posição: " + posCovid[i]);
            }
        }
        System.out.println("\nZica: " + porZica);
        if(zica > 0) {                      //imprime as posições se houver pelo menos 1 infectado com a respectiva doença.
            for (int i = 0; i < z; i++) { //percorre o vetor;
                System.out.println("Posição: " + posZica[i]);
            }
        }
        System.out.println("\nChik: " + porChik);
        if(chik > 0) {                      //imprime as posições se houver pelo menos 1 infectado com a respectiva doença.
            for (int i = 0; i < ck; i++) { //percorre o vetor;
                System.out.println("Posição: " + posChik[i]);
            }
        }
        System.out.println("\nDengue: " + porDengue);
        if(dengue > 0) {                    //imprime as posições se houver pelo menos 1 infectado com a respectiva doença.
            for (int i = 0; i < d; i++) { //percorre o vetor;
                System.out.println("Posição: " + posDengue[i]);
            }
        }
    }
    public void estoque () {
        int medic, quant;               
        Medicamento medicamento = new Medicamento();
        for (int i = 0; i < proxLivre; i++) {    //Percorre o vetor de pacientes.
            medic = vetor[i].getMedic();         //Guarda o medicamento de cada paciente.
            quant = vetor[i].getQtd();           //Guarda a quantidade de cada medicamento.
            if(medic == 1) {medicamento.setCovix(quant);}               //Compara para saber qual é o medicamento e então diminuir a quantidade do estoque na classe Medicamento.
            else if(medic == 2) {medicamento.setZicox(quant);}
            else if(medic == 3) {medicamento.setChikTop(quant);}
            else if(medic == 4) {medicamento.setDenguenit(quant);}
        }
        System.out.println("\nEstoque: " + "\nCovixUltra: " + medicamento.getCovix() + "\nZicox: " + medicamento.getZicox() + "\nChikTop: " + medicamento.getChikTop() + "\nDenguenit: " + medicamento.getDenguenit());
    }
    public void modifica (int pos) {  //O método necessita que o usuário indique a posição do paciente no vetor.
        System.out.println("Qual das informações deve ser modificada?");
        System.out.println("\n(1) Nome");
        System.out.println("(2) CPF");
        System.out.println("(3) Telefone");
        System.out.println("(4) Diagnóstico");
        System.out.println("(5) Medicamento");
        System.out.println("(6) Quantidade");
        int y = in.nextInt(); //"y" indica a opção escolhida pelo usuário
        switch(y) {           //switch para acessar todas as opções
            case 1:
                 System.out.println("Digite o novo nome: ");
                 in.nextLine();
                 String nome = in.nextLine();          //O usuário digite a atualização
                 vetor[pos].setNome(nome);             //Com os setters, acessamos as informações do paciente na posição "pos", indicada pelo usuário.
                 break;
            case 2: 
                System.out.println("Digite o novo CPF: ");
                in.nextLine();
                String cpf = in.nextLine();
                vetor[pos].setCpf(cpf);
                break; 
            case 3: 
                System.out.println("Digite o novo telefone: ");
                in.nextLine();
                String tel = in.nextLine();
                vetor[pos].setTel(tel);
                break;
            case 4:
                System.out.println("Digite o novo diagnóstico: ");
                int diag = in.nextInt();
                in.nextLine();
                vetor[pos].setDiag(diag);
                break;
            case 5: 
                System.out.println("Digite o novo medicamento: ");
                int medic = in.nextInt();
                in.nextLine();
                vetor[pos].setMedic(medic);
                break;
            case 6:
                System.out.println("Digite a nova quantidade: ");
                int qtd = in.nextInt();
                in.nextLine();
                vetor[pos].setQtd(qtd);
                break;
        }
        System.out.println(vetor[pos].toString());          //Imprimimos o paciente com a modificação feita.
    }
}