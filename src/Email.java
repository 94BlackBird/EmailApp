import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";
    private int mailboxCapasity = 500;
    private int defaultPasswordLength = 10;
    
    //Constructor to recieve firstname and lastname
    public Email(String firstName, String lastName){
     
        this.firstName = firstName;
        this.lastName = lastName; 
      
        // Call a method asking for the department - return the department
        this.department = setDepartment();
        

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
       
        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
      
    }
    //Ask for department
    private String setDepartment(){
        
    System.out.print("NEW WORKER: " + firstName + " ENTER THE DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
    try (Scanner sc = new Scanner(System.in)) {
        int depChoise = sc.nextInt();
            switch(depChoise){
                case 1: 
                return "sales";
                case 2: 
                return "dev";
                case 3: 
                return "acct";
                default: 
                return "";
            
            }
    } 
        
    }  
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length ; i++){
           int rand = (int) (Math.random() * passwordSet.length()); 
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set the mailbox capasity
public void setMailboxCapasity(int capasity){
    this.mailboxCapasity = capasity;
}
    //Set the alternete email
public void setALternateEmail(String altEmail){
    this.alternateEmail = altEmail;
}
    //Change the password
public void changePassword(String password){
    this.password = password;
}
public int getMailboxCapasity(){
    return mailboxCapasity;
}
public String getAlternateEmail(){
    return alternateEmail;
}
public String getPassword(){
    return password;
}
public String showInfo(){
    return "FULL NAME: " + firstName + " " + lastName +
        "\nCOMPANY EMAIL: " + email +
        "\nMAILBOX CAPASITY: " + mailboxCapasity +" mb";
}


}
