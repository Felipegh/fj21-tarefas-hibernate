package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class RemoveTarefas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager(); //abrir um EntityManager
		
				@SuppressWarnings("unused")
				Tarefa tarefa = new Tarefa();
								
				Tarefa encontrada = manager.find(Tarefa.class, 1L);
				
				manager.getTransaction().begin();
				manager.remove(encontrada);
				manager.getTransaction().commit();
	}

}
