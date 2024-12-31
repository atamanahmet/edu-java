public enum Suit {
    DIAMOND("Diamond"),
    SPADE("Spade"),
    CLUB("Club"),
    HEART("Heart");

    private final String name;

    private Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // public void setName(String newName) {
    // this.name = newName;
    // }
}
