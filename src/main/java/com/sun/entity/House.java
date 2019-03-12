package com.sun.entity;
import java.io.Serializable;


public class House implements Serializable{

  private long id;
  private String title;
  private String description;
  private long price;
  private java.sql.Date pubdate;
  private long floorage;
  private String contact;
  private long userId;
  private long typeId;
  private long streetId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  public java.sql.Date getPubdate() {
    return pubdate;
  }

  public void setPubdate(java.sql.Date pubdate) {
    this.pubdate = pubdate;
  }


  public long getFloorage() {
    return floorage;
  }

  public void setFloorage(long floorage) {
    this.floorage = floorage;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public long getStreetId() {
    return streetId;
  }

  public void setStreetId(long streetId) {
    this.streetId = streetId;
  }

  public House(){}
  public House ( long id ,String title ,String description ,long price ,java.sql.Date pubdate ,long floorage ,String contact ,long userId ,long typeId ,long streetId){
    this.id = id;
    this.title = title;
    this.description = description;
    this.price = price;
    this.pubdate = pubdate;
    this.floorage = floorage;
    this.contact = contact;
    this.userId = userId;
    this.typeId = typeId;
    this.streetId = streetId;
  }
}
