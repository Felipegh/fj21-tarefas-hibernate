package br.com.caelum.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.caelum.tarefas.modelo.Tarefa;
import javax.persistence.Persistence;

public class AtualizaTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarefa tarefa = new Tarefa();
		tarefa.setId((long) 2); //esse id já existe no banco
		tarefa.setDescricao("Não Estudar JPA e Hibernate");
		tarefa.setFinalizado(true);
		tarefa.setDataFinalizacao(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager(); //abrir um EntityManager
				
		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();

	}

}
