package com.foody.resto.RVI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@PrimaryKeyJoinColumn
private int userId;
private String userName;
private String passWord;

public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
	result = prime * result + userId;
	result = prime * result + ((userName == null) ? 0 : userName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Users other = (Users) obj;
	if (passWord == null) {
		if (other.passWord != null)
			return false;
	} else if (!passWord.equals(other.passWord))
		return false;
	if (userId != other.userId)
		return false;
	if (userName == null) {
		if (other.userName != null)
			return false;
	} else if (!userName.equals(other.userName))
		return false;
	return true;
}

}
