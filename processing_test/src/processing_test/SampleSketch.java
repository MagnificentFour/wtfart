/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processing_test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author nikla_000
 */
public class SampleSketch extends PApplet implements ActionListener {

    int sizeWidth = 1280;
    int sizeHeight = 720;
    PImage bgImg;
    boolean gogo = false;

    @Override
    public void setup() {
        size(sizeWidth, sizeHeight);
        background(255);
        noLoop();
    }

    @Override
    public void draw() {
//        ellipse(mouseX, mouseY, 40, 40);
        if (gogo) {
            image(bgImg, 0, 0);
        }
    }

    public void loadBgImage(File filein) {
        bgImg = loadImage(filein.getAbsolutePath());
        gogo = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()) {
            case "run":
                loop();
                break;
        }
                
    }

}
