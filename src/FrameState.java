public interface FrameState {

    void changeState(String state);
    void handleScore(Bowler bowler, int frame);
}
