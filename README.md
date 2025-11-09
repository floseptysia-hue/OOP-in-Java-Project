# ☕ Kopi Panas House — Java OOP Project

Hi there! 👋  
Welcome to **Kopi Panas House**, a simple Java project built to demonstrate the four main pillars of 
**Object-Oriented Programming (OOP)** — **Encapsulation, Inheritance, Abstraction, and Polymorphism** — through a coffee shop ordering simulation.

---

## 🧩 Project Structure

com.assignment.oop
│
├── Constants.java     // Store static final values (like tax rate or messages)
├── DrinkOrder.java    // Handles drink orders (extends Order)
├── SnackOrder.java    // Handles snack orders (extends Order)
├── Customer.java      // Represents customer data (Encapsulation)
├── Person.java        // Superclass for Barista & Customer (Inheritance)
├── Order.java         // Abstract class defining basic order behavior (Abstraction)
└── Barista.java       // Child class with specific implementations (Polymorphism)

---

##  OOP Concepts Implemented

### Encapsulation
Implemented in `Customer.java`, where customer data (like name and order) are stored in **private fields** with getters and setters.

### Inheritance
`Barista` and `Customer` inherit from the superclass `Person`, sharing common attributes such as name and role.

### Abstraction
`Order` is defined as an **abstract class** that provides a general structure for making an order, later implemented by `DrinkOrder` and `SnackOrder`.

### Polymorphism
`Barista` demonstrates **polymorphism** by overriding methods to handle different types of orders dynamically (drinks, snacks, etc.).

---

## 💻 Sample Output

Halo, hari yang cerah! Saya Adi, barista shift Pagi. Selamat datang di Kopi Panas Houseya, mau pesan apa hari ini?
Barista Adi sedang menyiapkan Boba Latte, mohon ditunggu ya!
Barista Adi sedang menyiapkan Cheese Cake, mohon ditunggu ya!

Pesanan milik Flo:
- Boba Latte (Rp23000.0)
- Cheese Cake (Rp55000.0)

Subtotal: Rp78000.0
Pajak (10%) : Rp7800.0
Total yang harus dibayar sebesar: Rp85800.0

Terimakasih sudah berkunjung ke Kopi Panas House. Datang lagi dilain waktu ya, see you!


---

## ⚙️ How to Run

1. Open the project in **IntelliJ IDEA** or any Java IDE.  
2. Make sure **JDK 11+** is installed.  
3. Run `Main.java` inside the `com.assignment.oop` package.  
4. The output will appear in the console.

---

## Key Learnings

Through this project, I learned how to apply OOP in a real-world context.  
Each class represents a clear, single responsibility — making the system **modular, reusable, and easy to maintain.**

---

## About

This project is part of my Java OOP learning journey, combining real-life scenarios (like ordering coffee ☕) with programming fundamentals.  


Let's connect and exchange ideas! 🚀  
📩 **Email:** [floseptysia@gmail.com](mailto:floseptysia@gmail.com)  
💼 **LinkedIn:** www.linkedin.com/in/florida-s-qa

