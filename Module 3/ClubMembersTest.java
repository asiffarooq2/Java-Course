import java.util.ArrayList;

class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    // Constructor
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    // Returns graduation year
    public int getGradYear() {
        return gradYear;
    }

    // Returns true if member is in good standing
    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + gradYear + ", " + hasGoodStanding + ")";
    }
}

class ClubMembers {

    private ArrayList<MemberInfo> memberList;

    // Constructor
    public ClubMembers() {
        memberList = new ArrayList<>();
    }

    // Part (a)
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    // Part (b)
    public ArrayList<MemberInfo> removeMembers(int year) {

        ArrayList<MemberInfo> graduatedMembers = new ArrayList<>();

        int i = 0;

        while (i < memberList.size()) {

            MemberInfo member = memberList.get(i);

            if (member.getGradYear() <= year) {

                if (member.inGoodStanding()) {
                    graduatedMembers.add(member);
                }

                memberList.remove(i);
            } else {
                i++;
            }
        }

        return graduatedMembers;
    }

    // Display all current members
    public void displayMembers() {
        System.out.println("Current Club Members:");

        if (memberList.isEmpty()) {
            System.out.println("No members.");
            return;
        }

        for (MemberInfo member : memberList) {
            System.out.println(member);
        }
    }
}

public class ClubMembersTest {

    public static void main(String[] args) {

        ClubMembers club = new ClubMembers();

        // Add members graduating in 2025
        String[] names2025 = {
                "Alice",
                "Bob",
                "Charlie"
        };

        club.addMembers(names2025, 2025);

        // Add members graduating in 2026
        String[] names2026 = {
                "David",
                "Emma"
        };

        club.addMembers(names2026, 2026);

        System.out.println("=== Before Removing Members ===");
        club.displayMembers();

        // Remove graduates up to 2025
        ArrayList<MemberInfo> graduates = club.removeMembers(2025);

        System.out.println("\n=== Graduated Members ===");

        for (MemberInfo member : graduates) {
            System.out.println(member);
        }

        System.out.println("\n=== Remaining Members ===");
        club.displayMembers();
    }
}