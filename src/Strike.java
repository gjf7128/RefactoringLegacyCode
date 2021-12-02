public class Strike implements FrameState {
    private Lane lane; //using lane since it has access to the scores needed for our methods.

    public Strike(Lane newLane) {
        lane = newLane;
    }


    @Override
    public void handleScore(Bowler bowler, int frame) {
        int[] curScore;
        int strikeballs = 0;
        int totalScore = 0;
        curScore = (int[]) lane.getScores().get(bowler);
        for (int i = 0; i != 10; i++){
            lane.getCumulScores()[lane.getBowlIndex()][i] = 0;
        }
    }
}
