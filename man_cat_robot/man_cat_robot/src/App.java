public class App {
    public static void main(String[] args) {
        Human human = new Human("Human 1", 1000, 2);
        Cat cat = new Cat("Cat 1", 500, 3);
        Robot robot = new Robot("Robot 1", 2000, 1);

        Track track = new Track(500);
        Wall wall = new Wall(1);

        track.runOnTrack(human);
        wall.jumpOverWall(human);

        track.runOnTrack(cat);
        wall.jumpOverWall(cat);

        track.runOnTrack(robot);
        wall.jumpOverWall(robot);
    }
}
