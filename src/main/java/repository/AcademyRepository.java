package repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import model.Academy;

@Named("academyRepo")
@Transactional
@ApplicationScoped
public class AcademyRepository {
	
	@PersistenceContext(name="ProjectDataBase")
	private EntityManager em;
	
	public void createAcademy(Academy academy){
		em.persist(academy);
	}
	
	public List<Academy> readAcademy(){
		Query query = em.createQuery("Select e from Academy e");
		return (List<Academy>)query.getResultList();
	}
	
	public void removeAcademy (Academy academy){
		academy = em.find(Academy.class, academy.getName());
		em.remove(academy);
	}
	
}
