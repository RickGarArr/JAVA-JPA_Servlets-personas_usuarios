package sga.servicio;

import java.util.List;
import javax.ejb.Local;
import sga.dominio.Persona;

@Local
public interface PersonaService {
    public List<Persona> selectPersonas();
    public Persona selectById(Persona persona);
    public Persona selectByEmail(Persona persona);
    public void insertPersona(Persona persona);
    public void updatePersona(Persona persona);
    public void deletePersona(Persona persona);
}
