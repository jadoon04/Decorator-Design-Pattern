/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpatterndemo;
public class RedShapeDecorator extends ShapeDecorator {
 
    public RedShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }
 
    @Override public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
 
    private void setRedBorder(Shape decoratedShape)
    {
      // Display message whenever function is called 
        System.out.println("Border Color: Red");
    }
}
