<div align="center"> 
	
# Kotlin 30 Days of Code — Day 2: Operators 
	
</div>

<div align="center">

![Status](https://img.shields.io/badge/Status-In%20Progress-F28B50?style=plastic)
![Kotlin](https://img.shields.io/badge/Kotlin-2.0-purple?style=plastic&logo=kotlin)
![Platform](https://img.shields.io/badge/HackerRank-Challenge-green?style=plastic&logo=hackerrank)
![License](https://img.shields.io/badge/license-MIT-blue.svg?style=plastic)

</div>

<div align="center">

[![Last Commit](https://img.shields.io/github/last-commit/Laura-Oliveira/30DaysCode/main)](https://github.com/Laura-Oliveira/30DaysCode/commits/main)
[![Stars](https://img.shields.io/github/stars/Laura-Oliveira/30DaysCode?style=social)](https://github.com/Laura-Oliveira/30DaysCode/stargazers)
[![Forks](https://img.shields.io/github/forks/Laura-Oliveira/30DaysCode?style=social)](https://github.com/Laura-Oliveira/30DaysCode/fork)

</div>

<div align="center">
	
Solutions for **Day 2 – Operators** from the **HackerRank 30 Days of Code challenge**, implemented in **Kotlin**.

This exercise focuses on **arithmetic operations, rounding, and input validation**, highlighting clean, maintainable, and scalable coding practices.

</div>

<p align="center">
  <img src="https://media.licdn.com/dms/image/v2/D4E22AQE1s_iZXwEDnQ/feedshare-shrink_2048_1536/B4EZy_mWobJsAo-/0/1772741028738?e=1774483200&v=beta&t=D-pPz238_yfr0Pz8UPTwPvQbb_25YfPoaZ2n1SF0hgw" width="500"/>
</p>

---

# 📚 Table of Contents

- [📌 Challenge Overview](#-challenge-overview)
- [⚡ Quick Start](#-quick-start)
- [💡 Example Solution](#-example-solution)
- [🧠 Key Programming Concepts](#-key-programming-concepts)
- [🧩 Kotlin Features Used](#-kotlin-features-used)
- [🏗 Architecture](#-architecture)
- [⚙️ Design Decisions](#-design-decisions)
- [📈 Complexity](#-complexity)
- [📚 Learning Notes](#-learning-notes)
- [👩🏻‍💻 Author](#-author)
- [🔗 Connect with Me](#-connect-with-me)

---

## 📌 Challenge Overview

This repository contains the solution for **Day 2 – Operators from the HackerRank 30 Days of Code Challenge**, implemented using **Kotlin**.

The exercise focuses on:
- **Calculating total meal cost** including tip and tax  
- **Precise rounding** of floating-point operations  
- **Safe input parsing** and defensive coding  

The program reads:
- **meal price** (Double)  
- **tip percent** (Int)  
- **tax percent** (Int)  

It then computes the **total cost of the meal** and prints the rounded result.

**📚 Official Challenge**  
https://www.hackerrank.com/challenges/30-operators

---

## ⚡ Quick Start

Run the solution locally.

```bash
kotlinc Main.kt -include-runtime -d program.jar
java -jar program.jar
```
---

## 💡 Example Solution

```kotlin
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
```








