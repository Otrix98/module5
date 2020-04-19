package com.example.module5

class Queue <T> {
    var queue = mutableListOf<T>()

    fun enqueue(item: T) {
        queue.remove(item)
        queue.add(queue.lastIndex, item)
    }

    fun dequeue(): T? {

       val first =  queue.firstOrNull()
        queue.remove(queue.firstOrNull())
        return first
    }
}