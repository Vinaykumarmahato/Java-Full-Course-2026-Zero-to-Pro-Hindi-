# 📊 Mini Project: Student Result Analyzer (Console App)

## 🎯 Project Overview
यह एक कंसोल बेस्ड एप्लीकेशन (Console Base Application) है, जो यूजर से एक स्टूडेंट का नाम और उसके 5 सब्जेक्ट्स (Physics, Chemistry, Math, Hindi, English) के मार्क्स इनपुट लेता है। फिर यह उन सब्जेक्ट्स का टोटल मार्क्स कैलकुलेट करता है, और एक्यूरेट परसेंटेज निकालकर स्क्रीन पर एक शानदार रिपोर्ट प्रिंट करता है।

**यह प्रोजेक्ट किन टॉपिक्स को मिला कर बना है?**
1. Variables & Data Types (`int`, `double`, `String`)
2. Methods (`void`, `int`, `double` return types)
3. Parameters & Arguments 
4. Arithmetic Operators (`+`, `*`, `/`)
5. *New Topic:* User Input via `Scanner`

---

## 🍕 "The Food Parcel Concept" - Introduction to Packages
जैसे आप बिहार में बैठकर यूपी का खाना मंगवाना चाहते हैं, तो आपको उस "घर" (पैकेज) का नाम बुलाना पड़ता है। प्रोग्रामिंग में पहले से ही कुछ कोड बना-बनाया रखा होता है। हम उसे अपने प्रोग्राम में बुलाने के लिए `import` कीवर्ड का इस्तेमाल करते हैं।

```java
import java.util.Scanner;
```
- `java`: मेन फोल्डर।
- `util`: उस फोल्डर के अंदर एक और फोल्डर।
- `Scanner`: उस फोल्डर के अंदर मौजूद एक क्लास (Class) जो इनपुट लेने का सारा लॉजिक जानती है।

### How to use Scanner?
```java
Scanner sc = new Scanner(System.in);
```
- **`System.in`**: इसका मतलब है कि हम जावा को बता रहे हैं कि "भाई, कीबोर्ड (Keyboard) से इनपुट ले लो।" 
- **`.nextLine()`**: `String` (Text) इनपुट लेने के लिए।
- **`.nextInt()`**: `int` (Integer Numbers) इनपुट लेने के लिए।

---

## 🧠 Brain Logic: Breaking tasks into Methods
एक प्रोफेशनल डेवलपर कभी भी सारा कोड एक साथ `main` मेथड में नहीं भरता। हम हर छोटे Task (काम) के लिए एक सेपरेट (Separate) Method बनाते हैं। 

1. **`takeUserInput()`**
   - यह हमारा 'Master Method' है। यह `Scanner` का यूज़ करके स्टूडेंट का नाम और 5 मार्क्स लेगा। फिर यह बाकी सारे मेथड्स को कॉल करेगा।
2. **`calculateTotal(int a, int b, int c, int d, int e)`**
   - यह 5 मार्क्स लेगा, उन्हें जोड़ेगा, और टोटल रिज़ल्ट को `return` कर देगा ताकि हम उसे कहीं सेव कर सकें।
   - *Pro Tip:* पैरामीटर में हम `a, b, c...` लिख सकते हैं। इसका मतलब है कि वैल्यू जिस ऑर्डर में भेजी जाएगी, उसी ऑर्डर में स्टोर होगी। "दोस्त के घर पर आपका नाम अलग हो सकता है, लेकिन इंसान आप वही रहते हैं!"
3. **`calculatePercentage(int totalMarks)`**
   - यह टोटल मार्क्स लेगा और `(totalMarks * 100.0) / 500` का इस्तेमाल करके डेसिमल वाला पॉइंट एक्यूरेट परसेंटेज कैलकुलेट कर के `return` करेगा।
   - *Note:* हमने `100.0` क्यों लिया? क्योंकि अगर हम दो `int` को डिवाइड करते हैं तो जावा डेसिमल हटा देता है। हमें प्वाइंट में रिज़ल्ट चाहिए था इसलिए हमने Double का यूज़ किया।
4. **`showReport(String name, int total, double percentage)`**
   - यह लास्ट स्टेप है, जो सारा कैलकुलेटेड डेटा ले कर टर्मिनल में सुंदर सा रिपोर्ट कार्ड प्रिंट करेगा।

---

## 🚀 Execution Flow (कैसे काम कर रहा है?)
1. `main` मेथड से प्रोग्राम स्टार्ट होगा।
2. `main` तुरंत `takeUserInput()` को बुलाएगा।
3. `takeUserInput()` नाम और मार्क्स पूछेगा।
4. `takeUserInput()` अब `calculateTotal` को बुला कर टोटल मार्क्स लाएगा और एक वेरिएबल में सेव कर लेगा।
5. फिर से `takeUserInput()` अब `calculatePercentage` को वो सेम टोटल मार्क्स भेज कर परसेंटेज निकालेगा।
6. फाइनली, यह सारा डेटा `showReport` को भेज दिया जाएगा जो आउटपुट में रिज़ल्ट दिखा देगा।
