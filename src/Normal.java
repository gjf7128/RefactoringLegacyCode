public class Normal implements FrameState {
    private Lane lane; //using lane since it has access to the scores needed for our methods.

    public Normal(Lane newLane) {
        lane = newLane;
    }


    @Override
    public void handleScore(Bowler bowler, int frame) {

    }
}
