public class DataTest {
    public static void main(String[] args) {
        // Create three DataEntry objects with different values
        DataEntry register = new DataEntry("id1", "Hello World", 1223344546);
        DataEntry counter = new DataEntry("id2", "blue sky", 890345740);
        DataEntry store = new DataEntry("id3", "green peas", 77352764);

        // Create a DataStorage object to store the DataEntry objects
        DataStorage<DataEntry> Database = new DataStorage<>();

        // Add the DataEntry objects to the DataStorage
        Database.addEntry(register);
        Database.addEntry(counter);
        Database.addEntry(store);

        // Calculate the average timestamp from the DataStorage and store it in the "total" variable
        long total = (long) Database.getAverageTimestamp();

        // Print the average timestamp
        System.out.println("Average Time: " + total);
    }
}
