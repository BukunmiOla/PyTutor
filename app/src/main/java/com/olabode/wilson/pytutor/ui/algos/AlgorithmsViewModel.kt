package com.olabode.wilson.pytutor.ui.algos

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.olabode.wilson.pytutor.repository.main.algo.AlgorithmRepository

/**
 *   Created by OLABODE WILSON on 9/29/20.
 */
class AlgorithmsViewModel @ViewModelInject constructor(
        algorithmRepository: AlgorithmRepository
) : ViewModel() {

    val algorithms = algorithmRepository
            .fetchAllAlgorithms()
            .asLiveData()
}