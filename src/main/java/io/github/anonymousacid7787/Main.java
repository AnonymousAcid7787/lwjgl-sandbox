package io.github.anonymousacid7787;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void run() {
        System.out.println("Hello LWJGL " + Version.getVersion() + "!");

        WindowManager.init();
        WindowManager.loop();

        // Free the window callbacks and destroy the window
        glfwFreeCallbacks(WindowManager.window);
        glfwDestroyWindow(WindowManager.window);

        // Terminate GLFW and free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }



    public static void main(String[] args) {
        new Main().run();
    }
}
