package co.com.elements.cartera.ingresoegreso;

import co.com.elements.cartera.ingresoegreso.entity.Empleado;
import co.com.elements.cartera.ingresoegreso.entity.Empresa;
import co.com.elements.cartera.ingresoegreso.entity.Rol;
import co.com.elements.cartera.ingresoegreso.entity.TipoDocumento;
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

		TipoDocumento tipoDocumento1 = new TipoDocumento();
		tipoDocumento1.setIdTipoDocumento(1);
		tipoDocumento1.setDescripcion("Cedula de Ciudadania");
		tipoDocumento1.setSiglas("CC");
		tipoDocumento1.setEstado(true);

		empresa.setIdEmpresa(1);
		empresa.setNombre("Five Elements");
		empresa.setDireccion("Zona Franca Bogotá");
		empresa.setTelefono("7777777777");
		empresa.setTipoDocumento(tipoDocumento1);
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
		empleado1.setNombre("Jaime Diaz");
		empleado1.setEmail("jaimediazbrand@gmail.com");
		empleado1.setTipoDocumento(tipoDocumento1);
		empleado1.setNumeroDocumento("4545454545");
		empleado1.setEmpresaEmpleado(empresa);
		empleado1.setRolEmpleado(rolEmpleado1);
		empleado1.setEstado(true);

		Empleado empleado2 = new Empleado();
		empleado2.setIdEmpleado(2);
		empleado2.setNombre("Edson Yair");
		empleado2.setEmail("edsonyair@gmail.com");
		empleado2.setTipoDocumento(tipoDocumento1);
		empleado2.setNumeroDocumento("7878787878");
		empleado2.setEmpresaEmpleado(empresa);
		empleado2.setRolEmpleado(rolEmpleado2);
		empleado2.setEstado(true);

		System.out.println("");
		System.out.println("ID de Empleado: " + empleado1.getIdEmpleado());
		System.out.println("Nombre del empleado: " + empleado1.getNombre());
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
		System.out.println("Nombre del empleado: " + empleado2.getNombre());
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










	}

}
