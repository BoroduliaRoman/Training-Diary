
/**
 * Created by BR 30.06.2020
 *
 * 01.07 - Created getters and setters for all fields of the class DaysOfTRaining
 */
public class TrainingDiary {
    public static void main(String[] args) {
        
        DaysOfTRaining.description = "Keep track of your workouts every day";
        DaysOfTRaining.getDescription();

        DaysOfTRaining day1 = new DaysOfTRaining();
        day1.setDate(29.06F);
        day1.setExercise("Pull-ups");
        day1.setNumberOfRepetitions(18);
        day1.setAverageHeartRate(98);
        day1.setTrainingTime(12.0F);
        day1.getGeneralTrainingInformation();

        DaysOfTRaining day2 = new DaysOfTRaining();
        day2.setDate(30.06F);
        day2.setExercise("Bars");
        day2.setNumberOfRepetitions(32);
        day2.setAverageHeartRate(98);
        day2.setTrainingTime(17.0F);
        day2.getGeneralTrainingInformation();

        DaysOfTRaining day3 = new DaysOfTRaining();
        day3.setDate(01.07F);
        day3.setExercise("Squats");
        day3.setNumberOfRepetitions(66);
        day3.setAverageHeartRate(106);
        day3.setTrainingTime(25.17F);
        day3.getGeneralTrainingInformation();

        DaysOfTRaining day4 = new DaysOfTRaining();
        day4.setDate(02.07F);
        day4.setExercise("Pull-ups");
        day4.setNumberOfRepetitions(19);
        day4.setAverageHeartRate(98);
        day4.setTrainingTime(12.29F);
        day4.getGeneralTrainingInformation();

        DaysOfTRaining day5 = new DaysOfTRaining();
        day5.setDate(03.07F);
        day5.setExercise("Bars");
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
        day8.setExercise("Squats");
        day8.setNumberOfRepetitions(67);
        day8.setAverageHeartRate(105);
        day8.setTrainingTime(24.34F);
        day8.getGeneralTrainingInformation();

        DaysOfTRaining day9 = new DaysOfTRaining();
        day9.setDate(07.07F);
        day9.setExercise("Pull-ups");
        day9.setNumberOfRepetitions(20);
        day9.setAverageHeartRate(98);
        day9.setTrainingTime(12.08F);
        day9.getGeneralTrainingInformation();

        DaysOfTRaining day10 = new DaysOfTRaining();
        day10.setDate(08.07F);
        day10.setExercise("Bars");
        day10.setNumberOfRepetitions(41);
        day10.setAverageHeartRate(105);
        day10.setTrainingTime(18.41F);
        day10.getGeneralTrainingInformation();

        DaysOfTRaining day11 = new DaysOfTRaining();
        day11.setDate(09.07F);
        day11.setExercise("Boxing");
        day11.setNumberOfRepetitions(1);
        day11.setTrainingTime(50F);
        day11.getGeneralTrainingInformation();

        DaysOfTRaining day12 = new DaysOfTRaining();
        day12.setDate(10.07F);
        day12.setExercise("Boxing");
        day12.setNumberOfRepetitions(1);
        day12.setTrainingTime(50F);
        day12.getGeneralTrainingInformation();

        DaysOfTRaining day13 = new DaysOfTRaining();
        day13.setDate(11.07F);
        day13.rest();

        DaysOfTRaining day14 = new DaysOfTRaining();
        day14.setDate(12.07F);
        day14.rest();

        DaysOfTRaining day15 = new DaysOfTRaining();
        day15.setDate(13.07F);
        day15.setExercise("Boxing");
        day15.setNumberOfRepetitions(1);
        day15.setTrainingTime(50F);
        day15.getGeneralTrainingInformation();

        DaysOfTRaining day16 = new DaysOfTRaining();
        day16.setDate(14.07F);
        day16.therapy();

        DaysOfTRaining day17 = new DaysOfTRaining();
        day17.setDate(15.07F);
        day17.therapy();

        DaysOfTRaining day18 = new DaysOfTRaining();
        day18.setDate(16.07F);
        day18.therapy();

        DaysOfTRaining day19 = new DaysOfTRaining();
        day19.setDate(17.07F);
        day19.therapy();
    }
}