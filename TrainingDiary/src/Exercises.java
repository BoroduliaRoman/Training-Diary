/**
 * Created by BR 06.07.2020
 */
public class Exercises implements Info{
    String name = "Exercise name";

    public void showInfo() {
        System.out.println(name);
    }
}

class PullUps extends Exercises{
    public String getName() {
        String name = "Pull-ups";
        return name;
    }
}

class Bars extends Exercises {
    private String name = "Bars";
    public String getName() {
        return this.name;
    }
}

class Squats extends Exercises {
    private String name = "Squats";
    public String getName() {
        return this.name;
    }
}

