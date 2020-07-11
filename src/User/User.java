package User;
/*
Stwórz klasę User, obiekty typu User mają posiadać pola email, password, points oraz role (enum którego wartości mogą przyjmować np pozycje ADMIN, CLIENT itp).

Zaimplementuj i przetestuj klasę UserRepository z mapą, w której kluczami będą maile użytkowników a wartościami obiekty użytkowników.

Stwórz metody:
 add - przyjmującą obiekt typu User i dodająca go do mpay
add - przyjmująca dwie wartości String i tworząca User dodając go do mapy.
countUsers - zwracająca liczbę użytkowników w repozytorium
containsMail - zwracająca true jeśli na liście znajduje się dany mail
get - przyjmująca mail i zwracająca obiekt typu User
login - przyjmującą email i password użytkownika i zwracająca zalogowanego użytkownika lub rzucająca wyjątek z odpowiednią wiadomością jeśli podano błędny email lub password
remove - pozwalająca usunąć użytkownika po mailu
containsAdmin - zwracająca true jeśli na liście znajduje się przynajmniej jeden obiekt o roli ADMIN
	addPoints - metoda dodaje x punktów wszystkim klientom

 */


import java.util.Objects;

public class User {

    private String email;
    private String password;
    private int points;
    private Roles roles;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Roles getRoles() {
        return roles;
    }

    public User(String email, String  password, int points, Roles roles) {
        this.email = email;
        this.password = password;
        this.points = points;
        this.roles = roles;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return password == user.password &&
                points == user.points &&
                Objects.equals(email, user.email) &&
                roles == user.roles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, points, roles);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password=" + password +
                ", points=" + points +
                ", roles=" + roles +
                '}';
    }
}
