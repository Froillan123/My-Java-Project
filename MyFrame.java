import javax.swing.*;


public class MyFrame extends JFrame {
    Person thPerson;
    Address address;
    StudentInfo studentInfo;

    public MyFrame(Person thPerson, Address address, StudentInfo studentInfo) {
        this.thPerson = thPerson;
        this.address = address;
        this.studentInfo = studentInfo;

        // Set the title for the JFrame
        setTitle("User Information");

        // Set the size of the JFrame
        setSize(600, 350);

        // Create and configure your GUI components
        JLabel nameLabel = new JLabel("Name: " + thPerson.getLastName() + ", " + thPerson.getFirstName());
        JLabel birthdayLabel = new JLabel("Birthday: " + thPerson.getBirthDate());
        JLabel genderLabel = new JLabel("Gender: " + thPerson.getGender());
        JLabel heightLabel = new JLabel("Height: " + thPerson.getHeight() + "cm");
        JLabel weightLabel = new JLabel("Weight: " + thPerson.getWeight() + "kg");
        JLabel addressLabel = new JLabel("Address: " + address.getAddressString(2));
        JLabel studentIdLabel = new JLabel("Student ID: " + studentInfo.getIdNo());
        JLabel yearLevelLabel = new JLabel("Year Level: " + studentInfo.getYearLevel());
        JLabel contactNoLabel = new JLabel("Contact Number: " + studentInfo.getContactNo());
        JLabel emailLabel = new JLabel("Email: " + studentInfo.getEmail());
        JLabel programLabel = new JLabel("Program: " + studentInfo.getProgram());

        // Create a JPanel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(nameLabel);
        panel.add(birthdayLabel);
        panel.add(genderLabel);
        panel.add(heightLabel);
        panel.add(weightLabel);
        panel.add(addressLabel);
        panel.add(studentIdLabel);
        panel.add(yearLevelLabel);
        panel.add(contactNoLabel);
        panel.add(emailLabel);
        panel.add(programLabel);

        // Add the panel to the JFrame
        add(panel);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
