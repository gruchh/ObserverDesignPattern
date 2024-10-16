# Observer Design Pattern Example

This repository contains a simple example of the Observer design pattern in Java. The example demonstrates the use of two threads: one that listens for user interaction and another that counts from 1 to 100.

## Overview

The program consists of the following components:
1. `Subject` class: Manages observers and notifies them of state changes.
2. `Observer` interface: Defines the method to be implemented by observers.
3. `ObserverImpl` class: Implements the `Observer` interface and handles state updates.
4. `Main` class: Demonstrates the usage of the observer pattern with two threads.