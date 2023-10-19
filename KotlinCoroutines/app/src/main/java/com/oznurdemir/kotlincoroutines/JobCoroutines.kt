package com.oznurdemir.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        val myJob = launch {
            delay(2000)
            println("myjob")
            val myJob2 = launch {
                println("myJob2")
            }

        }

        myJob.invokeOnCompletion {
            println("myJob ended.")
        }
        myJob.cancel()
    }
}