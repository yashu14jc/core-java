class StudioRunner {
    public static void main(String[] args) {
        Studio studio1 = new Studio();
        Studio studio2 = new Studio("Film Studio", "Bangalore", 5, "Recording", true);

        System.out.println(studio1.name);
        System.out.println(studio1.location);
        System.out.println(studio1.rooms);
        System.out.println(studio1.type);
        System.out.println(studio1.available);

        System.out.println(studio2.name);
        System.out.println(studio2.location);
        System.out.println(studio2.rooms);
        System.out.println(studio2.type);
        System.out.println(studio2.available);
    }
}
