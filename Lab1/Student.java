public class Student{
    private final String Name, Email, Major, TUID, PhoneNum,GradDate;
    private final boolean UndergradStatus;

    public Student(String Name, String Email, String Major, String TUID, String PhoneNum, String GradDate, boolean UndergradStatus){
        this.Name = Name;
        this.Email = Email;
        this.Major = Major;
        if(isTUIDValid(TUID)) this.TUID = TUID;
        else this.TUID = "000000000";
        this.PhoneNum = PhoneNum;
        this.GradDate = GradDate;
        this.UndergradStatus = UndergradStatus;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getMajor() {
        return Major;
    }

    public String getTUID() {
        return TUID;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public String getGradDate() {
        return GradDate;
    }

    public boolean isUndergrad() {
        return UndergradStatus;
    }

    public boolean isTUIDValid(String TUID){
        if(TUID.length() != 9) return false;
        char[] ID = TUID.toCharArray();
        for(char num : ID){
            if(num <48 || num >57) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Student Name:\t\t\t\t" + getName() + "\n";
        output += "TUID:\t\t\t\t\t" + getTUID() + "\n";
        output += "Email Address:\t\t\t\t" + getEmail() + "\n";
        output += "Phone Number:\t\t\t\t" + getPhoneNum() + "\n";
        output += "Major:\t\t\t\t\t" + getMajor() + "\n";
        output += "Expected Graduation Date:\t\t" + getGradDate() + "\n";
        output += "Undergraduate Status:\t\t\t" + isUndergrad() +"\n\n";
        return output;
    }
}