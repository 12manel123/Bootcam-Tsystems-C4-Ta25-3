package com.example.Almacenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Almacenes.dao.ICajaDAO;
import com.example.Almacenes.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{
	@Autowired
    private ICajaDAO iCajaDAO;

    @Override
    public List<Caja> listarCajas() {
        return iCajaDAO.findAll();
    }

    @Override
    public Caja obtenerCajaPorId(String id) {
    	return iCajaDAO.findById(id).get();
    }

    @Override
    public Caja guardarCaja(Caja Caja) {
        return iCajaDAO.save(Caja);
    };


    @Override
    public Caja actualizarCaja(Caja Caja) {
    	return iCajaDAO.save(Caja);
    }

    @Override
    public void eliminarCaja(String id) {
    	iCajaDAO.deleteById(id);
    }
}
