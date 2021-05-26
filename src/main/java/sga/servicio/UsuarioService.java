package sga.servicio;

import java.util.List;
import javax.ejb.Local;
import sga.dominio.Usuario;

@Local
public interface UsuarioService {
    List<Usuario> selectAll();
    Usuario selectById(Usuario usuario);
    Usuario selectByUsername(Usuario usuario);
    void insertUsuario(Usuario usuario);
    void updateUsuario(Usuario usuario);
    void deleteUsuario(Usuario usuario);
}
