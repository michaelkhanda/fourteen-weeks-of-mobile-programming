package com.example.midsemseter;

public class Bank extends MainActivity{

   private String fullname;
   private int Idnumber,accountnumber,accountbalance;
    public Bank(String name, int id, int accno, int accbal){

        fullname = name;
        Idnumber = id;
        accountnumber = accno;
        accountbalance = accbal;


    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getIdnumber() {
        return Idnumber;
    }

    public void setIdnumber(int idnumber) {
        Idnumber = idnumber;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(int accountbalance) {
        this.accountbalance = accountbalance;
    }
}
