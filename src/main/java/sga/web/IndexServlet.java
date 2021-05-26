package sga.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import sga.dominio.*;
import sga.servicio.*;

@WebServlet(name = "index", urlPatterns = {"/personas", "/usuarios"})
public class IndexServlet extends HttpServlet {

    @Inject PersonaService personaServiceLocal;
    @Inject UsuarioService usuarioService;

    public void processReques(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        switch (request.getServletPath()) {
            case "/personas":
                List<Persona> personas = personaServiceLocal.selectPersonas();
                request.setAttribute("personas", personas);
                request.getRequestDispatcher("/listadopersonas.jsp").forward(request, response);
                break;
            case "/usuarios":
                List<Usuario> usuarios = usuarioService.selectAll();
                request.setAttribute("usuarios", usuarios);
                request.getRequestDispatcher("/listadousuarios.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            processReques(request, response);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
