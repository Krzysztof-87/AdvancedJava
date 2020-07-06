package Maps;
/*
\Stwórz klasę User, obiekty typu User mają posiadać pola email, password, points oraz role (enum którego wartości mogą przyjmować np pozycje ADMIN, CLIENT itp).

Zaimplementuj i przetestuj klasę UserRepository z mapą, w której kluczami będą maile użytkowników a wartościami obiekty użytkowników.

Stwórz metody:
 add - przyjmującą obiekt typu User
add - przyjmująca dwie wartości String i tworząca User dodając go do mapy.
countUsers - zwracająca liczbę użytkowników w repozytorium
containsMail - zwracająca true jeśli na liście znajduje się dany mail
get - przyjmująca mail i zwracająca obiekt typu User
login - przyjmującą email i password użytkownika i zwracająca zalogowanego użytkownika lub rzucająca wyjątek z odpowiednią wiadomością jeśli podano błędny email lub password
remove - pozwalająca usunąć użytkownika po mailu
containsAdmin - zwracająca true jeśli na liście znajduje się przynajmniej jeden obiekt o roli ADMIN

 */

import java.util.HashMap;
import java.util.Map;

public class UserRepository {


    private Map<String, User> users = new HashMap<>();

    public void add(User user) {
        users.put(user.getEmail(), user);
    }

    public void add(String email, String password) {
        User user = new User(email,password,0,Rols.Client);
        add(user);
    }

    public int countUsers() {
       return users.size();

    }

    public boolean containsMail(String email) {
        return users.containsKey(email);
    }


    public User get(String email) {
       return users.get(email);
    }

    public User login(String login, String password){
        if (users.containsKey(login)&&users.get(login).getPassword().equals(password))
                return users.get(login);

            throw new UserRepositoryException("Nie znaleziono emaila lub haslo nieproprawne");
    }

    public void remove(String email) {
      users.remove(email);
    }


    public boolean containsAdmin(){
        for (User value : users.values()) {
            if (value.getRols() == Rols.Admin)
                return true;
        }
        return false;
    }
}

