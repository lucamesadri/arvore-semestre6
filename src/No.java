public class No<E extends Comparable<E>> {

    No<E> filhoEsquerdo;
    No<E> filhoDireito;
    No<E> pai;
    E valor;

    public No(E valor) {
        this.valor = valor;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
        this.pai = null;
    }

    public No<E> adicionarFilhoEsquerdo(No<E> filhoEsquerdo) {
        return this.filhoEsquerdo = filhoEsquerdo;
    }

    public No<E> adicionarFilhoDireito(No<E> filhoDireito) {
        return this.filhoDireito = filhoDireito;
    }

    public No(E valor, No<E> pai) {
        this.valor = valor;
        this.pai = pai;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }
}
