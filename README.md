# 🧩 Simple Servlet Login Page

A simple Java web application built using **Servlets Java** and html page that demonstrates user authentication and page redirection. This project is ideal for beginners learning about **Java Servlets**, **HTTP request handling**, and **basic web form validation**.

---

## 🚀 Features
- Beautiful and responsive **Login Page** using inline HTML and CSS  
- **Servlet-based validation** for username and password  
- Redirects to a **Home Page** upon successful login  
- Displays an **alert message** for invalid credentials  
- Clean and minimal **UI design** for better user experience  

---

## ⚙️ Tech Stack
| Component | Technology |
|------------|-------------|
| **Frontend** | HTML, Inline CSS |
| **Backend** | Java Servlets (Jakarta EE) |
| **Server** | Apache Tomcat |
| **IDE** | Eclipse / IntelliJ IDEA |

---

## 🧠 Project Flow
1. User enters **username** and **password** on the login page (`index.html`)  
2. Form data is submitted to the **Servlet** (`PasswordChecker.java`)  
3. Servlet validates credentials:
   - ✅ If valid → redirects to `home.html`  
   - ❌ If invalid → shows an alert message (`Invalid Password`) and reloads login page  

---

## 🗂️ Folder Structure
```

Simple-Servlet-Login-Page/
│
├── src/
│   └── checker/
│       └── PasswordChecker.java
│
├── WebContent/
│   ├── index.html
│   ├── home.html
│   └── WEB-INF/
│       └── web.xml
│
└── README.md

````

---

## 💡 Learning Outcomes
- Understand how **HTML forms** interact with Servlets  
- Learn to handle **HTTP requests and responses**  
- Use **RequestDispatcher** for internal navigation  
- Implement basic **web authentication** using Servlets  

---

## 🖥️ Screenshots

### 🔐 Login Page
![Login Page](https://via.placeholder.com/800x400?text=Login+Page)

### 🏠 Home Page
![Home Page](https://via.placeholder.com/800x400?text=Home+Page)

---

## 🧑‍💻 How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/Simple-Servlet-Login-Page.git
````

2. Open the project in **Eclipse IDE** (or any Java IDE)
3. Add **Apache Tomcat** to your workspace
4. Run the project on the server
5. Open browser and go to:

   ```
   http://localhost:8080/Simple-Servlet-Login-Page/
   ```

---

## ✨ Author

**Harshini Gajanan Bhat**
📧 [Connect on LinkedIn]([https://www.linkedin.com/in/](https://www.linkedin.com/in/harshini0bhat/)
💻 Passionate about Java, Web Development, and Cybersecurity

---

