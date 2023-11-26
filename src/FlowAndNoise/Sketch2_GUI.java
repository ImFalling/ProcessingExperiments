package FlowAndNoise;

import Sketchtools.ImGuiMenu;
import imgui.ImGui;
import imgui.app.Configuration;
import processing.core.PApplet;

public class Sketch2_GUI extends ImGuiMenu {
    public Sketch2_GUI(Sketch2 mainThread) {
        super(mainThread);
    }
    @Override
    protected void configure(Configuration config) {
        config.setTitle("Dear ImGui is Awesome!");
        config.setWidth(mainThread.displayWidth/3);
        config.setHeight(mainThread.displayHeight/3);
    }

    @Override
    public void process() {
        ImGui.text("Hello, World!");
        //Menu options to render for sketch2
        /*if(mainThread instanceof Sketch2 x){
            ImGui.text("Total lines = " + (x.getDrawers().size() + x.getPostDrawers().size()));
        }*/
    }
}
