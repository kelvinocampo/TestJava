import user.User;

public class App {
    public static void main(String[] args) throws Exception {
        String name = "Pepe";
        String email = "Pepe@gmail.com";
        byte age = 18;
        User user = new User(name, email, age);
        System.out.println(user.data());
        // Metodo estatico ejecutado mediante la clase y no la instancia
        System.out.println(User.saludo(name));
        // Ejecucion de un metodo privado mediante uno publico
        user.useMethodPrivate();
    }
}
