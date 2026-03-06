<div align="center"> 
	
# Kotlin 30 Days of Code — Day 0: Hello World 
	
</div>

<div align="center">

![Status](https://img.shields.io/badge/Status-Completed-4CAF50?style=plastic)
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
	
Solution for **Day 0 – Hello World** from the **HackerRank 30 Days of Code challenge**, implemented in **Kotlin**.

This exercise focuses on **basic input/output, Kotlin null-safety, and input validation patterns**.

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

This repository contains the solution for **Day 0 – Hello World from the HackerRank 30 Days of Code Challenge**, implemented using **Kotlin**.

The goal of the challenge is simple by design:

Print: Hello, World.

Followed by any **user input read from standard input**.

Even though the exercise is intentionally simple, it provides an opportunity to practice:

- **Console input handling**
- **Kotlin null-safety**
- **Basic validation patterns**
- **Writing clean and intentional code**

**📚 Official Challenge**  
https://www.hackerrank.com/domains/tutorials/30-days-of-code

---

# ⚡ Quick Start

Run the solution locally.

```bash
kotlinc Main.kt -include-runtime -d program.jar
java -jar program.jar
```

---

# 💡 Example Solution

```kotlin
package org.days.code

fun main()
{
    var helloWorld: String = "Hello, World."

    // prevents null or empty inputs
    var input: String? = readlnOrNull().orEmpty()

    // validate the inputs and require a value from the user
    require(!input.isNullOrBlank())
    {
        "Field cannot be null or blank."
    }

    print("$helloWorld\n$input")
}
```
---

# 🧠 Key Programming Concepts

**Input / Output**
- Console input
- Standard output printing

**Validation**
- Ensuring required input
- Defensive programming

**Kotlin Null Safety**
- Nullable types
- Safe handling of user input

---

# 🧩 Kotlin Features Used

- readlnOrNull()
- orEmpty()
- require()
- Nullable types (?)
- String interpolation

---

# 🏗 Architecture

The solution is intentionally minimal but still structured clearly.

| Component | Responsibility |
|---|---|
| `main()` | 📥 Reads user input and prints output |
| `require()` | ✅ Validates input and enforces constraints |

---

# ⚙️ Design Decisions

Some **engineering decisions** made in this implementation:

- **Explicit type declarations** were used for clarity.
- r**eadlnOrNull()** prevents runtime crashes if no input is provided.
- **orEmpty()** ensures the variable never becomes null.
- **require()** enforces validation and fails fast when input is invalid.

These decisions help demonstrate **intentional coding practices**, even in a simple program.

---

# 📈 Complexity

Time Complexity: **O(1)**
Space Complexity: **O(1)**

The program performs a constant number of operations regardless of input size.

---

## 📚 Learning Notes

Even simple exercises are valuable opportunities to practice clean and safe Kotlin code.

This implementation focuses on:
- ✔ Safe input parsing
- ✔ Kotlin null-safety
- ✔ Basic validation patterns
- ✔ Clear and readable code

Small problems are a great place to **build strong engineering habits**.

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
