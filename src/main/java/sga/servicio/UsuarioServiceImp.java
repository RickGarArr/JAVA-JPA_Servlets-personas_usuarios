package sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import sga.datos.UsuarioDAO;
import sga.dominio.Usuario;

@Stateless
public class UsuarioServiceImp implements UsuarioService{

    @Inject
    UsuarioDAO usuarioDAO;
    
    @Override
    public List<Usuario> selectAll() {
        return usuarioDAO.selectAll();
    }

    @Override
    public Usuario selectById(Usuario usuario) {
        return usuarioDAO.selectByID(usuario);
    }

    @Override
    public Usuario selectByUsername(Usuario usuario) {
        return usuarioDAO.selectByUsername(usuario);
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        usuarioDAO.insertUsuario(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        usuarioDAO.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        usuarioDAO.deleteUsuario(usuario);
    }
    
}
