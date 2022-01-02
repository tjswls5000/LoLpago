package com.hb.lolpago.home.document;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document("champions")
public class champions {
    @Id
    private ObjectId _id;
    private String name;
    private String championId;        
    private String cost;  
    private ArrayList<String> traits;

    public champions(ObjectId _id, String name, String championId, String cost, ArrayList<String> traits) {
        super();
        this._id = _id;
        this.name = name;
        this.championId = championId;
        this.cost = cost;
        this.traits = traits;
    }

}
