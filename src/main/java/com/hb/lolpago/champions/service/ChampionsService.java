package com.hb.lolpago.champions.service;

import com.hb.lolpago.champions.entity.Champions;
import com.hb.lolpago.champions.repository.ReactiveChampionsRepository;

import org.springframework.beans.factory.annotation.Autowired;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ChampionsService {

  @Autowired
  ReactiveChampionsRepository reactiveChampionsRepository;

  public Mono<Champions> getChampionByName(String name) {
    return reactiveChampionsRepository.findByName(name);
  }

  public Flux<Champions> getAllChampions() {
    return reactiveChampionsRepository.findAll();
  }
    
}
