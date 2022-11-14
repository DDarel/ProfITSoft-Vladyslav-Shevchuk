package org.example;

import org.example.Shapes.*;
import java.util.ArrayList;
import java.util.Collections;

public class GeometryVolumeSorted {
    public static ArrayList<Shape> geometryVolumeSorted(ArrayList<Shape> inputList){
        Collections.sort(inputList);
        return inputList;
    }
}
