package sga.cliente.ciclovida.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;
import sga.dominio.Persona;

public class EncontrarObjetoJPA {
    
    static Logger log  = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        // iniciar la transcaccion
        
        // iniciar transaccion
        tx.begin();
        
        // ejecutar sql
        Persona persona = em.find(Persona.class, 4);
        log.debug("Objeto del metodo find " + persona);
        
        // commit
        tx.commit();
        // OBjeto en estado detached
        log.debug("Objeto detached: " + persona);
        
        em.close();
        
    }
}
