package personsAndAcademies.authentication;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import personsAndAcademies.model.User;
import personsAndAcademies.service.UserService;
import personsAndAcademies.view.GrowlBean;

@Named
@RequestScoped
public class Register extends GrowlBean {

    private User user;

    @Inject
    private UserService service;

    @PostConstruct
    public void init() {
        user = new User();
    }

    public void submit() {
        try {
            service.create(user);
            defineGrowl("O utilizador foi criado com sucesso","", "registar");
        }
        catch (RuntimeException e) {
            Messages.addGlobalError("Registration failed: {0}", e.getMessage());
            e.printStackTrace(); // TODO: logger.
        }
    }

    public User getUser() {
        return user;
    }

}