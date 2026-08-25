# अध्याय 15: Strings (स्ट्रिंग्स) और मेमोरी का गहरा खेल — Zero to Pro 🚀

जावा की दुनिया में आपका स्वागत है! प्रोग्रामिंग में 70% से अधिक डेटा टेक्स्ट या स्ट्रिंग्स के रूप में प्रोसेस होता है (जैसे Usernames, Passwords, Emails, URLs, JSON Payloads)।

इस अध्याय में हम **String Class**, **String Constant Pool (SCP)**, **Immutability (अपरिवर्तनीयता)**, **Comparison**, **Concatenation**, **20+ Built-in Methods**, और **Top Interview Problems** को मेमोरी आर्किटेक्चर के साथ गहराई से समझेंगे।

---

## 📑 विषय-सूची (Index of Topics)

1. [String क्या है और यह Heap में कैसे रहता है? (Ep 50)](#1-string-क्या-है-और-यह-heap-में-कैसे-रहता-है-ep-50)
2. [Mutable vs Immutable Strings — String Immutable क्यों है? (Ep 51)](#2-mutable-vs-immutable-strings--string-immutable-क्यों-है-ep-51)
3. [String Constant Pool (SCP) vs Normal Heap Memory (Ep 52)](#3-string-constant-pool-scp-vs-normal-heap-memory-ep-52)
4. [String Comparison: `==` vs `.equals()` vs `.equalsIgnoreCase()` (Ep 53)](#4-string-comparison--vs-equals-vs-equalsignorecase-ep-53)
5. [String Concatenation: `+` Operator vs `.concat()` और मेमोरी का खेल (Ep 54)](#5-string-concatenation--operator-vs-concat-और-मेमोरी-का-खेल-ep-54)
6. [20+ Inbuilt String Methods Master Guide (Ep 55)](#6-20-inbuilt-string-methods-master-guide-ep-55)
7. [String Interview Problems Roadmap & Next Steps (Ep 56)](#7-string-interview-problems-roadmap--next-steps-ep-56)

---

## 1. String क्या है और यह Heap में कैसे रहता है? [Ep 50]

जावा में `String` कोई प्रिमिटिव डेटा टाइप (जैसे `int`, `char`) नहीं है। यह `java.lang` पैकेज की एक **Class** है।
जावा में हर स्ट्रिंग असल में कैरेक्टर्स का एक अनुक्रम (Sequence of characters) होता है।

### String बनाने के 3 तरीके:

```java
// तरीका 1: String Literal (अनुशंसित - मेमोरी बचाता है)
String s1 = "Java2026";

// तरीका 2: 'new' कीवर्ड के द्वारा
String s2 = new String("Java2026");

// तरीका 3: Character Array से
char[] arr = {'J', 'a', 'v', 'a'};
String s3 = new String(arr);
```

### 🧠 Stack vs Heap Memory Architecture:
```text
Stack Area                      Heap Area
+-------------+         +------------------------------------+
| s1 (0x101)  | ------> | [String Constant Pool (SCP)]       |
|             |         |   "Java2026" (Address: 0x101)       |
|             |         +------------------------------------+
| s2 (0x999)  | ------> | [Normal Heap Area]                 |
|             |         |   String Object (Address: 0x999)    |
|             |         |   (अंदर SCP के 0x101 को पॉइंट करता है)|
+-------------+         +------------------------------------+
```

---

## 2. Mutable vs Immutable Strings — String Immutable क्यों है? [Ep 51]

> [!IMPORTANT]
> **Immutability (अपरिवर्तनीयता) का अर्थ:**
> एक बार जब हीप मेमोरी में String का Object बन जाता है, तो उस ऑब्जेक्ट के अंदर के डेटा को **कभी बदला नहीं जा सकता**। अगर आप कोई भी बदलाव करेंगे, तो जावा उसी ऑब्जेक्ट को बदलने के बजाय **एक नया Object** बना देगा!

### कोड उदाहरण:
```java
String s = "Hello";
s.concat(" World"); // यह "Hello World" का नया ऑब्जेक्ट बनाता है, लेकिन s पुराना "Hello" ही रहेगा!
System.out.println(s); // Output: Hello

// अगर नया पता s में स्टोर करें:
s = s.concat(" World");
System.out.println(s); // Output: Hello World (अब s नए ऑब्जेक्ट को पॉइंट कर रहा है)
```

### 🎯 इंटरव्यू का सबसे पसंदीदा सवाल: String को Immutable क्यों बनाया गया?
1. 🔐 **Security (सुरक्षा):** Database Connection URLs, Passwords, Network Ports स्ट्रिंग में होते हैं। अगर स्ट्रिंग म्यूटेबल होती, तो कोई भी प्रोसेस बैकग्राउंड में आपका पासवर्ड बदल सकता था।
2. 🧵 **Thread Safety (मल्टी-थ्रेडिंग सुरक्षा):** क्योंकि डेटा बदल ही नहीं सकता, इसलिए हजारों थ्रेड्स बिना किसी सिंक्रोनाइज़ेशन या डेटा करप्शन के एक ही स्ट्रिंग को एक साथ पढ़ सकते हैं।
3. 💾 **String Constant Pool (मेमोरी की बचत):** यदि 1000 वेरिएबल्स की वैल्यू `"Admin"` है, तो हीप में 1000 बार स्पेस नहीं बनता, केवल 1 ऑब्जेक्ट बनता है और सभी उसे शेयर करते हैं।
4. ⚡ **HashCode Caching (फास्ट परफॉर्मेंस):** `HashMap` और `HashSet` में Keys के रूप में स्ट्रिंग्स सबसे ज्यादा इस्तेमाल होती हैं, क्योंकि इसका `hashCode()` पहली बार में ही कैश हो जाता है।

---

## 3. String Constant Pool (SCP) vs Normal Heap Memory [Ep 52]

* **String Constant Pool (SCP):** यह Heap मेमोरी के अंदर का एक विशेष रिज़र्व एरिया है।
* जब आप **String Literal** (`String s = "Java";`) बनाते हैं:
  1. JVM पहले SCP में चेक करता है: क्या `"Java"` पहले से मौजूद है?
  2. अगर हाँ, तो वही पुराना मेमोरी एड्रेस वापस दे देता है (नया ऑब्जेक्ट नहीं बनता)।
  3. अगर नहीं, तो SCP में नया ऑब्जेक्ट बनता है।
* जब आप **`new String("Java")`** लिखते हैं:
  1. JVM जबरन **दो (2) ऑब्जेक्ट्स** बनाता है: एक Normal Heap में और एक SCP में (यदि पहले से नहीं है)।

```java
String s1 = "Java";
String s2 = "Java";
System.out.println(s1 == s2); // true (दोनों SCP में एक ही कमरे को देख रहे हैं)

String s3 = new String("Java");
System.out.println(s1 == s3); // false (s1 SCP में है, s3 Normal Heap में)

// .intern() मेथड:
String s4 = s3.intern(); // यह s3 का SCP वाला एड्रेस निकाल लाता है
System.out.println(s1 == s4); // true
```

---

## 4. String Comparison: `==` vs `.equals()` vs `.equalsIgnoreCase()` [Ep 53]

| ऑपरेटर / मेथड | क्या चेक करता है? | उदाहरण (`s1 = "Java"`, `s2 = new String("Java")`) |
| :--- | :--- | :--- |
| **`==` Operator** | **Memory Address (रेफरेंस)** — क्या दोनों वेरिएबल एक ही जगह को पॉइंट कर रहे हैं? | `s1 == s2` ➡️ `false` |
| **`.equals()`** | **Content (सामग्री)** — क्या दोनों के अंदर लिखे अक्षर बिल्कुल समान हैं? | `s1.equals(s2)` ➡️ `true` |
| **`.equalsIgnoreCase()`** | **Case-Insensitive Content** — 'A' और 'a' को बराबर मानता है। | `"JAVA".equalsIgnoreCase("java")` ➡️ `true` |
| **`.compareTo()`** | **Dictionary (Lexicographical) Order** — अक्षरों का ASCII अंतर लौटाता है। | `"A".compareTo("B")` ➡️ `-1` |

---

## 5. String Concatenation: `+` Operator vs `.concat()` [Ep 54]

### A. Compile-Time Optimization (Literal + Literal):
```java
String s1 = "Hello" + "World"; // कंपाइलर इसे कंपाइल टाइम पर ही "HelloWorld" बना देता है (SCP में)
String s2 = "HelloWorld";
System.out.println(s1 == s2); // true
```

### B. Runtime Concatenation (Variable + Literal):
```java
String a = "Hello";
String s3 = a + "World"; // यह रन-टाइम पर StringBuilder का इस्तेमाल करके नया Heap Object बनाता है!
System.out.println(s2 == s3); // false
```

### C. '+' ऑपरेटर का Left-to-Right नियम:
```java
System.out.println(10 + 20 + "Java");   // Output: 30Java (पहले 10+20 जुड़ा, फिर String बनी)
System.out.println("Java" + 10 + 20);   // Output: Java1020 (पहले String बनी, फिर आगे सब String बन गया)
System.out.println("Java" + (10 + 20)); // Output: Java30 (ब्रैकेट पहले सॉल्व हुआ)
```

---

## 6. 20+ Inbuilt String Methods Master Guide [Ep 55]

| Method Signature | Return Type | Description / Use Case | Example |
| :--- | :--- | :--- | :--- |
| `length()` | `int` | स्ट्रिंग में कुल अक्षरों की संख्या | `"Java".length()` ➡️ `4` |
| `charAt(int index)` | `char` | दिए गए index पर मौजूद अक्षर (0-based) | `"Java".charAt(0)` ➡️ `'J'` |
| `substring(int beginIndex)` | `String` | दिए गए index से अंत तक का टुकड़ा | `"ZeroToPro".substring(4)` ➡️ `"ToPro"` |
| `substring(int begin, int end)` | `String` | `[begin, end)` रेंज का टुकड़ा | `"ZeroToPro".substring(0, 4)` ➡️ `"Zero"` |
| `indexOf(String str)` | `int` | सब-स्ट्रिंग का पहला index (ना मिले तो `-1`) | `"Java".indexOf("v")` ➡️ `2` |
| `lastIndexOf(char ch)` | `int` | अक्षर का आखिरी index | `"banana".lastIndexOf('a')` ➡️ `5` |
| `toUpperCase()` | `String` | सभी अक्षरों को CAPITAL में बदलता है | `"java".toUpperCase()` ➡️ `"JAVA"` |
| `toLowerCase()` | `String` | सभी अक्षरों को small में बदलता है | `"JAVA".toLowerCase()` ➡️ `"java"` |
| `trim()` | `String` | आगे और पीछे के फालतू spaces हटाता है | `"  hi  ".trim()` ➡️ `"hi"` |
| `replace(oldChar, newChar)` | `String` | पुराने अक्षर/शब्द को नए से बदलता है | `"cat".replace('c', 'b')` ➡️ `"bat"` |
| `contains(CharSequence s)` | `boolean` | चेक करता है कि शब्द मौजूद है या नहीं | `"Java 2026".contains("2026")` ➡️ `true` |
| `startsWith(String prefix)` | `boolean` | क्या स्ट्रिंग इससे शुरू होती है? | `"Mr. Sharma".startsWith("Mr.")` ➡️ `true` |
| `endsWith(String suffix)` | `boolean` | क्या स्ट्रिंग इससे खत्म होती है? | `"doc.pdf".endsWith(".pdf")` ➡️ `true` |
| `isEmpty()` | `boolean` | क्या `length == 0` है? | `"".isEmpty()` ➡️ `true` |
| `toCharArray()` | `char[]` | स्ट्रिंग को character array में बदलता है | `"Hi".toCharArray()` ➡️ `['H', 'i']` |
| `split(String regex)` | `String[]` | दिए गए डेलिमिटर के आधार पर टुकड़े करता है | `"a,b,c".split(",")` ➡️ `["a", "b", "c"]` |
| `join(delimiter, elements)` | `String` | एरे/लिस्ट को जोड़कर एक स्ट्रिंग बनाता है | `String.join("-", "01", "02")` ➡️ `"01-02"` |

---

## 7. String Interview Problems Roadmap & Next Steps [Ep 56]

स्ट्रिंग्स में महारत हासिल करने के लिए आवश्यक प्रॉब्लम-सॉल्विंग रोडमैप:

1. 🔄 **String Reversal:** बिना इनबिल्ट मेथड के लूप चलाकर स्ट्रिंग को उल्टा करना।
2. 🔍 **Palindrome Check:** दो-पॉइंटर अप्रोच (`left` और `right`) से चेक करना कि शब्द आगे और पीछे से समान है या नहीं (उदा. `"racecar"`, `"madam"`).
3. 🔠 **Vowels & Consonants Counter:** स्ट्रिंग में स्वर और व्यंजनों की गिनती।
4. 🧩 **Anagram Check:** चेक करना कि दो स्ट्रिंग्स में समान अक्षरों का प्रयोग हुआ है या नहीं (उदा. `"listen"` और `"silent"`).
5. ⚡ **Next Major Topic:** Mutable Strings — **`StringBuilder` और `StringBuffer`** (जब बहुत अधिक मॉडिफिकेशन करने हों और मेमोरी वेस्टेज रोकना हो).

---

## 📂 इस अध्याय की Code Files (Complete Episode Mappings)

| File | Episode / Video | Description |
| :--- | :--- | :--- |
| [`_01_StringBasicsHeapDemo.java`](./_01_StringBasicsHeapDemo.java) | Ep 50 | String Class, Object creation & Stack vs Heap memory layout |
| [`_02_MutableVsImmutableDemo.java`](./_02_MutableVsImmutableDemo.java) | Ep 51 | Immutability proofs, security & thread-safety reasons |
| [`_03_SCPVsHeapDemo.java`](./_03_SCPVsHeapDemo.java) | Ep 52 | String Constant Pool (SCP) vs Normal Heap & `.intern()` |
| [`_04_StringComparisonDemo.java`](./_04_StringComparisonDemo.java) | Ep 53 | `==` vs `.equals()` vs `.equalsIgnoreCase()` vs `.compareTo()` |
| [`_05_StringConcatenationMemoryDemo.java`](./_05_StringConcatenationMemoryDemo.java) | Ep 54 | `+` operator, `.concat()` and Heap memory optimizations |
| [`_06_StringMethodsMasterDemo.java`](./_06_StringMethodsMasterDemo.java) | Ep 55 | Practical demo of 20+ essential inbuilt String methods |
| [`_07_StringRoadmapProblemsDemo.java`](./_07_StringRoadmapProblemsDemo.java) | Ep 56 | Palindrome, Reversal, Vowels count and Interview Roadmap |

---

**Made with ❤️ for the Developer Community | #ZeroToPro**
