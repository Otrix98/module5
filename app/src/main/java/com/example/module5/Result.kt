package com.example.module5

import java.lang.Error

sealed class Result < out T, R> {
    data class Success<T, R> (val success : T): Result<T, R>()
    data class Error <T, R> (val error: R): Result <T, R> ()
}

fun result (key: Int, message: String): Result <Int, String> {

    if (key == 1) {
        return Result.Success(key)
    } else return Result.Error(message)
}

