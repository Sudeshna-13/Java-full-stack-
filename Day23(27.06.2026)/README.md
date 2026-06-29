Day 23 practiced files
<img width="845" height="617" alt="image" src="https://github.com/user-attachments/assets/ed4fc29a-c594-4bf1-9eac-c02248df01dc" />
<img width="1102" height="835" alt="image" src="https://github.com/user-attachments/assets/4a2aa4f5-332f-400b-a0fe-f32c3a8daa1b" />
Why name and location are private in Hospital
: In OOP, attributes (fields) are usually declared private to protect the internal state of the class.
: By keeping them private, you force external code to use (or other controlled APIs) to read or modify the values. This prevents accidental or unauthorized changes.
: If later you want to validate or transform data (e.g., check that location is not empty, or format name properly), you can do it inside the setter method without changing external code.
: In UML class diagrams, - means private, + means public. So - name: String means the attribute is private, while + addDoctor() is public.
public class Hospital {
    private String name;
    private String location;
    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setLocation(String location) {
        if(location != null && !location.isEmpty()) {
            this.location = location;
        }
    }
}
