# 3.1.2 Patterns : International Contact Manager (Abstract Factory Pattern)

## 📋 Description

This project is a small contact management application that supports **international phone numbers and addresses**. It demonstrates the use of the **Abstract Factory** design pattern to handle the variations in format between different countries.

## 🧱 Objective

The main goal is to build an address book that can store contacts from various countries, where each country may have different formats for:
- Phone numbers
- Addresses

The pattern ensures that each country has its own concrete implementation for these formats, while the application uses them through a common interface.

## 🎯 Features

- Add international contacts to the address book
- Use localized implementations for addresses and phone numbers
- Easily extendable to support more countries

## 🧰 Design Pattern Used

### Abstract Factory
This pattern is used to create families of related or dependent objects (in this case, addresses and phone numbers) without specifying their concrete classes.

- **Factory Interface**: `ContactFactory`
- **Concrete Factories**: `SpanishContactFactory`, `GermanContactFactory`, `IcelandContactFactory`
- **Abstract Products**: `Address`, `PhoneNumber`
- **Concrete Products**: `SpanishAddress`, `GermanPhoneNumber`, etc.


## 🚀 How to Run

Compile and run the `Main` class located in the `app` package. It demonstrates how to create and display international contacts using the abstract factory pattern.