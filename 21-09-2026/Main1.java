class Main1 {

    public static void main(String[] args) {

        Temple temple = new Temple();

        temple.name = "ISKCON Temple";
        temple.location = "Bangalore";

        temple.god = new God();
        temple.god.name = "Krishna";
        temple.god.gender = "Male";

        temple.info();
    }
}