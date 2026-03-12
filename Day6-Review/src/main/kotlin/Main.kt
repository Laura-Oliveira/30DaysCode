package org.days.code

fun main()
{
    var testCasesQt:Int = readLine()!!.trim().toInt()

    for(count in 0 until testCasesQt)
    {
        var stringS:String = readLine()!!
        var listEven = mutableListOf<String>()
        var listOdd = mutableListOf<String>()

        for(countString in stringS.indices)
        {
            when(countString % 2)
            {
                0 -> listEven.add("${stringS[countString]}")
                1 -> listOdd.add("${stringS[countString]}")
            }
        }
        println("${listEven.joinToString("")} ${listOdd.joinToString("")}")
    }
}