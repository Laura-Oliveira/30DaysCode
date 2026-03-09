<div align="center"> 
	
# Kotlin 30 Days of Code — Day 3: Conditional Statements 
	
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
	
Solutions for **Day 3 – Conditional Statements** from the **HackerRank 30 Days of Code challenge**, implemented in **Kotlin**.

This exercise focuses on **conditional logic, control flow, and Kotlin's `when` expression** to evaluate numeric ranges and determine program output.

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

This repository contains the solution for **Day 3 – Conditional Statements from the HackerRank 30 Days of Code Challenge**, implemented using **Kotlin**.

The goal of the challenge is to evaluate an integer and determine whether it should be classified as **"Weird"** or **"Not Weird"** based on specific conditions.

The program performs the following logic:

- If **N is odd** → print **"Weird"**
- If **N is even and between 2 and 5** → print **"Not Weird"**
- If **N is even and between 6 and 20** → print **"Weird"**
- If **N is even and greater than 20** → print **"Not Weird"**

The input consists of a **single positive integer**.

📚 Official Challenge  
https://www.hackerrank.com/challenges/30-conditional-statements

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
    val N = readLine()!!.trim().toInt()

    if(N % 2 != 0)
    {
        println("Weird")
    }
    else
    {
        when(N)
        {
            in 2..5 -> println("Not Weird")
            in 6..20 -> println("Weird")
            else -> println("Not Weird")
        }
    }
}
```

---

## 🧠 Key Programming Concepts

- **Conditional Statements** — using if and when to control program flow
- **Modulo Operator** — determining whether a number is odd or even
- **Range Evaluation** — checking if values fall within defined intervals
- **Control Flow** — selecting the correct output based on multiple conditions

---

## 🧩 Kotlin Features Used

- readLine()
- trim()
- toInt()
- if expressions
- when expressions
- Range operators (..)
- Non-null assertion operator (!!)

---

## 🏗 Architecture

The solution is intentionally minimal, as typical in competitive programming.

| Component | Responsibility |
|---|---|
| `main()` | 📥 Reads input and evaluates conditions |

All logic is executed directly within main() to keep the solution concise and aligned with HackerRank challenge constraints.

---

## ⚙️ Design Decisions

Some engineering decisions made in this implementation:

- **Input contract assumption** — `readLine()!!` is used because the HackerRank environment guarantees that valid input will always be provided. This keeps the implementation concise and avoids unnecessary defensive checks in a controlled runtime.

- **Input normalization** — `trim()` ensures that any leading or trailing whitespace is removed before parsing values, preventing formatting inconsistencies from affecting the calculation.

- **Odd number detection** — the modulo operator % is used to determine whether the input number is odd or even.

- **Range-based branching** — Kotlin’s when expression combined with range operators (2..5, 6..20) provides a clear and readable way to evaluate interval conditions.

- **Deterministic output mapping** — each possible condition maps directly to a single output, ensuring predictable program behavior.

This approach keeps the implementation **simple, readable, and aligned with competitive programming best practices**.

---

## 📈 Complexity

Time Complexity: **O(1)**

Space Complexity: **O(1)**

The program performs a fixed number of operations regardless of input size.

---

## 📚 Learning Notes

This challenge reinforces fundamental programming concepts related to **control flow and conditional evaluation**.

Key takeaways include:
- ✔ Identifying odd and even numbers
- ✔ Applying conditional logic
- ✔ Evaluating numeric ranges
- ✔ Using Kotlin’s when expression for readable branching

These concepts are foundational for building robust **application logic**, particularly in **validation**, **business rules**, and **decision-making systems**.

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
