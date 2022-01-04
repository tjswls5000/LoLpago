package com.hb.lolpago.champions.dto;

import java.util.List;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChampionsDto {
  
    private ObjectId _id;
    private String name;
    private String championId;
    private Integer cost;
    private List<String> traits;
}
