package org.days.code

fun main()
{
    val helloWorld: String = "Hello, World."

    //prevents null or empty inputs
    val input: String = readlnOrNull().orEmpty().trim()

    //validate the inputs and require a value from the user
    require(input.isNotBlank())
    {
        "Field cannot be null or blank."
    }

    print("$helloWorld\n$input")
}