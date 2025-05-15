
## 🧩 JSON Handling in Java – Practice & Projects

### 📘 Overview

This section includes **hands-on JSON practice problems** and a **project-level use case** designed to strengthen understanding of real-world JSON manipulation using Java. It leverages libraries such as **Jackson**, **org.json**, and **Gson** to work with JSON data effectively.

---

### 📌 Practice Problems

#### ✅ Beginner-Level Tasks

1️⃣ **Create a JSON object** for a Student with fields: `name`, `age`, `subjects (array)`
2️⃣ **Convert a Java object (Car)** into a JSON string
3️⃣ **Read a JSON file** and extract only specific fields like `name`, `email`
4️⃣ **Merge two JSON objects** into a single composite JSON
5️⃣ **Validate JSON structure** using Jackson’s schema validation tools
6️⃣ **Convert a list of Java objects** into a JSON array
7️⃣ **Parse and filter JSON** to select records where `age > 25`

#### 🧪 Hands-on Problems

1️⃣ Read a JSON file and **print all keys and values**
2️⃣ Convert a **List\<Object>** into a JSON array
3️⃣ Filter JSON data: **Print only users older than 25 years**
4️⃣ Validate an **email field** using **JSON Schema**
5️⃣ Merge **two JSON files** into a single JSON object
6️⃣ Convert **JSON → XML** format
7️⃣ Convert **CSV → JSON**
8️⃣ Generate a **JSON report from database records**

---

### 🏏 Project: IPL and Censor Analyzer

#### 🎯 Objective

Build a Java application that analyzes **IPL match data** from JSON and CSV formats, applies **censorship or redaction rules**, and outputs **cleaned data** to new files.

#### 📂 Features

* Read match statistics from JSON and/or CSV files
* Apply rules such as:

    * Redact inappropriate or sensitive words from match commentary
    * Mask player names based on match location
* Write the **sanitized match data** back to a cleaned JSON or CSV file
* Generate summary reports such as:

    * Most redacted entries
    * Players with most appearances
    * Match location-wise censorship breakdown

#### 🛠 Tools & Libraries

* **Jackson / Gson** for JSON parsing
* **OpenCSV / Apache Commons CSV** for CSV parsing
* **Regex & Streams** for filtering and censorship logic
* Optional: **JavaFX / CLI interface** for user-driven reports

#### 📈 Outcomes

* Gain practical experience with real-world data structures
* Understand JSON + CSV data integration
* Apply data sanitization, validation, and transformation in Java


