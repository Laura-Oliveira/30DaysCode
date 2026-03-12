package org.days.code

fun main()
{
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!
        .trimEnd()
        .split(" ")
        .map{ it.toInt() }
        .toTypedArray()

    val reversedArray = arr.reversedArray()

    for(count in reversedArray.indices)
    {
        print("${reversedArray[count]} ")
    }
}