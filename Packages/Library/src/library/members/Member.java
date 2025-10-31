package library.members;


public class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayDetails() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }

    public String getName() {
        return name;
    }
}
