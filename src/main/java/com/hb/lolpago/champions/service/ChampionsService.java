package com.hb.lolpago.champions.service;

import java.beans.JavaBean;

import com.hb.lolpago.champions.entity.Champions;
import com.hb.lolpago.champions.repository.ReactiveChampionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
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
