# Calculator with Unit Converters

This project is a **Java program** that combines a simple calculator with **9 different unit converters**: Length, Currency, Area, Volume, Power, Pressure, Speed, Temperature, and Weight. The program efficiently uses `JPanel` to switch between different views without opening multiple frames, providing a smoother and more convenient user experience.

## Features

- **Basic Calculator**: Perform simple arithmetic operations (addition, subtraction, multiplication, division) through an intuitive interface.
- **9 Unit Converters**: Convert between different units in the following categories:
  - Length
  - Currency
  - Area
  - Volume
  - Power
  - Pressure
  - Speed
  - Temperature
  - Weight
- **Efficient UI**: The program uses `JPanel` to layer various conversion interfaces on top of the main calculator window, preventing multiple frames from appearing and keeping the interface organized.
  
## Screenshots

### 1. Opening Screen: Simple Calculator
This is the starting page of the program, where you can perform basic calculations. The calculator includes buttons for numeric input and arithmetic operations.  

![Simple Calculator Screenshot](https://github.com/user-attachments/assets/1f7c3970-9fbe-4833-a054-f9357fccd26a)

### 2. Menu to Switch Between Calculator and Unit Converters
In the top-left corner, there's a menu to select either the calculator or one of the 9 unit converters.  

![Menu Screenshot](https://github.com/user-attachments/assets/5979a378-7f2a-49d6-b244-239b86c42882)

### 3. Currency Converter Interface
When you select the **Currency Converter**, this screen appears. It provides two dropdown boxes to select the currency you want to convert from and to. You can input the amount via the number pad and view the converted value.  

![Currency Converter Screenshot](https://github.com/user-attachments/assets/0922f038-7c0f-4fe3-89cb-4896af444e2e)

### 4. Input and Result Display
Enter the amount to be converted in the top box, and the result will be displayed in the lower box.  

![Currency Input Screenshot](https://github.com/user-attachments/assets/b2ce2e7e-cd72-434b-85c8-692b1f754408)

### 5. Other Unit Converters
The same interface is used for all other unit converters, allowing you to convert between units in the categories listed above.  

![Other Unit Converter Screenshot](https://github.com/user-attachments/assets/c4052085-5a74-422c-982a-b984ae262ec9)

## How it Works

The program operates within a single `JFrame` to provide a seamless experience. By switching between `JPanel` layers, it avoids opening multiple windows, which makes it more user-friendly and visually cleaner.

### Switching Between Panels
Each unit converter is implemented as a separate `JPanel`, and these panels are stacked on top of each other in the main frame. When you select a different converter from the menu, the corresponding panel is brought to the front, replacing the current view.

### User Input
For both the calculator and unit converters, users input numbers using the on-screen numeric keypad. The system processes the inputs in real-time, and the results are displayed immediately in the designated output fields.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- A code editor like IntelliJ IDEA, Eclipse, or VS Code with Java support.

### Running the Program

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/ameykulkarni27/Calculator-with-Unit-Convertors-.git
    ```

2. Open the project in your Java IDE.

3. Build and run the program.

### Usage

1. Upon launching, you will see the **Simple Calculator** interface.
2. To switch to a unit converter:
   - Use the menu in the top-left corner.
   - Select the type of conversion (e.g., Currency, Length, Weight, etc.).
3. Input the amount and choose the units to convert between. The result will appear in the output box.

## Future Improvements

- **Additional Unit Converters**: Expand to more categories such as Energy, Force, or Time.
- **Currency Exchange Rates**: Integrate a real-time API to fetch updated exchange rates for the currency converter.
- **Themes and Customization**: Allow users to switch between different themes or personalize the interface.

## Contributing

If you'd like to contribute to this project, please fork the repository and submit a pull request with your improvements. Any enhancements, bug fixes, or new features are welcome!

1. Fork the project.
2. Create your feature branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.
