# QuickFood — Console Order Manager (Java)

A **Java console application** that captures customer details and order items, calculates totals (including delivery fees and discounts), and prints a neat invoice/receipt. This project demonstrates clean object‑oriented design, validation, and defensive programming.

## Table of Contents
- [About](#about)
- [Features](#features)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Credits](#credits)

## About
QuickFood streamlines small take‑away orders by guiding the user through customer information, item selection, and summary totals. It focuses on correctness (defensive input validation) and maintainability (classes for `Customer`, `Order`, `OrderItem`, etc.).

### Why it matters
- Reinforces **Java fundamentals** (classes, lists, loops, methods).
- Demonstrates **defensive programming** (no blank fields, proper phone number validation).
- Produces a clear **invoice** suitable for printing or saving.

## Features
- Add multiple items per order (name, quantity, unit price)
- Auto‑calculations: line totals, subtotal, optional delivery, discounts
- Defensive validation (no empty names, numeric quantity/price, sensible ranges)
- Pretty **invoice output** with totals

## Project Structure
> If your structure differs, update this section after upload.
```
src/
  Main.java
  models/
    Customer.java
    Order.java
    OrderItem.java
  utils/
    Validator.java
```

## Installation

### Prerequisites
- Java 17+ (recommended) or Java 11+
- Git (optional)

### Build & Run (CLI)
```bash
# 1) Clone or download the repository
git clone <your-repo-url> quickfood
cd quickfood

# 2) Compile (classic javac)
javac -d out $(find src -name "*.java")

# 3) Run
java -cp out Main
```

### Build a runnable JAR (optional)
```bash
# Using plain jar tools (adjust Main-Class if your package name differs)
echo "Main-Class: Main" > manifest.txt
jar cfm quickfood.jar manifest.txt -C out .

# Run the JAR
java -jar quickfood.jar
```

## Usage
At startup, the app prompts for **customer** info and **order items** (repeat until done).
- Phone validation example: must be **10 digits** (South Africa) or match `^\+?\d{10,15}$`.
- Blank names/addresses are **rejected** with a helpful message.

Example session:
```
Welcome to QuickFood
Customer name: Thandi Ndlovu
Phone (digits only): 0831234567
Address: 123 Main Rd, Mokopane

Add item? (y/n): y
Item name: Kota
Quantity: 2
Unit price (ZAR): 35

Add item? (y/n): y
Item name: Chips (Large)
Quantity: 1
Unit price (ZAR): 28

Add delivery? (y/n): y
Delivery fee (ZAR): 30

----- INVOICE -----
Customer: Thandi Ndlovu  |  0831234567
Address: 123 Main Rd, Mokopane

1) Kota x2    @ 35.00 = 70.00
2) Chips (Large) x1 @ 28.00 = 28.00
Subtotal: 98.00
Delivery: 30.00
Total:    128.00
-------------------
```

## Screenshots
Add CLI screenshots in `docs/screenshots/`, e.g.:
- `docs/screenshots/quickfood-run.png`
- `docs/screenshots/quickfood-invoice.png`

## Deployment
QuickFood is a **Java console application** and runs locally from your command line.  
It is not hosted online. You can package and distribute it as a `.jar` for easy execution.

## Credits
- Author: Julani Victor Chonco ([@JulaniChonco](https://github.com/JulaniChonco))
- Mentors/Reviewers: HyperionDev
