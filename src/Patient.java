public class Patient {
    int id;
    String name;
    int severity;
    int age;

    public Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }
        @Override
        public String toString() {
            return "Patient: "
                    + name
                    + " id: " + id
                    + " severity: " + severity
                    + " age: " + age;
        }
    }


