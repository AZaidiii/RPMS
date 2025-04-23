# Remote Health Monitoring System (RPMS)

## Overview

This is a Java-based Remote Health Monitoring System developed as part of the **CS-212 Object Oriented Programming** course. It demonstrates core OOP principles such as encapsulation, abstraction, interfaces, inheritance, and composition.

## Features

- Vital sign monitoring with emergency alert
- Manual panic button triggering
- Doctor-patient chat system
- Video consultation via Zoom or Google Meet
- Appointment and medication reminder notifications (Email/SMS)

## Files

- `RemoteHealthMonitoringApp.java`: Main program file containing all class definitions and test interactions.

## How to Run

### Prerequisites
- Java 8 or above
- Any Java IDE (e.g., IntelliJ, Eclipse) or command-line Java setup

### Steps
1. **Clone or Download** the repository.
2. Open the file `RemoteHealthMonitoringApp.java` in your IDE.
3. Compile and run the main class:
4. Follow the console prompts to:
- Enter heart rate and temperature
- Decide whether to trigger the panic button
- Simulate chat between patient and doctor
- Choose a platform for video consultation
- Send a reminder to a specified email

## Concepts Demonstrated

- **Encapsulation**: Private attributes and public getters/setters
- **Inheritance**: `Notifiable` interface implemented by multiple classes
- **Composition**: Classes like `EmergencyAlert` use `NotificationService`
- **Abstraction**: Clients interact with simplified interfaces, hiding internal logic
- **Interfaces**: `Notifiable` for email and SMS notifications



