package com.example.module5



fun main() {
    val listOfInt = listOf( 1, 2, 3, 4, 5, 6)
    val listOfDouble = listOf( 1.2, 2.5, 3.3, 4.1, 5.7, 6.2)


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


}