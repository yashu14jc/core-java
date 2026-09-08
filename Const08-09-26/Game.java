class Game {
    String name;
    String type;
    int players;
    String platform;
    boolean multiplayer;

    Game() {
    }

    Game(String name, String type, int players, String platform, boolean multiplayer) {
        this.name = name;
        this.type = type;
        this.players = players;
        this.platform = platform;
        this.multiplayer = multiplayer;
    }
}
