# 🪄 The Ternary Operator

## 🤔 What is the Ternary Operator?
यह एक ऐसा जादुई ऑपरेटर है जो आपके **5 लाइन के `if-else` कोड को सिर्फ़ 1 लाइन में कन्वर्ट कर देता है!** 
ज़्यादातर बिगिनर्स इसे देखकर डर जाते हैं या गलत यूज़ करते हैं, लेकिन असल में यह बहुत आसान है।

### Real Life Analogy:
> **"क्या बाहर बारिश हो रही है ? (अगर हाँ) छाता ले लो : (अगर नहीं) बिना छाता के जाओ"**

---

## 🛠️ Syntax

इस ऑपरेटर में 3 हिस्से होते हैं (इसीलिए इसे Ternary बोलते हैं):
```java
DataType variable = (Condition) ? "Value_if_True" : "Value_if_False";
```
1. `Condition`: वह शर्त जो हमें चेक करनी है।
2. `?` (Question Mark): इसका मतलब है "चेक करो कि क्या कंडीशन सही है?"
3. `:` (Colon): यह `else` का काम करता है (नहीं तो यह कर दो)।

---

## 📉 5 Lines vs 1 Line (Even/Odd Program)

**Traditional `if-else` (5 Lines):**
```java
if (num % 2 == 0) {
    result = "Even";
} else {
    result = "Odd";
}
```

**Using Ternary Operator (1 Line):**
```java
String result = (num % 2 == 0) ? "Even" : "Odd";
```
*जादू देखा?* जो काम `{}` और `if-else` लगाकर 5 लाइन में हो रहा था, वो सिर्फ़ 1 लाइन में सिमट गया!

---

## 🪣 Storing Different Data Types
Ternary ऑपरेटर सिर्फ़ String के साथ ही नहीं, बल्कि किसी भी Data Type के साथ काम करता है:

- **String:** `String res = (age >= 18) ? "Vote" : "Cannot Vote";`
- **Boolean:** `boolean res = (2 > 3) ? true : false;`
- **Integer:** `int score = (marks > 40) ? 100 : 200;`

*(Rule: आप कॉलन `:` के लेफ्ट और राईट साइड में जो वैल्यू दे रहे हैं, स्टोर करने वाले वेरिएबल का Data Type भी वही होना चाहिए!)*

---

## 🎯 Famous Interview Question
**Question:** *"Find the largest of 3 numbers using ONLY the Ternary Operator."* (बिना `if-else` के 3 नंबर्स में से सबसे बड़ा नंबर ढूंढो)

**The Logic (2 Steps):**
1. सबसे पहले `num1` और `num2` की लड़ाई कराओ। जो जीते उसे `temp` (Temporary variable) में स्टोर कर लो:
   `int temp = (num1 > num2) ? num1 : num2;`
2. अब जो जीता (`temp`) उसकी लड़ाई तीसरे नंबर (`num3`) से कराओ। जो इसमें जीतेगा, वही फाइनल विनर है:
   `int largest = (temp > num3) ? temp : num3;`

*(इसका प्रैक्टिकल और रनिंग कोड आपको `TernaryOperator.java` में मिलेगा!)*
