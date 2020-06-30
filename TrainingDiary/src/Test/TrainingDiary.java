package Test;

public class TrainingDiary {

    public static void main(String[] args) {
        DaysOfTRaining day1 = new DaysOfTRaining();
        //day1.setInfo(29.06F, "Pull-ups", 18, 98, 12.0F);

        day1.setDate(29.06F);
        day1.setExercise("Pull-ups");
        day1.setNumberOfRepetitions(18);
        day1.setAverageHeartRate(98);
        day1.setTrainingTime(12.0F);

        day1.generalTrainingInformation();
        day1.calculateExercisesToHundred();



        DaysOfTRaining day2 = new DaysOfTRaining();
        //day2.setInfo(30.06F, "Bars", 32, 98, 17.0F);

        day2.setDate(30.06F);
        day2.setExercise("Bars");
        day2.setNumberOfRepetitions(32);
        day2.setAverageHeartRate(98);
        day2.setTrainingTime(17.0F);

        day2.generalTrainingInformation();
        day2.calculateExercisesToHundred();
    }
}

class DaysOfTRaining {
    private float date;
    private String exercise;
    private int numberOfRepetitions;
    private int averageHeartRate;
    private float trainingTime ;

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        if (exercise.isEmpty()) {
            System.out.println("Введи название упражнения");
        }
        this.exercise = exercise;
    }

    public int getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(int numberOfRepetitions) {
        this.numberOfRepetitions = numberOfRepetitions;
    }

    public int getAverageHeartRate() {
        return averageHeartRate;
    }

    public void setAverageHeartRate(int averageHeartRate) {
        this.averageHeartRate = averageHeartRate;
    }

    public float getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(float trainingTime) {
        this.trainingTime = trainingTime;
    }

    /*
    void setInfo(float date, String exercise, int numberOfRepetitions, int averageHeartRate, float trainingTime) {
        this.date = date;
        this.exercise = exercise;
        this.numberOfRepetitions = numberOfRepetitions;
        this.averageHeartRate = averageHeartRate;
        this.trainingTime = trainingTime;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public float getDate(){
        return date;
    }

    void setExercise(String exercise) {
        this.exercise = exercise;
    }

    void setNumberOfRepetitions(int numberOfRepetitions) {
        this.numberOfRepetitions = numberOfRepetitions;
    }

    void setAverageHeartRate(int averageHeartRate){
        this.averageHeartRate = averageHeartRate;
    }

    void setTrainingTime(float trainingTime) {
        this.trainingTime = trainingTime;
    }

     */

    void calculateExercisesToHundred() {
        int hundred = 100 - numberOfRepetitions;
        System.out.println("Number of exercises up to a hundred: " + hundred);
    }

    void generalTrainingInformation() {
        System.out.println("\nDate: " + date + "| Exercise: " + exercise + "| Number of repetitions: " +
                numberOfRepetitions + "| Average Heart Rate: " + averageHeartRate + "| Training time: "
                + trainingTime + "m!");
    }
}