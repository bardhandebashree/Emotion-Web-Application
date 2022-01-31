package com.wapp.webproject.UserModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Userregister")
public class Userregister {
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
			public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
			

		public Emotionregister getEmos() {
			return emos;
		}
		public void setEmos(Emotionregister emos) {
			this.emos = emos;
		}




		@Id
	    private int id;
		@Column(name="username")
	   	private String username;
		@Column(name="email")
	    private String email;
		@Column(name="password")
	    private String password;
	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "up_id")
	    private Emotionregister emos;
	    @Override
	   	public String toString() {
	   		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	   	}

}
