/**
 * This file demonstrates the key differences between abstract classes and interfaces in Java.
 */

public class AbstractVsInterface {
    public static void main(String[] args) {
        System.out.println("Демонстрація різниці між абстрактним класом та інтерфейсом у Java:");
        System.out.println();
        
        // Використання абстрактного класу
        System.out.println("=== Приклад використання абстрактного класу ===");
        Dog dog = new Dog("Бобік", 5);
        dog.eat();
        dog.makeSound();
        dog.sleep();
        System.out.println();
        
        // Використання інтерфейсу
        System.out.println("=== Приклад використання інтерфейсу ===");
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        
        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Периметр кола: " + circle.calculatePerimeter());
        
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
        System.out.println("Периметр прямокутника: " + rectangle.calculatePerimeter());
        System.out.println();
        
        // Приклад множинного наслідування через інтерфейси
        System.out.println("=== Приклад множинного наслідування через інтерфейси ===");
        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.takePhoto();
        phone.browseInternet();
    }
    
    // ======= АБСТРАКТНИЙ КЛАС =======
    /**
     * Абстрактний клас - це клас, який не може бути інстанційований (не можна створити об'єкт цього класу).
     * Він може містити як абстрактні методи (без реалізації), так і звичайні методи з реалізацією.
     */
    abstract static class Animal {
        // Абстрактні класи можуть мати поля (стан)
        private String name;
        private int age;
        
        // Абстрактні класи можуть мати конструктори
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Абстрактний метод (без реалізації)
        public abstract void makeSound();
        
        // Звичайний метод з реалізацією
        public void sleep() {
            System.out.println(name + " спить...");
        }
        
        // Ще один звичайний метод з реалізацією
        public void eat() {
            System.out.println(name + " їсть...");
        }
        
        // Геттери і сеттери
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
    }
    
    // Конкретний клас, що наслідує абстрактний клас
    static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }
        
        // Обов'язково реалізуємо абстрактний метод
        @Override
        public void makeSound() {
            System.out.println(getName() + " гавкає: Гав-гав!");
        }
    }
    
    // ======= ІНТЕРФЕЙС =======
    /**
     * Інтерфейс - це повністю абстрактний тип, який визначає контракт для класів, що його реалізують.
     * Всі методи в інтерфейсі за замовчуванням є public і abstract (до Java 8).
     */
    interface Shape {
        // Всі методи в інтерфейсі за замовчуванням абстрактні
        double calculateArea();
        double calculatePerimeter();
        
        // З Java 8 можна додавати методи з реалізацією за допомогою ключового слова default
        default void printInfo() {
            System.out.println("Це геометрична фігура");
        }
        
        // З Java 8 можна додавати статичні методи
        static void printShapeInfo() {
            System.out.println("Інформація про геометричні фігури");
        }
    }
    
    // Клас, що реалізує інтерфейс
    static class Circle implements Shape {
        private double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        
        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
    
    // Ще один клас, що реалізує той самий інтерфейс
    static class Rectangle implements Shape {
        private double width;
        private double height;
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        
        @Override
        public double calculateArea() {
            return width * height;
        }
        
        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }
    
    // ======= МНОЖИННЕ НАСЛІДУВАННЯ ЧЕРЕЗ ІНТЕРФЕЙСИ =======
    // Інтерфейси для демонстрації множинного наслідування
    interface Phone {
        void call();
    }
    
    interface Camera {
        void takePhoto();
    }
    
    interface Browser {
        void browseInternet();
    }
    
    // Клас, що реалізує кілька інтерфейсів (множинне наслідування)
    static class SmartPhone implements Phone, Camera, Browser {
        @Override
        public void call() {
            System.out.println("Здійснюю дзвінок...");
        }
        
        @Override
        public void takePhoto() {
            System.out.println("Роблю фото...");
        }
        
        @Override
        public void browseInternet() {
            System.out.println("Переглядаю інтернет...");
        }
    }
}

/**
 * ОСНОВНІ ВІДМІННОСТІ МІЖ АБСТРАКТНИМ КЛАСОМ ТА ІНТЕРФЕЙСОМ:
 * 
 * 1. Наслідування:
 *    - Клас може наслідувати тільки один абстрактний клас (одиночне наслідування)
 *    - Клас може реалізувати багато інтерфейсів (множинне наслідування)
 * 
 * 2. Поля (змінні):
 *    - Абстрактний клас може мати поля будь-якого типу
 *    - Інтерфейс може мати тільки константи (public static final)
 * 
 * 3. Методи:
 *    - Абстрактний клас може мати як абстрактні методи, так і методи з реалізацією
 *    - Інтерфейс до Java 8 міг мати тільки абстрактні методи, з Java 8 може мати default та static методи
 * 
 * 4. Конструктор:
 *    - Абстрактний клас може мати конструктор
 *    - Інтерфейс не може мати конструктор
 * 
 * 5. Модифікатори доступу:
 *    - Методи і поля абстрактного класу можуть мати різні модифікатори доступу (private, protected, public)
 *    - Всі методи інтерфейсу за замовчуванням public
 * 
 * 6. Швидкість:
 *    - Абстрактні класи зазвичай швидші, ніж інтерфейси
 * 
 * 7. Призначення:
 *    - Абстрактні класи використовуються для створення ієрархії класів з спільною функціональністю
 *    - Інтерфейси використовуються для визначення контракту, який класи повинні реалізувати
 * 
 * КОЛИ ВИКОРИСТОВУВАТИ:
 * 
 * Використовуйте абстрактний клас, коли:
 * - Ви хочете поділитися кодом серед кількох тісно пов'язаних класів
 * - Класи, що наслідують абстрактний клас, мають багато спільних методів або полів
 * - Ви хочете оголосити non-public члени
 * - Ви хочете мати стан (поля) в базовому класі
 * 
 * Використовуйте інтерфейс, коли:
 * - Ви очікуєте, що непов'язані класи будуть реалізовувати ваш інтерфейс
 * - Ви хочете визначити поведінку для класів, незалежно від їх місця в ієрархії класів
 * - Ви хочете використовувати множинне наслідування
 */