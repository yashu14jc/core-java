class Application {

    String name;
    String version;
    String developer;
    int size;
    String platform;

    public Application() {
        System.out.println("Application no-arg constructor");
    }

    public Application(String name, String version, String developer,
                int size, String platform) {

        this.name = name;
        this.version = version;
        this.developer = developer;
        this.size = size;
        this.platform = platform;
    }
}