package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ScoreViewModelFactory(private val finalScore: Int, private val lastWord: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)){
            return ScoreViewModel(finalScore, lastWord) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

class ScoreViewModel(finalScore: Int, lastWord: String) : ViewModel() {
    var score = finalScore
    var word = lastWord

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore and last word is $lastWord")
    }
}