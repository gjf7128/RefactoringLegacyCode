public class Normal implements FrameState {
    private Lane lane; //using lane since it has access to the scores needed for our methods.

    public Normal(Lane newLane) {
        lane = newLane;
    }


    @Override
    public void handleScore(Bowler bowler, int frame) {
        int[] curScore;
        int strikeballs = 0;
        int totalScore = 0;
        int counter = 0;
        curScore = (int[]) lane.getScores().get(bowler);
        for (int i = 0; i != 10; i++){
            lane.getCumulScores()[lane.getBowlIndex()][i] = 0;
        }
        for (int i = 0; i != 20; i++) {
            // if a spare happens
            if (i % 2 == 1 && curScore[i] == 10) {
                lane.getCumulScores()[lane.getBowlIndex()][(i-1)/2] += curScore[i];
                lane.setFrameState(lane.getSpareState());
            }
            else if (i == 0 && curScore[i+counter] == 10) {
                lane.getCumulScores()[lane.getBowlIndex()][i] += curScore[i+counter];
                counter += 2;
                lane.setFrameState(lane.getStrikeState());
            }
            else {
                if (i % 2 == 0 && i != 0) {
                    lane.getCumulScores()[lane.getBowlIndex()][(i/2)] += curScore[i] + lane.getCumulScores()[lane.getBowlIndex()][(i/2)-1];
                }
                else {
                    lane.getCumulScores()[lane.getBowlIndex()][(i-1)/2] += curScore[i];
                }
            }
        }
    }
}
