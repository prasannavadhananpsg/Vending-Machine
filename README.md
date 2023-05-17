# Vending-Machine
# Beverage Vending Machine

Welcome to the Beverage Vending Machine! This Java program simulates a vending machine that offers various beverages, including Espresso, Latte, Cappuccino, and Tea. Each beverage is made using specific ingredients and served with a description.

## How to Use

1. Run the Program: After successful compilation, run the program using the following command:
java Main


2. Choose a Beverage: The program will prompt you to choose a drink from the available options. Enter the corresponding number for your choice and press Enter.

3. Enjoy Your Beverage: The program will prepare and serve your selected beverage, providing a description of the drink.

## Beverage Options

1. Espresso: A bold and intense coffee experience.
2. Latte: A creamy delight with the perfect balance of coffee and milk.
3. Cappuccino: A frothy masterpiece that combines equal parts of espresso, steamed milk, and milk foam.
4. Tea: A soothing brew that warms the heart and invigorates the soul.

## Code Structure

- `Main.java`: The main entry point of the program that prompts the user for a beverage choice and interacts with the `BeverageVendingMachine` class.
- `BeverageVendingMachine.java`: The class responsible for making and serving the selected beverage based on the provided `BeverageInterface` implementation.
- `BeverageInterface.java`: An interface implemented by the beverage classes, defining the methods for retrieving ingredients and serving the beverage.
- `Espresso.java`, `Latte.java`, `Cappuccino.java`, `Tea.java`: Classes representing specific beverages, each implementing the `BeverageInterface` and providing their own implementation of ingredient retrieval and serving.
