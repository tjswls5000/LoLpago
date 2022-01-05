package com.hb.lolpago.champions.repository;

import java.util.Optional;

import com.hb.lolpago.champions.entity.Champions;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionsRepository extends MongoRepository<Champions, String> {
  Optional<Champions> findByName(String name);
}