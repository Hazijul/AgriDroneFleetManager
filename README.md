# 🚁 Agri-Drone Fleet Manager

Welcome to the **Agri-Drone Fleet Manager**! This is my custom project submission for the Java Programming evaluation. 

## 📖 Project Overview
As modern agriculture leans heavier into automation, farm operators are deploying multiple drones for different tasks—like spraying crops and surveying field health. However, managing these fleets manually is inefficient. 

I built this command-line application to act as a high-level logistical layer for agricultural drones. Instead of dealing with low-level flight controllers, this software focuses on the management side: tracking which drones are available, categorizing them by their hardware payloads (chemical tanks vs. cameras), dispatching them to specific field coordinates, and automatically logging their flight telemetry.

## ✨ Key Features (Functional Requirements)
To meet the project requirements, I built out three core functional modules:
1. **Dynamic Fleet Management (CRUD):** Users can register new drones into the system, view the entire active fleet, and track real-time availability and battery levels.
2. **Hardware-Aware Mission Dispatch:** The system uses business logic to ensure that only available drones of the correct type are dispatched (e.g., preventing a survey drone from attempting a spraying mission).
3. **Automated Telemetry Logging:** Every time a drone completes a mission, the system simulates the battery drain and automatically writes a post-flight report to a local text file (`mission_logs.txt`) for auditing purposes.

## 🛠️ Technology Stack & Concepts
I intentionally kept this project lightweight and fully executable from the terminal without requiring any heavy IDEs or external databases. 
* **Language:** Core Java (JDK 8+)
* **Architecture:** Pure Object-Oriented Programming (OOP)
  * **Inheritance & Polymorphism:** Created an abstract base `Drone` class, extended by specialized `SprayingDrone` and `SurveyDrone` subclasses.
  * **Interfaces:** Implemented a `Mission` interface to standardize how different drones execute tasks.
  * **Encapsulation:** Protected class variables using strict getter/setter methods.
* **Data Handling:** Java Collections (`ArrayList`) for dynamic memory management.
* **Storage:** Java File I/O (`FileWriter`) for persistent log storage.

## 🚀 How to Install and Run
I designed this to be fully executable via the command line, requiring zero GUI-based setup. Assume you are starting from scratch:

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/Hazijul/AgriDroneFleetManager.git](https://github.com/Hazijul/AgriDroneFleetManager.git)