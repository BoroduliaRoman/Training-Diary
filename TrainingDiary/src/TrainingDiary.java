/**
 * Created by BR 30.06.2020
 */
public class TrainingDiary {
    public static void main(String[] args) {
        DaysOfTRaining day1 = new DaysOfTRaining();
        day1.setInfo(29.06F, "Pull-ups", 18, 98, 12.0F);
        day1.generalTrainingInformation();

        DaysOfTRaining day2 = new DaysOfTRaining();
        day2.setInfo(30.06F, "Bars", 32, 98, 17.0F);
        day2.generalTrainingInformation();
    }
}

class DaysOfTRaining {
    private float date;
    private String exercise;
    private int numberOfRepetitions;
    private int averageHeartRate;
    private float trainingTime ;

    void setInfo(float date, String exercise, int numberOfRepetitions, int averageHeartRate, float trainingTime) {
        this.date = date;
        this.exercise = exercise;
        this.numberOfRepetitions = numberOfRepetitions;
        this.averageHeartRate = averageHeartRate;
        this.trainingTime = trainingTime;
    }

    void generalTrainingInformation() {
        System.out.println("Date: " + date + "| Exercise: " + exercise + "| Number of repetitions: " +
                numberOfRepetitions + "| Average Heart Rate: " + averageHeartRate + "| Training time: "
                + trainingTime + "m!\n");
    }
}