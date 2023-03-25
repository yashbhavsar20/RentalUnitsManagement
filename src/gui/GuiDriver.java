package gui;
import gui.java.HomePage;
public class GuiDriver {
    public static void main(String [] args) {
            Runnable runnable= new HomePage();
            Thread homePageThread=new Thread(runnable);
            System.out.println("New Thread Started");
            homePageThread.start();
        }
}
