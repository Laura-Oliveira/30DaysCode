package org.days.code

import kotlin.math.roundToInt

fun main()
{
    val meal_cost: Double = readlnOrNull()?.trim()?.toDoubleOrNull() ?: 0.0
    val tip_percent: Int = readlnOrNull()?.trim()?.toIntOrNull() ?: 0
    val tax_percent: Int = readlnOrNull()?.trim()?.toIntOrNull() ?: 0

    solve(meal_cost, tip_percent, tax_percent)
}

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit
{
    val tip = (meal_cost * tip_percent) / 100
    val tax = (meal_cost * tax_percent) / 100
    val totalCost = (meal_cost + tip + tax).roundToInt()

    println(totalCost)
}