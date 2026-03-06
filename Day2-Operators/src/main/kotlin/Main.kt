package org.days.code

import kotlin.math.roundToInt

fun main()
{
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit
{
    val tip = (meal_cost * tip_percent) / 100
    val tax = (meal_cost * tax_percent) / 100
    var totalCost = (meal_cost + tip + tax).roundToInt()

    println(totalCost)
}