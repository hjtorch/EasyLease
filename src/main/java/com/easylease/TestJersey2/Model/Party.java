package com.easylease.TestJersey2.Model;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Party {
     public int party_id;
     
     @JsonProperty
     private String title;
     
     @JsonProperty
     private String owner;
     
     public String owner_thumbnail;
     
     public Date date;
     
     public Time time;
     
     
     public String getTitle() {
         return title;
     }
     
     public void setTitle(String title) {
    	 this.title = title;
     }
     
     public String getOwner() {
    	 return owner;
     }
     
     public void setOwner(String owner) {
    	 this.owner = owner;
     }
}
