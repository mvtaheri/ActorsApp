package com.mohammad.actorsapp.repository

import com.mohammad.actorsapp.retrofit.Character
import com.mohammad.actorsapp.retrofit.CharacterApi

class CharacterRepository(val characterApi: CharacterApi) {

    suspend fun getCharacters(): List<Character> {
        return characterApi.getCharacters()
    }

}