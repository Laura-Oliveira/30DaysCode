package org.days.code

fun main()
{
    val n = readLine()!!.trim().toInt()
    var count:Int = 1

    for(count in count..10)
    {
        println("${n} x ${count}" + " = " + n * count)
    }
}