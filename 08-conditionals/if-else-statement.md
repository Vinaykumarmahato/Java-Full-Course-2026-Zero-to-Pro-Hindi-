# ⚖️ The `if-else` Statement in Java

## 🤔 The Problem with `if`
पिछले वीडियो में हमने देखा कि `if` स्टेटमेंट तब काम करता है जब कंडीशन True (सही) होती है। लेकिन जब कंडीशन **False (गलत)** होती है, तो हमें कोई आउटपुट नही मिलता (100% रिज़ल्ट अचीव नहीं होता)।
जैसे: अगर `age = 17` है, तो "यू कांट वोट (You can't vote)" प्रिंट होना चाहिए, लेकिन `if` के केस में प्रोग्राम चुपचाप आगे बढ़ जाता है।

इसी प्रॉब्लम को सॉल्व करने के लिए प्रोग्रामिंग दुनिया में **`if-else` Statement** आया। 

---

## 🛠️ Syntax & The DRY Principle

```java
if (condition) {
    // अगर Condition TRUE है, तो यह कोड रन होगा
} else {
    // अगर Condition FALSE है, तो यह कोड रन होगा
}
```

### 🌵 "DRY" Principle (Don't Repeat Yourself)
क्या हम `else` की जगह एक और `if` लगाकर काम नहीं चला सकते?
```java
if (age >= 18) { ... }
if (age < 18) { ... }  // ❌ Not Recommended
```
हम ऐसा कर सकते हैं, लेकिन एक अच्छे प्रोफेशनल प्रोग्रामर को **DRY Principle** फॉलो करना होता है। हमें सेम लॉजिक को बार-बार रिपीट नहीं करना है। जब जावा ने हमें `else` का फीचर दिया है कि *"अगर पहली शर्त गलत हो जाए, तो बाकी बचे हुए के लिए यह चला दो"*, तो हमें बेमतलब एक और `if` नहीं लिखना चाहिए।

---

## 🎯 Practical Need: Even or Odd Program
चलिए इसे एक असली प्रॉब्लम से समझते हैं: **"यूज़र से एक नंबर लो और बताओ कि वो Even (सम) है या Odd (विषम)।"**

### Brain Logic (मैथ्स):
- अगर किसी नंबर को 2 से भाग (Divide) दें, और उसका **शेषफल (Remainder)** `0` आये, तो वह **Even** है।
- वर्ना वह **Odd** है।

जावा में शेषफल (Remainder) निकालने के लिए हम `Modulo (%)` ऑपरेटर का इस्तेमाल करते हैं।

### Assignments `=` vs Comparison `==`
- `=` (Single Equal): वैल्यू को असाइन (Assign) करने के लिए। (e.g. `int a = 10;`)
- `==` (Double Equal): दो वैल्यूज़ को कंपेयर (Check) करने के लिए कि क्या वो बराबर हैं?

इसीलिए हम कंडीशन में लिखेंगे: `num % 2 == 0` (क्या नंबर को 2 से डिवाइड करने पर रिमाइंडर 0 के बराबर है?)

---

## 🤯 Important Interview Point: Curly Braces `{}` Optional?
- अगर आपके `if` या `else` ब्लॉक के अंदर सिर्फ़ **एक ही लाइन का कोड (Single Statement)** है, तो आप Curly Braces `{}` हटा सकते हैं। जावा कोई Error नहीं देगा!
- लेकिन, अगर ब्लॉक के अंदर **एक से ज़्यादा लाइन्स (Multiple Statements)** हैं और आपने `{}` नहीं लगाया, तो जावा तुरंत Error दे देगा!

```java
// ✅ VALID: Single statement (No braces needed)
if (num % 2 == 0) 
    System.out.println("Even");
else 
    System.out.println("Odd");

// ❌ INVALID: Multiple statements without braces will cause an error on the else!
if (num % 2 == 0)
    System.out.println("Even");
    System.out.println("Good Morning!");
else // ERROR HERE
    System.out.println("Odd");
```
