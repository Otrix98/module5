package com.example.module5

fun main() {
    val listOfInt = listOf( 1, 2, 3, 4, 5, 6)
    val genericObject = GenericClass <Int> (listOfInt)

    val listOfDouble = listOf( 1.2, 2.5, 3.3, 4.1, 5.7, 6.2)
    val genericObject2 = GenericClass <Double> (listOfDouble)

}

class GenericClass <out T: Number> (defaultList: List<T>) {
    private var item: List<T> = defaultList
    fun getItem(): List<T> {
        return item
    }
}

fun even (x: GenericClass<Number>): List<Number>  {
    return  x.getItem().filter { it % 2 == 0 }
}
