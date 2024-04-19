public class Q03_7 {
    public static void main(String[] args) {
        Lutador ryu = new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison", 100, 12);
        for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(bison);
        }
        System.out.printf("Energia de Bison apos 3 golpes de Ryu: %d\n",bison.energia);

        for (int j = 0; j < 8; j++) {
            bison.aplicarGolpe(ryu);
        }
        System.out.printf("Energia de Ryu apos 8 golpes de Bison: %d\n",ryu.energia);
    }
}
