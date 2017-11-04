package com.example.that1guy.code4good;

import android.provider.BaseColumns;

/**
 * Created by pureu on 11/4/2017.
 */

public final class AccountDB {

    //public final class AccountContract {
        // To prevent someone from accidentally instantiating the contract class,
        // make the constructor private.
        AccountDB() {}

        /* Inner class that defines the table contents */
        public static class Account implements BaseColumns {
            public static final String TABLE_NAME = "Account"; // Balance
            public static final String COLUMN_NAME_Balance = "balance";
            public static final String COLUMN_NAME_Username = "username";
            public static final String COLUMN_NAME_Password = "password";
            public static final String COLUMN_NAME_FamilyMembers = "family_members";
            public static final String COLUMN_NAME_Phone = "phone_number";
            public static final String COLUMN_NAME_Email = "email";
        }

        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Account.TABLE_NAME + " (" +
                        Account.COLUMN_NAME_Phone + " INTEGER PRIMARY KEY," +
                        Account.COLUMN_NAME_Username + " TEXT," +
                        Account.COLUMN_NAME_Password + " TEXT," +
                        Account.COLUMN_NAME_Email + " TEXT," +
                        Account.COLUMN_NAME_FamilyMembers + " TEXT," +
                        Account.COLUMN_NAME_Balance + " INTEGER)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Account.TABLE_NAME;
    //}
}
