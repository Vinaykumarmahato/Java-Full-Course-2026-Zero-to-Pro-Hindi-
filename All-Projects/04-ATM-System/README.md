# 🏦 Project 04: ATM System Simulation

## 📝 About the Project
This project is the culmination of Java learning from Phase 01 to Phase 09. It brings together all the fundamental concepts into one real-world, interactive application.

We simulated a fully functional ATM machine where the user is granted **3 attempts** to crack the PIN. Upon successful login, an infinite interactive menu loop allows them to view their balance, deposit funds, or withdraw cash while evaluating edge cases like insufficient funds or negative inputs.

---

## 🧠 Concepts Applied & Demonstrated
1. **The `do-while` Loop:** Used for the PIN verification system because the ATM must ask the user for input *at least one time* regardless of initial conditions.
2. **The `while(true)` Loop:** Used to keep the Main Menu active continually until the user explicitly selects `Exit` (`return` or `break`).
3. **`switch` Statements:** For routing user choice dynamically (Check Balance, Deposit, Withdraw).
4. **Shared Data (`static` variables):** The `balance` and `pin` variables were made `static` so every isolated method in the `ATMSystem` class could instantly share and modify the same centralized memory.
5. **Scanner Stream Buffers (`sc.close()`):** Addressed memory-leak issues by ensuring the OS keyboard-buffer connection is successfully closed before executing a total program `return`.
6. **Method Chaining & `return` logic:** How `return true;` behaves directly inside a loop and how pure `return;` behaves inside the main method to kill execution.

---

## 💻 How to Run
1. Open this folder in VS Code or Terminal.
2. Compile: `javac ATMSystem.java`
3. Run: `java ATMSystem`
4. The Master PIN is `1234`. Try failing it 3 times to see the Card Block feature!
