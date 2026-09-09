class Clinic {

    String name;
    String location;
    int doctors;
    int patients;

    public Clinic(String name, String location, int doctors, int patients) {
        this.name = name;
        this.location = location;
        this.doctors = doctors;
        this.patients = patients;
    }

    void ClinicInfo() {
        System.out.println(name);
        System.out.println(location);
        System.out.println(doctors);
        System.out.println(patients);
    }
}