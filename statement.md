## Problem Statement
Modern agriculture relies heavily on automation to increase crop yields, yet managing multiple autonomous drones—whether for spraying pesticides or surveying crop health—is often disjointed. Farm operators lack a lightweight, unified system to track drone availability, assign specific tasks based on hardware payloads, and log flight history without getting bogged down in low-level flight controller software.

## Scope of the Project
This project provides a terminal-based Java application to manage a multi-drone agricultural fleet. It intentionally abstracts the hardware-level flight control into a high-level logistical manager. The system handles drone categorization (Survey vs. Spraying), tracks real-time availability status, executes hardware-specific mission dispatching, and handles automated telemetry logging to local storage. 

## Target Users
- **Farm Managers:** Needing a quick overview of available hardware before deployment.
- **Drone Fleet Operators:** Dispatching specific drones to coordinate zones based on payload capability.
- **Agricultural Technology Researchers:** Auditing automated flight logs for efficiency analysis.

## High-Level Features
1. **Dynamic Fleet Tracking:** Real-time tracking of drone battery and availability status across different subclasses.
2. **Hardware-Specific Dispatch:** Business logic that prevents assigning survey hardware to chemical spraying coordinates.
3. **Automated Telemetry Logging:** Persistent File I/O logging of mission completion data and coordinate targets for post-flight auditing.