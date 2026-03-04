package org.days.code

fun main()
{
    var helloWorld: String = "Hello, World."

    //prevents null or empty inputs
    var input: String? = readlnOrNull().orEmpty()

    //validate the inputs and require a value from the user
    require(!input.isNullOrBlank())
    {
        "Field cannot be null or blank."
    }

    print("$helloWorld\n$input")
}