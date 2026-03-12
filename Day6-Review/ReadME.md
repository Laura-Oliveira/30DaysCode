<div align="center"> 
	
# Kotlin 30 Days of Code — Day 6: Let's Review
	
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
	
Solutions for **Day 6 – Let's Review** from the **HackerRank 30 Days of Code challenge**, implemented in **Kotlin**.

This exercise focuses on **string manipulation and index-based iteration**, separating characters based on **even and odd indices**.

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

This repository contains the solution for **Day 6 – Let's Review from the HackerRank 30 Days of Code Challenge**, implemented using **Kotlin**.

The objective of this challenge is to **separate characters of a string based on their index parity**.

The program performs the following steps:

1. Reads an integer `T` representing the number of test cases.
2. For each test case, reads a string `S`.
3. Iterates through the string characters.
4. Separates characters into two groups:
   - **Even-indexed characters**
   - **Odd-indexed characters**
5. Prints both groups separated by a space.

**Example input:**

2

Hacker

Rank

**Example output:**

Hce akr

Rn ak

---

# ⚡ Quick Start

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
    var testCasesQt:Int = readLine()!!.trim().toInt()

    for(count in 0 until testCasesQt)
    {
        var stringS:String = readLine()!!
        var listEven = mutableListOf<String>()
        var listOdd = mutableListOf<String>()

        for(countString in stringS.indices)
        {
            when(countString % 2)
            {
                0 -> listEven.add("${stringS[countString]}")
                1 -> listOdd.add("${stringS[countString]}")
            }
        }
        println("${listEven.joinToString("")} ${listOdd.joinToString("")}")
    }
}
```

---

## 🧠 Key Programming Concepts

This challenge reinforces several important programming concepts:
- **String iteration** — traversing characters within a string
- **Index-based logic** — identifying even and odd positions
- **Modulo operator** — determining parity of indices
- **Loop control structures** — processing multiple test cases
- **Output formatting** — combining results into structured output

---

## 🧩 Kotlin Features Used

Key Kotlin features used in this implementation:
-	repeat() function for iterating test cases
- for loops with indices
- readLine() for input parsing
- trim() for whitespace normalization
- toInt() for numeric conversion
- Kotlin string interpolation ($variable)
- Non-null assertion operator (!!)

---

## 🏗 Architecture

The program is intentionally simple to match the competitive programming style used in HackerRank challenges.

| Component | Responsibility |
|---|---|
| `main()` | Handles input processing and program flow |
| `repeat()` | Executes the logic for each test case |
| `for (i in text.indices)` | Iterates through characters of the string |
| `Parity logic` | Separates even and odd indexed characters |
| `println()` | Prints formatted results |

All logic is implemented directly within main() to keep the solution concise and aligned with HackerRank challenge constraints.

---

## ⚙️ Design Decisions

Some engineering decisions made in this implementation:

- **Input contract assumption — readLine()!!** is used because the HackerRank environment guarantees that valid input will always be provided.
- **Input normalization — trim()** removes leading and trailing whitespace before parsing the integer.
- **Index-based traversal — using text.indices** ensures safe iteration across all characters in the string.
- **Parity detection with modulo — the % operator** is used to determine whether an index is even or odd.
- **Deterministic output structure** — each string is always split into two predictable groups: even-indexed characters followed by odd-indexed characters.
- **String interpolation — Kotlin** string templates ("${listEven.joinToString("")} ${listOdd.joinToString("")}") provide a clean and readable way to format output.
- **Single-responsibility logic** — the program keeps all operations simple and sequential: read input → iterate → print results.

This approach keeps the solution **simple, readable, and aligned with competitive programming best practices**.

---

## 📈 Complexity

Time Complexity: **O(n)**

Where n is the length of the input string.

Space Complexity: **O(n)**

Additional space is used to store the separated even and odd characters.

---

## 📚 Learning Notes

This challenge reinforces **string traversal and index-based logic**, hich are common in algorithmic problem solving.

**Key takeaways:**
- ✔ Iterating through string indices
- ✔ Identifying even and odd positions
- ✔ Splitting data based on conditions
- ✔ Formatting structured output

These concepts are fundamental for solving problems involving **text processing**, **data transformation**, and **algorithm design**.

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
