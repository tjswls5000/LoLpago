package com.hb.lolpago.champions.repository;

import java.util.List;

import com.hb.lolpago.champions.entity.Champions;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactiveChampionsRepository extends ReactiveCrudRepository<Champions, String> {
  Mono<Champions> findByName(String name);

  Flux<Champions> findeByCost(Integer cost);

  Flux<Champions> findByTraits(List<String> traits);

}
