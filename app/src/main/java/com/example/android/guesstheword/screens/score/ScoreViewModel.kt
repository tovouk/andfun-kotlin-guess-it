package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int): ViewModel() {

    private var _finalScore = MutableLiveData<Int>()
    val finalScore : LiveData<Int>
        get() = _finalScore

    private var _playAgain = MutableLiveData<Boolean>()
    val playAgain : LiveData<Boolean>
        get() = _playAgain

    init {
        Log.i("ScoreViewModel","Final Score is $finalScore")
        _playAgain.value = false
        _finalScore.value = finalScore
    }

    fun onPlayAgainPressed(){
        _playAgain.value = true
    }

    fun resetPlayAgain(){
        _playAgain.value = false
    }

}