# Agricultural Drone Fleet Manager

## Overview
The Agricultural Drone Fleet Manager is a Command Line Interface (CLI) application built in Java. It allows farm operators to manage a fleet of specialized agricultural drones (sprayers and surveyors), dispatch them on automated waypoint missions, and track their flight telemetry via local file logging.

## Features (Functional Requirements)
- **Fleet Management (CRUD):** Add, view, and track the status of different drone types.
- **Mission Assignment:** Dispatch drones to specific geographical coordinates based on their payload capabilities.
- **Telemetry Logging:** Automatically generate post-mission reports saved to a local text file (`mission_logs.txt`).

## Technologies Used
- Java (JDK 8 or higher)
- Object-Oriented Principles (Inheritance, Abstraction, Polymorphism)
- Java Standard Library (Collections, File I/O, Scanner)

## How to Install and Run
This project requires no GUI or external IDE to run. 

1. Clone the repository: `git clone https://github.com/yourusername/AgriDroneFleetManager.git`
2. Navigate to the directory: `cd AgriDroneFleetManager`
3. Compile all Java files: `javac *.java`
4. Run the application: `java Main`

## Testing Instructions
1. Run the application.
2. Select Option `1` to add a Spraying Drone (e.g., ID: `AG-01`, Tank: `15.5`).
3. Select Option `3` to verify the drone was added.
4. Select Option `4` to dispatch a mission. Enter `spray` and coordinate `Zone A`.
5. Exit the program and check the newly created `mission_logs.txt` file in the root directory to verify File I/O operations worked correctly.