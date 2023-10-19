package com.oznurdemir.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    //Dispatcher
    //Dispatcher.Default -> CPU Intensive
    //Dispatcher.IO -> Input / Output, Networking
    //Dispatcher.Main -> UI
    //Dispatcher.Unconfied -> Inherited dispatcher

    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("Default Unconfied: ${Thread.currentThread().name}")
        }
    }
}