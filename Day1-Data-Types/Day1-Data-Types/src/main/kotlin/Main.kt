package org.days.code

fun main()
{
    val inputInt:Int? = readlnOrNull()?.trim()?.toIntOrNull() ?: 0
    val inputDouble:Double? = readlnOrNull()?.trim()?.toDoubleOrNull() ?: 0.0
    val inputString:String = readlnOrNull().orEmpty().trim()

    combineData(inputInt, inputDouble, inputString)
}

fun combineData(inputInt:Int?, inputDouble:Double?, inputString:String)
{
    val dataInt:Int = 4
    val dataDouble:Double = 4.0
    val dataString:String = "HackerRank "
    val isValid = validateFields(inputInt, inputDouble, inputString)
 
    if(dataInt != null && dataDouble != null && dataString.isNotBlank())
    {
        println("Fields cannot be null or empty")
    }
    else
    {
        val outputInt:Int = dataInt + inputInt!!
        val outputDouble:Double = dataDouble + inputDouble!!
        val outputString:String = dataString + inputString

        println(outputInt)
        println(outputDouble)
        println(outputString)
    }
}

//Validate Null or Blank Inputs. Requires a Valid Data Input
private fun validateFields(inputInt: Int?, inputDouble: Double?, inputString: String): Boolean
{
    return (inputInt != null && inputDouble != null && inputString.isNotBlank())
}