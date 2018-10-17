package com.rameez.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class User {

    @GraphId
    private String userid;
    private String username;
    private String age;
    private  String adress;


    @Relationship(type = "USES", direction = Relationship.INCOMING)
    private List<Vehicle> vehicle;

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public User() {

    }

    public String getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }
}
