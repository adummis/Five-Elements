package co.com.elements.cartera.ingresoegreso;

import co.com.elements.cartera.ingresoegreso.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresoegresoApplication {

	public static void main(String[] args) {

		SpringApplication.run(IngresoegresoApplication.class, args);

		Empresa empresa = new Empresa();
		TipoDocumento tipoDocumento2 = new TipoDocumento();
		tipoDocumento2.setIdTipoDocumento(2);
		tipoDocumento2.setDescripcion("Número de Identificación Tributaria");
		tipoDocumento2.setSiglas("NIT");
		tipoDocumento2.setEstado(true);

		empresa.setIdEmpresa(1);
		empresa.setNombre("Five Elements");
		empresa.setDireccion("Zona Franca Bogotá");
		empresa.setTelefono("7777777777");
		empresa.setTipoDocumento(tipoDocumento2);
		empresa.setNumeroDocumento("23232323");
		empresa.setEstado(true);

		System.out.println("");
		System.out.println("ID de Empresa: " + empresa.getIdEmpresa());
		System.out.println("Nombre de la empresa: " + empresa.getNombre());
		System.out.println("Dirección: " + empresa.getDireccion());
		System.out.println("Teléfono: " + empresa.getTelefono());
		System.out.println("Tipo de Documento: " + empresa.getTipoDocumento().getSiglas());
		System.out.println("Número de Documento: " + empresa.getNumeroDocumento());
		if(empresa.isEstado()){
			System.out.println("Estado: Activo");
		}
		else {
			System.out.println("Estado: Inactivo");
		}

		TipoDocumento tipoDocumento1 = new TipoDocumento();
		tipoDocumento1.setIdTipoDocumento(1);
		tipoDocumento1.setDescripcion("Cedula de Ciudadania");
		tipoDocumento1.setSiglas("CC");
		tipoDocumento1.setEstado(true);

		Rol rolEmpleado1 = new Rol();
		rolEmpleado1.setIdRol(1);
		rolEmpleado1.setDescripcion("administrador");
		rolEmpleado1.setEstado(true);

		Rol rolEmpleado2 = new Rol();
		rolEmpleado2.setIdRol(2);
		rolEmpleado2.setDescripcion("operativo");
		rolEmpleado2.setEstado(true);

		Empleado empleado1 = new Empleado();
		empleado1.setIdEmpleado(1);
		empleado1.setNombre("Jaime");
		empleado1.setApellido("Díaz");
		empleado1.setEmail("jaimediazbrand@gmail.com");
		empleado1.setTipoDocumento(tipoDocumento1);
		empleado1.setNumeroDocumento("4545454545");
		empleado1.setEmpresaEmpleado(empresa);
		empleado1.setRolEmpleado(rolEmpleado1);
		empleado1.setEstado(true);

		Empleado empleado2 = new Empleado();
		empleado2.setIdEmpleado(2);
		empleado2.setNombre("Edson");
		empleado2.setApellido("Muñoz");
		empleado2.setEmail("edsonyair@gmail.com");
		empleado2.setTipoDocumento(tipoDocumento1);
		empleado2.setNumeroDocumento("7878787878");
		empleado2.setEmpresaEmpleado(empresa);
		empleado2.setRolEmpleado(rolEmpleado2);
		empleado2.setEstado(true);

		System.out.println("");
		System.out.println("ID de Empleado: " + empleado1.getIdEmpleado());
		System.out.println("Nombre: " + empleado1.getNombre());
		System.out.println("Apellido: " + empleado1.getApellido());
		System.out.println("Email: " + empleado1.getEmail());
		System.out.println("Tipo de Documento: " + empleado1.getTipoDocumento().getSiglas());
		System.out.println("Número de Documento: " + empleado1.getNumeroDocumento());
		System.out.println("Empresa donde trabaja: " + empleado1.getEmpresaEmpleado().getNombre());
		System.out.println("Rol del empleado: " + empleado1.getRolEmpleado().getDescripcion());
		if(empleado1.isEstado()){
			System.out.println("Estado: Activo");
		}
		else {
			System.out.println("Estado: Inactivo");
		}

		System.out.println("");
		System.out.println("ID de Empleado: " + empleado2.getIdEmpleado());
		System.out.println("Nombre: " + empleado2.getNombre());
		System.out.println("Apellido: " + empleado2.getApellido());
		System.out.println("Email: " + empleado2.getEmail());
		System.out.println("Tipo de Documento: " + empleado2.getTipoDocumento().getSiglas());
		System.out.println("Número de Documento: " + empleado2.getNumeroDocumento());
		System.out.println("Empresa donde trabaja: " + empleado2.getEmpresaEmpleado().getNombre());
		System.out.println("Rol del empleado: " + empleado2.getRolEmpleado().getDescripcion());
		if(empleado2.isEstado()){
			System.out.println("Estado: Activo");
		}
		else {
			System.out.println("Estado: Inactivo");
		}

		Usuario usuario1 = new Usuario();
		usuario1.setIdUsuario(1);
		usuario1.setNombre(empleado1.getNombre());
		usuario1.setApellido(empleado1.getApellido());
		usuario1.setTipoDocumento(empleado1.getTipoDocumento());
		usuario1.setCedula(empleado1.getNumeroDocumento());
		usuario1.setRol(empleado1.getRolEmpleado());
		usuario1.setUsuario("jaime");
		usuario1.setClave("1234");
		usuario1.setEstado(true);

		Usuario usuario2 = new Usuario();
		usuario2.setIdUsuario(2);
		usuario2.setNombre(empleado2.getNombre());
		usuario2.setApellido(empleado2.getApellido());
		usuario2.setTipoDocumento(empleado2.getTipoDocumento());
		usuario2.setCedula(empleado2.getNumeroDocumento());
		usuario2.setRol(empleado2.getRolEmpleado());
		usuario2.setUsuario("edson");
		usuario2.setClave("1234");
		usuario2.setEstado(true);

		MovimientoDinero movimientoDinero1 = new MovimientoDinero();
		movimientoDinero1.setIdMovimientoDinero(1);
		movimientoDinero1.setMonto(1500000.00F);
		movimientoDinero1.setConceptoMovimiento("Venta de computador");
		movimientoDinero1.setUsuarioMovimiento(usuario2);
		movimientoDinero1.setEstado(true);

		System.out.println("");
		System.out.println("Id Movimiento de Dinero: " + movimientoDinero1.getIdMovimientoDinero());
		System.out.println("Monto: " + "$ " + movimientoDinero1.getMonto());
		System.out.println("Concepto: " + movimientoDinero1.getConceptoMovimiento());
		System.out.println("Usuario que realizó el movimiento: " + movimientoDinero1.getUsuarioMovimiento().getNombre() + " " + movimientoDinero1.getUsuarioMovimiento().getApellido());
		System.out.println("Rol del Usuario: " + movimientoDinero1.getUsuarioMovimiento().getRol().getDescripcion());
		if(movimientoDinero1.isEstado()){
			System.out.println("Estado: Activo");
		}
		else {
			System.out.println("Estado: Inactivo");
		}

		MovimientoDinero movimientoDinero2 = new MovimientoDinero();
		movimientoDinero2.setIdMovimientoDinero(2);
		movimientoDinero2.setMonto(-500000.00F);
		movimientoDinero2.setConceptoMovimiento("Pago recibo de energía");
		movimientoDinero2.setUsuarioMovimiento(usuario1);
		movimientoDinero2.setEstado(true);

		System.out.println("");
		System.out.println("Id Movimiento de Dinero: " + movimientoDinero2.getIdMovimientoDinero());
		System.out.println("Monto: " + "$ " + movimientoDinero2.getMonto());
		System.out.println("Concepto: " + movimientoDinero2.getConceptoMovimiento());
		System.out.println("Usuario que realizó el movimiento: " + movimientoDinero2.getUsuarioMovimiento().getNombre() + " " + movimientoDinero2.getUsuarioMovimiento().getApellido());
		System.out.println("Rol del Usuario: " + movimientoDinero2.getUsuarioMovimiento().getRol().getDescripcion());
		if(movimientoDinero1.isEstado()){
			System.out.println("Estado: Activo");
		}
		else {
			System.out.println("Estado: Inactivo");
		}

	}

}
