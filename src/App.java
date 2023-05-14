public class App {
    public static void main(String[] args) throws Exception {
        
        // Inicialização; condição; execução do comando (print); incrementando até a condição chegar a 10;
        // Primeiro bloco: inicialização. Aqui vamos atribuir uma variável iteratora que controla a quantidade de excução do comando for.
        // Segundo bloco: Condição de execução, se essa condição for verdadeira vai executar a repetição da instrução. Quando ela for falsa, vai parar de executar comandos.
        // Terceiro bloco: Definição de quantidade de passos que vamos dar a cada iteração.
        for (int i=0; i < 10; i++) { // int i=0 variável no escopo local.
            // comandos
            System.out.println("Repetição " + i);
        }
    }
}