package com.example.quiz;

public class Customer {

    public String fullName,idNumber, gender, dateOfBirth, age, accountNumber;

    public Customer(String fullName, String idNumber, String gender, String dateOfBirth, String age, String accountNumber) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.accountNumber = accountNumber;
    }

    String[]values = new String[]{
            "Full Name: " + getFullName(), "Id Number: " + getIdNumber(), "Gender" + getGender(),"DOB" + getDateOfBirth(), "Age" +getAge(), "Account Number: " + getAccountNumber()

    };

    public String getFullName() {
        return fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
