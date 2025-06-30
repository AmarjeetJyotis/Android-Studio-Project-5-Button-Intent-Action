# Android-Studio-Project-5-Button-Intent-Action

![image](https://github.com/user-attachments/assets/dd483866-4b5f-45b9-b831-0fb0c3046192)


![image](https://github.com/user-attachments/assets/cfd230bd-fb56-4b70-946d-ab50708ddad2)

# Android Intent Data Transfer App

This is a simple Android application demonstrating how to pass data (Name and Age) between two activities using **Intents** in Android Studio. The user inputs their name and age on the first screen, and upon clicking the "Send Data" button, the information is displayed on the second screen.

## 📱 Features

- Collect user input using EditText
- Navigate between activities
- Transfer data using Intents
- Display personalized message on the second screen

## 🛠️ Built With

- Java
- Android Studio
- XML (for UI design)
- Android SDK 29 (API Level 29)

## 📸 Screenshots

### Activity 1 – User Input
![Input Screen](/mnt/data/Screenshot%202025-06-24%20210853.png)

### Activity 2 – Display Result
![Display Screen](/mnt/data/e3d960a2-4eef-4fb7-a08f-c303d0af62e2.png)


## 🧑‍💻 Author

**Amarjeet Kumar**  
**UID:** 21BCS10768  
**Department of Computer Science & Engineering**  
**Chandigarh University**

**Portfolio:** [https://amarjeetkr.vercel.app/](https://amarjeetkr.vercel.app/)  
**LinkTree:** [https://linktr.ee/AmarjeetKumarJyotish](https://linktr.ee/AmarjeetKumarJyotish)  
**GitHub:** [https://github.com/AmarjeetJyotis](https://github.com/AmarjeetJyotis)  
**LinkedIn:** [https://www.linkedin.com/in/amarjeet-jyotish/](https://www.linkedin.com/in/amarjeet-jyotish/)  
**GeeksforGeeks:** [https://www.geeksforgeeks.org/user/amarjeetjyotish/](https://www.geeksforgeeks.org/user/amarjeetjyotish/)  
**LeetCode:** [https://leetcode.com/u/AmarjeetJyotish/](https://leetcode.com/u/AmarjeetJyotish/)


## 📂 Project Structure

app/
├── java/
│ └── com.example.exp21/
│ ├── MainActivity.java
│ └── SecondActivity.java
├── res/
│ ├── layout/
│ │ ├── activity_main.xml
│ │ └── activity_second.xml
│ └── values/
│ └── strings.xml

bash
Copy
Edit

## 🚀 Getting Started

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/android-intent-demo.git
Open the project in Android Studio.

Run the app on an emulator or physical device.

🧠 How It Works
MainActivity.java:

Collects user input.

Sends it to SecondActivity using an Intent.

SecondActivity.java:

Receives the data via getIntent().getStringExtra(...).

Displays it in TextViews.

📌 Requirements
Android Studio Arctic Fox or newer

Android device or emulator (API 29+)

Java 8+

📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

