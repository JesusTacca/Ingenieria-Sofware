package dominio.Modelo;

public class Visitante extends Usuario{
  private int num_bancario;

  public Visitante( int cod, String username, String password, String email, int dni, String nombre, String apellido,int num_bancario) {
    super(cod, username, password, email, dni, nombre, apellido);
    this.num_bancario = num_bancario;
  }

  public int getNum_bancario() {
    return num_bancario;
  }

  public void setNum_bancario(int num_bancario) {
    this.num_bancario = num_bancario;
  }
  
}
