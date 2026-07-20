import java.util.ArrayList;
import java.util.Scanner;

// Review class
class Review {

    private String comment;

    public Review(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}

public class CollectComments {

    // Method to collect comments containing an exclamation mark
    public ArrayList<String> collectComments(ArrayList<Review> allReviews) {

        ArrayList<String> comments = new ArrayList<>();

        // Check each review
        for (int i = 0; i < allReviews.size(); i++) {

            String comment = allReviews.get(i).getComment();

            // Process only comments containing '!'
            if (comment.contains("!")) {

                String formattedComment = i + "-" + comment;

                // Add a period if the comment does not end with '.' or '!'
                if (!comment.endsWith(".") && !comment.endsWith("!")) {
                    formattedComment += ".";
                }

                comments.add(formattedComment);
            }
        }

        return comments;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CollectComments obj = new CollectComments();

        // Input number of reviews
        System.out.print("Enter the number of reviews: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Review> allReviews = new ArrayList<>();

        // Input reviews
        for (int i = 0; i < n; i++) {
            System.out.print("Enter comment for review " + (i + 1) + ": ");
            String comment = sc.nextLine();
            allReviews.add(new Review(comment));
        }

        // Collect and display formatted comments
        ArrayList<String> comments = obj.collectComments(allReviews);

        System.out.println("Formatted comments:");
        for (String comment : comments) {
            System.out.println(comment);
        }

        sc.close();
    }
}