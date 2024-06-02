/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpatterndemo;
   public abstract class ShapeDecorator implements Shape {
 
    // Protected variable
    protected Shape decoratedShape;
 
    // Method 1
    // Abstract class method
    public ShapeDecorator(Shape decoratedShape)
    {
        // This keywordd refers to current object itself
        this.decoratedShape = decoratedShape;
    }
 
    // Method 2 - draw()
    // Outside abstract class
    public void draw() { decoratedShape.draw(); }
}

