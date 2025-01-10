class Patient extends Person {
    private String ailment;

    public Patient(String name, int age, String ailment) {
        super(name, age);
        this.ailment = ailment;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient: " + getName() + ", Age: " + getAge() + ", Ailment: " + ailment);
    }
}

