public class PilhaEstatica implements Empilhavel {

    private int ponteiroTopo;
    private Object[] dados;
    private int tamanho;

    public PilhaEstatica() {
        this(10);
    }

    public PilhaEstatica(int tamanho) {
        ponteiroTopo = 0;
        this.tamanho = tamanho;
        dados = new Object[tamanho];
    }

    public void empilhar(Object elemento) {
        if (!estaCheia()) {
            ponteiroTopo++;
            dados[ponteiroTopo] = elemento;
        } else {
            System.out.println("Pilha está cheia!");
        }
    }

    public Object desempilhar() {
        Object elementoTopo = 0;
        if (!estaVazia()) {
            elementoTopo = dados[ponteiroTopo];
            ponteiroTopo--;
        } else {
            System.out.println("Pilha está vazia!");
        }
        return elementoTopo;
    }

    public Object topo(){
        Object elementoTopo = 0;
        if (!estaVazia()){
            elementoTopo = dados[ponteiroTopo];
        } else {
            System.out.println("Pilha está vazia.");
        }
        return elementoTopo;
    }


    public boolean estaCheia() {
        return (ponteiroTopo == tamanho - 1);
    }

    public boolean estaVazia() {
        return (ponteiroTopo == -1);
    }

    public String imprimir() {
        StringBuilder resultado = new StringBuilder("[");
        for (int i = 0; i <= ponteiroTopo; i++){
            resultado.append(dados[i] + ",");
        }
        return resultado + "]";
    }
}
