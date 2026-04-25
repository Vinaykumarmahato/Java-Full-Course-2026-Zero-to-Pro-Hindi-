# 📖 Chapter 3: Parameterized Constructor & `this` Keyword
> **📹 Video Timeline: 00:31:36** | **👨‍💻 Code Ref:** `CH03_Parameterized_ThisKeyword.java`

## 3️⃣ Parameterized Constructor (Type 3)
यहीं से आपको कंस्ट्रक्टर का असली पावर देखने को मिलता है! यह इंडस्ट्री में सबसे ज्यादा इस्तेमाल किया जाता है।
जब हम ऑब्जेक्ट बनाते समय ही वैल्यू (Arguments) पास कर देते हैं:
`Student s1 = new Student(101, "Vinay", "Mumbai");` 

यह एक ही लाइन में ऑब्जेक्ट भी बनाता है और वैल्यू भी असाइन कर देता है! अगर आप एक भी वैल्यू (जैसे City) भूल गए, तो जावा उसी वक़्त कंपाइलर एरर (Error) देगा (प्रॉब्लम सॉल्व!)।

## 🔑 The `this` Keyword का जादू
जब हमारे **Instance Variable** (Class Level) और **Parameter Variable** (Local) का नाम बिल्कुल सेम हो जाता है (जैसे दोनों `name` हैं), तो जावा कंफ्यूज हो जाता है कि कौन सा वेरिएबल कहाँ से आ रहा है।

**सलूशन:** 
`this` का मतलब होता है "करंट ऑब्जेक्ट का रेफ़रेन्स"।
`this.name = name;` का मतलब है कि *"हे जावा, जो मेरे हिप एरिया में ऑब्जेक्ट का `name` है, उसमे वह `name` डालो जो यूजर ने फॉर्म (पैरामीटर) में दिया है।"*
