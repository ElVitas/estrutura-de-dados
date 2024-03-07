public class App {
    public static void main (String [] args){
        Empilhavel pilha = new PilhaEstatica(5);

        pilha.empilhar("Victor");
        pilha.empilhar("Rodrigues");
        pilha.empilhar("Oliveira");
        //pilha.empilhar("Casa");
        pilha.empilhar("Eu");



        System.out.println("Pilha = " + pilha.imprimir());
    }
}