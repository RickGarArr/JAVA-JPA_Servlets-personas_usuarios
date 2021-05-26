package sga.datos;

import java.util.List;
import sga.dominio.Usuario;

public interface UsuarioDAO {
public List<Usuario> selectAll();
    public Usuario selectByID(Usuario usuario);
    public Usuario selectByUsername(Usuario usuario);
    public void insertUsuario(Usuario usuario);
    public void updateUsuario(Usuario usuario);
    public void deleteUsuario(Usuario usuario);    
}
