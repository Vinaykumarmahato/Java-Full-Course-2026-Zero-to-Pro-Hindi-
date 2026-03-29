# 🗃️ Assignment Operators in Java

## 🚀 Introduction
- **Definition:** एक ऐसा ऑपरेटर जो **Right Side** की वैल्यू को उठाकर **Left Side** के वेरिएबल में स्टोर (Assign) कर देता है, उसे **Assignment Operator** कहते हैं।
- **रूल (Rule):** असाइनमेंट हमेशा **Right ➡️ to ➡️ Left** काम करता है।

---

## 🗂️ Categories of Assignment Operators

### 1. Basic Assignment (`=`)
सबसे सिंपल असाइनमेंट।
```java
int a = 20; // 20 'a' के अंदर स्टोर हो गया
```

### 2. The Chaining Concept (Interview Hot Topic 🔥)
इंटरव्यूअर अक्सर पूछता है: *"जावा में `a = b = c = 10;` कैसे काम करता है?"*
- **Ans:** यह **Right-to-Left** काम करता है।
- सबसे पहले `10`, वेरिएबल `c` में जाएगा। (`c = 10`)
- फिर `c` की वैल्यू `b` में जाएगी। (`b = 10`)
- और आख़िर में `b` की वैल्यू `a` में जाएगी। (`a = 10`)

### 3. Compound Assignment Operators (Shorthand)
प्रोग्रामिंग में कोड को छोटा करने के लिए हम शॉर्टकट ऑपरेटर्स (Compound Operators) का इस्तेमाल करते हैं। 
अगर `a = 20` है:

| नॉर्मल तरीका | शॉर्टकट (Compound) तरीका | मतलब | आउटपुट (`a=20`) |
|:---:|:---:|---|:---:|
| `a = a + 5` | **`a += 5`** | `a` में 5 जोड़ दो और फिर `a` में ही स्टोर कर दो | `25` |
| `a = a - 5` | **`a -= 5`** | `a` में से 5 घटा दो | `15` |
| `a = a * 5` | **`a *= 5`** | `a` में 5 से गुणा कर दो | `100` |
| `a = a / 5` | **`a /= 5`** | `a` में 5 से भाग दे दो | `4` |
| `a = a % 5` | **`a %= 5`** | `a` में 5 से भाग देकर शेषफल (Remainder) निकालो | `0` |

---

## 🤯 Tricky Interview Questions

### Trick 1: Precedence Effect
```java
int a = 5;
a += 10 * 2; 
```
- यहाँ ऑपरेटर प्रेसिडेंस (Operator Precedence) लागू होता है। `*` (मल्टीप्लिकेशन) की प्रायोरिटी `+=` से ज़्यादा है।
- इसलिए पहले राइट साइड इवैल्यूएट होगा: `10 * 2 = 20`
- फिर यह `a` में जुड़ेगा: `5 + 20 = 25`
- **आउटपुट:** `25`

### Trick 2: Double Compound Assignment
```java
int a = 5;
a += a += 5;
```
- असाइनमेंट **Right-to-Left** होता है। 
- 1st Step (Right side box): `a += 5` (यहाँ `a` 10 हो गया)
- 2nd Step (Left side box): `a += 10` (पुरानी वैल्यू 5 में 10 जुड़ जाएगा)
- **आउटपुट:** `15`

---

## 🌍 Real-Time Industry Use Cases
1. **Banking System (Deposit & Withdrawal):**
   - जब आप पैसे जमा करते हैं: `balance += 500;` (करंट बैलेंस में ₹500 जुड़ जाएगा)
   - जब आप पैसे निकालते हैं: `balance -= 200;` (करंट बैलेंस से ₹200 कट जाएगा)
2. **Gaming Scores:** जब भी आप एनिमी को मारते हैं: `score += 100;`
3. **Inventory Management / Billing:** जब स्टॉक बिकता है: `stockItems -= 1;`

> **Pro-Tip for Developers:** जो भी कोड आप सीख रहे हैं, उसे GitHub पर ज़रूर अपलोड करें और LinkedIn पर शेयर करें। रिक्रूटर्स सबसे पहले आपका सोशल-प्रूफ और GitHub कमिट्स देखते हैं! 🚀

---

## 💻 Code Implementation 
Chaining, Compound Operators और Banking System के रियल-टाइम एग्ज़ांपल्स `AssignmentOperators.java` फाइल में मौजूद हैं!
