public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averagemark) {
        super(firstName, lastName, group, averagemark);
    }


    public double getScholarship() {
        if (getAveragemark() >= 5) {
            return 2500;
        } else {
            return 2200;

        }

    }

}
