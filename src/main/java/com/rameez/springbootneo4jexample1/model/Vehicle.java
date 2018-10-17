package com.rameez.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Vehicle {

    @GraphId
    private String vin;
    private String vehicleMade;
    private String vehicleCappacity;

    public Vehicle() {
    }

    public String getVin() {
        return vin;
    }

    public String getVehicleMade() {
        return vehicleMade;
    }

    public String getVehicleCappacity() {
        return vehicleCappacity;
    }
}
