package org.days.code

fun main()
{
    val testCasesQt = readlnOrNull()?.trim()?.toIntOrNull() ?: 0

    repeat(testCasesQt)
    {
        val inputString = readlnOrNull()?.trim() ?: ""

        // filterIndexed iterates each character with its index, keeping only the ones where the condition is true
        //
        // input.filterIndexed { index, _ -> index % 2 == 0 }
        //              │        │     │         └── condition: is the index even?
        //              │        │     └── the character (ignored, so written as _)
        //              │        └── the position of the character (0, 1, 2...)
        //              └── iterate through each character with its index
        val listEven = inputString.filterIndexed { testCasesQt, _ -> testCasesQt % 2 == 0  }
        val listOdd = inputString.filterIndexed { testCasesQt, _ -> testCasesQt % 2 != 0  }

        println("$listEven, $listOdd")
    }
}