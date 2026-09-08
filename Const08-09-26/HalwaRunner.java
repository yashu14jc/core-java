class HalwaRunner {
    public static void main(String[] args) {
        Halwa halwa1 = new Halwa();
        Halwa halwa2 = new Halwa("Carrot Halwa", "Sweet", 200, "Orange", true);

        System.out.println(halwa1.name);
        System.out.println(halwa1.type);
        System.out.println(halwa1.price);
        System.out.println(halwa1.color);
        System.out.println(halwa1.sweet);

        System.out.println(halwa2.name);
        System.out.println(halwa2.type);
        System.out.println(halwa2.price);
        System.out.println(halwa2.color);
        System.out.println(halwa2.sweet);
    }
}
