class Robot {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " run successfully " + distance + " meters");
        } else {
            System.out.println(name + " couldn't run succesfully " + distance + " meters");
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " Jump over the wall, hights of " + height + " meters");
        } else {
            System.out.println(name + " couldn't jump over the wall, hights " + height + " meters");
        }
    }
}


