package com.oznurdemir.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    runBlocking {
        // aynı launch içerisinde farklı contextlerde işlemler yaptırabiliriz.
        launch(Dispatchers.Default) {
            println("Default: ${coroutineContext}")

            withContext(Dispatchers.IO) {
                println("IO: ${coroutineContext}")
            }
        }
    }
}