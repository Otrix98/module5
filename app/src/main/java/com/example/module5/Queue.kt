package com.example.module5

class Queue <T> {
    var queue = mutableListOf<T>()

    fun enqueue(item: T) {
        queue.add(queue.lastIndex, item)
    }

    fun dequeue(): T? {
        if (queue.size == 0) {
            return null
        } else {
            return queue.removeAt(0)
        }
    }
}