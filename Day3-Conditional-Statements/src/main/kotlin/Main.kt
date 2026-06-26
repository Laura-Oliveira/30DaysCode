package org.days.code
import kotlin.io.*
import kotlin.text.*

fun main()
{
    val inputData = readlnOrNull()?.trim()?.toInt() ?: 0

    if(inputData % 2 != 0)
    {
        println("Weird")
    }
    else
    {
        when(inputData)
        {
            in 2..5 -> println("Not Weird")
            in 6..20 -> println("Weird")
            else -> println("Not Weird")
        }
    }
}