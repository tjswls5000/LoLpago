package com.hb.lolpago.champions.service;

import java.util.Optional;

import com.hb.lolpago.champions.dto.ChampionsDto;
import com.hb.lolpago.champions.entity.Champions;
import com.hb.lolpago.champions.repository.ChampionsRepository;
import com.hb.lolpago.champions.repository.ReactiveChampionsRepository;
import com.hb.lolpago.utlis.AppUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ChampionsService {

  @Autowired
  private ChampionsRepository championsRepository;

  @Autowired
  private ReactiveChampionsRepository reactiveChampionsRepository;
  
  public Optional<Champions> getChampionByName(String name) {
    return championsRepository.findByName(name);
  }

  public Mono<ChampionsDto> getChampionByNameR(String name) {
    return reactiveChampionsRepository.findByName(name).map(AppUtils::entityToDto);
  }

  public Flux<Champions> getAllChampions() {
    return reactiveChampionsRepository.findAll();
  }
    
}
