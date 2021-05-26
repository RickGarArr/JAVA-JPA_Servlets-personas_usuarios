package sga.cliente.ciclovida.jpa;

import javax.persistence.*;
import javax.persistence.Persistence;
import sga.dominio.Persona;

public class EliminarObjetoJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Persona persona = em.find(Persona.class, 4);
        tx.commit();
        tx.begin();
        em.remove(em.merge(persona));
        tx.commit();
        em.close();
    }
}
