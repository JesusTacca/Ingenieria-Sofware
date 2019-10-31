package dominio.Modelo;
public class Usuario {
    private int cod;
    private String username;
    private String password;
    private String email;
    private int dni;
    private String nombre;
    private String apellido;
    
    public Usuario(){}
    public Usuario(int cod,String username, String password,
            String email, int dni, String nombre,
            String apellido) {
        this.cod=cod;
        this.username = username;
        this.password = password;
        this.email = email;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCod() {return cod;}
    public void setCod(int cod) {this.cod = cod;}
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public int getDni() {return dni;}
    public void setDni(int dni) {this.dni = dni;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
}
