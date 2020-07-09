import java.util.GregorianCalendar;

/**
 * Created by BR 09.07.2020
 */
class DaysOfTRaining {

    public static String description;
    private static int numberOfTraining;
    public static String MOTIVATION = "No pain no gain";

    private float date;
    private String exercise;
    private int numberOfRepetitions;
    private int averageHeartRate;
    private float trainingTime;


    public DaysOfTRaining() {
        this.exercise = "Lead the name of the exercise";
        numberOfTraining++;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        if (date > 31 || date < 1) {
            System.out.println("There is no such date yet");
        } else {
            this.date = date;
        }
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        if (exercise.isEmpty()){
            System.out.println("Lead the name of the exercise");
        } else {
            this.exercise = exercise;
        }
    }

    public int getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(int numberOfRepetitions) {
        if (numberOfRepetitions < 10) {
            System.out.println("You are weak today, sleep longer" + numberOfRepetitions);
        } else {
            this.numberOfRepetitions = numberOfRepetitions;
        }
    }

    public int getAverageHeartRate() {
        return averageHeartRate;
    }

    public void setAverageHeartRate(int averageHeartRate) {
        if (averageHeartRate < 0) {
            System.out.println("You're probably dead");
        } if (averageHeartRate < 50) {
            System.out.println("You definitely need a doctor");
        } if (averageHeartRate > 140) {
            System.out.println("Reduce the load");
        } else {
            this.averageHeartRate = averageHeartRate;

        }
    }

    public float getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(float trainingTime) {
        if (trainingTime < 10) {
            System.out.println("Do something else");
        } else {

            this.trainingTime = trainingTime;
        }
    }

    public void getGeneralTrainingInformation() {
        System.out.printf("Date: %.2f | Exercise: %s | Number of repetitions: %d | Average Heart Rate: %d | " +
                        "Training time: %.2f m!| Workout day %d | %s \n", date, exercise, numberOfRepetitions, averageHeartRate,
                trainingTime, numberOfTraining, MOTIVATION);
    }

    public static void getDescription() {
        System.out.println(description + "\n");
    }

    public void rest() {
        System.out.printf("Date: %.2f | Day of rest \n", date);
    }

    public void showInfo() {
        System.out.println(date);
    }
}
