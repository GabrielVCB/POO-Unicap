public class Q04_7 {
    public static void main(String[] args) {
        Post post = new Post("Foto", "fotoAugusto.com");
        for (int i = 0; i < 3; i++) {
            post.curtir("Foto");
        }
        System.out.printf("Numero de curtidas da foto de Augusto: %d\n", post.numCurtidas);

        for (int j = 0; j < 2; j++) {
            post.compartilhar("fotoAugusto.com");
        }
        System.out.printf("Numero de compartilhamentos do link: %d", post.numCompartilhamentos);
    }
}
