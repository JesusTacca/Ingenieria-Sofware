package dominio.Servicio;

import dominio.Modelo.Admin;
import java.util.ArrayList;
import repositorio.CrudAdmin;

public class ControlarAdmin {
    private static final String ACTION_END_FORM = "'/><br>\n";

    public boolean crearAdmin(Admin u) {
        CrudAdmin ca = new CrudAdmin();
        return ca.crearAdmin(u);
    }

    public boolean autentificarAdmin(String user, String pass) {
        CrudAdmin ca = new CrudAdmin();
        return ca.autentificarAdmin(user, pass);
    }

    public ArrayList<Admin> getAllAdmin() {
        CrudAdmin ca = new CrudAdmin();
        return ca.getAllAdmin();
    }

    public boolean actualizarAdmin(Admin p) {
        CrudAdmin mp = new CrudAdmin();
        return mp.actualizarAdmin(p);
    }

    public boolean eliminarAdmin(int id) {
        CrudAdmin mp = new CrudAdmin();
        /* manejar las acciones que van a realizarse*/
        return mp.eliminarAdmin(id);
    }

    public String getAdminId(int id) {
        String htmlcode = "";
        CrudAdmin tmp = new CrudAdmin();
        Admin pr = tmp.getAdmin(id);

        htmlcode += "<form action='../controlleradmin' method=\"POST\">\n"
                + "          <input placeholder=\"CODIGO\" class=\"form-control\" type=\"text\" name=\"codigo\" readonly value='" + pr.getCod() + ACTION_END_FORM
                + "          <input placeholder=\"USERNAME\" class=\"form-control\" type=\"text\" name=\"username\" value='" + pr.getUsername() + ACTION_END_FORM
                + "          <input placeholder=\"CONTRASEÑA\" class=\"form-control\" type=\"password\" name=\"password\" value='" + pr.getPassword() + ACTION_END_FORM
                + "          <input placeholder=\"EMAIL\" class=\"form-control\" type=\"email\" name=\"email\" value='" + pr.getEmail() + ACTION_END_FORM
                + "          <input placeholder=\"DNI\" class=\"form-control\" type=\"text\" name=\"dni\" value='" + pr.getDni() + ACTION_END_FORM
                + "          <input placeholder=\"NOMBRE\" class=\"form-control\" type=\"text\" name=\"nombre\" value='" + pr.getNombre() + ACTION_END_FORM
                + "          <input placeholder=\"APELLIDO\" class=\"form-control\" type=\"text\" name=\"apellido\" value='" + pr.getApellido() + ACTION_END_FORM
                + "          <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"Actualizar\">"
                + "        </form>";
        return htmlcode;

    }
}
