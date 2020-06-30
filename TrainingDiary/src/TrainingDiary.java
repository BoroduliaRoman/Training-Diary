/**
 * Created by BR 30.06.2020
 */
public class TrainingDiary {
    float[] date = {30.06F};
    String[] exercise = {"Bars"};
    int[] numberOfRepetitions = {32};
    int[] averageHeartRate = {98};
    float[] trainingTime = {17F};

    public static void main(String[] args) {
        TrainingDiary day1 = new TrainingDiary();
        day1.generalTrainingInformation();
    }

    public void generalTrainingInformation() {
        System.out.println("Date: " + date[0] + ", Exercise: " + exercise[0] + ", Number of repetitions: " +
                numberOfRepetitions[0] + ", Average Heart Rate :" + averageHeartRate[0] + ", Training time: "
                + trainingTime[0] + "m!");
    }
}