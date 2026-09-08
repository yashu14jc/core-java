class PannerRunner {
    public static void main(String[] args) {

        Panner panner1 = new Panner();
        Panner panner2 = new Panner("Milk", 1.0, 350, "Amul", true);

        System.out.println(panner1.type);
        System.out.println(panner1.weight);
        System.out.println(panner1.price);
        System.out.println(panner1.brand);
        System.out.println(panner1.fresh);

        System.out.println(panner2.type);
        System.out.println(panner2.weight);
        System.out.println(panner2.price);
        System.out.println(panner2.brand);
        System.out.println(panner2.fresh);
    }
}
