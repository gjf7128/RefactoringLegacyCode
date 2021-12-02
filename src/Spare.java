public class Spare implements FrameState {
    private Lane lane;  //using lane since it has access to the scores needed for our methods.

    public Spare(Lane newLane) {
        lane = newLane;
    }


    @Override
    public void handleScore(Bowler bowler, int frame) {

    }
}
