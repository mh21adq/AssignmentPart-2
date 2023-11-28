public enum LevelInteger {
    LEVEL_ONE(1),
    LEVEL_TWO(2),
    LEVEL_THREE(3),
    LEVEL_FOUR(4);

    private final int levelValue;

    LevelInteger(int levelValue) {
        this.levelValue = levelValue;
    }

    public int getLevelValue() {
        return this.levelValue;
    }
}