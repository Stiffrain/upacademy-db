package personsAndAcademies.repository;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import personsAndAcademies.model.Academy;
import personsAndAcademies.model.Person;


@Named("academyRepo")
@Transactional
@ApplicationScoped
public class AcademyRepository {
	
	
	
	@PersistenceContext(name="ProjectDataBase")
	private EntityManager em;
	
	private Academy academy;
	
	private long academyId;
	

	public void createAcademy(Academy academy){
		em.persist(academy);
	}
	
	public List<Academy> readAcademy(){
		Query query = em.createQuery("Select e from Academy e");
		return (List<Academy>)query.getResultList();
	}
	
	public void remove(Long ID){
		System.out.println(ID);
		Academy academy = em.find(Academy.class, ID);
		em.remove(academy);
	}
	
	public void updateAcademy(Academy academy){
		academy = em.find(Academy.class,academy.getID());
		em.merge(academy);
	}	

	public long getAcademyId() {
		return academyId;
	}

	public void setAcademyId(long academyId) {
		this.academyId = academyId;
	}

	public Academy getAcademy() {
		return academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}
	
}