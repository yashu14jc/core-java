class ContentCreatorRunner {
    public static void main(String[] args) {
        ContentCreator creator1 = new ContentCreator();
        ContentCreator creator2 = new ContentCreator("Varun", "YouTube", 10000, "Technology", true);

        System.out.println(creator1.name);
        System.out.println(creator1.platform);
        System.out.println(creator1.followers);
        System.out.println(creator1.category);
        System.out.println(creator1.verified);

        System.out.println(creator2.name);
        System.out.println(creator2.platform);
        System.out.println(creator2.followers);
        System.out.println(creator2.category);
        System.out.println(creator2.verified);
    }
}
