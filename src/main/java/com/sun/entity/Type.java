package com.sun.entity;
import java.io.Serializable;


public class Type implements Serializable{

  private long id;
  private String name;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Type(){}
  public Type ( long id ,String name){
    this.id = id;
    this.name = name;
  }
}
