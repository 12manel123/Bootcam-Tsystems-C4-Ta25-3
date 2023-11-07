package com.example.Almacenes.services;

import java.util.List;

import com.example.Almacenes.dto.Caja;

public interface ICajaService {
public List<Caja> listarCajas();
	
	//Listar por id
	public Caja obtenerCajaPorId(String id);

    // Guardar
    public Caja guardarCaja(Caja Caja);

    // Actualizar
    public Caja actualizarCaja(Caja Caja);

    // Eliminar
    public void eliminarCaja(String id);
}
