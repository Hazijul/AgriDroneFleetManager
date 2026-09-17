## Problem Statement
Modern agriculture relies heavily on automation to increase crop yields, yet managing multiple autonomous drones (for spraying pesticides and surveying crop health) is often disjointed. Operators lack a lightweight, unified system to track drone availability, assign specific tasks based on drone hardware, and log flight history.

## Scope of the Project
This project provides a terminal-based software solution to manage a multi-drone agricultural fleet. It abstracts the hardware-level flight control into a high-level logistical manager, handling drone categorization, availability status, and mission telemetry logging.

## Target Users
- Farm Managers
- Drone Fleet Operators
- Agricultural Technology Researchers

## High-Level Features
- Real-time tracking of drone battery and availability status.
- Hardware-specific mission dispatching (preventing survey drones from attempting spraying missions).
- Persistent logging of mission completion data for auditing purposes.