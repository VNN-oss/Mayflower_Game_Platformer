import mayflower.*;
public class Animation
{
    private MayflowerImage[] frames = new MayflowerImage[10];
    private int currentFrame;
    private int frameRate;
    public Animation()
    {
        currentFrame = 0;
    }
    public Animation(int frame, String[] images)
    {
        currentFrame = 0;
        frameRate = frame;
        for(int i = 0; i<10; i++)
        {
            frames[i] = new MayflowerImage(images[i]);
        }
    }
    public int getFrameRate()
    {
        return frameRate;
    }
    public MayflowerImage getNextFrame()
    {
        int index = currentFrame;
        currentFrame++;
        currentFrame = currentFrame % frames.length;
        return frames[index];
    }
}
