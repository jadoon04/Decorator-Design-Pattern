/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpatterndemo;

/**
 *
 * @author hp
 */
public class DecoratorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Shape circle = new Circle();
 
        Shape redCircle
            = new RedShapeDecorator(new Circle());
 
        Shape redRectangle
            = new RedShapeDecorator(new Rectangle());
 
        // Display message
        System.out.println("Circle with normal border");
 
        // Calling the draw method over the
        // object calls as created in
        // above classes
 
        // Call 1
        circle.draw();
 
        // Display message
        System.out.println("\nCircle of red border");
 
        // Call 2
        redCircle.draw();
 
        // Display message
        System.out.println("\nRectangle of red border");
 
        // Call 3
        redRectangle.draw();
    }
    
}
