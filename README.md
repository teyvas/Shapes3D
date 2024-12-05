# Shapes 3D Polymorphism Project

## Overview
This project demonstrates the concept of **polymorphism** in Java by modeling various 3D shapes using an interface. The program calculates the **surface area** and **volume** of different shapes (Sphere, Cylinder, Cube) and outputs the results.

## Features
- Implements a `Shape3DInterface` with methods for:
  - Calculating **surface area**.
  - Calculating **volume**.
- Defines classes for specific 3D shapes:
  - `Sphere`
  - `Cylinder`
  - `Cube`
- Uses random dimensions to generate and calculate properties of 10 shape objects.
- Demonstrates polymorphism by handling all shapes uniformly via the interface.

## Formulas Used

### Sphere
- **Surface Area**: \( 4 \pi r^2 \)
- **Volume**: \( \frac{4}{3} \pi r^3 \)

### Cylinder
- **Surface Area**: \( 2 \pi r (r + h) \)
- **Volume**: \( \pi r^2 h \)

### Cube
- **Surface Area**: \( 6 a^2 \)
- **Volume**: \( a^3 \)

## How It Works
1. A `Shape3DInterface` defines the blueprint for 3D shapes.
2. Classes (`Sphere`, `Cylinder`, `Cube`) implement the interface.
3. Random dimensions are generated for each shape.
4. The program calculates and outputs:
   - Shape name
   - Surface area
   - Volume


## Polymorphism
Polymorphism in this project is specifically demonstrated in the implementation of the Shape3DInterface. 
The interface declares two methods, surfaceArea() and volume(), which define the contract for calculating these properties. 
Each class that represents a 3D shape (e.g., Sphere, Cylinder, Cube) provides its own implementation of these methods, as the formulas for surface area and volume differ based on the shape.
![Shape 1](https://github.com/user-attachments/assets/62898ace-589d-4585-94e9-113ce7a55a91)

![Shape 2](https://github.com/user-attachments/assets/cb8a71ea-ec56-44ae-9a08-e54a5ec082e6)
