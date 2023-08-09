TÍTULO DO PROJETO: Trabalho Final - Assistência às UPAS;

AUTORES: Maria Eduarda Gotuzzo da Silva (23102550) e Tiago Dias Dieterich (23102713)
DISCIPLINA: Fundamentos de Programação 2023/1 - Turma 10; 

OBJETIVO DO PROJETO: Auxiliar a organizar as informações dos pacientes e medicamentos a serem receitados nas consultas de UPAS;

DATA: 23/06/2023

COMO INICIAR O PROJETO: 
1. Abrir o arquivo Package do BlueJ dentro da pasta;
2. Clicar com o botão esquerdo em "App" e selecionar "void main(String[] args)" para iniciar a aplicação;


INSTRUÇÕES PARA O USUÁRIO:
1 . O usuário deve seguir os passos de "como iniciar o projeto" para que ele seja aberto;
2. Com a aplicação iniciada, deve aparecer um menu, assim, digite o número da função desejada, de 0 a 6:
    2.1. Digitar "0" faz com que as ações da aplicação sejam encerradas, após isso é necessário fechar a aplicação;
    2.2. Digitar "1" permite adicionar um novo paciente na lista (cadastro);
        2.2.1. É necessário digitar nome sem o uso de eventuais acentos gráficos, CPF e número de telefone;
        2.2.2. É necessário digitar o número indicado para o diagnóstico que o paciente possui ("1" para Covid, "2" para Zica, "3" para Chikungunya e "4" para Dengue);
        2.2.3. É necessário repetir o processo acima com o número inidicado do medicamento a ser oferecido  ("1" para CovixUltra, "2" para Zicox, "3" para ChikTop e "4" para Denguenit);
        2.2.4. É necessário digitar, ainda, a quantidade de caixas necessárias do medicamento escolhido.
    2.3. Digitar "2" permite remover um paciente da lista (descadastro);
    2.4. Digitar "3" faz com que todo o vetor (todas as informações) apareçam na tela, sejam elas ou os dados de um paciente ou nulas, esta última indica que ainda há espaço para novos pacientes;
    2.5. Digitar "4" faz com que os dados de todos os pacientes apareçam na tela;
    2.6. Digitar "5" coloca os a lista dos pacientes em ordem alfabética;
    2.7. Digitar "6" apresenta o percentual de cada doença dentro dos pacientes cadastrados;
    2.8. Digitar "7" exibe o relatório do estoque de medicamentos atualizado;
    2.9. Digitar "8" permite que o usuário modifique algum dado de qualquer paciente que seja necessário.
3. Ao encerrar a aplicação (ao digitar "0"), as informações antes salvas são deletadas automaticamente. Não feche a aplicação enquanto houverem pacientes a receberem tratamento. 


LIÇÕES APRENDIDAS COM O TRABALHO:
1. As dificuldades individuais podem ser melhor trabalhadas quando em grupo, pois um ajuda o outro em seus pontos fracos;
2. Programar não é simples e sempre há coisas novas para aprender;
3. O trabalho é um meio de aprender e botar em prática os conhecimentos das aulas;
4. Buscar entender erros ("bugs") e revisar o(s) código(s) é fundamental para desenvolvimento de habilidade;
5. É necessário manter a cabeça firme e não desistir.
6. Pedir ajuda não é vergonhoso, pois possibilita que dúvidas sejam resolvidas e que se aprenda com elas.


DIFICULDADES ENCONTRADAS E RESOLUÇÃO:
1. Apesar das tentativas de usar "int" ou "long", os números de CPF e telefone não eram aceitos pelo programa.
    Resolução:
    1.1. Descobriu-se, com a ajuda da professora, que "int" e "long" são utilizados para funções matemáticas, então o ideal seria colocar tais informações no formato de "String".

2. Como colocar os nomes dos pacientes em ordem alfabética e organizar o vetor com essa ordem.
    Resolução:
    2.1. Com pesquisa e consulta à professora, percebeu-se que não podia-se mexer no vetor original, pois haveria risco de eliminar algum dado, então foi preciso criar um vetor auxilar;
    2.2. Com o vetor auxilar, foi necessário percorrer as posições do vetor original e buscar o nome presente em cada uma dessas posições com o metódo presente em "public Paciente[] ordemAlfabetica()";
    2.3. Com o método "Arrays.sort()" foi possível ordenar os nomes por ordem alfabética.

3. Como utilizar a classe Medicamento propriamente.
    Resolução:
    3.1. Criação de um novo método na classe CadastroPacientes chamado estoque para acessar os medicamentos usados por cada um dos pacientes e as respectivas quantidades.
    3.2. O método estoque também é responsável por modificar a quantidade original de cada medicamento, na classe Medicamento, subtraindo o número utilizado pelos pacientes utilizando setters.
    3.3. Por fim, o método retorna o relatório atual do estoque para o usuário através do menu.


FONTES UTILIZADAS PARA REALIZAÇÃO DO TRABALHO:
1. DEVMEDIA: 
    1.1. Ordenando Arrays em Java. Disponível em: https://www.devmedia.com.br/ordenando-arrays-em-java/28779#:~:text=Facilmente%20pode%2Dse%20ir%20em,pelo%20comparador%20personalizado%20em%20Java.
2. GUJ:
    2.1. Ordenação de Objetos por ordem alfabética. Disponível em: https://www.guj.com.br/t/ordenacao-de-objetos-por-ordem-alfabetica-resolvido/232540
3. W3Schools:
    3.1. Java String compareToIgnoreCase() Method. Disponível em: https://www.w3schools.com/java/ref_string_comparetoignorecase.asp
4. Lúcia Giraffa - professora PUCRS (RS, Brasil).
    4.1. BancoGIRAFFA - exemplo de aula;
    4.2. contaBancaria - exemplo de aula;
    4.3. ordenacaoVETORES - exemplo de aula;
    4.4. entre outros materiais disponibilizados em aula e na plataforma Moodle.
5. Rafael Fuchs - formado em ciência da computação UFRGS - trabalha em ADP (GA, USA). Serviu de consultor para enventuais dúvidas além da própria professora. 
