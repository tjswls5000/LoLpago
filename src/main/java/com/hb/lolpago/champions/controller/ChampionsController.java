package com.hb.lolpago.champions.controller;

import com.hb.lolpago.champions.entity.Champions;
import com.hb.lolpago.champions.service.ChampionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/champions")
public class ChampionsController {

    @Autowired
    private ChampionsService championsService;

    @GetMapping("/{name}")
    public Mono<Champions> getChampionByName(@PathVariable String name){
        return championsService.getChampionByName(name);
    }
}
