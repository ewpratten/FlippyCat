package flippycat.screens;

import java.awt.Color;
import java.awt.Font;

import PicoEngine.Screen;
import PicoEngine.ScreenManager;
import PicoEngine.Window;

public class Credits implements Screen {
    ScreenManager sm = ScreenManager.getInstance();

    public void setup(Window win) {
        // Set the pallet
        win.setColor(Color.black);
        win.setBackgroundColor(Color.white);

        // Clear the window
        win.clear();
    }

    public void feed(Window win) {

    }
    
    public void draw(Window win) {
        // One-time draw
        synchronized (win) {
            win.clear();

            win.drawString("Developers:", win.getGrid().getX(1), win.getGrid().getY(134));
            win.drawString("Evan Pratten", win.getGrid().getX(1), win.getGrid().getY(138));
            win.drawString("Carter Tomlenovich", win.getGrid().getX(1), win.getGrid().getY(140));
        }

        win.sleep(10);
        sm.setScreen("Menu", win);
        
    }

}