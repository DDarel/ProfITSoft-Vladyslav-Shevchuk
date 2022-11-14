package org.example.Shapes;

public class PyramidFour implements Shape {

    protected double pyramid_four_side;

    protected double pyramid_four_high;

    public PyramidFour(double pyramid_four_side, double pyramid_four_high) {
        this.pyramid_four_side = pyramid_four_side;
        this.pyramid_four_high = pyramid_four_high;
    }

    @Override
    public double volume(){
        return pyramid_four_side*pyramid_four_side*pyramid_four_high/3;
    }

    @Override
    public String getName(){
        return "PyramidFour";
    }

    @Override
    public int compareTo(Shape shape) {
        if (this.volume() - shape.volume() < 0) {
            return -1;
        } else if (this.volume() - shape.volume() > 0) {
            return 1;
        } else return 0;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof Shape)) {
            return false;
        }

        Shape c = (Shape) o;

        return Double.compare(this.volume(), c.volume()) == 0;
    }
}
