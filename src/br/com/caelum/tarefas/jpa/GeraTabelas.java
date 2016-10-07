package br.com.caelum.tarefas.jpa;

//import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {
		
	public static void main(String[] args) {
			
		try{
			System.out.println("Gerando TABELA");
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
			//EntityManager manager = factory.createEntityManager();
			//manager.close();
			factory.close();
			System.out.println("TABELA GERADA");
		}
        catch (Exception e) {
        	System.out.println("Erro: " + e.getMessage());
		}
	

	}        
}    