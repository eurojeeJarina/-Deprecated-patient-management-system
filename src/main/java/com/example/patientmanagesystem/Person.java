package com.example.patientmanagesystem;

/*Person Class - Super class consists of variables: title, firstname, middlename, surname, date of birth, home address, contact number*/

public class Person {

    // initialize variables
    private String _title;
    private String _firstName;
    private String _middleName;
    private String _surname;
    private String _birthDate;
    private String _gender;
    private String _homeAddress;
    private int _phoneNumber;

    // constructor
    public Person(String _title, String _firstName, String _middleName, String _surname, String _birthDate, String _gender, String _homeAddress, int _phoneNumber) {
        this._title = _title;
        this._firstName = _firstName;
        this._middleName = _middleName;
        this._surname = _surname;
        this._birthDate = _birthDate;
        this._gender = _gender;
        this._homeAddress = _homeAddress;
        this._phoneNumber = _phoneNumber;
    }
    public Person()
    {
        this.set_title("Mr/Mrs/Ms/Miss/Dr");
        this.set_firstName("default");
        this.set_middleName("default");
        this.set_surname("default");
        this.set_birthDate("dd/mm/yyyy");
        this.set_gender("M/F/Other");
        this.set_homeAddress("default");
        this.set_phoneNumber(0000000000);
    }


    /*GETTERS AND SETTERS BELOW*/
    private String get_title() {
        return _title;
    }

    private void set_title(String _title) {
        this._title = _title;
    }

    private String get_firstName() {
        return _firstName;
    }

    private void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    private String get_middleName() {
        return _middleName;
    }

    private void set_middleName(String _middleName) {
        this._middleName = _middleName;
    }

    private String get_surname() {
        return _surname;
    }

    private void set_surname(String _surname) {
        this._surname = _surname;
    }

    private String get_birthDate() {
        return _birthDate;
    }

    private void set_birthDate(String _birthDate) {
        this._birthDate = _birthDate;
    }

    private String get_gender() {
        return _gender;
    }

    private void set_gender(String _gender) {
        this._gender = _gender;
    }

    private String get_homeAddress() {
        return _homeAddress;
    }

    private void set_homeAddress(String _homeAddress) {
        this._homeAddress = _homeAddress;
    }

    private int get_phoneNumber() {
        return _phoneNumber;
    }

    private void set_phoneNumber(int _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    /*SHOW METHOD FOR DEBUGGING PURPOSE*/

    public void displayDetails(){
        System.out.println("Title: " + this.get_title());
        System.out.println("Firstname: " + this.get_firstName());
        System.out.println("Middlename: " + this.get_middleName());
        System.out.println("Surname: " + this.get_surname());
        System.out.println("Date of Birth: " + this.get_birthDate());
        System.out.println("Gender: " + this.get_gender());
        System.out.println("Address: " + this.get_homeAddress());
        System.out.println("Phone No. :" + this.get_phoneNumber());
    }

}
