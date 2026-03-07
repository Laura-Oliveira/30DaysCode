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

---

## 🧠 Key Programming Concepts

- **Arithmetic Operations:** Addition, multiplication, percentage calculation
- **Rounding:** Converting floating-point total cost to nearest integer
- **Separation of Concerns:** solve() handles business logic, main() handles input

---

## 🧩 Kotlin Features Used

- readLine()
- trim()
- toDouble()
- toInt()
- roundToInt()
- Non-null assertion operator (!!)

---

## 🏗 Architecture

The solution was structured to separate responsibilities into small functions:
| Component | Responsibility |
|---|---|
| `main()` | 📥 Reads and parses input |
| `solve()` | ⚙️ Performs the cost calculation |

This approach improves:
- Readability
- Maintainability

---

## ⚙️ Design Decisions

Some engineering decisions made in this implementation:

- **Input contract assumption** — `readLine()!!` is used because the HackerRank environment guarantees that valid input will always be provided. This keeps the implementation concise and avoids unnecessary defensive checks in a controlled runtime.

- **Input normalization** — `trim()` ensures that any leading or trailing whitespace is removed before parsing values, preventing formatting inconsistencies from affecting the calculation.

- **Deterministic numeric parsing** — `toDouble()` and `toInt()` are used for direct type conversion, ensuring predictable numeric inputs for the calculation pipeline.

- **Separation of concerns** — the `solve()` function encapsulates the core calculation logic, while `main()` is responsible only for input handling and orchestration.

- **Single-point rounding strategy** — `roundToInt()` is applied only to the final computed value, ensuring arithmetic precision throughout the calculation and producing a deterministic integer output.

This structure keeps the solution **clear, deterministic, and aligned with common competitive programming practices**, while still reflecting principles used in production-grade software design.

---

## 📈 Complexity

Time Complexity: **O(1)**

Space Complexity: **O(1)**

The program performs a fixed number of operations regardless of input size.

---

## 📚 Learning Notes

Even small algorithmic exercises are valuable opportunities to reinforce key engineering principles.

This challenge reinforces:
- ✔ Correct Arithmetic Calculations
- ✔ Input Parsing
- ✔ Code Organization
- ✔ Clean Separation of Logic

These practices are essential when building **production-grade mobile applications**, especially when dealing with **financial** or **transactional data**.
  
---

## 👩🏻‍💻 Author

**Laura Oliveira**  
Android Engineer | Kotlin Developer

I build **modern Android applications using Kotlin/Java**, focusing on **clean architecture, scalability, and high-quality code**.

### 🔧 Core Skills

- Kotlin
- Java
- Android SDK
- MVVM Architecture
- Coroutines & Concurrency
- Firebase
- REST APIs

🌍 Open to international opportunities

Remote • Hybrid • Relocation

---

## 🔗 Connect with Me

💼 **LinkedIn:** https://www.linkedin.com/in/laura-oliveira-mobile/

🌐 **Portfolio:** https://laura-oliveira.github.io/

📧 **Email:** laura.oliveira.tech@gmail.com

---

⭐ If you find this project helpful, consider **giving it a star!**

---

#30DaysOfCode #Kotlin #Algorithms #ProblemSolving #SoftwareEngineering
