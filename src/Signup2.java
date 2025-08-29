import com.toedter.calendar.JDateChooser;
import jdk.jfr.Category;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup2 extends JFrame implements ActionListener {

    JTextField  pan , adhaar;

    JLabel  additionalDetails, Religion, Category, Income, Education , qualification, Occupation, Pan, Adhaar, Senior, Account;
    JComboBox religion , category , occupation, education , income ;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    String formno;
    JDateChooser dateChooser;
    Signup2(String formno) {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        additionalDetails = new JLabel("Additional Details ");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        Religion = new JLabel("Religion");
        Religion.setFont(new Font("Raleway", Font.BOLD, 22));
        Religion.setBounds(100, 140, 100, 30);
        add(Religion);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);


        Category = new JLabel("Category");
        Category.setFont(new Font("Raleway", Font.BOLD, 22));
        Category.setBounds(100, 190, 200, 30);
        add(Category);

        String valCategory[] = {"General", "OBC", "SC", "ST", "other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        Income = new JLabel("Income");
        Income.setFont(new Font("Raleway", Font.BOLD, 22));
        Income.setBounds(100, 240, 200, 30);
        add(Income);

        String incomeCategory[] = {"Null", "< 1,50,000", "<2,50,000", "<5,00,000", "<10,00,000", "Above"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        Education = new JLabel("Educational");
        Education.setFont(new Font("Raleway", Font.BOLD, 22));
        Education.setBounds(100, 290, 200, 30);
        add(Education);

        qualification = new JLabel("Qualifications");
        qualification.setFont(new Font("Raleway", Font.BOLD, 22));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String Educationalvalues[] = {"Non-Graduate", "Graduate", "Post Graduate", "Doctorate", "Other"};
        education = new JComboBox(Educationalvalues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        Occupation = new JLabel("Occupation");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 22));
        Occupation.setBounds(100, 390, 200, 30);
        add(Occupation);

        String Occupationalvalues[] = {"Self Employed", "Salaried", "Buisness", "Student", "Retired", "other"};
        occupation = new JComboBox(Occupationalvalues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        Pan = new JLabel("PAN Number");
        Pan.setFont(new Font("Raleway", Font.BOLD, 22));
        Pan.setBounds(100, 440, 200, 30);
        add(Pan);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        Adhaar = new JLabel("Adhaar Number:");
        Adhaar.setFont(new Font("Raleway", Font.BOLD, 22));
        Adhaar.setBounds(100, 490, 200, 30);
        add(Adhaar);

        adhaar = new JTextField();
        adhaar.setFont(new Font("Raleway", Font.BOLD, 14));
        adhaar.setBounds(300, 490, 400, 30);
        add(adhaar);

        Senior = new JLabel("Senior Citizen:");
        Senior.setFont(new Font("Raleway", Font.BOLD, 22));
        Senior.setBounds(100, 540, 200, 30);
        add(Senior);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup senior = new ButtonGroup();
        senior.add(syes);
        senior.add(sno);

        Account = new JLabel("Existing Account:");
        Account.setFont(new Font("Raleway", Font.BOLD, 22));
        Account.setBounds(100, 590, 200, 30);
        add(Account);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existing = new ButtonGroup();
        existing.add(eyes);
        existing.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
        public void actionPerformed(ActionEvent ae){
            Random rand = new Random();
            String formno = "" + Math.abs(rand.nextLong());
            String sreligion = (String) religion.getSelectedItem();
            String scategory = (String) category.getSelectedItem();
            String sincome = (String) income.getSelectedItem();
            String  seducation = (String) education.getSelectedItem();
            String soccupation = (String) occupation.getSelectedItem();
            String seniorcitizen = null;
            if(syes.isSelected()){
                seniorcitizen = "Male";
            } else if (sno.isSelected()){
                seniorcitizen = "Female";
            }

            String existingaccount = null;
            if(eyes.isSelected()){
                existingaccount = "Yes";
            } else if (eno.isSelected()) {
                existingaccount = "No";
            }

            String span = Pan.getText();
            String sadhaar = Adhaar.getText();


            try {
                Conn c = new Conn();
                String query = "insert into signup2 values('"+formno+"', '"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhaar+"','"+seniorcitizen+"','"+existingaccount+"')" ;
                c.s.executeUpdate(query);

                //Signup3 object
                setVisible(false);
                new Signup3(formno).setVisible(true);
            } catch (Exception e){
                System.out.println(e);
            }
        }
        public static void main(String[] args) {
            new Signup2("");
        }
    }


