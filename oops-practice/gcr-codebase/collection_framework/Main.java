import java.util.HashSet;

class EventEntryVerificationSystem {

    private HashSet<String> participants;

    public EventEntryVerificationSystem() {
        participants = new HashSet<>();
    }

    // Register participant
    public void registerParticipant(String email) {
        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println("Duplicate registration rejected for: " + email);
        }
    }

    // Display all unique participants
    public void displayParticipants() {
        System.out.println("\nUnique Registered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }
    }

    // Display total attendees
    public void displayTotalParticipants() {
        System.out.println("\nTotal Eligible Participants: " + participants.size());
    }
}

public class Main {
    public static void main(String[] args) {

        EventEntryVerificationSystem event = new EventEntryVerificationSystem();

        // Register participants
        event.registerParticipant("alice@gmail.com");
        event.registerParticipant("bob@gmail.com");
        event.registerParticipant("charlie@gmail.com");
        event.registerParticipant("alice@gmail.com");     // Duplicate
        event.registerParticipant("david@gmail.com");
        event.registerParticipant("bob@gmail.com");       // Duplicate

        // Display participants
        event.displayParticipants();

        // Display total participants
        event.displayTotalParticipants();
    }
}