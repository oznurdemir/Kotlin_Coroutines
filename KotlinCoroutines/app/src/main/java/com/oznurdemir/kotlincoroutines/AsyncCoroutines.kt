package com.oznurdemir.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    var userName = ""
    var userAge = 0
    runBlocking {
        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()
        userAge = downloadedAge.await()

        println("${userName} ${userAge}")
    }
}

suspend fun downloadName() : String{
    delay(2000)
    val userName = "Nur: "
    println("User name downloaded.")
    return userName
}

suspend fun downloadAge() : Int{
    delay(4000)
    val userAge = 22
    println("User age downloaded.")
    return userAge
}