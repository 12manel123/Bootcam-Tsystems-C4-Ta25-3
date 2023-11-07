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

import com.example.Almacenes.dto.Caja;
import com.example.Almacenes.services.CajaServiceImpl;

@RestController
@RequestMapping("/caja")
public class CajaController {
	@Autowired
	private CajaServiceImpl CajaServiceImpl;

    @GetMapping("/all")
    public List<Caja> getCaja() {
        return CajaServiceImpl.listarCajas();
    }

    @GetMapping("/{id}")
	public Caja CajaXID(@PathVariable(name="id") String id) {
    	Caja Caja_xid= new Caja();
    	Caja_xid=CajaServiceImpl.obtenerCajaPorId(id);
		System.out.println("Caja XID: "+Caja_xid);
		return Caja_xid;
	}
    @PostMapping("/add")
	public Caja salvarCaja(@RequestBody Caja Caja) {
		return CajaServiceImpl.guardarCaja(Caja);
	}

    @PutMapping("/{id}")
	public Caja actualizarCaja(@PathVariable(name="id")String id,@RequestBody Caja Caja) {
    	Caja Caja_seleccionado= new Caja();
		
    	Caja_seleccionado= CajaServiceImpl.obtenerCajaPorId(id);
		
    	Caja_seleccionado.setContenido(Caja.getContenido());
    	Caja_seleccionado.setValor(Caja.getValor());
    	Caja_seleccionado.setAlmacen(Caja.getAlmacen());
		
    	Caja_seleccionado = CajaServiceImpl.actualizarCaja(Caja_seleccionado);
		
		System.out.println("La caja actualizada es: "+ Caja_seleccionado);
		
		return Caja_seleccionado;
    }

    @DeleteMapping("/{id}")
    public void eliminarCaja(@PathVariable String id) {
    	CajaServiceImpl.eliminarCaja(id);
		System.out.println("Caja eliminada");
    }
}
