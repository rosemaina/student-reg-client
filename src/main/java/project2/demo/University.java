package project2.demo;

public class University {

//    Properties
    private Long id;
    private String universityName;
    private String location;
    private double latitude;
    private double longitude;
    private Integer capacity;

    //    CONSTRUCTOR
    public University(String universityName, String location, Integer capacity) {
        this.universityName = universityName;
        this.location = location;
        this.capacity = capacity;
    }

    //    CONSTRUCTOR
    public University(Long id, String universityName, String location, double latitude, double longitude, Integer capacity) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

//    Setting Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUniversityName() { return universityName; }
    public void setUniversityName(String universityName) { this.universityName = universityName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public Integer getCapacity() { return capacity; }
    public void setCapacity(Integer capacity) { this.capacity = capacity; }

    // Private constructor
    private University() { }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", universityName='" + universityName + '\'' +
                ", location='" + location + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", capacity=" + capacity +
                '}';
    }
}

