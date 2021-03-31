package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase() + ", area: "
                + calculateArea() + " sq. units, radius length: "
                + radius + " units, color: " + this.color);
    }
}
