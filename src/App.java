public class App {
    public static void main(String[] args) throws Exception {

        Arvore arvore = new Arvore<>();

        No<Integer> raiz = new No<Integer>(50);
        
        arvore.adicionarRaiz(raiz);

        arvore.adicionarValor(20);
        System.out.println();
    }
}
