
import java.util.Arrays;
import java.util.Scanner;

public class DateArithmetic {
    private String format;
    private final int[] getDateSplit(String codeDate) {
        String[] DateStr = codeDate.split("/", 3);
        int[] a = new int[3];
        a[0] = Integer.parseInt(DateStr[0]);
        a[1] = Integer.parseInt(DateStr[1]);
        a[2] = Integer.parseInt(DateStr[2]);
        return a;
    }

    private final int[] getDateSplit19(String codeDate) {
        String[] DateStr = codeDate.split("/", 3);
        int[] a = new int[3];
        a[0] = Integer.parseInt(DateStr[0]);
        a[1] = Integer.parseInt(DateStr[1]);
        a[2] = Integer.parseInt(DateStr[2]) + 1900;
        return a;
    }

    private final int[] getDateSplit20(String codeDate) {
        String[] DateStr = codeDate.split("/", 3);
        int[] a = new int[3];
        a[0] = Integer.parseInt(DateStr[0]);
        a[1] = Integer.parseInt(DateStr[1]);
        a[2] = Integer.parseInt(DateStr[2]) + 2000;
        return a;
    }

    private final int[] getDateSplitCode(String codeDate) {
        int dateCode = Integer.parseInt(codeDate);
        int[] a = new int[3];
        a[2] = dateCode % 10000;
        a[1] = (dateCode / 10000) % 100;
        a[0] = (dateCode / 1000000) % 100;
        return a;
    }

    private final int[] getDateSplit20Code(String codeDate) {
        int dateCode = Integer.parseInt(codeDate);
        int[] a = new int[3];
        a[2] = dateCode % 100 + 2000;
        a[1] = (dateCode / 100) % 100;
        a[0] = (dateCode / 10000) % 100;
        return a;
    }

    private final int[] getDateSplit19Code(String codeDate) {
        int dateCode = Integer.parseInt(codeDate);
        int[] a = new int[3];
        a[2] = dateCode % 100 + 1900;
        a[1] = (dateCode / 100) % 100;
        a[0] = (dateCode / 10000) % 100;
        return a;
    }

    public final int[] getDateDDMMYYYY(String strDate) {
        format = "DDMMYYYY";
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[0] + "/" + DateStr[1] + "/" + DateStr[2];
        int[] a = getDateSplit(codeDate);
        return a;
    }

    public final int[] getDateMMDDYYYY(String strDate) {
        format = "DDMMYYYY";
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[1] + "/" + DateStr[0] + "/" + DateStr[2];
        int[] a = getDateSplit(codeDate);
        return a;
    }

    public final int[] getDateYYYYDDMM(String strDate) {
        format = "DDMMYYYY";
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[1] + "/" + DateStr[2] + "/" + DateStr[0];
        int[] a = getDateSplit(codeDate);
        return a;
    }

    public final int[] getDateYYYYMMDD(String strDate) {
        format = "DDMMYYYY";
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[2] + "/" + DateStr[1] + "/" + DateStr[0];
        int[] a = getDateSplit(codeDate);
        return a;
    }

    public final int[] getDateDDMMYY19(String strDate) {
        format = "DDMMYYYY";
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[0] + "/" + DateStr[1] + "/" + DateStr[2];
        int[] a = getDateSplit19(codeDate);
        return a;
    }

    public final int[] getDateDDMMYY20(String strDate) {
        format = "DDMMYYYY";
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[0] + "/" + DateStr[1] + "/" + DateStr[2];
        int[] a = getDateSplit20(codeDate);
        return a;
    }

    public final int[] getDateMMDDYY19(String strDate) {
        format = "DDMMYYYY";
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[1] + "/" + DateStr[0] + "/" + DateStr[2];
        int[] a = getDateSplit19(codeDate);
        return a;
    }

    public final int[] getDateMMDDYY20(String strDate) {
        format = "DDMMYYYY";
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[1] + "/" + DateStr[0] + "/" + DateStr[2];
        int[] a = getDateSplit20(codeDate);
        return a;
    }

    public final int[] getDateCodeDDMMYYYY(String strDate) {
        format = "DDMMYYYY";
        int[] a = getDateSplitCode(strDate);
        return a;
    }

    public final int[] getDateCodeMMDDYYYY(String strDate) {
        format = "DDMMYYYY";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 10000;
        a[1] = (dateCode / 1000000) % 100;
        a[0] = (dateCode / 10000) % 100;
        return a;
    }

    public final int[] getDateCodeYYYYDDMM(String strDate) {
        format = "DDMMYYYY";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode / 10000;
        a[1] = dateCode % (dateCode / 1000000);
        a[0] = (dateCode % 10000) / 100;
        return a;
    }

    public final int[] getDateCodeYYYYMMDD(String strDate) {
        format = "DDMMYYYY";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode / 10000;
        a[1] = (dateCode % 10000) / 100;
        a[0] = dateCode % (dateCode / 1000000);
        return a;
    }

    public final int[] getDateCodeDDMMYY19(String strDate) {
        format = "DDMMYYYY";
        int[] a = getDateSplit19Code(strDate);
        return a;
    }

    public final int[] getDateCodeDDMMYY20(String strDate) {
        format = "DDMMYYYY";
        int[] a = getDateSplit20Code(strDate);
        return a;
    }

    public final int[] getDateCodeMMDDYY19(String strDate) {
        format = "DDMMYYYY";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 100 + 1900;
        a[1] = (dateCode / 10000) % 100;
        a[0] = (dateCode / 100) % 100;
        return a;
    }

    public final int[] getDateCodeMMDDYY20(String strDate) {
        format = "DDMMYYYY";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 100 + 2000;
        a[1] = (dateCode / 10000) % 100;
        a[0] = (dateCode / 100) % 100;
        return a;
    }

    public final int[] getDateDDMonYYYY(String strDate) {
        format = "DDMMYYYY";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[0] = dateStr[0].replaceFirst("st", "");
        dateStr[0] = dateStr[0].replaceFirst("nd", "");
        dateStr[0] = dateStr[0].replaceFirst("rd", "");
        dateStr[0] = dateStr[0].replaceFirst("th", "");
        a[0] = Integer.parseInt(dateStr[0]);
        a[2] = Integer.parseInt(dateStr[2]);
        switch (dateStr[1]) {
            case "Jan":
                a[1] = 1;   break;
            case "Feb":
                a[1] = 2;   break;
            case "Mar":
                a[1] = 3;   break;
            case "Apr":
                a[1] = 4;   break;
            case "May":
                a[1] = 5;   break;
            case "Jun":
                a[1] = 6;   break;
            case "Jul":
                a[1] = 7;   break;
            case "Aug":
                a[1] = 8;   break;
            case "Sep":
                a[1] = 9;   break;
            case "Oct":
                a[1] = 10;  break;
            case "Nov":
                a[1] = 11;  break;
            case "Dec":
                a[1] = 12;  break;
        }
        return a;
    }

    public final int[] getDateMonDDYYYY(String strDate) {
        format = "DDMMYYYY";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[1] = dateStr[1].replaceFirst("st", "");
        dateStr[1] = dateStr[1].replaceFirst("nd", "");
        dateStr[1] = dateStr[1].replaceFirst("rd", "");
        dateStr[1] = dateStr[1].replaceFirst("th", "");
        a[0] = Integer.parseInt(dateStr[1]);
        a[2] = Integer.parseInt(dateStr[2]);
        switch (dateStr[0]) {
            case "Jan":
                a[1] = 1;   break;
            case "Feb":
                a[1] = 2;   break;
            case "Mar":
                a[1] = 3;   break;
            case "Apr":
                a[1] = 4;   break;
            case "May":
                a[1] = 5;   break;
            case "Jun":
                a[1] = 6;   break;
            case "Jul":
                a[1] = 7;   break;
            case "Aug":
                a[1] = 8;   break;
            case "Sep":
                a[1] = 9;   break;
            case "Oct":
                a[1] = 10;  break;
            case "Nov":
                a[1] = 11;  break;
            case "Dec":
                a[1] = 12;  break;
        }
        return a;
    }

    public final int[] getDateYYYYMonDD(String strDate) {
        format = "DDMMYYYY";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[2] = dateStr[2].replaceFirst("st", "");
        dateStr[2] = dateStr[2].replaceFirst("nd", "");
        dateStr[2] = dateStr[2].replaceFirst("rd", "");
        dateStr[2] = dateStr[2].replaceFirst("th", "");
        a[0] = Integer.parseInt(dateStr[2]);
        a[2] = Integer.parseInt(dateStr[0]);
        switch (dateStr[1]) {
            case "Jan":
                a[1] = 1;   break;
            case "Feb":
                a[1] = 2;   break;
            case "Mar":
                a[1] = 3;   break;
            case "Apr":
                a[1] = 4;   break;
            case "May":
                a[1] = 5;   break;
            case "Jun":
                a[1] = 6;   break;
            case "Jul":
                a[1] = 7;   break;
            case "Aug":
                a[1] = 8;   break;
            case "Sep":
                a[1] = 9;   break;
            case "Oct":
                a[1] = 10;  break;
            case "Nov":
                a[1] = 11;  break;
            case "Dec":
                a[1] = 12;  break;
        }
        return a;
    }

    public final int[] getDateDDMonthYYYY(String strDate) {
        format = "DDMMYYYY";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[0] = dateStr[0].replaceFirst("st", "");
        dateStr[0] = dateStr[0].replaceFirst("nd", "");
        dateStr[0] = dateStr[0].replaceFirst("rd", "");
        dateStr[0] = dateStr[0].replaceFirst("th", "");
        a[0] = Integer.parseInt(dateStr[0]);
        a[2] = Integer.parseInt(dateStr[2]);
        switch (dateStr[1]) {
            case "January":
                a[1] = 1;   break;
            case "February":
                a[1] = 2;   break;
            case "March":
                a[1] = 3;   break;
            case "April":
                a[1] = 4;   break;
            case "May":
                a[1] = 5;   break;
            case "June":
                a[1] = 6;   break;
            case "July":
                a[1] = 7;   break;
            case "August":
                a[1] = 8;   break;
            case "September":
                a[1] = 9;   break;
            case "October":
                a[1] = 10;  break;
            case "November":
                a[1] = 11;  break;
            case "December":
                a[1] = 12;  break;
        }
        return a;
    }

    public final int[] getDateYYYYMonthDD(String strDate) {
        format = "DDMMYYYY";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[2] = dateStr[2].replaceFirst("st", "");
        dateStr[2] = dateStr[2].replaceFirst("nd", "");
        dateStr[2] = dateStr[2].replaceFirst("rd", "");
        dateStr[2] = dateStr[2].replaceFirst("th", "");
        a[0] = Integer.parseInt(dateStr[2]);
        a[2] = Integer.parseInt(dateStr[0]);
        switch (dateStr[1]) {
            case "January":
                a[1] = 1;   break;
            case "February":
                a[1] = 2;   break;
            case "March":
                a[1] = 3;   break;
            case "April":
                a[1] = 4;   break;
            case "May":
                a[1] = 5;   break;
            case "June":
                a[1] = 6;   break;
            case "July":
                a[1] = 7;   break;
            case "August":
                a[1] = 8;   break;
            case "September":
                a[1] = 9;   break;
            case "October":
                a[1] = 10;  break;
            case "November":
                a[1] = 11;  break;
            case "December":
                a[1] = 12;  break;
        }
        return a;
    }

    public final String putDateDDMMYYYY(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%04d", a[2]);
        return strDate;
    }

    public final String putDateMMDDYYYY(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%04d", a[2]);
        return strDate;
    }

    public final String putDateYYYYMMDD(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%04d", a[2]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]);
        return strDate;
    }

    public final String putDateYYYYDDMM(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%04d", a[2]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]);
        return strDate;
    }

    public final String putDateMMDDYY20(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[2] - 2000);
        return strDate;
    }

    public final String putDateMMDDYY19(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[2] - 1900);
        return strDate;
    }

    public final String putDateDDMMYY20(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[2] - 2000);
        return strDate;
    }

    public final String putDateDDMMYY19(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[2] - 1900);
        return strDate;
    }

    public final String putDateCodeMMDDYYYY(int a[]) {
        format = "DDMMYYYY";
       String strDate = String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%04d", a[2]);
        return strDate;
    }

    public final String putDateCodeDDMMYYYY(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%04d", a[2]);
        return strDate;
    }

    public final String putDateCodeYYYYDDMM(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%04d", a[2]) + String.format("%02d", a[0]) + String.format("%02d", a[1]);
        return strDate;
    }

    public final String putDateCodeYYYYMMDD(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%04d", a[2]) + String.format("%02d", a[1]) + String.format("%02d", a[0]);
        return strDate;
    }

    public final String putDateCodeMMDDYY20(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%02d", (a[2] - 2000));
        return strDate;
    }

    public final String putDateCodeDDMMYY20(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%02d", (a[2] - 2000));
        return strDate;
    }

    public final String putDateCodeMMDDYY19(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%02d", (a[2] - 1900));
        return strDate;
    }

    public final String putDateCodeDDMMYY19(int a[]) {
        format = "DDMMYYYY";
        String strDate = String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%02d", (a[2] - 2000));
        return strDate;
    }

    public final String putDateMonDDYYYY(int a[]) {
        format = "DDMMYYYY";
        String mon = new String();
        switch (a[1]) {
            case 1:
                mon = "Jan";    break;
            case 2:
                mon = "Feb";    break;
            case 3:
                mon = "Mar";    break;
            case 4:
                mon = "Apr";    break;
            case 5:
                mon = "May";    break;
            case 6:
                mon = "Jun";    break;
            case 7:
                mon = "Jul";    break;
            case 8:
                mon = "Aug";    break;
            case 9:
                mon = "Sep";    break;
            case 10:
                mon = "Oct";    break;
            case 11:
                mon = "Nov";    break;
            case 12:
                mon = "Dec";    break;
        }
        String strDate = mon + " " + a[0] + " " + a[2];
        return strDate;
    }

    public final String putDateDDMonYYYY(int a[]) {
        format = "DDMMYYYY";
        String mon = new String();
        switch (a[1]) {
            case 1:
                mon = "Jan";    break;
            case 2:
                mon = "Feb";    break;
            case 3:
                mon = "Mar";    break;
            case 4:
                mon = "Apr";    break;
            case 5:
                mon = "May";    break;
            case 6:
                mon = "Jun";    break;
            case 7:
                mon = "Jul";    break;
            case 8:
                mon = "Aug";    break;
            case 9:
                mon = "Sep";    break;
            case 10:
                mon = "Oct";    break;
            case 11:
                mon = "Nov";    break;
            case 12:
                mon = "Dec";    break;
        }
        String strDate = a[0] + " " + mon + " " + a[2];
        return strDate;
    }

    public final String putDateYYYYMonDD(int a[]) {
        format = "DDMMYYYY";
        String mon = new String();
        switch (a[1]) {
            case 1:
                mon = "Jan";    break;
            case 2:
                mon = "Feb";    break;
            case 3:
                mon = "Mar";    break;
            case 4:
                mon = "Apr";    break;
            case 5:
                mon = "May";    break;
            case 6:
                mon = "Jun";    break;
            case 7:
                mon = "Jul";    break;
            case 8:
                mon = "Aug";    break;
            case 9:
                mon = "Sep";    break;
            case 10:
                mon = "Oct";    break;
            case 11:
                mon = "Nov";    break;
            case 12:
                mon = "Dec";    break;
        }
        String strDate = a[2] + " " + mon + " " + a[0];
        return strDate;
    }

    public final String putDateDDMonthYYYY(int a[]) {
        format = "DDMMYYYY";
        String month = new String();
        switch (a[1]) {
            case 1:
                month = "January";      break;
            case 2:
                month = "February";     break;
            case 3:
                month = "March";        break;
            case 4:
                month = "April";        break;
            case 5:
                month = "May";          break;
            case 6:
                month = "June";         break;
            case 7:
                month = "July";         break;
            case 8:
                month = "August";       break;
            case 9:
                month = "September";    break;
            case 10:
                month = "October";      break;
            case 11:
                month = "November";     break;
            case 12:
                month = "December";     break;
        }
        String strDate = new String();

        if (a[0] % 10 == 1) {
            strDate = a[0] + "st " + month + " " + a[2];
        } else if (a[0] % 10 == 2) {
            strDate = a[0] + "nd " + month + " " + a[2];
        } else if (a[0] % 10 == 3) {
            strDate = a[0] + "rd " + month + " " + a[2];
        } else {
            strDate = a[0] + "th " + month + " " + a[2];
        }

        return strDate;
    }

    public final String putDateYYYYMonthDD(int a[]) {
        format = "DDMMYYYY";
        String month = new String();
        switch (a[1]) {
            case 1:
                month = "January";      break;
            case 2:
                month = "February";     break;
            case 3:
                month = "March";        break;
            case 4:
                month = "April";        break;
            case 5:
                month = "May";          break;
            case 6:
                month = "June";         break;
            case 7:
                month = "July";         break;
            case 8:
                month = "August";       break;
            case 9:
                month = "September";    break;
            case 10:
                month = "October";      break;
            case 11:
                month = "November";     break;
            case 12:
                month = "December";     break;
        }
        String strDate = new String();
        if (a[0] % 10 == 1) {
            strDate = a[2] + " " + month + " " + a[0] + "st";
        } else if (a[0] % 10 == 2) {
            strDate = a[2] + " " + month + " " + a[0] + "nd";
        } else if (a[0] % 10 == 3) {
            strDate = a[2] + " " + month + " " + a[0] + "rd";
        } else {
            strDate = a[2] + " " + month + " " + a[1] + "th";
        }
        return strDate;
    }

    public final int toUnivno(int a[]) {
        int d = 0;
        if (a[2] % 4 == 0 && a[2] > 0) {
            switch (a[1]) {
                case 1:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] : 0;
                    break;
                case 2:
                    d = a[0] > 0 && a[0] <= 29 ? a[0] + 31 : 0;
                    break;
                case 3:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 60 : 0;
                    break;
                case 4:
                    d = a[0] > 0 && a[0] <= 30 ? a[0] + 91 : 0;
                    break;
                case 5:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 121 : 0;
                    break;
                case 6:
                    d = a[0] > 0 && a[0] <= 30 ? a[0] + 152 : 0;
                    break;
                case 7:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 182 : 0;
                    break;
                case 8:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 213 : 0;
                    break;
                case 9:
                    d = a[0] > 0 && a[0] <= 30 ? a[0] + 244 : 0;
                    break;
                case 10:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 274 : 0;
                    break;
                case 11:
                    d = a[0] > 0 && a[0] <= 30 ? a[0] + 305 : 0;
                    break;
                case 12:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 335 : 0;
                    break;
            }
        } else if (a[2] % 4 != 0 && a[2] > 0) {
            switch (a[1]) {
                case 1:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] : 0;
                    break;
                case 2:
                    d = a[0] > 0 && a[0] <= 28 ? a[0] + 31 : 0;
                    break;
                case 3:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 59 : 0;
                    break;
                case 4:
                    d = a[0] > 0 && a[0] <= 30 ? a[0] + 90 : 0;
                    break;
                case 5:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 120 : 0;
                    break;
                case 6:
                    d = a[0] > 0 && a[0] <= 30 ? a[0] + 151 : 0;
                    break;
                case 7:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 181 : 0;
                    break;
                case 8:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 212 : 0;
                    break;
                case 9:
                    d = a[0] > 0 && a[0] <= 30 ? a[0] + 243 : 0;
                    break;
                case 10:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 273 : 0;
                    break;
                case 11:
                    d = a[0] > 0 && a[0] <= 30 ? a[0] + 304 : 0;
                    break;
                case 12:
                    d = a[0] > 0 && a[0] <= 31 ? a[0] + 334 : 0;
                    break;
            }
        }
        return (d != 0)? (a[2] - 1) * 365 + (a[2] - 1) / 4 + d : 0;
    }

    public final boolean toCheckValidDate(int a) {
        return (a > 0)? true : false;
    }

    public final boolean toCheckValidDate(int a[]) {
        int d = toUnivno(a);
        return(d > 0)? true : false;
    }

    public final int daysBetweenDates(int a, int b) {
        return (a >= b) ? a - b : b - a;
    }

    public final int daysBetweenDates(int d1[], int d2[]) {
        int a = toUnivno(d1);
        int b = toUnivno(d2);
        return (a >= b) ? a - b : b - a;

    }

    public final int[] toDate(int d) {
        int a[] = new int[3];
        int lp = ((d - (d / 365) / 4) / 365) / 4;
        a[2] = ((d - lp) / 365) + 1;
        int m = d - (a[2] - 1) * 365 - lp;
        a[0] = 0;
        a[1] = 0;
        if (a[2] % 4 == 0) {
            if (m > 0 && m < 32) {
                a[0] = m;
                a[1] = 1;
            } else if (m > 31 && m <= 60) {
                a[0] = m - 31;
                a[1] = 2;
            } else if (m > 60 && m <= 91) {
                a[0] = m - 60;
                a[1] = 3;
            } else if (m > 91 && m <= 121) {
                a[0] = m - 91;
                a[1] = 4;
            } else if (m > 121 && m <= 152) {
                a[0] = m - 121;
                a[1] = 5;
            } else if (m > 152 && m <= 182) {
                a[0] = m - 152;
                a[1] = 6;
            } else if (m > 182 && m <= 213) {
                a[0] = m - 182;
                a[1] = 7;
            } else if (m > 213 && m <= 244) {
                a[0] = m - 213;
                a[1] = 8;
            } else if (m > 244 && m <= 274) {
                a[0] = m - 244;
                a[1] = 9;
            } else if (m > 274 && m <= 305) {
                a[0] = m - 274;
                a[1] = 10;
            } else if (m > 305 && m <= 335) {
                a[0] = m - 305;
                a[1] = 11;
            } else if (m > 335 && m <= 366) {
                a[0] = m - 335;
                a[1] = 12;
            } else if (m == 0) {
                a[0] = 31;
                a[1] = 12;
                a[2] = a[2] - 1;
            }
        } else {
            if (m > 0 && m <= 31) {
                a[0] = m - 0;
                a[1] = 1;
            } else if (m > 31 && m <= 59) {
                a[0] = m - 31;
                a[1] = 2;
            } else if (m > 59 && m <= 90) {
                a[0] = m - 59;
                a[1] = 3;
            } else if (m > 90 && m <= 120) {
                a[0] = m - 90;
                a[1] = 4;
            } else if (m > 120 && m <= 151) {
                a[0] = m - 120;
                a[1] = 5;
            } else if (m > 151 && m <= 181) {
                a[0] = m - 151;
                a[1] = 6;
            } else if (m > 181 && m <= 212) {
                a[0] = m - 181;
                a[1] = 7;
            } else if (m > 212 && m <= 243) {
                a[0] = m - 212;
                a[1] = 8;
            } else if (m > 243 && m <= 273) {
                a[0] = m - 243;
                a[1] = 9;
            } else if (m > 273 && m <= 304) {
                a[0] = m - 273;
                a[1] = 10;
            } else if (m > 304 && m <= 334) {
                a[0] = m - 304;
                a[1] = 11;
            } else if (m > 334 && m <= 365) {
                a[0] = m - 334;
                a[1] = 12;
            } else if (m == 0) {
                a[0] = 31;
                a[1] = 12;
                a[2] = a[2] - 1;
            }
        }
        return a;
    }

    public final String toDay(int a) {
        String d = new String();
        switch (a % 7) {
            case 1:
                d = "Sunday";       break;
            case 2:
                d = "Monday";       break;
            case 3:
                d = "Tuesday";      break;
            case 4:
                d = "Wednesday";    break;
            case 5:
                d = "Thursday";     break;
            case 6:
                d = "Friday";       break;
            case 0:
                d = "Saturday";     break;
        }
        return d;
    }

    public final String[] toSortDates(String a[]) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++)
            c[i] = toUnivno(getDateDDMMYYYY(a[i]));
        Arrays.sort(c);
        for (int i = 0; i < a.length; i++)
            a[i] = putDateDDMMYYYY(toDate(c[i]));
        return a;
    }
}
