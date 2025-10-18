# Quick Food – Java Console Application

## Overview
Quick Food is a Java console program that simulates an online meal-ordering system.  
It captures customer and restaurant details, reads driver data from a file, selects the best-matched driver (based on location and workload), and generates a printable invoice (`invoice.txt`).

---

## Features
✅ Capture and validate customer information  
✅ Capture and validate restaurant information  
✅ Defensive programming to prevent blank fields  
✅ Validate 10-digit phone numbers and proper email format  
✅ Read drivers dynamically from `drivers.txt`  
✅ Automatically match restaurant area to available driver  
✅ Generate a detailed `invoice.txt` file  
✅ Handle “no driver available” scenarios gracefully  

---

## Program Flow
1. User enters Customer details  
2. User enters Restaurant details  
3. Program loads driver list from `drivers.txt`  
4. Program assigns the least-loaded driver in the same city  
5. `invoice.txt` is generated with all order details

---

## Folder Structure
