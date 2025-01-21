package com.devsuperior.dslist.dto.mapper;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface GameMapper {

    Optional<Game> optionalToGameDto(Optional<Game> game);
    Game toEntity(GameDTO gameDto);
    GameDTO toDto(Game game);
    GameMinDTO gameToMinDto(Game game);
    GameMinDTO gameDtoToMinDto(GameDTO gameDto);
}
