public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averagemark;

    public Student(String firstName, String lastName, String group, double averagemark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averagemark = averagemark;
    }

    public double getScholarship() {
        if (averagemark>=5) {
            return 2000;
        } else   {return 1900;

        }
    }


    public double getAveragemark() {
        return averagemark;
    }


}
