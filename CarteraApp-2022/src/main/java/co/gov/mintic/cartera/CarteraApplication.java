package co.gov.mintic.cartera;

import co.gov.mintic.cartera.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class CarteraApplication {

	public static void main(String[] args) {

		SpringApplication.run(CarteraApplication.class, args);

		DocumentTypeEntity documentType1 = new DocumentTypeEntity();
		documentType1.setIdDocumentType(1);
		documentType1.setDescription("Cedula de Ciudadania");
		documentType1.setAcronym("CC");
		documentType1.setStatus(true);

		DocumentTypeEntity documentType2 = new DocumentTypeEntity();
		documentType2.setIdDocumentType(2);
		documentType2.setDescription("Número de Identificación Tributaria");
		documentType2.setAcronym("NIT");
		documentType2.setStatus(true);

		ProfileEntity profile1 = ProfileEntity.Financiero;
		ProfileEntity profile2 = ProfileEntity.Comercio;

		UserEntity user1 = new UserEntity();
		user1.setIdUser(1);
		user1.setUsername("jaimebrand");
		user1.set_password("123456");
		user1.setEmail("jaimebrand@gmail.com");
		user1.setCreatedAt(new Date());
		user1.setStatus(true);

		UserEntity user2 = new UserEntity();
		user2.setIdUser(1);
		user2.setUsername("edsonyair");
		user2.set_password("123456");
		user2.setEmail("edsonyair@gmail.com");
		user2.setCreatedAt(new Date());
		user2.setStatus(true);

		EnterpriseEntity enterprise = new EnterpriseEntity();
		enterprise.setIdEnterprise(1);
		enterprise.setName("Five Elements");
		enterprise.setAddress("Zona Franca Bogotá");
		enterprise.setPhone("7777777777");
		enterprise.setDocumentType(documentType2);
		enterprise.setDocumentNumber("123123123-3");
		enterprise.setStatus(true);

		System.out.println("");
		System.out.println("ID de Empresa: " + enterprise.getIdEnterprise());
		System.out.println("Nombre de la empresa: " + enterprise.getName());
		System.out.println("Dirección: " + enterprise.getAddress());
		System.out.println("Teléfono: " + enterprise.getPhone());
		System.out.println("Tipo de Documento: " + enterprise.getDocumentType().getAcronym());
		System.out.println("Número de Documento: " + enterprise.getDocumentNumber());
		System.out.println("Fecha de creación: " + enterprise.getCreatedAt());
		if(enterprise.isStatus()){
			System.out.println("Estado: Activo");
		}
		else {
			System.out.println("Estado: Inactivo");
		}

		RoleEntity role1 = new RoleEntity();
		role1.setIdRole(1);
		role1.setDescription("administrador");
		role1.setStatus(true);

		RoleEntity role2 = new RoleEntity();
		role2.setIdRole(2);
		role2.setDescription("operativo");
		role2.setStatus(true);

		EmployeeEntity employee1 = new EmployeeEntity();
		employee1.setIdEmployee(1);
		employee1.setName("Jaime");
		employee1.setLastname("Díaz");
		employee1.setDocumentType(documentType1);
		employee1.setDocumentNumber("4545454545");
		employee1.setAddress("Centro, Pereira");
		employee1.setPhone("999999999");
		employee1.setEnterprise(enterprise);
		employee1.setRole(role1);
		employee1.setProfile(profile1);
		employee1.setUser(user1);
		employee1.setStatus(true);

		EmployeeEntity employee2 = new EmployeeEntity();
		employee2.setIdEmployee(2);
		employee2.setName("Yair");
		employee2.setLastname("Muñoz");
		employee2.setDocumentType(documentType1);
		employee2.setDocumentNumber("1212121212");
		employee2.setAddress("Centro, Quibdó");
		employee2.setPhone("7777777777");
		employee2.setEnterprise(enterprise);
		employee2.setRole(role2);
		employee2.setProfile(profile2);
		employee2.setUser(user2);
		employee2.setStatus(true);

		System.out.println("");
		System.out.println("ID de Empleado: " + employee1.getIdEmployee());
		System.out.println("Nombre: " + employee1.getName());
		System.out.println("Apellido: " + employee1.getLastname());
		System.out.println("Email: " + employee1.getUser().getEmail());
		System.out.println("Tipo de Documento: " + employee1.getDocumentType().getAcronym());
		System.out.println("Número de Documento: " + employee1.getDocumentNumber());
		System.out.println("Dirección: " + employee1.getAddress());
		System.out.println("Número de teléfono: " + employee1.getPhone());
		System.out.println("Empresa donde trabaja: " + employee1.getEnterprise().getName());
		System.out.println("Rol del empleado: " + employee1.getRole().getDescription());
		System.out.println("Perfíl: " + employee1.getProfile().name());
		System.out.println("Usuario: " + employee1.getUser().getUsername());
		System.out.println("Fecha de creación: " + employee1.getCreatedAt());
		if(employee1.isStatus()){
			System.out.println("Estado: Activo");
		}
		else {
			System.out.println("Estado: Inactivo");
		}

		System.out.println("");
		System.out.println("ID de Empleado: " + employee2.getIdEmployee());
		System.out.println("Nombre: " + employee2.getName());
		System.out.println("Apellido: " + employee2.getLastname());
		System.out.println("Email: " + employee2.getUser().getEmail());
		System.out.println("Tipo de Documento: " + employee2.getDocumentType().getAcronym());
		System.out.println("Número de Documento: " + employee2.getDocumentNumber());
		System.out.println("Dirección: " + employee2.getAddress());
		System.out.println("Número de teléfono: " + employee2.getPhone());
		System.out.println("Empresa donde trabaja: " + employee2.getEnterprise().getName());
		System.out.println("Rol del empleado: " + employee2.getRole().getDescription());
		System.out.println("Perfíl: " + employee2.getProfile().name());
		System.out.println("Usuario: " + employee2.getUser().getUsername());
		System.out.println("Fecha de creación: " + employee2.getCreatedAt());
		if(employee2.isStatus()){
			System.out.println("Estado: Activo");
		}
		else {
			System.out.println("Estado: Inactivo");
		}

		TransactionEntity transaction1 = new TransactionEntity();
		transaction1.setIdTransaction(1);
		transaction1.setAmount(1500000.00F);
		transaction1.setTransactionConcept("Venta de computador");
		transaction1.setEmployee(employee2);

		System.out.println("");
		System.out.println("Id Movimiento de Dinero: " + transaction1.getIdTransaction());
		System.out.println("Monto: " + "$ " + transaction1.getAmount());
		System.out.println("Concepto: " + transaction1.getTransactionConcept());
		System.out.println("Usuario que realizó el movimiento: " + transaction1.getEmployee().getName() + " " + transaction1.getEmployee().getLastname());
		System.out.println("Rol del Usuario: " + transaction1.getEmployee().getRole().getDescription());
		System.out.println("Fecha de creación movimiento: " + transaction1.getCreatedAt());

		TransactionEntity transaction2 = new TransactionEntity();
		transaction2.setIdTransaction(2);
		transaction2.setAmount(-500000.00F);
		transaction2.setTransactionConcept("Pago recibo de energía");
		transaction2.setEmployee(employee1);

		System.out.println("");
		System.out.println("Id Movimiento de Dinero: " + transaction2.getIdTransaction());
		System.out.println("Monto: " + "$ " + transaction2.getAmount());
		System.out.println("Concepto: " + transaction2.getTransactionConcept());
		System.out.println("Usuario que realizó el movimiento: " + transaction2.getEmployee().getName() + " " + transaction2.getEmployee().getLastname());
		System.out.println("Rol del Usuario: " + transaction2.getEmployee().getRole().getDescription());
		System.out.println("Fecha de creación movimiento: " + transaction2.getCreatedAt());
	}
}
