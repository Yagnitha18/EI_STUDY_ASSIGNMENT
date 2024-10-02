# EI_STUDY_ASSIGNMENT
# EXERCISE - 1
# Design Patterns in Java

## Introduction

This project showcases various design patterns implemented in Java. Design patterns are reusable solutions to common problems in software design. The patterns included in this project are:

1. **Creational Patterns**
   - Factory Pattern
   - Builder Pattern

2. **Structural Patterns**
   - Adapter Pattern
   - Decorator Pattern

3. **Behavioral Patterns**
   - Observer Pattern
   - Command Pattern

## Getting Started

To run the Java files in this project, you need to have the following installed:

- Java Development Kit (JDK) version 8 or higher.
- A terminal or command prompt.

### Running the Examples

Follow these steps to run the examples:

1. **Clone the Repository**

   Open your terminal and clone the repository using the following command:

   ```bash
   git clone https://github.com/Yagnitha18/EI_STUDY_ASSIGNMENT.git

2. **Navigate to the Desired Pattern Directory**
   
   Change into the directory of the design pattern you want to run. For example, to run the Builder
   pattern:

   ```bash
   cd Creational_Design_Pattern/Builder

3. **Compile the Java Files**

   Compile the java files using the javac command:

   ```bash
   javac *.java
   ```
   This command will generate .class files for each Java file in the directory.

4. **Run the Main Class**

   Execute the Main class using the java command:

   ```bash
   java Main


# EXERCISE - 2

# Virtual Classroom Manager

## Overview
The **Virtual Classroom Manager** is a terminal-based application designed to manage virtual classrooms in an educational setting. The application allows users to create classrooms, enroll students, schedule assignments, and track assignment submissions.

## Features
- **Classroom Management**: Create, list, and manage virtual classrooms.
- **Student Management**: Enroll students in classrooms and view the list of students in each classroom.
- **Assignment Management**: Schedule assignments for classrooms and allow students to submit assignments.
- **Logging**: Provides logging functionality to track actions and any errors that occur.

## Prerequisites
- **Java Development Kit (JDK)**: Ensure that you have JDK 8 or higher installed on your machine. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use a package manager like Homebrew (macOS) or apt (Linux).

## Installation
1. **Clone the Repository**:
   If using Git, clone the repository to your local machine:
   ```bash
   git clone <repository-url>

2. **Create Java Files**:
   Create the following Java files inside the VirtualClassroomManager directory:

     - `Assignment.java`
     - `Classroom.java`
     - LoggerUtil.java`
     - `ClassroomManager.java`
     - `Student.java`
     - `StudentManager.java`
     - `AssignmentManager.java`
     - `CommandProcessor.java`
     - `VirtualClassroomManager.java`

## Compilation and Execution

1. Open a Terminal: Navigate to the VirtualClassroomManager directory.

2. Compile the Java Files: Run the following command to compile all the Java files:

   ```bash
   javac *.java

3. Run the Application: After successful compilation, run the application with:

   ```bash
   java VirtualClassroomManager


## Usage
Once the application is running, you can enter commands in the terminal to manage the virtual classrooms. Here are some examples of commands you can use:

### Add Classroom
```bash
add_classroom <class_name>
```
**Example:**
```bash
add_classroom Math101
```

### Add Student
```bash
add_student <student_id> <class_name>
```
**Example:**
```bash
add_student S123 Math101
```

### Schedule Assignment
```bash
schedule_assignment <class_name> <assignment_details>
```
**Example:**
```bash
schedule_assignment Math101 Homework1
```

### Submit Assignment
```bash
submit_assignment <student_id> <class_name> <assignment_details>
```
**Example:**
```bash
submit_assignment S123 Math101 Homework1
```

### Exit the Application
To stop the application and exit the command prompt, use the following command:
```bash
exit
```
You can also stop a running command in the terminal by pressing `Ctrl + C`.

## Installation
1. Clone the repository.
2. Navigate to the project directory.
3. Install dependencies (if any).
4. Run the application.
