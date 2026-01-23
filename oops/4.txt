class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int s, double price, String c) {
        speed = s;
        regularPrice = price;
        color = c;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;

    Truck(int s, double price, String c, int w) {
        super(s, price, c);
        weight = w;
    }

    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice * 0.8;
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int s, double price, String c, int y, int m) {
        super(s, price, c);
        year = y;
        manufacturerDiscount = m;
    }

    double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;

    Sedan(int s, double price, String c, int l) {
        super(s, price, c);
        length = l;
    }

    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.9;
        }
    }
}

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck t = new Truck(65, 2500000, "Red", 3000);
        System.out.println("Price of Truck: " + t.getSalePrice());

        Car c = new Car(100, 800000, "Black");
        System.out.println("Price of Car: " + c.getSalePrice());

        Ford f = new Ford(120, 2200000, "Yellow", 2023, 20000);
        System.out.println("Price of Ford: " + f.getSalePrice());

        Sedan s = new Sedan(100, 3500000, "Blue", 22);
        System.out.println("Price of Sedan: " + s.getSalePrice());
    }
}
