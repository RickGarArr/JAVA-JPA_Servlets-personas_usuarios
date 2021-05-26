package sga.cliente.ciclovida.jpa;

import javax.persistence.*;
import org.apache.logging.log4j.*;
import sga.dominio.Persona;

public class PersistirObjetoJPA {
    static Logger log  = LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        // iniciar la transcaccion
        // objeto transitivo - no ligado a base de datos
        Persona persona = new Persona(0, "Amelia", "Arreola", "Nevarez", "ameliaarreola@gmail.com", "6771066402");
        
        // iniciar transaccion
        tx.begin();
        
        // ejecutar sql
        em.persist(persona);
        log.debug("Objeto persistido = sin commit: " + persona);
        
        // commit
        tx.commit();
        // OBjeto en estado detached
        log.debug("Objeto persistido = detached: " + persona);
        
        em.close();
        
    }
}
