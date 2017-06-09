package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Academy;
import model.Person;
import service.AcademyService;

@Named("academyBean")
@RequestScoped
public class AcademyBean {

	private Academy academy = new Academy();
	
	private List<Academy> selectedAcademy;
	
	@Inject
	private AcademyService academyService;

	private List<Academy> editAcademy = new ArrayList<>();
	
	public String createAcademy(){
		academyService.createAcademy(academy);
		return "readAcademies";
	}
	
	public String editAcademy(Long ID){
		academyService.editAcademy(ID);
		return "readAcademies";
	}
	
	public Collection<Academy> readAcademy(){
		return academyService.readAcademy();
		
	}
	public String removeAcademy(Long ID){
		//setId(Id);
		academyService.removeAcademy(ID);
		//academyService.updateAcademy(academy);
		return "readAcademies";
		
	}
	
	public Academy getAcademy() {
		return academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public AcademyService getAcademyService() {
		return academyService;
	}

	public void setAcademyService(AcademyService academyService) {
		this.academyService = academyService;
	}

	public List<Academy> getEditAcademy() {
		return editAcademy;
	}

	public void setEditAcademy(List<Academy> editAcademy) {
		this.editAcademy = editAcademy;
	}

	public List<Academy> getSelectedAcademy() {
		return selectedAcademy;
	}

	public void setSelectedAcademy(List<Academy> selectedAcademy) {
		this.selectedAcademy = selectedAcademy;
	}
	
	
}