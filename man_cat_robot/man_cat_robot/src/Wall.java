class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void jumpOverWall(Human human) {
        human.jump(height);
    }
public void jumpOverWall(Cat cat) {
        cat.jump(height);
    }
public void jumpOverWall(Robot robot) {
        robot.jump(height);
    }

}
