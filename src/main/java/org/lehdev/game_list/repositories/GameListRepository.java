package org.lehdev.game_list.repositories;

import org.lehdev.game_list.entities.Game;
import org.lehdev.game_list.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
