package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                double side = 1 + random.nextDouble() * 20;
                return new Square(color, side);
            case 1:
                double width = 1 + random.nextDouble() * 20;
                double hight = 1 + random.nextDouble() * 20;
                return new Rectangle(color, width, hight);
            case 2:
                double radius = 1 + random.nextDouble() * 20;
                return new Circle(color, radius);
            case 3:
                double firstLeg = 1 + random.nextDouble() * 20;
                double secondLeg = 1 + random.nextDouble() * 20;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                double base1 = 1 + random.nextDouble() * 20;
                double base2 = 1 + random.nextDouble() * 20;
                double height = 1 + random.nextDouble() * 20;
                return new IsoscelesTrapezoid(color, base1, base2, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
