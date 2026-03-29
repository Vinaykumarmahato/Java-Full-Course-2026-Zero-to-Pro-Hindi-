# 🧠 Topic: Data Types in Java (Complete Guide)

## 🚀 Introduction (Need of Data Types)
- **हम सॉफ्टवेयर क्यों बनाते हैं?** क्योंकि हमें डेटा (Data) या इंफॉर्मेशन को स्टोर और प्रोसेस करना होता है।
- **जावा एक 'Statically Typed' लैंग्वेज है:** इसका मतलब है कि जब भी हम कोई डेटा स्टोर करते हैं, हमें **पहले ही बताना पड़ता है** कि वह किस "प्रकार" (Type) का डेटा है (छोटा नंबर है, बड़ा नंबर है, टेक्स्ट है, दशमलव (point) वाली वैल्यू है, या True/False है)।

---

## 🗂️ Categories of Data Types in Java
जावा में Data Types मुख्य रूप से 2 प्रकार के होते हैं:

### 1. Primitive Data Types
ये बेसिक डेटा टाइप्स होते हैं जिन्हें JVM डायरेक्ट मेमोरी में स्टोर करता है (बिना Object क्रिएट किए)।
Primitive की 4 मुख्य कैटेगरी होती हैं:
- **Integer (Numbers):** `byte`, `short`, `int`, `long`
- **Floating-Point (Decimals):** `float`, `double`
- **Character (Single Letter):** `char`
- **Boolean (True/False):** `boolean`

### 2. Non-Primitive Data Types
ये Objects के रूप में होते हैं और Primitive से काफी अलग होते हैं (हम इन्हें आगे डिटेल में पढ़ेंगे)।
- **Examples:** `String`, `Array`, `Class`, `Interface`, `Enum`

---

## 💾 Bits & Bytes (Memory Management)
- कंप्यूटर केवल 2 ही भाषा समझता है: **0 और 1**। इन्हें **Bit** कहते हैं।
- **1 Byte = 8 Bits**
- **एक अच्छा डेवलपर सही Data Type क्यों चुनता है?** इमेजिन करें आपके पास एक ऐसा डेटा है जो 1KB का है, लेकिन आप उसे 2MB के कंटेनर में स्टोर कर रहे हैं। बाकी का स्पेस वेस्ट हो जाएगा! इसीलिए हमें ज़रूरत के हिसाब से Data Type का साइज़ चुनना चाहिए।

| Data Type | Size in Memory | Range Formula | Best Use Case |
| --- | --- | --- | --- |
| **`byte`** | 1 byte (8 bits) | `-2^7` to `2^7 - 1` | Small numbers (e.g., Age) |
| **`short`**| 2 bytes (16 bits)| `-2^15` to `2^15 - 1` | Medium numbers (e.g., Total Students) |
| **`int`** | 4 bytes (32 bits)| `-2^31` to `2^31 - 1` | Default choice for numbers (e.g., City Population) |
| **`long`** | 8 bytes (64 bits)| `-2^63` to `2^63 - 1` | Huge numbers (e.g., World Population) |
| **`float`** | 4 bytes | - | Decimals (MANDATORY: Add 'f' or 'F' at end) |
| **`double`**| 8 bytes | - | Default choice for decimals (High precision) |
| **`char`** | 2 bytes | - | Single Character (e.g., 'A', 'B') |
| **`boolean`**| 1 bit (Logical) | `true` or `false` | Conditional Flags (e.g., `isOn = true`) |

---

## 💡 Pro Tips & Interview Questions

1. **How is Range Calculated?**
   - **Formula:** `-2^(n-1)` to `2^(n-1) - 1` *(where 'n' = number of bits)*
   - *Example (`int` has 32 bits):* The range is `-2^31` to `2^31 - 1`. 
   
2. **Boolean Actual Size:**
   - जावा टेक्निकली बुलियन का साइज़ डिफाइन नहीं करता है, लेकिन लॉजिकली यह **1 Bit** होता है क्योंकि यह सिर्फ़ 2 ही स्टेट लेता है (`0` for false, `1` for true)।

3. **Syntax Rules for `long` and `float`:**
   - `long` इस्तेमाल करते समय नंबर के आख़िर में `L` लगाना ज़रूरी है (उदा: `8000000000L`).
   - `float` इस्तेमाल करते समय आख़िर में `f` लगाना ज़रूरी है (उदा: `10.5f`).

---

## 💻 Code Implementation 
इस टॉपिक का प्रैक्टिकल कोड आपको `DataTypeInJava.java` फाइल में मिल जाएगा!
