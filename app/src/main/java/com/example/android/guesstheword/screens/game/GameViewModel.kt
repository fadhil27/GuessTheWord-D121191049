package com.example.android.guesstheword.screens.game

class GameViewModel {
    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }


    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }
}
}