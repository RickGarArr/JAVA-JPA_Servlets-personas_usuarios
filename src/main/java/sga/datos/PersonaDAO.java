package sga.datos;

import java.util.List;
import sga.dominio.Persona;

public interface PersonaDAO {
    public List<Persona> selectAll();
    public Persona selectByID(Persona persona);
    public Persona selectByEmail(Persona persona);
    public void insertPersona(Persona persona);
    public void updatePersona(Persona persona);
    public void deletePersona(Persona persona);
}
