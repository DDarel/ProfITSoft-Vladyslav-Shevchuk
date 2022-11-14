package org.example.Shapes;

public class PyramidThree implements Shape {

    protected double pyramid_three_side;

    protected double pyramid_three_high;

    public PyramidThree(double pyramid_three_side, double pyramid_three_high) {
        this.pyramid_three_side = pyramid_three_side;
        this.pyramid_three_high = pyramid_three_high;
    }

    @Override
    public double volume(){
        return pyramid_three_side*pyramid_three_side*pyramid_three_high/(4*1.73205080757);
    }

    @Override
    public String getName(){
        return "PyramidThree";
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
