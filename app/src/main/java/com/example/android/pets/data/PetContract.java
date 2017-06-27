package com.example.android.pets.data;


import android.provider.BaseColumns;

public final class PetContract {

    private PetContract() {}

    public static final class PetEntry implements BaseColumns {

        /* CONSTANTS FOR TABLE INFO */
        // Table name
        public static final String TABLE_NAME = "pets";

        // Column headings
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /* CONSTANTS FOR GENDER */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }


}
