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

    //Do I need to use the result somewhere else?
        //If yes -> return type + return statement
        //If not -> returns Unit value by default
    //2 Categories:
        //Perform Action: print, increment, save -> it don't need result statement
        //Produces Value: calculate, get, convert -> it need a result statement

    //Void Function, Unit Data Type implied
    fun yearPasses() { age++ }

    //Void Function, Unit Data Type implied
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
    //readlnOrNull() -> reads the line, returns null if there's no input
    // ?. -> only calls the next function if the value is not null
    //.? only calls the next function it's not null
    // ?: -> Elvis Operator, If the result is null, use 0 instead
    val inputData:Int = readlnOrNull()?.trim()?.toInt() ?: 0

    for(count in 0..inputData)
    {
        val personAge = readLine()!!.trim().toInt()
        val person = Person(personAge)
        person.amIOld()

        repeat(count)
        { person.yearPasses() }

        person.amIOld()
        println()
    }
}