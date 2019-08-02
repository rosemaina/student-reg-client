package project2.demo;

public class Unit {

    private Long id;
    private String name;

    public Unit(String name) { this.name = name; }

    public Unit(Long id) { this.id = id; }

    public Unit() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
