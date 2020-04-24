package com.example.module5



fun main() {
    val listOfInt = listOf( 1, 2, 3, 4, 5, 6)
    val listOfDouble = listOf( 1.2, 2.5, 3.3, 4.1, 5.7, 6.2)

    val number: Result<Number, String> =  result(1, "message")
    val any: Result<Any, String> = result(2, "message")


    fun <T : Number> even(list : List<T>) : List<T>{
        val filteredList = mutableListOf<T>()
        for (i in 0 until list.size) {
            if (i % 2 == 0) {
                filteredList.add(list[i+1])
            }
        }

        return  filteredList
}

println("${even(listOfInt)}")
    println("${even(listOfDouble)}")

    println(number)
    println(any)


    val filtrationType1 = println("filtration")
    val queue = Queue<Int>()
    queue.queueFilter {filtrationType1}

}