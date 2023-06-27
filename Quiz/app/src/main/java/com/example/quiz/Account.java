package com.example.quiz;

import android.widget.Toast;

public class Account {

    public String accountBalance;
    public int prevBalance;

    public Account(String accountBalance) {
        this.accountBalance = accountBalance;
    }

//    private void Balance_Calculator()
//    {
//        if (prevBalance > 1000)
//        {
//            Toast.makeText(MainActivity., "LOW FUNDS", Toast.LENGTH_SHORT).show();
//        }
//        else
//        {
//            return;
//        }
//    }

    public String getAccountBalance() {
        return accountBalance;
    }
}
