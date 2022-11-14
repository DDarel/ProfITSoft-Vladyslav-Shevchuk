import org.example.*;
import org.example.Shapes.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class GeometryVolumeSortedTEST {
    @Test
    public void geometryVolumeSort(){
        ArrayList<Shape> inputList = new ArrayList<>();
        inputList.add(new Cube(4));
        inputList.add(new Sphere(4));
        inputList.add(new PyramidFour(4, 10));
        inputList.add(new PyramidThree(3, 10));
        inputList.add(new Parallelepiped(3, 10, 5));
        inputList.add(new Cylinder(3, 10));
        inputList.add(new Cone(3, 10));

        ArrayList<Shape> expectedList = new ArrayList<>();
        expectedList.add(new PyramidThree(3, 10)); //12.9903
        expectedList.add(new PyramidFour(4, 10)); //53.333333333333336
        expectedList.add(new Cube(4)); //64
        expectedList.add(new Cone(3, 10)); //94.24777960769379
        expectedList.add(new Parallelepiped(3, 10, 5));
        expectedList.add(new Sphere(4)); //268.082573106329
        expectedList.add(new Cylinder(3, 10)); //282.74

        inputList = GeometryVolumeSorted.geometryVolumeSorted(inputList);
        Assertions.assertEquals(expectedList, inputList);
    }
}
