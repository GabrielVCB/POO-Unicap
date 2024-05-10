import java.util.HashSet;

public class ConjuntoDePalavras {
    private HashSet<String> palavrasSet;

    public ConjuntoDePalavras(String palavras) {
        palavrasSet = new HashSet<>();
        String[] palavrasArray = palavras.split(",");
        for (String palavra : palavrasArray) {
            palavrasSet.add(palavra.trim()); 
        }
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasArray = palavras.split(",");
        for (String palavra : palavrasArray) {
            if (!palavrasSet.contains(palavra.trim())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras("java,programação,linguagem,computador");
        
        String palavras1 = "java,linguagem";
        String palavras2 = "java,Python";
        
        System.out.println("Contém todas as palavras em '" + palavras1 + "'? " + conjunto.contemTodas(palavras1));
        System.out.println("Contém todas as palavras em '" + palavras2 + "'? " + conjunto.contemTodas(palavras2));
    
    }

}
