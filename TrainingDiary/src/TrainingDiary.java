/**
 * Created by BR 30.06.2020
 *
 * 01.07 - Created getters and setters for all fields of the class DaysOfTRaining
 */
public class TrainingDiary {
    public static void main(String[] args) {
        PullUps pullUps = new PullUps();
        Bars bars = new Bars();
        Squats squats = new Squats();

        DaysOfTRaining.description = "Keep track of your workouts every day";
        DaysOfTRaining.getDescription();

        DaysOfTRaining day1 = new DaysOfTRaining();
        day1.setDate(29.06F);
        day1.setExercise(pullUps.getName());
        day1.setNumberOfRepetitions(18);
        day1.setAverageHeartRate(98);
        day1.setTrainingTime(12.0F);
        day1.getGeneralTrainingInformation();

        DaysOfTRaining day2 = new DaysOfTRaining();
        day2.setDate(30.06F);
        day2.setExercise(bars.getName());
        day2.setNumberOfRepetitions(32);
        day2.setAverageHeartRate(98);
        day2.setTrainingTime(17.0F);
        day2.getGeneralTrainingInformation();

        DaysOfTRaining day3 = new DaysOfTRaining();
        day3.setDate(01.07F);
        day3.setExercise(squats.getName());
        day3.setNumberOfRepetitions(66);
        day3.setAverageHeartRate(106);
        day3.setTrainingTime(25.17F);
        day3.getGeneralTrainingInformation();

        DaysOfTRaining day4 = new DaysOfTRaining();
        day4.setDate(02.07F);
        day4.setExercise(pullUps.getName());
        day4.setNumberOfRepetitions(19);
        day4.setAverageHeartRate(98);
        day4.setTrainingTime(12.29F);
        day4.getGeneralTrainingInformation();

        DaysOfTRaining day5 = new DaysOfTRaining();
        day5.setDate(03.07F);
        day5.setExercise(bars.getName());
        day5.setNumberOfRepetitions(39);
        day5.setAverageHeartRate(105);
        day5.setTrainingTime(18.40F);
        day5.getGeneralTrainingInformation();

        DaysOfTRaining day6 = new DaysOfTRaining();
        day6.setDate(04.07F);
        day6.rest();

        DaysOfTRaining day7 = new DaysOfTRaining();
        day7.setDate(05.07F);
        day7.rest();

        DaysOfTRaining day8 = new DaysOfTRaining();
        day8.setDate(06.07F);
        day8.setExercise(squats.getName());
        day8.setNumberOfRepetitions(67);
        day8.setAverageHeartRate(105);
        day8.setTrainingTime(24.34F);
        day8.getGeneralTrainingInformation();
    }
}

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
}