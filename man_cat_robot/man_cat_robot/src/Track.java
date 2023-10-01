class Track {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public void runOnTrack(Human human) {
        human.run(length);
    }
  public void runOnTrack(Cat cat) {
        cat.run(length);
    }
    public void runOnTrack(Robot robot) {
        robot.run(length);
    }
}

