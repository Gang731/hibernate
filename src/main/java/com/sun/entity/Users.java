package com.sun.entity;
import java.io.Serializable;


public class Users implements Serializable{

  private Integer id;
  private String name;
  private String password;
  private String telephone;
  private String userName;
  private String isAdmin;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
  }

  public Users(){}
  public Users ( Integer id ,String name ,String password ,String telephone ,String userName ,String isAdmin){
    this.id = id;
    this.name = name;
    this.password = password;
    this.telephone = telephone;
    this.userName = userName;
    this.isAdmin = isAdmin;
  }

  @Override
  public String toString() {
    return "Users{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", telephone='" + telephone + '\'' +
            ", userName='" + userName + '\'' +
            ", isAdmin='" + isAdmin + '\'' +
            '}';
  }
}
