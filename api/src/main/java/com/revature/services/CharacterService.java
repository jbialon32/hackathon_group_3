package com.revature.services;

import com.revature.entities.Character;
import com.revature.repos.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }
    public Character saveCharacter(Character character){
        return characterRepository.save(character);
    }
}