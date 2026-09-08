class ContentCreator {
    String name;
    String platform;
    int followers;
    String category;
    boolean verified;

    ContentCreator() {
    }

    ContentCreator(String name, String platform, int followers, String category, boolean verified) {
        this.name = name;
        this.platform = platform;
        this.followers = followers;
        this.category = category;
        this.verified = verified;
    }
}
