# 🏦 Bank Management System

The **Bank Management System** is a Java-based simulation of a banking system.  
It provides users with essential banking operations through a simple GUI built with **Java Swing/JavaFX** and a **MySQL database** for secure data storage.

---

## 📌 About
This system allows users to:
- **Sign In** using their account number and PIN.  
- **Sign Up** if they don’t have an account, where they provide their details through 3 forms.  
  - On successful registration, an **account number and PIN** are generated automatically.  
  - A pop-up window prompts the user to make their first deposit.  

Once logged in, users can perform common banking tasks such as:
- Balance Enquiry  
- Deposit  
- Withdrawal  
- Fast Cash  
- PIN Change  

---

## 🛠 Tech Stack
- **Java Swing / JavaFX** (Frontend GUI)  
- **MySQL Database** (Data Storage)  
- **IntelliJ IDEA** (IDE for Development)  

---

## 🚀 How to Run
1. Clone or download the repository.  
2. Set up a **MySQL database** and update the database connection details in the project.  
3. Navigate to the `dist` folder.  
4. Run the `.jar` file using the command:

   ```bash
   java -jar BankManagementSystem.jar
