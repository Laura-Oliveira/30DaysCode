package org.days.code

fun main()
{
<<<<<<< HEAD
    var inputInt: Int? = readlnOrNull()?.toIntOrNull()
    var inputDouble: Double? = readlnOrNull()?.toDoubleOrNull()
    var inputString: String = readlnOrNull().orEmpty()
=======
    var inputInt:Int? = readlnOrNull()?.toIntOrNull()
    var inputDouble:Double? = readlnOrNull()?.toDoubleOrNull()
    var inputString:String = readlnOrNull().orEmpty()
>>>>>>> main

    combineData(inputInt, inputDouble, inputString)
}

//Validate Null or Blank Inputs. Requires a Valid Data Input
<<<<<<< HEAD
private fun validateFields(inputInt: Int?, inputDouble: Double?, inputString: String): Boolean
{ return (inputInt != null && inputDouble != null && inputString.isNotBlank()) }

fun combineData(inputInt: Int?, inputDouble: Double?, inputString: String)
{
    val dataInt: Int = 4
    val dataDouble: Double = 4.0
    val dataString: String = "HackerRank "
    val isValid = validateFields(inputInt, inputDouble, inputString)

    if (!isValid)
    { println("Fields cannot be null or empty") }
    else
    {
        val outputInt: Int = dataInt + inputInt!!
        val outputDouble: Double = dataDouble + inputDouble!!
        val outputString: String = dataString + inputString
=======
private fun validateFields(inputInt:Int?, inputDouble:Double?, inputString:String):Boolean
{
    return (inputInt != null && inputDouble != null && inputString.isNotBlank())
}

fun combineData(inputInt:Int?, inputDouble:Double?, inputString:String)
{
    val dataInt:Int = 4
    val dataDouble:Double = 4.0
    val dataString:String = "HackerRank "
    val isValid = validateFields(inputInt, inputDouble, inputString)

    if(!isValid)
    {
        println("Fields cannot be null or empty")
    }
    else
    {
        val outputInt:Int = dataInt + inputInt!!
        val outputDouble:Double = dataDouble + inputDouble!!
        val outputString:String = dataString + inputString
>>>>>>> main

        println(outputInt)
        println(outputDouble)
        println(outputString)
    }
}