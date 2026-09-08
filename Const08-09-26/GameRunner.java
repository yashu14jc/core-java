class GameRunner {
    public static void main(String[] args) {
        Game game1 = new Game();
        Game game2 = new Game("Cricket", "Outdoor", 11, "Ground", true);

        System.out.println(game1.name);
        System.out.println(game1.type);
        System.out.println(game1.players);
        System.out.println(game1.platform);
        System.out.println(game1.multiplayer);

        System.out.println(game2.name);
        System.out.println(game2.type);
        System.out.println(game2.players);
        System.out.println(game2.platform);
        System.out.println(game2.multiplayer);
    }
}
