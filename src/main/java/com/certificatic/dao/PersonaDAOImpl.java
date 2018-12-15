package com.certificatic.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.certificatic.model.Alumno;

public class PersonaDAOImpl implements PersonaDAO {
	
	private static Map<Integer, Alumno> alumnos = 
			new HashMap<>();
	
	static {
		Alumno eduardo = 
				new Alumno(123456789, "Eduardo", "Castillo", "Computacion");
		alumnos.put(1, eduardo);
	}

	@Override
	public List<Alumno> getAlumnos() {
		return new ArrayList<Alumno>(alumnos.values());
	}

	@Override
	public void addAlumno(Alumno alumno) {
		alumnos.put(alumnos.size() + 1, alumno);
	}

	@Override
	public void deleteAlumno(int id) {
		alumnos.remove(id);
	}
	

}
