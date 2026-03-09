package org.days.code

class Person(initialAge:Int)
{
   private var age:Int = 0

    init
    {
        if(initialAge < 0)
        {
            age = 0
            println("Age is not valid, setting age to 0.")
        }
        else
        { age = initialAge }
    }

    fun yearPasses() { age++ }

    fun amIOld()
    {
        when
        {
            age < 13 -> println("You are young.")
            age in 13..17 -> println("You are a teenager.")
            else -> println("You are old.")
        }
    }
}

fun main()
{
    val T:Int = readLine()!!.trim().toInt()

    for(count in 0 until T)
    {
        var age = readLine()!!.trim().toInt()
        val person = Person(age)
        person.amIOld()

        repeat(3)
        { person.yearPasses() }

        person.amIOld()
        println()
    }
}