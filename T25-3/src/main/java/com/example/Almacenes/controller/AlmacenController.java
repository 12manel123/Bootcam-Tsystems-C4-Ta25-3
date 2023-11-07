package com.example.Almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Almacenes.dto.Almacen;
import com.example.Almacenes.services.AlmacenServiceImpl;

@RestController
@RequestMapping("/almacen")
public class AlmacenController {
	@Autowired
	private AlmacenServiceImpl AlmacenServiceImpl;
	@GetMapping("/all")
    public List<Almacen> getAlmacen() {
        return AlmacenServiceImpl.listarAlmacenes();
    }

    @GetMapping("/{id}")
	public Almacen AlmacenXID(@PathVariable(name="id") Integer id) {
    	Almacen Almacen_xid= new Almacen();
		Almacen_xid=AlmacenServiceImpl.obtenerAlmacenPorId(id);
		System.out.println("Almacen XID: "+Almacen_xid);
		return Almacen_xid;
	}
    @PostMapping("/add")
	public Almacen salvarAlmacen(@RequestBody Almacen Almacen) {
		return AlmacenServiceImpl.guardarAlmacen(Almacen);
	}

    @PutMapping("/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id")Integer id,@RequestBody Almacen Almacen) {
    	Almacen Almacen_seleccionado= new Almacen();
    	Almacen Almacen_actualizado= new Almacen();
		
		Almacen_seleccionado= AlmacenServiceImpl.obtenerAlmacenPorId(id);
		Almacen_seleccionado.setLugar(Almacen.getLugar());
		Almacen_seleccionado.setCapacidad(Almacen.getCapacidad());

		Almacen_actualizado = AlmacenServiceImpl.actualizarAlmacen(Almacen_seleccionado);
		
		System.out.println("El Almacen actualizado es: "+ Almacen_actualizado);
		
		return Almacen_actualizado;
    }

    @DeleteMapping("/{id}")
    public void eliminarAlmacen(@PathVariable int id) {
    	AlmacenServiceImpl.eliminarAlmacen(id);
		System.out.println("Almacen eliminado");

    }
}
