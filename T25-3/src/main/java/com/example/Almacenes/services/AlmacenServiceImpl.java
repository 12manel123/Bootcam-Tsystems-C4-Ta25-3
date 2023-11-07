package com.example.Almacenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Almacenes.dao.IAlmacenDAO;
import com.example.Almacenes.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{
	@Autowired
    private IAlmacenDAO iAlmacenDAO;

    @Override
    public List<Almacen> listarAlmacenes() {
        return iAlmacenDAO.findAll();
    }

    @Override
    public Almacen obtenerAlmacenPorId(Integer id) {
    	return iAlmacenDAO.findById(id).get();
    }

    @Override
    public Almacen guardarAlmacen(Almacen Almacen) {
        return iAlmacenDAO.save(Almacen);
    };


    @Override
    public Almacen actualizarAlmacen(Almacen Almacen) {
    	return iAlmacenDAO.save(Almacen);
    }

    @Override
    public void eliminarAlmacen(Integer id) {
    	iAlmacenDAO.deleteById(id);
    }
}
