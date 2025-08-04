public class Arvore<E extends Comparable<E>> {

    No<E> raiz;

    public Arvore() { }

    public void adicionarRaiz(No<E> raiz) {
        this.raiz = raiz;
    }

    public No<E> adicionarValor(E valor) {
        No<E> novoNo = new No<E>(valor);

        return adicionarValor(novoNo, null, this.raiz);
    }

    public No<E> adicionarValor(No<E> novoNo, No<E> noAnterior, No<E> noAtual) {
        if (noAtual == null) {
            novoNo.pai = noAnterior;
            return novoNo;
        }

        if (novoNo.valor.compareTo(noAtual.valor) > 0) {
            No<E> no = adicionarValor(novoNo, noAtual, noAtual.filhoDireito);
            noAtual.adicionarFilhoDireito(no);
        } else {
            No<E> no = adicionarValor(novoNo, noAtual,  noAtual.filhoEsquerdo);
            noAtual.adicionarFilhoEsquerdo(no);
        }
        return noAtual;
    }
}
