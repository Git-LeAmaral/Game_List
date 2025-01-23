package org.lehdev.game_list.repositories;

import org.lehdev.game_list.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
