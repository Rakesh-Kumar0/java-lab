import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm
        extends JFrame implements ActionListener {

    // Labels
    JLabel lblName, lblRoll, lblBranch,
           lblSemester, lblGender, lblContact;

    // Text fields
    JTextField txtName, txtRoll, txtContact;

    // Combo boxes
    JComboBox<String> branchBox, semesterBox;

    // Radio buttons
    JRadioButton male, female;

    // Button group
    ButtonGroup bg;

    // Submit button
    JButton submit;

    StudentRegistrationForm() {

        setTitle("Student Registration Form");

        setSize(500, 450);

        setLayout(new GridLayout(7, 2, 10, 10));

        // Labels
        lblName = new JLabel("Student Name:");
        lblRoll = new JLabel("Roll Number:");
        lblBranch = new JLabel("Branch:");
        lblSemester = new JLabel("Semester:");
        lblGender = new JLabel("Gender:");
        lblContact = new JLabel("Contact Number:");

        // Text fields
        txtName = new JTextField();
        txtRoll = new JTextField();
        txtContact = new JTextField();

        // Branch combo box
        String branches[] = {
                "CSE", "IT", "ECE", "ME", "CE"
        };

        branchBox =
            new JComboBox<>(branches);

        // Semester combo box
        String semesters[] = {
                "1", "2", "3", "4",
                "5", "6", "7", "8"
        };

        semesterBox =
            new JComboBox<>(semesters);

        // Radio buttons
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        // Grouping radio buttons
        bg = new ButtonGroup();

        bg.add(male);
        bg.add(female);

        // Submit button
        submit = new JButton("Submit");

        submit.addActionListener(this);

        // Add components
        add(lblName);
        add(txtName);

        add(lblRoll);
        add(txtRoll);

        add(lblBranch);
        add(branchBox);

        add(lblSemester);
        add(semesterBox);

        add(lblGender);

        JPanel genderPanel = new JPanel();

        genderPanel.add(male);
        genderPanel.add(female);

        add(genderPanel);

        add(lblContact);
        add(txtContact);

        add(new JLabel(""));
        add(submit);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    // Button click event
    public void actionPerformed(ActionEvent e) {

        String name =
            txtName.getText().trim();

        String roll =
            txtRoll.getText().trim();

        String branch =
            branchBox.getSelectedItem()
                     .toString();

        String semester =
            semesterBox.getSelectedItem()
                       .toString();

        String contact =
            txtContact.getText().trim();

        String gender = "";

        if(male.isSelected()) {
            gender = "Male";
        }
        else if(female.isSelected()) {
            gender = "Female";
        }

        // Validation
        if(name.isEmpty()
                || roll.isEmpty()
                || contact.isEmpty()
                || gender.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please fill all mandatory fields."
            );

            return;
        }

        // Display entered data
        String message =
                "Student Registration Successful\n\n"
                + "Name: " + name + "\n"
                + "Roll Number: " + roll + "\n"
                + "Branch: " + branch + "\n"
                + "Semester: " + semester + "\n"
                + "Gender: " + gender + "\n"
                + "Contact Number: " + contact;

        JOptionPane.showMessageDialog(
                this,
                message
        );
    }

    public static void main(String[] args) {

        new StudentRegistrationForm();
    }
}
