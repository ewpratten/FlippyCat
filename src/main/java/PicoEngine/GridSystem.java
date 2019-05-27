package PicoEngine;

import java.awt.Point;
//38x70

public class GridSystem {
    int w, h;

    int pixPerGridW;
    int pixPerGridH;

    public GridSystem(int rawHeight, int rawWidth, int gridHeight, int gridWidth) {
        pixPerGridW = (int) (rawWidth / gridWidth);
        pixPerGridH = (int) (rawHeight / gridHeight);

        w = rawWidth;
        h = rawHeight;
    }
    
    public Point getPoint(int x, int y) {
        return new Point(x * pixPerGridW, y * pixPerGridH);
    }
    
    public int getX(int x) {
        return x * pixPerGridW;
    }

    public int getY(int y) {
        return y * pixPerGridH;
    }
}