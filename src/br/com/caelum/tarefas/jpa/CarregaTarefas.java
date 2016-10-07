package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class CarregaTarefas {

	public static void main(String[] args) {
		// Método para adicionar Tarefas pelo id 
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		
				EntityManager manager = factory.createEntityManager();
				
				Tarefa encontrada = manager.find(Tarefa.class, 2L);
				
				System.out.println(encontrada.getId());
				System.out.println(encontrada.getDescricao());
				System.out.println(encontrada.isFinalizado());
				manager.close();
	}

}
