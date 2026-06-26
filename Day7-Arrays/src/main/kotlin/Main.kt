package org.days.code

fun main()
{
    val loopCounts:Int = readlnOrNull()?.trim()?.toIntOrNull() ?: 0

    repeat(loopCounts)
    {
        val inputArray: Array<Int> = readlnOrNull()
            ?.trim()
            ?.split(" ")
            ?.mapNotNull { it.toIntOrNull() }
            ?.toTypedArray() //returns Array<Int>
            ?: emptyArray<Int>() //returns a Array<Int> with 0 elements

        //Reverse the Array order, and elements joined with spaces, instead of comma
        println(inputArray.reversedArray().joinToString(" "))
    }

    //.toIntArray()
    // returns type List<Int>
    //.toTypedArray()
    //returns type Array<Int>
}