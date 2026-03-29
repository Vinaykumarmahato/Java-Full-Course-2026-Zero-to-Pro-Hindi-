# 🧠 Topic: Variables in Java in Detail (Local, Instance & Static)

## 🚀 Introduction
- **Variable (वेरिएबल) क्या है?** प्रोग्रामिंग के दौरान जब भी हम कोई डेटा या इनफार्मेशन (जैसे- नाम, उम्र, मार्क्स) अपने सिस्टम की मेमोरी में स्टोर करना चाहते हैं, तब हमें Variable की ज़रूरत पड़ती है।
- **Memory Allocation:** जैसे ही आप प्रोग्राम में लिखते हैं `int age = 18;`, आपके कंप्यूटर की मेमोरी (RAM) में एक स्पेस रिज़र्व हो जाता है। उस स्पेस (लोकेशन) का नाम `age` रख दिया जाता है और उसके अंदर `18` स्टोर हो जाता है।

## ⚙️ Syntax & Golden Rules of Variables
चूँकि जावा एक Statically Typed लैंग्वेज है, हमें वेरिएबल बनाते वक़्त 3 चीज़ें लिखनी पड़ती हैं:

```java
// 1. Data Type   2. Variable Name     3. Value
   int            marks                = 90;
```

🚨 **Important Rules to Remember:**
1. **One Time DataType:** एक बार किसी वेरिएबल को डिक्लेअर (`int a = 10;`) कर दिया, तो आप दोबारा उस स्कोप में `int a = 20;` नहीं लिख सकते। वैल्यू अपडेट करने के लिए सीधे `a = 20;` लिखें।
2. **Single Value:** एक वेरिएबल एक समय (At a time) पर केवल एक ही वैल्यू अपने अंदर स्टोर करके रख सकता है।
3. **No Reserved Words:** आप जावा के फिक्स कीवर्ड्स (जैसे `void`, `class`, `public`) को वेरिएबल का नाम नहीं बना सकते।
4. **No Numbers at Start:** वेरिएबल का नाम कभी भी किसी नंबर से शुरू नहीं हो सकता (`2name` गलत है, `name2` सही है)।
5. **No Spaces:** दो शब्दों के बीच में स्पेस नहीं दिया जा सकता (स्पेस की जगह `_` अंडरस्कोर लगा सकते हैं)।

---

## 🐫 Camel Case Naming Conventions (For Professionals)
एक प्रोफेशनल कोडर बनने के लिए आपको वेरिएबल और क्लास का नाम लिखते समय 'कैमल केस' (Camel Case) रूल्स फॉलो करने चाहिए:

1. **Lower Camel Case (Variables & Methods के लिए):**
   - पहला शब्द पूरा छोटा (small), दूसरे शब्द का पहला अक्षर बड़ा (Capital)।
   - *Example:* `firstName`, `helloVinay`, `displayValue()`
2. **Upper Camel Case / Pascal Case (Classes & Interfaces के लिए):**
   - हर शब्द का पहला अक्षर बड़ा (Capital)।
   - *Example:* `StudentDetails`, `SimpleClass`
3. **Constant / Final Case:**
   - सब कुछ CAPITAL लेटर में, और शब्दों के बीच में अंडरस्कोर (`_`)।
   - *Example:* `MAX_MARKS`, `DISPLAY_VALUE`

---

## 🗂️ 3 Types of Variables in Java (Interview Favorite!)

### 1. Local Variable
- **कहाँ लिखते हैं?** किसी भी **Method के अंदर**।
- **खासियत:** इसकी उम्र सिर्फ उस मेथड के अंदर तक ही होती है। बाहर इसका कोई वजूद नहीं होता।

### 2. Instance Variable
- **कहाँ लिखते हैं?** Method के बाहर, लेकिन **Class के अंदर**।
- **खासियत:** इस वेरिएबल की वैल्यू को प्रिंट करने या इस्तेमाल करने के लिए आपको मैन्युअली उस क्लास का **Object (new कीवर्ड से) क्रिएट करना पड़ता है**!

### 3. Static Variable
- **कहाँ लिखते हैं?** Method के बाहर (क्लास के अंदर) + इसके आगे **`static`** कीवर्ड लगा होता है।
- **खासियत:** यह सबसे पावरफुल है! इसे एक्सेस करने के लिए **Object क्रिएट करने की कोई ज़रूरत नहीं** होती। आप इसे डायरेक्ट `ClassName.variableName` लिखकर एक्सेस कर सकते हैं।
- *फायदा:* बिना ऑब्जेक्ट क्रिएट किए ये काम करता है, इसलिए यह हमारी सिस्टम मेमोरी (RAM) को बचाता है। 

---

## 💻 Code Implementation 
इस टॉपिक का सारा प्रैक्टिकल कोड आपको इसी फोल्डर के `Simple.java` फाइल में मिल जाएगा!
