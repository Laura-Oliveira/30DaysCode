<div align="center"> 
	
# Kotlin 30 Days of Code — Day 5: Loops 
	
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
	
Solutions for **Day 5 – Loops** from the **HackerRank 30 Days of Code challenge**, implemented in **Kotlin**.

This exercise focuses on **iteration and loop control structures**, using Kotlin loops to generate a multiplication table.

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

This repository contains the solution for **Day 5 – Loops from the HackerRank 30 Days of Code Challenge**, implemented using **Kotlin**.

The objective of this challenge is to generate the **first 10 multiples of a given integer** using a loop.

The program performs the following steps:

1. Reads an integer `n` from input.
2. Iterates from **1 to 10**.
3. Prints each multiplication result in the format:

Example output for `n = 3`:

3 x 1 = 3

3 x 2 = 6

3 x 3 = 9

3 x 4 = 12

3 x 5 = 15

3 x 6 = 18

3 x 7 = 21

3 x 8 = 24

3 x 9 = 27

3 x 10 = 30

📚 **Official Challenge**  
https://www.hackerrank.com/challenges/30-loops

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
    val n = readLine()!!.trim().toInt()
    var count:Int = 1

    for(count in count..10)
    {
        println("${n} x ${count}" + " = " + n * count)
    }
}
```

---

## 🧠 Key Programming Concepts

This challenge reinforces fundamental concepts related to loops and iteration:
- **For loops** — executing repeated operations
- **Multiplication tables** — applying arithmetic operations within loops
- **String interpolation** — formatting output strings
- **Deterministic iteration** — iterating over a fixed numeric range

---

## 🧩 Kotlin Features Used

Key Kotlin features used in this implementation:
- for loops with ranges
- Range operators (..)
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
| `main()` | 📥 Reads input and prints the multiplication table |
| `for loop` | Iterates through values 1–10 |
| `Output formatting` | Produces formatted multiplication results |

All logic is implemented directly within main() to keep the solution concise and aligned with HackerRank challenge constraints.

---

## ⚙️ Design Decisions

Some engineering decisions made in this implementation:

- **Input contract assumption — readLine()!!** is used because the HackerRank environment guarantees that valid input will always be provided.
- **Input normalization — trim()** removes leading and trailing whitespace before parsing the integer.
- **Deterministic iteration — the range 1..10** ensures the loop executes exactly ten times, matching the challenge specification.
- **String interpolation — Kotlin** string templates ("$n x $i = ${n * i}") provide a clean and readable way to format output.
- **Single-responsibility logic** — the program keeps all operations simple and sequential: read input → iterate → print results.

This approach keeps the implementation clean, predictable, and aligned with competitive programming best practices.

---

## 📈 Complexity

Time Complexity: **O(1)**

The loop always runs exactly 10 iterations, regardless of input value.

Space Complexity: **O(1)**

The program performs a fixed number of operations regardless of input size.

---

## 📚 Learning Notes

This challenge reinforces **iteration patterns** and **loop-based logic**.

**Key takeaways:**
- ✔ Using loops to repeat operations
- ✔ Generating multiplication tables
- ✔ Formatting structured output
- ✔ Iterating through numeric ranges

These concepts are fundamental for implementing **data processing**, **algorithm design**, and **control flow** in software systems.

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
