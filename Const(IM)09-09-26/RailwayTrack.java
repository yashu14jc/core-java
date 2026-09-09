class RailwayTrack {

    String type;
    String location;
    int length;
    int tracks;

    public RailwayTrack(String type, String location, int length, int tracks) {
        this.type = type;
        this.location = location;
        this.length = length;
        this.tracks = tracks;
    }

    void RailwayTrackInfo() {
        System.out.println(type);
        System.out.println(location);
        System.out.println(length);
        System.out.println(tracks);
    }
}