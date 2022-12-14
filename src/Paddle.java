import java.awt.*;

/**
 * This class represents the paddle that moves back and forth to keep the ball in play.
 */
public class Paddle extends Brick{
    private final int LEFTBOUND;
    private final int RIGHTBOUND;

    public Paddle(int height, int width, double xPos, double yPos, Color col, int left, int right){
        super(height,width,xPos,yPos,col);
        LEFTBOUND = left;
        RIGHTBOUND = right;
    }

    /**
     * If a collision is detected between the paddle and a projectile, call this method on the paddle and send it the projectile. If it is the ball, reflect the ball at an angle based on where it contacted the paddle. Functionality may later be added for certain powerups that apply to the paddle. Currently, all powerups are applied in the Game class.
     * @param incoming the projectile that contacted the paddle.
     * @param collisionSide 1 for top, 2 for right, 3 for bottom, 4 for left
     */
    public void collide(Projectile incoming, int collisionSide){
        if(incoming instanceof Ball){
            //compute the magnitude of the ball's velocity
            double ballSpeed = Math.sqrt(incoming.getxVelocity()*incoming.getxVelocity()+incoming.getyVelocity()*incoming.getyVelocity());

            double dY = incoming.getyPosition() - this.getyPosition();
            double dX = incoming.getxPosition() - this.getxPosition();
            double reflectAngle = Math.atan(dY/dX);

            double VyFinal = -1*Math.abs(ballSpeed*Math.sin(reflectAngle)); //the paddle always sends the ball up
            double VxFinal = Math.abs(ballSpeed*Math.cos(reflectAngle)); //by default, send the ball right
            if(incoming.getxPosition() < this.getxPosition()){//if the ball is on the left side of the paddle, send it left
                VxFinal *= -1;
            }

            incoming.setxVelocity(VxFinal);
            incoming.setyVelocity(VyFinal);
        }
    }

    /**
     * this method does nothing, because the paddle should never move up and down
     * @param yPos only included to correctly override the method from Drawable
     */
    @Override
    public void setyPosition(double yPos){

    }

    /**
     * only update the x position of the paddle within the bounds
     */
    @Override
    public void setxPosition(double xPos){
                int minX = LEFTBOUND + this.getWidth()/2;
        int maxX = RIGHTBOUND - this.getWidth()/2;

        if(xPos < minX){
            super.setxPosition(minX);
        }
        else if(xPos > maxX){
            super.setxPosition(maxX);
        }
        else{
            super.setxPosition(xPos);
        }
    }


    //This method is not needed in this class. Paddle velocity adjustments can be done in the update function using Drawable's getter and setter methods for velocity.
    //check to see which keys are pressed and set velocity as appropriate.
    //public void move(){}
}
