package personsAndAcademies.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import personsAndAcademies.model.Academy;

@Named("academyService")
@RequestScoped
public class AcademyService extends Service<Academy> {
	public Academy findByName(String name) {
		return academyRepo.findByName(name);
	}
}
