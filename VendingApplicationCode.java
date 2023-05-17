import java.util.*;

interface BeverageInterface {
    List<Ingredient> getIngredients();
    void serve(String beverage);
}
class Cappuccino implements BeverageInterface {
    private Ingredient coffee;
    private Ingredient milk;
    private Ingredient foam;

    public Cappuccino() {
        coffee = new Ingredient("coffee", "gm", 20);
        milk = new Ingredient("milk", "ml", 100);
        foam = new Ingredient("foam", "ml", 50);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(coffee);
        ingredients.add(milk);
        ingredients.add(foam);
        return ingredients;
    }

    @Override
    public void serve(String beverage) {
        System.out.println("Serving " + beverage);
    }

    public Cappuccino makeCappuccino() {
        grindCoffee(coffee);
        brewCoffee(coffee);
        steamMilk(milk);
        createFoam(foam);
        mixCoffeeMilkAndFoam(coffee, milk, foam);
        return this;
    }

    private void grindCoffee(Ingredient coffee) {
        System.out.println("Grinding coffee beans");
    }

    private void brewCoffee(Ingredient coffee) {
        System.out.println("Brewing coffee");
    }

    private void steamMilk(Ingredient milk) {
        System.out.println("Steaming milk");
}
    private void createFoam(Ingredient foam) {
        System.out.println("Creating milk foam");
    }

    private void mixCoffeeMilkAndFoam(Ingredient coffee, Ingredient milk, Ingredient foam) {
        System.out.println("Mixing coffee, milk, and foam");
    }
}

class Espresso implements BeverageInterface {
    private Ingredient coffee;

    public Espresso() {
        coffee = new Ingredient("coffee", "gm", 20);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(coffee);
        return ingredients;
    }

    @Override
    public void serve(String beverage) {
        System.out.println("Serving " + beverage);
    }

    public Espresso makeEspresso() {
        grindCoffee(coffee);
        brewCoffee(coffee);
        return this;
    }

    private void grindCoffee(Ingredient coffee) {
        System.out.println("Grinding coffee beans");
    }

    private void brewCoffee(Ingredient coffee) {
        System.out.println("Brewing coffee");
    }
}
class Latte implements BeverageInterface {
    private Ingredient coffee;
    private Ingredient milk;

    public Latte() {
        coffee = new Ingredient("coffee", "gm", 20);
        milk = new Ingredient("milk", "ml", 100);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(coffee);
        ingredients.add(milk);
        return ingredients;
    }

    @Override
    public void serve(String beverage) {
        System.out.println("Serving " + beverage);
    }

    public Latte makeLatte() {
        grindCoffee(coffee);
        brewCoffee(coffee);
        steamMilk(milk);
        mixCoffeeAndMilk(coffee, milk);
        return this;
    }

    private void grindCoffee(Ingredient coffee) {
        System.out.println("Grinding coffee beans");
    }

    private void brewCoffee(Ingredient coffee) {
        System.out.println("Brewing coffee");
    }

    private void steamMilk(Ingredient milk) {
        System.out.println("Steaming milk");
    }

    private void mixCoffeeAndMilk(Ingredient coffee, Ingredient milk) {
        System.out.println("Mixing coffee and milk");
    }
}
class Tea implements BeverageInterface {
    private Ingredient teaLeaves;
    private Ingredient water;

    public Tea() {
        teaLeaves = new Ingredient("tea leaves", "gm", 5);
        water = new Ingredient("water", "ml", 200);
    }

    @Override
    public List<Ingredient> getIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(teaLeaves);
        ingredients.add(water);
        return ingredients;
    }

    @Override
    public void serve(String beverage) {
        System.out.println("Serving " + beverage);
    }

    public Tea makeTea() {
        steepTea(teaLeaves, water);
        return this;
    }

    private void steepTea(Ingredient teaLeaves, Ingredient water) {
        System.out.println("Steeping tea leaves in hot water");
    }
}
class BeverageVendingMachine {
    private BeverageInterface beverage;

    public BeverageVendingMachine(BeverageInterface beverage) {
        this.beverage = beverage;
    }

   public void makeBeverage() {
    if (beverage instanceof Espresso) {
        Espresso espresso = (Espresso) beverage;
        espresso.makeEspresso();
        beverage.serve("Espresso: A bold and intense coffee experience");
    } else if (beverage instanceof Latte) {
        Latte latte = (Latte) beverage;
        latte.makeLatte();
        beverage.serve("Latte: A creamy delight with the perfect balance of coffee and milk");
    } else if (beverage instanceof Cappuccino) {
        Cappuccino cappuccino = (Cappuccino) beverage;
        cappuccino.makeCappuccino();
        beverage.serve("Cappuccino: A frothy masterpiece that combines equal parts of espresso, steamed milk, and milk foam");
    } else if (beverage instanceof Tea) {
        Tea tea = (Tea) beverage;
        tea.makeTea();
        beverage.serve("Tea: A soothing brew that warms the heart and invigorates the soul");
    }
}
}


class Ingredient {
    private String name;
    private String unit;
    private double value;

    public Ingredient(String name, String unit, double value) {
        this.name = name;
        this.unit = unit;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Beverage Vending Machine!");
        System.out.println("Please choose a drink:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("4. Tea");
        int choice = scanner.nextInt();

        BeverageInterface beverage;

        switch (choice) {
            case 1:
                beverage = new Espresso();
                break;
            case 2:
                beverage = new Latte();
                break;
            case 3:
                beverage = new Cappuccino();
                break;
            case 4:
                beverage = new Tea();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        BeverageVendingMachine vendingMachine = new BeverageVendingMachine(beverage);
        vendingMachine.makeBeverage();
    }
}


