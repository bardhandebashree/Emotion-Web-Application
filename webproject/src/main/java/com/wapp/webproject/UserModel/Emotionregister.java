package com.wapp.webproject.UserModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "EmotionRegister")
public class Emotionregister {
	@Id
	private int id;
	@Column(name="emotions")
	private String emotions;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "emos")
	private Userregister userreg;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmotions() {
		return emotions;
	}
	public void setEmotions(String emotions) {
		this.emotions = emotions;
	}
	public Userregister getUserreg() {
		return userreg;
	}
	public void setUserreg(Userregister userreg) {
		this.userreg = userreg;
	}
	
	
	
}