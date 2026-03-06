# Kotlin 30 Days of Code — Day 1: Data Types

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
	
Solutions for **Day 1 – Data Types** from the **HackerRank 30 Days of Code challenge**, implemented in **Kotlin**.

This exercise focuses on **primitive data types, safe input parsing, and Kotlin null-safety patterns**.

</div>

<p align="center">
  <img src="https://media.licdn.com/dms/image/v2/D4E22AQE1s_iZXwEDnQ/feedshare-shrink_2048_1536/B4EZy_mWobJsAo-/0/1772741028738?e=1774483200&v=beta&t=D-pPz238_yfr0Pz8UPTwPvQbb_25YfPoaZ2n1SF0hgw" width="500"/>
</p>

---

# 📚 Table of Contents

- [Challenge Overview](#-challenge-overview)
- [Quick Start](#-quick-start)
- [Example Solution](#-example-solution)
- [Key Programming Concepts](#-key-programming-concepts)
- [Kotlin Features Used](#-kotlin-features-used)
- [Architecture](#-architecture)
- [Design Decisions](#-design-decisions)
- [Complexity](#-complexity)
- [Learning Notes](#-learning-notes)
- [Author](#-author)

---

## 📌 Challenge Overview

Part of the **30 Days of Code challenge by HackerRank**.

The goal of this exercise is to practice **working with primitive data types and input parsing** while reinforcing **Kotlin null-safety patterns**.

The program reads:

- an **Int**
- a **Double**
- a **String**

Then combines them with predefined values and prints the results.

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
    var inputInt:Int? = readlnOrNull()?.toIntOrNull()
    var inputDouble:Double? = readlnOrNull()?.toDoubleOrNull()
    var inputString:String = readlnOrNull().orEmpty()

    combineData(inputInt, inputDouble, inputString)
}

// Validate Null or Blank Inputs
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

        println(outputInt)
        println(outputDouble)
        println(outputString)
    }
}
```
---

## 🧠 Key Programming Concepts

**Data Types**
- Int
- Double
- String

**Input Handling**
- Console input parsing
- Safe conversions

**Kotlin Null Safety**
- Nullable types
- Defensive programming

---

## 🧩 Kotlin Features Used

- readlnOrNull()
- toIntOrNull()
- toDoubleOrNull()
- orEmpty()
- Nullable types (?)
- Non-null assertion (!!)

---

## 🏗 Architecture

The solution was structured to separate responsibilities into small functions:
| Component | Responsibility |
|---|---|
| `main()` | 📥 Reads and parses input |
| `validateFields()` | ✅ Ensures inputs are valid |
| `combineData()` | ⚙️ Performs the core logic |

This approach improves:
- Readability
- Maintainability
- Defensive programming
  
---

## ⚙️ Design Decisions

Some engineering decisions made in this implementation:
	•	**readlnOrNull()** was used to prevent runtime crashes when input is missing.
	•	**toIntOrNull()** and toDoubleOrNull() allow safe parsing without exceptions.
	•	**Validation logic was separated from business** logic to keep functions focused.
	• **Defensive programming** ensures the program handles invalid input gracefully.

This structure keeps the code **clean**, **predictable**, and **maintainable**.

---

## 📈 Complexity

Time Complexity: **O(1)**
Space Complexity: **O(1)**

The program performs a fixed number of operations regardless of input size.

---

## 📚 Learning Notes

Even simple exercises are valuable opportunities to practice clean and safe Kotlin code.

This implementation focuses on:
- ✔ Safe input parsing
- ✔ Kotlin null-safety
- ✔ Separation of validation and processing logic
- ✔ Writing clear and maintainable functions
  
---

## 👩‍💻 Author

Laura Oliveira

Android Developer | Kotlin | Mobile Engineering

**🔗LinkedIn:** https://www.linkedin.com/in/laura-oliveira

**💻GitHub:** https://github.com/Laura-Oliveira

---







