public class Frame{
  int frame;
  int score;
  private FrameState currentFrameState;
  private FrameState strike;
  private FrameState spare;
  private FrameState normal;

  public Frame(int frame, int score) {
    this.frame = frame;
    this.score = score;
    this.currentFrameState = normal;
  }

  public int getFrame(){
    return frame;
  }

  public FrameState getCurrentFrameState(){
    return currentFrameState;
  }

  public void setCurrentFrameState(FrameState newFrameState){
    this.currentFrameState = newFrameState;
  }

  public int getScore(){
    return score;
  }

  public void setScore(int frameScore){
    this.score += frameScore;
  }

  public void setFrame(int currentFrame){
    this.frame = currentFrame;
  }
}
