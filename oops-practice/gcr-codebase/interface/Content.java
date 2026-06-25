interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy: No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"idiot", "stupid", "hate"};

        post = post.toLowerCase();

        for (String word : restrictedWords) {
            if (post.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam Detection Policy: No promotional spam allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {

        post = post.toLowerCase();

        return post.contains("buy now")
                || post.contains("click here")
                || post.contains("free money");
    }

    // Resolving default method conflict
    @Override
    public void displayModerationPolicy() {

        System.out.println("=== Content Moderation Policies ===");

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class Content {

    public static void main(String[] args) {

        String[] posts = {
                "I love programming in Java.",
                "Buy now and get 50% discount!",
                "You are an idiot.",
                "Click here to win free money.",
                "Learning interfaces is fun."
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:");

        for (String post : posts) {

            if (moderator.isSpam(post)) {
                System.out.println("\"" + post + "\" -> Spam Post");
            }
            else if (moderator.isOffensive(post)) {
                System.out.println("\"" + post + "\" -> Offensive Post");
            }
            else {
                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}