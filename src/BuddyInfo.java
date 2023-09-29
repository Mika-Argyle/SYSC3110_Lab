public class BuddyInfo {



    private String name;
    private String address;
    private long phoneNo;

    public BuddyInfo(String name, String address, long phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public BuddyInfo() {
        this.name = "Who";
        this.address = "Where";
        this.phoneNo = 123456;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }


   /* public static void main(String[] args) {

        BuddyInfo bud = new BuddyInfo("Billy", "123 Home St", 6135551234L);

        System.out.println("Hello " + bud.getName());

    } */
}
