public class DataEntry {
    private String identifier; // stores the identifier of the data entry
    private String dataValue; // stores the value of the data entry
    private long timestamp; // stores the timestamp of when the data entry was created

    public DataEntry(String identifier, String dataValue, long timestamp) {
        this.identifier = identifier; // assign the provided identifier to the instance variable
        this.dataValue = dataValue; // assign the provided dataValue to the instance variable
        this.timestamp = timestamp; // assign the provided timestamp to the instance variable
    }

    public String getIdentifier() {
        return identifier; // return the identifier of the data entry
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier; // set the identifier of the data entry to the provided value
    }

    public Object getDataValue() {
        return dataValue; // return the value of the data entry
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue; // set the value of the data entry to the provided value
    }

    public long getTimestamp() {
        return timestamp; // return the timestamp of the data entry
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp; // set the timestamp of the data entry to the provided value
    }
}
