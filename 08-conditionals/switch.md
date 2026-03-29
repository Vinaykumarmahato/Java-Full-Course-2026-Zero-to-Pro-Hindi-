# 🔀 The `switch` Statement

## 🤔 Why Do We Need `switch`?
जब हमारे पास **मल्टीपल फ़िक्स्ड वैल्यूज़ (Multiple Fixed Values)** होती हैं, तो हम बहुत सारे `if-else-if` लेडर (ladder) लिखना शुरू कर देते हैं। 
इससे होने वाली परेशानियां:
1. **Long & Messy Code:** कोड बहुत बड़ा और पढ़ने में बेकार लगने लगता है।
2. **Readability Issue:** 50 लाइन का `if-else` कोई नहीं पढ़ना चाहता।
3. **Performance Issue:** अगर आपने 100 Conditions लिख दिए, तो जावा एक-एक करके सबको चेक करेगा, जिससे टाइम ज़्यादा लगता है।

इन्हीं सारी परेशानियों का "Permanent Solution" है ➡️ **Switch Statement**!

---

## 🛠️ Syntax & Keywords

```java
switch (variable) {
    case value1:
        // अगर variable की वैल्यू value1 है, तो यह कोड चलेगा
        break; // यहाँ से बाहर निकलो 
        
    case value2:
        // अगर variable की वैल्यू value2 है, तो यह कोड चलेगा
        break;
        
    default:
        // अगर ऊपर का कोई भी case मैच नहीं हुआ, तो यह चलेगा (Just like 'else')
}
```

### 🗝️ Important Keywords:
- **`switch(variable)`**: वह वेरिएबल जिसकी वैल्यू हमें चेक करनी है। इसका मतलब है "एक केस से दूसरे केस पर स्विच (jump) करना।"
- **`case`**: जिस फिक्स्ड वैल्यू से हम अपने वेरिएबल को मैच करवा रहे हैं।
- **`break`**: यह बहुत ही ज़रूरी है! अगर आप `break` नहीं लिखेंगे, तो जावा उस केस से नीचे वाले **सभी केसेज़ को रन कर देगा (Fall-through Problem)**।
- **`default`**: यह `if-else` के `else` जैसा काम करता है।

---

## 🪣 Supported Data Types (कौन से Data Type सपोर्ट होते हैं?)
- ✅ **Supported:** `int`, `char`, `String`, `enum`
- ❌ **Not Supported:** `float`, `double`, `boolean`

---

## 🚫 Limitations of `switch` (कहाँ Use नहीं कर सकते?)

1. **Complex Conditions Not Allowed:** 
   *(गलत)* `case age > 18:` ❌ 
   *(सही)* `case 18:` ✅
2. **Range Checking Not Possible:**
   *(गलत)* `case 80 to 90:` ❌
3. **Logical Expressions Not Allowed:**
   *(गलत)* `case num > 5 && num < 15:` ❌

*Rule of Thumb: हमेशा Fixed Values (जैसे 1, 2, 'A', "Monday") के लिए ही `switch` यूज़ करें!*

---

## 🏢 Project Application
हमने इस कांसेप्ट को एक **"Floor Selection System (धुरंधर बिल्डिंग)"** बनाकर समझा है।
इसका पूरा वर्किंग कंसोल ऐप आपको `All-Projects/03-Floor-Selection-System` के फोल्डर में मिलेगा!
