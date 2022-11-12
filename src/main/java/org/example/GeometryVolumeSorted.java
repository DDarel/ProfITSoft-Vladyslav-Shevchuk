package org.example;

import org.example.Shapes.*;
import java.util.ArrayList;
import java.util.Collections;
import org.testng.annotations.Test;

public class GeometryVolumeSorted {
    public static ArrayList<Shapes> geometryVolumeSorted(ArrayList<Shapes> inputList){
        Collections.sort(inputList);
        return inputList;
    }
}
