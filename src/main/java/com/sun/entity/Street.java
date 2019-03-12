package com.sun.entity;
import java.io.Serializable;


public class Street implements Serializable{

  private long id;
  private String name;
  private long districtId;


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


  public long getDistrictId() {
    return districtId;
  }

  public void setDistrictId(long districtId) {
    this.districtId = districtId;
  }

  public Street(){}
  public Street ( long id ,String name ,long districtId){
    this.id = id;
    this.name = name;
    this.districtId = districtId;
  }
}
