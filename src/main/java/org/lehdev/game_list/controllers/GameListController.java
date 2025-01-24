package org.lehdev.game_list.controllers;

import org.lehdev.game_list.dto.GameDTO;
import org.lehdev.game_list.dto.GameListDto;
import org.lehdev.game_list.dto.GameMinDTO;
import org.lehdev.game_list.services.GameListService;
import org.lehdev.game_list.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListService.findAll();
        return result;
    }
}
