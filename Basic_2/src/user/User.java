package user;

public class User {
    String name;
    String email;
    Byte age;

    // Constructor - Mismo nombre de la clase
    public User(String name, String email, Byte age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Metodos
    public boolean isAdult() {
        return this.age >= 18;
    }

    public String data() {
        return "Nombre: " + this.name + ", Edad: " + this.age + ", Correo: " + this.email;
    }

    // Metodo estatico
    public static String saludo(String name) {
        return "Bienvenido " + name + ".";
    }

    // Metodo privado
    private boolean isPasswordValid(String password) {
        return password.length() > 8;
    }

    public void useMethodPrivate() {
        // Ejecucion del metodo privado, solo puede ser usado dentro de esta clase
        // Operador ternario
        String passwordValidText = isPasswordValid("123456789") ? "Contraseña valida." : "Contraseña no valida.";
        System.out.println(passwordValidText);
    }

}
