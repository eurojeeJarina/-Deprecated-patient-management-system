package com.example.patientmanagesystem;

/*Staff Class - represents the staff, the staff can either be given administrative access to modify patient's details
*
* VARIABLES:
* staffId = an int variable that increments each time a new staff/user is added.
* staff_username = String variable store username of a staff/user.
* staff_password = String variable password, must exist in the database in order for access.
* staff_admin = boolean variable, TRUE a staff has been granted access to add or update a patient,
*               FALSE a staff is not authorize to add or update patient's records.
* */

public class Staff extends Person{

    private int staffId;
    private String staff_username;
    private String staff_password;
    private boolean staff_admin;

    public Staff(String _title, String _firstName, String _middleName, String _surname, String _birthDate, String _gender, String _homeAddress, int _phoneNumber, int staffId, String staff_username, String staff_password, boolean staff_admin) {
        super(_title, _firstName, _middleName, _surname, _birthDate, _gender, _homeAddress, _phoneNumber);
        this.staffId = staffId;
        this.staff_username = staff_username;
        this.staff_password = staff_password;
        this.staff_admin = staff_admin;
    }

    public Staff(int staffId, String staff_username, String staff_password, boolean staff_admin) {
        this.staffId = staffId;
        this.staff_username = staff_username;
        this.staff_password = staff_password;
        this.staff_admin = staff_admin;
    }

    public Staff()
    {
        this.staffId += 1;
        this.staff_username = "default username";
        this.staff_password = "default password";
        this.staff_admin = false;
    }
}
