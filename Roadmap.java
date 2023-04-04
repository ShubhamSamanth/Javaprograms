import java.util.ArrayList;
import java.util.List;

public class Roadmap {
    private List<String> goals;

    public Roadmap() {
        this.goals = new ArrayList<>();
    }

    public void addGoal(String goal) {
        this.goals.add(goal);
    }

    public void removeGoal(String goal) {
        this.goals.remove(goal);
    }

    public void printRoadmap() {
        System.out.println("Roadmap:");

        for (int i = 0; i < this.goals.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, this.goals.get(i));
        }
    }

    public static void main(String[] args) {
        Roadmap roadmap = new Roadmap();

        roadmap.addGoal("Speed up the road");
        roadmap.addGoal("Build a plan ");
        roadmap.addGoal("Learn from the road");
        roadmap.addGoal("Know the road");
        roadmap.addGoal("Complex and complex goals   are not supported   yet in  this game");
        roadmap.removeGoal("Complex and complex goals   are not supported   yet in  this game");

        roadmap.printRoadmap();
    }
}
