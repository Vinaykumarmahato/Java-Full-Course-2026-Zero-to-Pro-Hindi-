# 📖 Chapter 4: Constructor Overloading
> **📹 Video Timeline: 00:41:35** | **👨‍💻 Code Ref:** `CH04_ConstructorOverloading.java`

## 4️⃣ Constructor Overloading (Type 4)
क्लास के अंदर हम **एक से अधिक (Multiple) कंस्ट्रक्टर्स** बना सकते हैं। ऐसा करने की शर्त केवल यह है कि उनके अंदर डाले जाने वाले पैरामीटर्स (Arguments) अलग-अलग (Different Types या Different Counts) होने चाहिए।

### 🆚 Compile Time Decision
जावा कोड के रन होने से पहले (Compile Time पर ही) यह आसानी से डिसाइड कर लेता है कि:
- अगर यूजर ने 1 पैरामीटर पास किया है: तो वह 1 पैरामीटर वाला कंस्ट्रक्टर रन करेगा।
- अगर यूजर ने 3 पैरामीटर पास किये हैं: तो 3 वाला कंस्ट्रक्टर रन होगा।

यह फीचर हमें ऑब्जेक्ट क्रिएट करते समय बहुत सारे चॉइसेस (Choices) देता है!
