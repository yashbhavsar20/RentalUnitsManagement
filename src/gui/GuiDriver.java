package gui;
import gui.config.Config;
public class GuiDriver {
    public static void main(String [] args) {
            Runnable runnable= new Config();
            Thread homePageThread=new Thread(runnable);
            System.out.println("New Thread Started");
            homePageThread.start();
        }
}
