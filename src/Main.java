//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public static void inicio() {
        new Cabecalho();
        Cabecalho.exibir();
        int pontuacao = 0;
        Questao[] questoes = new Questao[15];
        questoes[0] = new Questao();
        questoes[0].pergunta = "1. O que é um algoritmo?";
        questoes[0].opcaoA = "a) Um tipo de linguagem de programação";
        questoes[0].opcaoB = "b) Um software de computador";
        questoes[0].opcaoC = "c) Um conjunto finito de passos para resolver um problema";
        questoes[0].opcaoD = "d) Um tipo de hardware usado em computadores";
        questoes[0].opcaoE = "e) Um sistema operacional";
        questoes[0].correta = "c";
        questoes[1] = new Questao();
        questoes[1].pergunta = "2. Qual estrutura de controle é usada para repetir um bloco de código até uma condição ser atendida?";
        questoes[1].opcaoA = "a) Condicional IF";
        questoes[1].opcaoB = "b) Comando PRINT";
        questoes[1].opcaoC = "c) Laço de repetição WHILE";
        questoes[1].opcaoD = "d) Declaração de variável";
        questoes[1].opcaoE = "e) Função RETURN";
        questoes[1].correta = "c";
        questoes[2] = new Questao();
        questoes[2].pergunta = "3. Em um algoritmo, o que significa \"variável\"?";
        questoes[2].opcaoA = "a) Um valor que nunca muda";
        questoes[2].opcaoB = "b) Um espaço na memória que armazena um dado";
        questoes[2].opcaoC = "c) Um comando de repetição";
        questoes[2].opcaoD = "d) Um operador matemático";
        questoes[2].opcaoE = "e) Um tipo de erro no programa";
        questoes[2].correta = "b";
        questoes[3] = new Questao();
        questoes[3].pergunta = "4. Qual das seguintes opções NÃO é um tipo de estrutura de dados?";
        questoes[3].opcaoA = "a) Pilha";
        questoes[3].opcaoB = "b) Fila";
        questoes[3].opcaoC = "c) Lista";
        questoes[3].opcaoD = "d) If-Else";
        questoes[3].opcaoE = "e) Árvore";
        questoes[3].correta = "d";
        questoes[4] = new Questao();
        questoes[4].pergunta = "5. Qual é a complexidade do algoritmo de busca binária?";
        questoes[4].opcaoA = "a) O(n)";
        questoes[4].opcaoB = "b) O(log n)";
        questoes[4].opcaoC = "c) O(n²)";
        questoes[4].opcaoD = "d) O(n log n)";
        questoes[4].opcaoE = "e) O(1)";
        questoes[4].correta = "b";
        questoes[5] = new Questao();
        questoes[5].pergunta = "6. O que significa a sigla \"P\" em programação estruturada?";
        questoes[5].opcaoA = "a) Python";
        questoes[5].opcaoB = "b) Processamento";
        questoes[5].opcaoC = "c) Procedural";
        questoes[5].opcaoD = "d) Pilha";
        questoes[5].opcaoE = "e) Prioridade";
        questoes[5].correta = "c";
        questoes[6] = new Questao();
        questoes[6].pergunta = "7. Qual das seguintes opções é um exemplo de estrutura de controle condicional?";
        questoes[6].opcaoA = "a) While";
        questoes[6].opcaoB = "b) If-Else";
        questoes[6].opcaoC = "c) For";
        questoes[6].opcaoD = "d) Array";
        questoes[6].opcaoE = "e) Pilha";
        questoes[6].correta = "b";
        questoes[7] = new Questao();
        questoes[7].pergunta = "8. Qual das seguintes opções NÃO é uma característica de um algoritmo eficiente?";
        questoes[7].opcaoA = "a) Claridade";
        questoes[7].opcaoB = "b) Eficiência";
        questoes[7].opcaoC = "c) Redundância";
        questoes[7].opcaoD = "d) Correção";
        questoes[7].opcaoE = "e) Finitude";
        questoes[7].correta = "c";
        questoes[8] = new Questao();
        questoes[8].pergunta = "9. Em um algoritmo de ordenação, qual das opções a seguir representa um algoritmo de ordenação por comparação?";
        questoes[8].opcaoA = "a) Radix Sort";
        questoes[8].opcaoB = "b) Bucket Sort";
        questoes[8].opcaoC = "c) Quick Sort";
        questoes[8].opcaoD = "d) Counting Sort";
        questoes[8].opcaoE = "e) Algoritmo de Dijkstra";
        questoes[8].correta = "c";
        questoes[9] = new Questao();
        questoes[9].pergunta = "10. Qual é a principal função da estrutura de repetição \"for\"?";
        questoes[9].opcaoA = "a) Criar funções";
        questoes[9].opcaoB = "b) Declarar variáveis";
        questoes[9].opcaoC = "c) Executar um bloco de código um número fixo de vezes";
        questoes[9].opcaoD = "d) Comparar dois valores";
        questoes[9].opcaoE = "e) Interromper a execução do programa";
        questoes[9].correta = "c";
        questoes[10] = new Questao();
        questoes[10].pergunta = "11. O que caracteriza um algoritmo guloso?";
        questoes[10].opcaoA = "a) Resolve problemas dividindo-os em subproblemas";
        questoes[10].opcaoB = "b) Sempre escolhe a melhor opção no momento";
        questoes[10].opcaoC = "c) Precisa conhecer todas as respostas antes de decidir";
        questoes[10].opcaoD = "d) Utiliza uma abordagem de tentativa e erro";
        questoes[10].opcaoE = "e) Sempre retorna a solução ótima";
        questoes[10].correta = "b";
        questoes[11] = new Questao();
        questoes[11].pergunta = "12. O que acontece quando um algoritmo entra em um loop infinito?";
        questoes[11].opcaoA = "a) Ele termina rapidamente";
        questoes[11].opcaoB = "b) Ele executa indefinidamente sem parar";
        questoes[11].opcaoC = "c) Ele se torna mais eficiente";
        questoes[11].opcaoD = "d) Ele melhora a velocidade de processamento";
        questoes[11].opcaoE = "e) Ele economiza memória";
        questoes[11].correta = "b";
        questoes[12] = new Questao();
        questoes[12].pergunta = "13. Qual das seguintes estruturas de dados segue o princípio FIFO (First In, First Out)?";
        questoes[12].opcaoA = "a) Pilha";
        questoes[12].opcaoB = "b) Lista encadeada";
        questoes[12].opcaoC = "c) Fila";
        questoes[12].opcaoD = "d) Árvore binária";
        questoes[12].opcaoE = "e) Heap";
        questoes[12].correta = "c";
        questoes[13] = new Questao();
        questoes[13].pergunta = "14. Em um algoritmo de busca linear, qual é o pior caso para encontrar um elemento?";
        questoes[13].opcaoA = "a) O primeiro elemento da lista";
        questoes[13].opcaoB = "b) O último elemento da lista";
        questoes[13].opcaoC = "c) O elemento no meio da lista";
        questoes[13].opcaoD = "d) O algoritmo sempre encontra no primeiro passo";
        questoes[13].opcaoE = "e) O algoritmo nunca encontra o elemento";
        questoes[13].correta = "b";
        questoes[14] = new Questao();
        questoes[14].pergunta = "15. Qual das alternativas representa um algoritmo de complexidade O(n²)?";
        questoes[14].opcaoA = "a) Bubble Sort";
        questoes[14].opcaoB = "b) Merge Sort";
        questoes[14].opcaoC = "c) Quick Sort";
        questoes[14].opcaoD = "d) Busca Binária";
        questoes[14].opcaoE = "e) Heap Sort";
        questoes[14].correta = "a";
        System.out.println("Quiz de Algoritmos\n");

        for(int i = 0; i < questoes.length; ++i) {
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(resposta)) {
                ++pontuacao;
            }
        }

        System.out.println("Fim do Quiz! Você acertou " + pontuacao + " de " + questoes.length + " questões.");
    }

    public static void main(String[] args) {
        inicio();
    }
}
