package sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sga.dominio.Persona;

@Stateless
public class PersonaDAOImp implements PersonaDAO {

    @PersistenceContext(unitName = "JPATest")
    EntityManager em;

    @Override
    public List<Persona> selectAll() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona selectByID(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona selectByEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email = :email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(em.merge(persona));
    }

}
