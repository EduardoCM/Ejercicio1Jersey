package com.certificatic.jersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.certificatic.dao.PersonaDAO;
import com.certificatic.dao.PersonaDAOImpl;
import com.certificatic.model.Alumno;
import com.certificatic.model.Respuesta;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("alumnos")
public class MyResource {

	private PersonaDAO personaDao = new PersonaDAOImpl();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alumno> getAlumnos() {
		return personaDao.getAlumnos();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addAlumno(Alumno alumno) {
		personaDao.addAlumno(alumno);
	}
	
	@DELETE
	@Path("/{alumnoId}")
	public void deleteAlumno(@PathParam("alumnoId") int id) {
	   personaDao.deleteAlumno(id);
	}
	
	
	
	
	

}
