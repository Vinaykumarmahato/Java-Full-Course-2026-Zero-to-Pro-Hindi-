# 🔄 The `do-while` Loop

## 🤔 Why Do We Need `do-while`? (क्या जरूरत थी इसकी?)
हमने पिछले वीडियो में देखा कि **`while` loop** में सबसे पहले कंडीशन चेक होती है।
- अगर कंडीशन **True** है ➡️ कोड चलेगा।
- अगर कंडीशन **False** है ➡️ कोड एक बार भी नहीं चलेगा!

लेकिन, क्या हो अगर हमें अपना कोड **कम से कम एक बार (At least ONE time)** तो चलाना ही चलाना हो, चाहे कंडीशन True हो या False? 
इसी प्रॉब्लम को सॉल्व करने के लिए जावा में **`do-while` Loop** को लाया गया! इसका सीधा सा मतलब है: **"पहले काम करो (Do), फिर कंडीशन चेक करो (While)!"**

---

## 📱 Real-World Analogy (समझने का बेहतरीन तरीका)
**The Old Keypad Phone in the Dark:**
इमेजिन करिए आपके पास पुराने ज़माने का कीपैड (Keypad) फ़ोन है और आप अँधेरे में हैं। 
1. आपको कोई नंबर डायल करना है, लेकिन अँधेरे में बटन्स नहीं दिख रहे।
2. आप रैंडमली किसी भी एक बटन को दबाते हैं **(DO - Action Performed)**।
3. बटन दबते ही फ़ोन की लाइट जल जाती है और आपको स्क्रीन दिखने लगती है **(At least 1 output guaranteed)**।
4. अब आप देखते हैं कि आपने '3' दबा दिया है जबकि आपको '2' दबाना था। अब आप अपनी **कंडीशन चेक** करते हैं **(WHILE - Condition Verification)**।

---

## 💻 Syntax & Comparison

### `do-while` Syntax:
```java
int i = 10; // 1. Initialization

do {
    // 2. Action (यह कोड बिना कंडीशन चेक किये 1 बार तो चलेगा ही)
    System.out.println("Hi"); 
    i++; // Increment/Decrement
    
} while (i <= 5); // 3. Condition Check (लास्ट में सेमीकोलन ; लगाना ज़रूरी है!)
```

### 🥊 `while` vs `do-while`
| Feature | `while` Loop | `do-while` Loop |
| :--- | :--- | :--- |
| **Checking Time** | Entry-Controlled (घुसते ही चेकिंग) | Exit-Controlled (निकलते वक़्त चेकिंग) |
| **Execution** | अगर कंडीशन False है, तो **0 बार** चलेगा। | अगर कंडीशन False है, तो भी **1 बार** तो चलेगा ही। |
| **Use Case** | जबiterations फिक्स न हों और कंडीशन पहले चेक करनी हो। | जब मेन्यू (Menu-driven) प्रोग्राम बनाना हो जहाँ 1 बार UI दिखाना ही हो। |

---

## 🎯 Important Note
`do-while` loop के अंत में कंडीशन लिखते समय ब्रैकेट के बाद **Semicolon (`;`)** लगाना मत भूलना! 
`(while (condition);)` 

अगले वीडियो में हम **`for` Loop** को समझेंगे और फिर इन तीनों लूप्स का इस्तेमाल करके एक शानदार **Project** बनाएंगे! 🚀
