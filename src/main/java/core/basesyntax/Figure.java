package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    protected String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract String getFigureName();

    public abstract String getDetails();

    public void draw() {
        System.out.println("Figure: " + getFigureName()
                + ", area: " + getArea()
                + ", sq. units: " + getDetails()
                + ", color: " + getColor()
        );
    }
}
