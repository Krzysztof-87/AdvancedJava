package User;

public class UserLauncher {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.add(new User("k.latacz@interia.pl", "AlamaKota", 10, Roles.Client));
        userRepository.add(new User("chris.latacz@gmail.com", "Inny", 22, Roles.Admin));
        userRepository.add(new User("Marat.anna@gmail.com", "Ania13", 44, Roles.Client));
        userRepository.add(new User("Wesele2020@gmail.com", "NIe wiem"));


        System.out.println(userRepository.countUsers());
        System.out.println(userRepository.containsMail("chris.latacz@gmail.com"));
        System.out.println(userRepository.get("Marat.anna@gmail.com"));
        System.out.println(userRepository.login("k.latacz@interia.pl", "AlamaKota"));
        System.out.println(userRepository.containsAdmin());
        userRepository.addPoints(10);
        System.out.println(userRepository.getUsers());
        userRepository.remove("chris.latacz@gmail.com");
        System.out.println(userRepository.getUsers());




    }
}
