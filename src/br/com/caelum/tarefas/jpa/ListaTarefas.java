package br.com.caelum.tarefas.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
//import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;


public class ListaTarefas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager(); //abrir um EntityManager
		
				Query query = manager
				.createQuery("select t from Tarefa as t "+
				"where t.finalizado = :paramFinalizado");
				query.setParameter("paramFinalizado", true);
				@SuppressWarnings({ "unchecked" })
				List<Tarefa> lista = query.getResultList();
				for (Tarefa t : lista) {
					System.out.println(t.getDescricao());
					}
					manager.close();
	}

}
