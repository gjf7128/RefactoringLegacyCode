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
        for (int i = 0; i != 2; i++) {
            lane.getCumulScores()[lane.getBowlIndex()][i] += curScore[i];
            // if a spare happens
            if (i == 1 && curScore[i] == 10) {
                lane.setFrameState(lane.getSpareState());
            }
            // if a strike happens
            else if (i == 0 && curScore[i] == 10) {
            }
            // if normal
            else {
                lane.setFrameState(lane.getNormalState());
            }
        }

    }
}
