package models;

public class User {
 String email,password,salt,login_type,status;
 int id_user;
 
 
 
 
 
 
 
 public User() {
	super();
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getID() {
	 return id_user;
 }

 public String getSalt() {
		return salt;
	}
 
 public String loginT() {
		return login_type;
	}
 public void setID(int id_user) {
	 this.id_user=id_user;
 }
 public void setSalt(String salt) {
	 this.salt=salt;
 }
 
 public void setLoginT(String login_type) {
	 this.login_type=login_type;
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




public User(int id_user,String email,String login_type) {
	super();
	this.id_user=id_user;
	this.email = email;
	this.login_type = login_type;
}

@Override
public String toString() {
	return "Users [email=" + email + ", password=" + password + ", salt=" + salt + ", login_type=" + login_type
			+ ", id_user=" + id_user + "]";
}





}
