package solid.SingleResponsibility.singleResponsibity;


/*
Definition: A class should be open for extension but closed for modification.

Simple Words: You should be able to add new features without changing existing code.
*/


// Violates OCP: Adding new shape requires modifying this class
//class Shape {
//    void draw(String shapeType) {
//        if (shapeType.equals("Circle")) {
//            // Draw circle
//        } else if (shapeType.equals("Rectangle")) {
//            // Draw rectangle
//        }
//    }
//}

// Follows OCP: Use polymorphism to extend functionality
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        // Draw circle
    }
}

class Rectangle extends Shape {
    void draw() {
        // Draw rectangle
    }
}

