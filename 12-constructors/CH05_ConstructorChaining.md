# 📖 Chapter 5: Constructor Chaining (`this()`)
> **📹 Video Timeline: 00:46:37** | **👨‍💻 Code Ref:** `CH05_ConstructorChaining.java`

## 🤦‍♂️ The Problem in Overloading (Messy Code)
ओवरलोडिंग करने पर हमें एक ही असाइनमेंट लॉजिक जैसे `this.name = name` हर एक कंस्ट्रक्टर में बार-बार लिखना पड़ता है। 
यह DRY (Don't Repeat Yourself) रूल को तोड़ता है और अगर फ्यूचर में कोई बदलाव करना हो, तो हमें हर जगह जाकर कोड बदलना पड़ेगा।

## 5️⃣ Constructor Chaining (Type 5) 
हम `this()` मेथड का यूज़ करके एक कंस्ट्रक्टर से दूसरे कंस्ट्रक्टर को कॉल (Call / Forward) कर सकते हैं। 

### 🏫 रियल-लाइफ एनालॉजी (The 3 Rooms)
- **Room 1:** एक स्टूडेंट के पास एडमिशन के लिए सिर्फ `Roll Number` था। रूम 1 के स्टाफ ने उसे डिफ़ॉल्ट नाम ("Unknown") के साथ **Room 2** में फॉरवर्ड कर दिया।
- **Room 2:** रूम 2 वालों ने नाम और रोल नंबर लेकर उसे **Room 3** में फॉरवर्ड किया।
- **Room 3 (Master Room):** सारा डाटा यहीं पर प्रोसेस (Assign) हुआ!

> **🚨 गोल्डन रूल:** `this()` का कॉल हमेशा कंस्ट्रक्टर कोड ब्लॉक की **पहली लाइन (First Statement)** पर होना चाहिए, वरना एरर आएगा!
