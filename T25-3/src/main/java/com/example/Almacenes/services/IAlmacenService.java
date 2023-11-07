package com.example.Almacenes.services;

import java.util.List;

import com.example.Almacenes.dto.Almacen;

public interface IAlmacenService {
	//Listar todos
			public List<Almacen> listarAlmacenes();
			
			//Listar por id
			public Almacen obtenerAlmacenPorId(Integer id);

		    // Guardar
		    public Almacen guardarAlmacen(Almacen Almacen);

		    // Actualizar
		    public Almacen actualizarAlmacen(Almacen Almacen);

		    // Eliminar
		    public void eliminarAlmacen(Integer id);
}
