package KlasyIInterfejsy.Zad1;

public class Validacja {

    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();
        String email = "email.addres@interia.pl";
        System.out.println(userValidator.validateEmails(email));
    }

}
