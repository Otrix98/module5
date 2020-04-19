package com.example.module5

sealed class Result < out T, R> (defaultValue: T){
   data class Success <T, R> (val x: T) : Result <T, R> (1)
    data class Error <T, R> (val y: R): Result <T, R> (2)

    private var item: T = defaultValue
    fun getItem(): T{
        return item
    }
}

fun result (key: Int): Result <Int, String>  {
    val number: Result<Number, String>
    val any: Result<Any, String>

    if (key == 1) {
        return number.getItem()
    }
return
}