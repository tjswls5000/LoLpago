package com.hb.lolpago.champions.repository;

import com.hb.lolpago.champions.entity.Champions;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChampionsRepository extends MongoRepository<Champions, String> {
  public Champions findByName(String name);
}