package test;

import java.util.GregorianCalendar;
import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.salvi.hibernate.modelo.cliente;

public class testCliente {
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		// Creamos el gestor de perdsistencia)EM)
		emf = Persistence.createEntityManagerFactory("hibernate-jpa-ejemploPU");
		manager = emf.createEntityManager();

		List<cliente> listaClientes = manager.createQuery("FROM cliente").getResultList();

		System.out.println("en esta base de datos hay " + listaClientes.size() + " empleados");

		//Consulta empleado
		cliente cliconsulta =manager.find( cliente.class,"admin");
		
		// vamos a añadir un empleado

		cliente e = new cliente("salvi2021", "salvador", "sierra", "cliente",new GregorianCalendar(1992, 9, 29).getTime());
		cliente e1 = new cliente("salvi2022", "salvador", "sierra", "cliente",new GregorianCalendar(1992, 9, 29).getTime());
		cliente e2 = new cliente("salvi2023", "salvador", "sierra", "cliente",new GregorianCalendar(1992, 9, 29).getTime());
		manager.getTransaction().begin();
		
		
		//editar cliente
//	    manager.persist(e);
//		manager.persist(e1);
//		manager.persist(e2);
		
		cliconsulta.setApellidos("pepe luis");
		e.setTipo("admin");

		
		//borrar registro
		cliente cliborrar =manager.find( cliente.class,"rafa");
		
		manager.remove(cliborrar);
		
		
		
		manager.getTransaction().commit();
		
		
		testCliente.imprimirTodo();
		
		//cerramos manager , es importante
		manager.close();
		

	}

	private static void imprimirTodo() {

		List<cliente> listaClientes = manager.createQuery("FROM cliente").getResultList();
		System.out.println("en esta base de datos hay " + listaClientes.size() + " empleados");

		for (cliente cli : listaClientes) {
			System.out.println(cli.toString());
		}

	}
}
