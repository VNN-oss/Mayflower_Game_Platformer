import mayflower.*;
public class AnimatedActor extends Actor
{
    private Animation animation;
    private Timer animationTimer;
    public AnimatedActor()
    {
        animation = new Animation();
        animationTimer = new Timer(100000000);
    }
    public void setAnimation(Animation a)
    {
        animation = a;
    }
    public void act()
    {
        if(animation != null)
        {
            if(animationTimer.isDone() )
            {
                animationTimer.reset();
                MayflowerImage variable = animation.getNextFrame();
                setImage(variable);
            }
        }
    }
}
