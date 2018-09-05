package com.example.cybrilla.intellicar.utils;

import android.content.Context;

import com.example.cybrilla.intellicar.R;

public class Utility {

    public static int getThumbnail(Context context, String iconName) {

        String packageName;

        if (context != null) {
            packageName = context.getPackageName();
        } else {
            return 0;
        }
        return context.getResources().getIdentifier(iconName,
                "drawable", packageName);
    }


    public static StringBuilder getAppendedString(Context context, String string, int size) {
        StringBuilder sb = new StringBuilder(string);
       return sb.append(Constants.SPACE + Constants.LEFT_PARENTHESIS).
                append(size).append(Constants.RIGHT_PARENTHESIS);
    }
}

