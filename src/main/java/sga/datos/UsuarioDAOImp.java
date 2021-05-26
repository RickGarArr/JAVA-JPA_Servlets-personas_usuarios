package sga.datos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sga.dominio.Usuario;

public class UsuarioDAOImp implements UsuarioDAO {
    
    @PersistenceContext(unitName = "JPATest")
    EntityManager em;

    @Override
    public List<Usuario> selectAll() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario selectByID(Usuario usuario) {
        return (Usuario) em.createNamedQuery("Usuario.findByIdUsuario").getSingleResult();
    }
    
    @Override
    public Usuario selectByUsername(Usuario usuario) {
        return (Usuario) em.createNamedQuery("Usuario.findByUsername").getSingleResult();
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        em.remove(em.merge(usuario));
    }
}
