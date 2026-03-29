# 🌀 The `while` Loop

## 🧐 What is a `while` Loop?
**`while` loop** एक **Control Structure** है जो हमारे प्रोग्राम के एग्जीक्यूशन (Execution Flow) को कंट्रोल करता है। 
इसका सिंपल सा मतलब है: **"जब तक (While) मेरा दिया हुआ कंडीशन `true` है, तब तक कोड को बार-बार चलाओ (Execute करो)।"**

## 🎯 When to Use `while` Loop?
हमें `while` लूप का इस्तेमाल तब करना चाहिए जब:
1. **No Fixed Iterations:** हमें पहले से पता नहीं है कि लूप कितनी बार चलने वाला है।
2. **Taking User Input:** जब तक यूज़र सही इनपुट नहीं डालता, तब तक लूप चलाना।
3. **Dynamic Conditions:** रन-टाइम पर अगर हमारा कंडीशन बदल रहा है (जैसे गेम लाइफ़लाइन चेक करना)।

---

## 💻 Syntax & Basic Example

```java
int i = 1; // 1. Initialization (शुरुआत कहाँ से करनी है)

while (i <= 5) { // 2. Condition (कब तक चलाना है)
    System.out.println("Hello World - " + i);
    i++; // 3. Increment/Decrement (आगे कैसे बढ़ना है)
}
```

### 🧠 How it Works internally:
1. `i` की वैल्यू `1` है। कंडीशन चेक होती है `1 <= 5` (True)। "Hello World" प्रिंट होता है।
2. `i++` की वजह से `i` की वैल्यू `2` हो जाती है।
3. फिर कंडीशन चेक होती है `2 <= 5` (True)...
4. यह तब तक चलता है जब तक `i` की वैल्यू `6` न हो जाये। जैसे ही `6 <= 5` (False) होता है, लूप स्टॉप हो जाता है!

*(Note: अगर आप `i++` लिखना भूल जायेंगे, तो वैल्यू हमेशा 1 रहेगी और कंडीशन हमेशा True रहेगी। इसे **Infinite Loop** कहते हैं, जिससे आपका प्रोग्राम क्रैश हो सकता है!)*

---

## 🪆 Nested `while` Loop
जैसे हमने Nested `if` पढ़ा था (घर के अंदर घर), वैसे ही **Nested `while` Loop** का मतलब है **एक `while` लूप के अंदर दूसरा `while` लूप**!

**🧠 Analogy (समझने का बेहतरीन तरीका):**
एक हफ्ते (Week) में 7 दिन (Days) होते हैं, और हर 1 दिन के अंदर 24 घंटे (Hours) होते हैं। 
- आउटर लूप (Outer Loop) = 7 दिन
- इनर लूप (Inner Loop) = 24 घंटे
*मतलब आउटर लूप का 1 दिन पूरा होने के लिए, इनर लूप को 24 बार चलना पड़ेगा!*

### 📝 Nested Loop Code Example:
```java
int i = 1;

while (i <= 3) {
    System.out.println("Outer Loop Item: " + i);

    int j = 1; // इनर लूप के लिए नया वेरिएबल
    while (j <= 2) {
        System.out.println("   Inner Loop Item: " + j);
        j++;
    }
    i++;
}
```

---

## ⚠️ Common Mistakes in Loops
1. **Forget Increment/Decrement:** `i++` या `i--` देना भूल जाना, जिससे लूप Infinite बन जाता है।
2. **Wrong Condition:** कंडीशन गलत लगा देना (`<` की जगह `>`), जिससे लूप एक बार भी रन ही नहीं होता।
3. **Variable Resetting in Nested Loops:** नेस्टेड लूप में इनर वेरिएबल (जैसे `j`) को लूप के अंदर ইনিशियलाइज़ करना भूलना।

---

## 🎤 Top Interview Questions
- **What is a while loop?** -> It is a control structure to repeatedly run code as long as a condition is true. Best used when iteration count is unknown.
- **What is an infinite loop?** -> A loop that never terminates because its condition always evaluates to true (usually due to missing increments).
- **How Does Nested Loop work?** -> For every 1 round of the outer loop, the inner loop executes completely from start to finish.
- **Time Complexity Factor:** Nested loops generally increase the program's **Time Complexity** (ओह-नो! मतलब प्रोग्राम थोड़ा स्लो हो सकता है क्योंकि अगर 5x5 लूप है, तो कोड 25 बार चलेगा!)
