public class Arvore<E extends Comparable<E>> {
    No<E> raiz;

    public Arvore(){ }

    public void adicionarRaiz (No<E> raiz){
        this.raiz = raiz;
    }
    public No<E> adicionarValor(E valor){
        No<E> novoNo = new No<E>(valor);

        return adicionarValor(novoNo, this.raiz); 
    }
    public No<E> adicionarValor(No<E> novoNo, No<E> noAtual){
        if (noAtual == null){
            return novoNo;
        }

        if (novoNo.valor.compareTo(noAtual.valor) > 0){
            return adicionarValor(novoNo, noAtual.filhoDireito);
        } 
        else {
            return adicionarValor(novoNo, noAtual.filhoEsquerdo);
        }
    }
}
