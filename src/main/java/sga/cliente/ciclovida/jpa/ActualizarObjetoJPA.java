package sga.cliente.ciclovida.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sga.dominio.Persona;

public class ActualizarObjetoJPA {

    private static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
        EntityManager em = emf.createEntityManager();
        
        // sesion corta
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Persona persona = em.find(Persona.class, 4);
        tx.commit();
        
        persona.setNombre("Lucia");
        
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        em.merge(persona);
        tx2.commit();
        
        //em.close();
        
        // sesion larga
        EntityTransaction tx3 = em.getTransaction();
        tx3.begin();
        Persona persona2 = em.find(Persona.class, 4);
        persona2.setNombre("Lucio");
        em.merge(persona2);
        tx3.commit();
        em.close();
    }

}
