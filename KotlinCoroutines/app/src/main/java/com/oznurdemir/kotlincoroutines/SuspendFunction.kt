package com.oznurdemir.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    // suspend fonksiyonlar -> içerisinde coroutine çalıştırılabilen fonksiyonlardır.
    runBlocking {
        delay(2000)
        println("run blocking")
        myFunction() // suspend fonksiyonlar ya suspend fonksiyonlar tarafından ya da coroutines fonksiyonlar tarafndan çağırılabilir.
    }

}

suspend fun myFunction(){
        coroutineScope {
            delay(4000)
            println("suspend function")
        }
}