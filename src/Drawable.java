import java.awt.*;

/**
 * Anything that will be drawn in the GUI is a drawable object
 */
public class Drawable {
    private double xPosition;
    private double yPosition;
    private double xVelocity;
    private double yVelocity;
    private Color color;

    /**
     * This constructor takes in the x position, the y position, the velocities in the x and y directions
     * and the color of the object to initialize a Drawable object.
     * @param xPos the x position of the Drawable object.
     * @param yPos the y position of the Drawable object.
     * @param xVel the velocity in the x direction of the Drawable object.
     * @param yVel the velocity in the y direction of the Drawable object.
     * @param col the color of the Drawable object.
     */
    public Drawable(double xPos, double yPos, double xVel, double yVel, Color col){
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.xVelocity = xVel;
        this.yVelocity = yVel;
        this.color = col;
    }

    /**
     * This method returns the x position of the objects under Drawable
     * @return the x position of the objects under Drawable.
     */
    public double getxPosition() {
        return xPosition;
    }

    /**
     * This method sets the x position of the Drawable objects.
     * @param xPosition the x position of the Drawable object.
     */
    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * This method returns the y position of the Drawable object.
     * @return the y position of the Drawable object.
     */
    public double getyPosition() {
        return yPosition;
    }

    /**
     * This method sets the y position of the Drawable Object.
     * @param yPosition the y position of the Drawable object.
     */
    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * This method retrieves the velocity in the x direction of the Drawable object.
     * @return the velocity in the x direction of the Drawable object.
     */
    public double getxVelocity() {
        return xVelocity;
    }

    /**
     * This method sets the velocity in the x direction of the Drawable object.
     * @param xVelocity the velocity in the x direction of the Drawable object.
     */
    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    /**
     * This method retrieves the velocity in the y direction of the Drawable object.
     * @return the velocity in the y direction of the Drawable object.
     */
    public double getyVelocity() {
        return yVelocity;
    }

    /**
     * This method sets the velocity in the y direction of the Drawable object.
     * @param yVelocity the velocity in the y direction of the Drawable object.
     */
    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    /**
     * This method retrieves the color of the Drawable object.
     * @return the color of the Drawable object.
     */
    public Color getColor() {
        return color;
    }

    /**
     * This method sets the color of the Drawable object.
     * @param color the color of the Drawable object.
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
