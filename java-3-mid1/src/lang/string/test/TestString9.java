package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String parts[]=email.split("@");
        String idParts=parts[0];
        String domainParts=parts[1];

        System.out.println("idParts = " + idParts);
        System.out.println("domainParts = " + domainParts);



    }
}
