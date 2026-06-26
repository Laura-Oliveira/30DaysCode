package org.days.code

fun main()
{
    val inputData = readlnOrNull()?.trim()?.toIntOrNull() ?: 0

    for(count in 1..inputData)
    {
        println("$inputData x $count" + " = " + (inputData * count))
    }
}