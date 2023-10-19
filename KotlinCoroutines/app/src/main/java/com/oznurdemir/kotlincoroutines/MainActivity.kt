package com.oznurdemir.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Light Weights

        /*
            GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }
         */

        //Scope

        /*
        //runBlocking
        println("runBlocking start")
        runBlocking {
            launch {
                delay(5000)
                println("runBlockin run")
            }
        }
        println("runBlocking end")
        */

        /*
        //Global Scope
        println("Global Scope start")
        GlobalScope.launch {
            delay(5000)
            println("Global scope")
        }
        println("Global Scope end")
        */

        /*
        // CoroutineScope
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")
        */

        /*
        // Nested Coroutine
        println("coroutine start")
        runBlocking {
            launch {
                delay(5000)
                println("runblocking")
            }
            coroutineScope {
                delay(3000)
                println("coroutine scope")
            }
        }
        println("coroutine end")

         */

    }
}