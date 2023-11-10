package Nodethreads;

import processing.core.PApplet;
import processing.core.PVector;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Sketch1 extends PApplet {
    public void settings(){
        size(800, 600);
    }
    ArrayList<Vertex> vertices;
    public void setup(){
        vertices = new ArrayList<Vertex>();
        for(int i = 0; i < 30; i++){
            var x = new Vertex(this, width/2f, height/2f);
            vertices.add(x);
        }
    }

    int tickCounter = 99;
    public void draw(){
        background(Color.GRAY.getRGB());
        fill(Color.BLACK.getRGB());
        for(Vertex x : vertices){
            x.nearestNeighbors = Vertex.findNearestNeighbors(x, vertices, 5);
            x.update();
            strokeWeight(1);
            circle(x.pos.x, x.pos.y, 15f);
            stroke(Color.blue.getRGB());
            strokeWeight(3);
            for(Vertex neighbor : x.nearestNeighbors){
                line(x.pos.x, x.pos.y, neighbor.pos.x, neighbor.pos.y);
            }
        }
        tickCounter += 1;
        if(tickCounter > 100)
            tickCounter = 0;
    }
}
