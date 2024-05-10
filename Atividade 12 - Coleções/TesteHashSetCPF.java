import java.util.HashSet;
public class TesteHashSetCPF {
    public static void main(String[] args) {
        HashSet<String> cpfs = new HashSet<>();
        cpfs.add("123.456.789-00");
        cpfs.add("987.654.321-00");
        cpfs.add("123.456.789-00");
        cpfs.add("987.654.321-00");
        cpfs.add("123.456.789-00");
        cpfs.add("987.654.321-00");
        cpfs.add("123.456.789-00");
        cpfs.add("987.654.321-00");
        cpfs.add("123.456.789-00");
        cpfs.add("987.654.321-00");

        for (String cpf : cpfs) {
            System.out.println(cpf);
        }
    }
}
