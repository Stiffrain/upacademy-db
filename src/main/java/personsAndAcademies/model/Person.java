package personsAndAcademies.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long ID;
	
	private String name;
	private boolean online = false;
	private String username;
	private String dateOfBirth;
	private String academicCourse;
	private String gender;
	private byte[] photo;
	private String academy;
	private int numTelephone;
	private String email;
	private String password;
	private String facebookLink;
	private String linkedInLink;
	private String gitHubLink;
	private String workPlace;
	private byte[] curriculum;
	private String securityQuestion;
	private String securityAnswer;
	
	
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAcademicCourse() {
		return academicCourse;
	}
	public void setAcademicCourse(String academicCourse) {
		this.academicCourse = academicCourse;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public long getID() {
		return ID;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public int getNumTelephone() {
		return numTelephone;
	}
	public void setNumTelephone(int numTelephone) {
		this.numTelephone = numTelephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacebookLink() {
		return facebookLink;
	}
	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}
	public String getLinkedInLink() {
		return linkedInLink;
	}
	public void setLinkedInLink(String linkedInLink) {
		this.linkedInLink = linkedInLink;
	}
	public String getGitHubLink() {
		return gitHubLink;
	}
	public void setGitHubLink(String gitHubLink) {
		this.gitHubLink = gitHubLink;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public byte[] getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(byte[] curriculum) {
		this.curriculum = curriculum;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	
}
