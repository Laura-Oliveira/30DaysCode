<div align="center"> 
	
# Kotlin 30 Days of Code — Day 4: Class vs Instance 
	
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
	
Solutions for **Day 4 – Class vs Instance** from the **HackerRank 30 Days of Code challenge**, implemented in **Kotlin**.

This exercise focuses on **object-oriented programming concepts**, including **classes, constructors, encapsulation, and instance methods**.

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

This repository contains the solution for **Day 4 – Class vs Instance from the HackerRank 30 Days of Code Challenge**, implemented using **Kotlin**.

The goal of this challenge is to practice **object-oriented programming (OOP)** by implementing a class that models a person's age and determines their age category.

The program performs the following actions:

1. Creates a `Person` class with an age attribute.
2. Validates the initial age when the object is instantiated.
3. Classifies the person's age group.
4. Simulates the passing of years and re-evaluates the age category.

Age classification rules:

- **Age < 13** → `"You are young."`
- **Age between 13 and 17** → `"You are a teenager."`
- **Age ≥ 18** → `"You are old."`

If the initial age is negative, it is corrected to **0**.

**📚 Official Challenge**  
https://www.hackerrank.com/challenges/30-class-vs-instance

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
class Person(initialAge:Int)
{
   private var age:Int = 0

    init
    {
        if(initialAge < 0)
        {
            age = 0
            println("Age is not valid, setting age to 0.")
        }
        else
        { age = initialAge }
    }

    fun yearPasses() { age++ }

    fun amIOld()
    {
        when
        {
            age < 13 -> println("You are young.")
            age in 13..17 -> println("You are a teenager.")
            else -> println("You are old.")
        }
    }
}

fun main()
{
    val T:Int = readLine()!!.trim().toInt()

    for(count in 0 until T)
    {
        var age = readLine()!!.trim().toInt()
        val person = Person(age)
        person.amIOld()

        repeat(3)
        { person.yearPasses() }

        person.amIOld()
        println()
    }
}
```

---

## 🧠 Key Programming Concepts

This challenge introduces core object-oriented programming concepts:
- **Classes and Objects** — modeling real-world entities
- **Constructors** — initializing object state
- **Encapsulation** — protecting data using private variables
- **Instance Methods** — behavior associated with object state
- **State Mutation** — modifying object properties over time

---

## 🧩 Kotlin Features Used

Key Kotlin features used in this implementation:
- Classes and constructors
- init initialization block
- private property encapsulation
- when expressions
- Range operators (..)
- repeat() function
- for loops with ranges
- readLine() for input parsing
- Non-null assertion operator (!!)

---

## 🏗 Architecture

The program is intentionally simple to match the competitive programming style used in HackerRank challenges.

| Component | Responsibility |
|---|---|
| `Person class` | Encapsulates age state and behavior
 |
| `main()` | 📥 Reads input and evaluates conditions |
| `yearPasses()` | Simulates aging |
| `amIOld()` | Determines the age category |
| `main()` | Handles input and program flow |

The **Person class contains all business logic**, while the **main** function is responsible for **input processing and test execution**.

---

## ⚙️ Design Decisions

Some engineering decisions made in this implementation:

- **Constructor validation** — the constructor checks whether the provided age is negative. If so, the value is reset to `0` and a message is printed, ensuring that the object always starts in a valid state.

- **Encapsulation of state** — the `age` property is declared as `private`, preventing external modification and protecting the internal state of the `Person` object.

- **Controlled state mutation** — the `yearPasses()` method is responsible for incrementing the age. This keeps all state changes explicit and contained within the class behavior.

- **Range-based branching** — Kotlin’s `when` expression combined with range operators (`13..17`) provides a clear and expressive way to evaluate age categories.

- **Deterministic behavior** — each age range maps directly to a single output message, ensuring consistent and predictable program behavior.

This approach keeps the implementation **simple, readable, and aligned with object-oriented design principles and competitive programming practices**.

---

## 📈 Complexity

Time Complexity: **O(1)**

Space Complexity: **O(1)**

The program performs a fixed number of operations regardless of input size.

---

## 📚 Learning Notes

This challenge reinforces **object-oriented thinking** by modeling a real-world concept using a class.

**Key takeaways:**

- ✔ Creating classes and constructors  
- ✔ Encapsulating state with private variables  
- ✔ Implementing object behavior with methods  
- ✔ Updating object state over time  

These concepts are essential for building **scalable software systems**, especially in **Android development and backend applications**.

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
