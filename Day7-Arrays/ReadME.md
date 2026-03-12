<div align="center"> 
	
# Kotlin 30 Days of Code — Day 7: Arrays
	
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
	
Solutions for **Day 7 – Arrays** from the **HackerRank 30 Days of Code challenge**, implemented in **Kotlin**.

This exercise focuses on **array manipulation and iteration**, reversing the order of elements from a given list of integers.

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

# 📌 Challenge Overview

This repository contains the solution for **Day 7 – Arrays from the HackerRank 30 Days of Code Challenge**, implemented using **Kotlin**.

The objective of this challenge is to **print the elements of an array in reverse order**.

The program performs the following steps:

1. Reads an integer `n`, representing the size of the array.
2. Reads a line containing `n` space-separated integers.
3. Stores the values in an array or list structure.
4. Reverses the order of the elements.
5. Prints the reversed sequence as a **single line of space-separated numbers**.

**Example Input:**

4

1 4 3 2

**Example Output:**

2 3 4 1

📚 **Official Challenge**  
https://www.hackerrank.com/challenges/30-arrays

---

# ⚡ Quick Start

Run the solution locally.

```bash
kotlinc Main.kt -include-runtime -d program.jar
java -jar program.jar
```

---

---

## 💡 Example Solution

```kotlin
fun main()
{
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!
        .trimEnd()
        .split(" ")
        .map{ it.toInt() }
        .toTypedArray()

    val reversedArray = arr.reversedArray()

    for(count in reversedArray.indices)
    {
        print("${reversedArray[count]} ")
    }
}
```

---

## 🧠 Key Programming Concepts

This challenge reinforces several important programming concepts:
- **Arrays and lists** — storing collections of integers
- **Iteration** — processing elements of a collection
- **Data transformation** — reversing element order
- **Input parsing** — converting strings into numeric values
- **Output formatting** — printing structured results

---

## 🧩 Kotlin Features Used

Key Kotlin features used in this implementation:
-	split() for parsing space-separated values
- map {} for transforming strings into integers
- reversed() for reversing list order
- trim() for whitespace normalization
- toInt() for numeric conversion
- Kotlin string interpolation ($variable)
- Non-null assertion operator (!!)

---

## 🏗 Architecture

The program is intentionally simple to match the competitive programming style used in HackerRank challenges.

| Component | Responsibility |
|---|---|
| `main()` | Handles input parsing and output generation |
| `split()` | Converts input string into individual values |
| `map()` | Transforms strings into integers |
| `reversed()` | Reverses the order of the array |
| `println()` | Prints formatted results |

All logic is implemented directly within main() to keep the solution concise and aligned with HackerRank challenge constraints.

---

## ⚙️ Design Decisions

Some engineering decisions made in this implementation:

- **Input contract assumption — readLine()!!** is used because the HackerRank environment guarantees that valid input will always be provided.
- **Input normalization — trim()** removes leading and trailing whitespace before parsing the integer.
- **Functional transformation — split() and map()** convert the raw input string into a structured list of integers.
- **Built-in list reversal — reversed()** leverages Kotlin’s standard library to simplify reversing operations.
- **Concise pipeline processing** — input parsing, transformation, and output formatting are chained together for readability and simplicity.

This approach keeps the solution **simple, readable, and aligned with competitive programming best practices**.

---

## 📈 Complexity

Time Complexity: **O(n)**

Where n is the number of elements in the array.

Space Complexity: **O(n)**

Additional space is used to store the array and its reversed representation.

---

## 📚 Learning Notes

This challenge reinforces **string traversal and index-based logic**, hich are common in algorithmic problem solving.

**Key takeaways:**
- ✔ Parsing arrays from input
- ✔ Transforming collections using functional operations
- ✔ Reversing data structures
- ✔ Formatting structured output

These techniques are fundamental for implementing **data processing pipelines**, **algorithm design**, and **efficient collection handling**.

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
