import java.util.*;

public class DataStorage<T> {
    private List<DataEntry> entries = new ArrayList<>(); // stores the list of DataEntry objects

    public void addEntry(DataEntry entry) {
        this.entries.add(entry); // adds a DataEntry object to the list
    }

    public void removeEntry(String identifier) {
        entries.removeIf(entry -> entry.getIdentifier().equals(identifier)); // removes a DataEntry object from the list based on the provided identifier
    }

    public DataEntry retrieveEntry(String identifier) {
        for (DataEntry entry : entries) {
            if (entry.getIdentifier().equals(identifier)) {
                return entry; // retrieves a DataEntry object from the list based on the provided identifier
            }
        }
        return null; // returns null if no DataEntry object is found with the provided identifier
    }

    public List<DataEntry> listAllEntries() {
        return new ArrayList<>(entries); // returns a new ArrayList containing all the DataEntry objects in the list
    }

    public double getAverageTimestamp() {
        if (entries.isEmpty()) {
            return 0; // returns 0 if the list is empty
        }
        long total = 0;
        for (DataEntry entry : entries) {
            total += entry.getTimestamp(); // calculates the total sum of timestamps of all DataEntry objects in the list
        }
        return (double) total / entries.size(); // returns the average timestamp by dividing the total sum by the number of DataEntry objects in the list
    }
}
