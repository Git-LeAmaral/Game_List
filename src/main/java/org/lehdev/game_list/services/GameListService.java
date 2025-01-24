package org.lehdev.game_list.services;

import org.lehdev.game_list.dto.GameDTO;
import org.lehdev.game_list.dto.GameListDto;
import org.lehdev.game_list.dto.GameMinDTO;
import org.lehdev.game_list.entities.Game;
import org.lehdev.game_list.repositories.GameListRepository;
import org.lehdev.game_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        var result = gameListRepository.findAll();
        List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
        return dto;
    }
}
