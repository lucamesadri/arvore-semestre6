public class App {
    public static void main(String[] args) throws Exception {

        Arvore<Integer> arvore = new Arvore<Integer>();
        No<Integer> raiz = new No<Integer>(50);
        arvore.adicionarRaiz(raiz);

        System.out.println(arvore.raiz.valor);
    }
}
