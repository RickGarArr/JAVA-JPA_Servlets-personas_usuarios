package sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import sga.datos.PersonaDAO;
import sga.dominio.Persona;

@Stateless
public class PersonaServiceImp implements PersonaService {

    @Inject
    private PersonaDAO personaDAO;
    
    @Override
    public List<Persona> selectPersonas() {
        return personaDAO.selectAll();
    }

    @Override
    public Persona selectById(Persona persona) {
        return personaDAO.selectByID(persona);
    }

    @Override
    public Persona selectByEmail(Persona persona) {
        return personaDAO.selectByEmail(persona);
    }

    @Override
    public void insertPersona(Persona persona) {
        personaDAO.insertPersona(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        personaDAO.updatePersona(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        personaDAO.deletePersona(persona);
    }
    
}
