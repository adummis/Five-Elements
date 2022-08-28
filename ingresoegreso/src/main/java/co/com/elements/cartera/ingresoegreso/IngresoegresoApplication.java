package co.com.elements.cartera.ingresoegreso;

import co.com.elements.cartera.ingresoegreso.entity.Empresa;
import co.com.elements.cartera.ingresoegreso.entity.TipoDocumento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresoegresoApplication {

	public static void main(String[] args) {

		SpringApplication.run(IngresoegresoApplication.class, args);

		Empresa empresa = new Empresa();
		TipoDocumento tipoDocumento = new TipoDocumento();
		tipoDocumento.setIdTipoDocumento(1);
		tipoDocumento.setIdTipoDocumento(2);
		tipoDocumento.setDescripcion("Número de Identificación Tributaria");
		tipoDocumento.setSiglas("NIT");
		tipoDocumento.setEstado(true);

		empresa.setIdEmpresa(1);
		empresa.setNombre("Five Elements");
		empresa.setDireccion("Zona Franca Bogotá");
		empresa.setTelefono("9999999999");
		empresa.setTipoDocumento(tipoDocumento);
		empresa.setNumeroDocumento("999999999-9");
		empresa.setEstado(true);

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

	}

}
