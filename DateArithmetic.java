
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

    private final int getMonth(String a){
        int b;
        switch (a) {
            case "January":
                b = 1;   break;
            case "February":
                b = 2;   break;
            case "March":
                b = 3;   break;
            case "April":
                b = 4;   break;
            case "May":
                b = 5;   break;
            case "June":
                b = 6;   break;
            case "July":
                b = 7;   break;
            case "August":
                b = 8;   break;
            case "September":
                b = 9;   break;
            case "October":
                b = 10;  break;
            case "November":
                b = 11;  break;
            case "December":
                b = 12;  break;
            default: b = 0;
        }
        return b;
    }

    private final int getMon(String a){
        int b;
        switch (a) {
            case "Jan":
                b = 1;   break;
            case "Feb":
                b = 2;   break;
            case "Mar":
                b = 3;   break;
            case "Apr":
                b = 4;   break;
            case "May":
                b = 5;   break;
            case "Jun":
                b = 6;   break;
            case "Jul":
                b = 7;   break;
            case "Aug":
                b = 8;   break;
            case "Sep":
                b = 9;   break;
            case "Oct":
                b = 10;  break;
            case "Nov":
                b = 11;  break;
            case "Dec":
                b = 12;  break;
            default: b = 0;
        }
        return b;
    }

    private final String putMonth(int a){
        String b;
        switch (a) {
            case 1:
                b = "January";      break;
            case 2:
                b = "February";     break;
            case 3:
                b = "March";        break;
            case 4:
                b = "April";        break;
            case 5:
                b = "May";          break;
            case 6:
                b = "June";         break;
            case 7:
                b = "July";         break;
            case 8:
                b = "August";       break;
            case 9:
                b = "September";    break;
            case 10:
                b = "October";      break;
            case 11:
                b = "November";     break;
            case 12:
                b = "December";     break;
            default: b = null;
        }
        return b;
    }

    private final String putMon(int a){
        String b;
        switch (a) {
            case 1:
                b = "Jan";    break;
            case 2:
                b = "Feb";    break;
            case 3:
                b = "Mar";    break;
            case 4:
                b = "Apr";    break;
            case 5:
                b = "May";    break;
            case 6:
                b = "Jun";    break;
            case 7:
                b = "Jul";    break;
            case 8:
                b = "Aug";    break;
            case 9:
                b = "Sep";    break;
            case 10:
                b = "Oct";    break;
            case 11:
                b = "Nov";    break;
            case 12:
                b = "Dec";    break;
            default: b = null;
        }
        return b;
    }

    private String getReplaceDay(String a) {
        a = a.replaceFirst("st", "");
        a = a.replaceFirst("nd", "");
        a = a.replaceFirst("rd", "");
        a = a.replaceFirst("th", "");
        return a;
    }

    private String putReplaceDay(int a) {
        String b;
        if (a % 10 == 1) {
            b = "st";
        } else if (a % 10 == 2) {
            b = "nd";
        } else if (a % 10 == 3) {
            b = "rd";
        } else {
            b = "th";
        }
        return b;
    }

    public final int[] getDateDDMMYYYY(String strDate) {
        format = "DD/MM/YYYY";
        String[] DateStr = strDate.split("/", 3);
        int[] a = getDateSplit(DateStr[0] + "/" + DateStr[1] + "/" + DateStr[2]);
        return a;
    }

    public final int[] getDateMMDDYYYY(String strDate) {
        format = "MM/DD/YYYY";
        String[] DateStr = strDate.split("/", 3);
        int[] a = getDateSplit(DateStr[1] + "/" + DateStr[0] + "/" + DateStr[2]);
        return a;
    }

    public final int[] getDateYYYYDDMM(String strDate) {
        format = "YYYY/DD/MM";
        String[] DateStr = strDate.split("/", 3);
        int[] a = getDateSplit(DateStr[1] + "/" + DateStr[2] + "/" + DateStr[0]);
        return a;
    }

    public final int[] getDateYYYYMMDD(String strDate) {
        format = "YYYY/MM/DD";
        String[] DateStr = strDate.split("/", 3);
        int[] a = getDateSplit(DateStr[2] + "/" + DateStr[1] + "/" + DateStr[0]);
        return a;
    }

    public final int[] getDateDDMMYY19(String strDate) {
        format = "DD/MM/YY";
        String[] DateStr = strDate.split("/", 3);
        int[] a = getDateSplit19(DateStr[0] + "/" + DateStr[1] + "/" + DateStr[2]);
        return a;
    }

    public final int[] getDateDDMMYY20(String strDate) {
        format = "DD/MM/YY";
        String[] DateStr = strDate.split("/", 3);
        int[] a = getDateSplit20(DateStr[0] + "/" + DateStr[1] + "/" + DateStr[2]);
        return a;
    }

    public final int[] getDateMMDDYY19(String strDate) {
        format = "MM/DD/YY";
        String[] DateStr = strDate.split("/", 3);
        int[] a = getDateSplit19(DateStr[1] + "/" + DateStr[0] + "/" + DateStr[2]);
        return a;
    }

    public final int[] getDateMMDDYY20(String strDate) {
        format = "MM/DD/YY";
        String[] DateStr = strDate.split("/", 3);
        int[] a = getDateSplit20(DateStr[1] + "/" + DateStr[0] + "/" + DateStr[2]);
        return a;
    }

    public final int[] getDateCodeDDMMYYYY(String strDate) {
        format = "DDMMYYYY";
        int[] a = getDateSplitCode(strDate);
        return a;
    }

    public final int[] getDateCodeMMDDYYYY(String strDate) {
        format = "MMDDYYYY";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 10000;
        a[1] = (dateCode / 1000000) % 100;
        a[0] = (dateCode / 10000) % 100;
        return a;
    }

    public final int[] getDateCodeYYYYDDMM(String strDate) {
        format = "YYYYDDMM";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode / 10000;
        a[1] = dateCode % (dateCode / 1000000);
        a[0] = (dateCode % 10000) / 100;
        return a;
    }

    public final int[] getDateCodeYYYYMMDD(String strDate) {
        format = "YYYYMMDD";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode / 10000;
        a[1] = (dateCode % 10000) / 100;
        a[0] = dateCode % (dateCode / 1000000);
        return a;
    }

    public final int[] getDateCodeDDMMYY19(String strDate) {
        format = "DDMMYY";
        int[] a = getDateSplit19Code(strDate);
        return a;
    }

    public final int[] getDateCodeDDMMYY20(String strDate) {
        format = "DDMMYY";
        int[] a = getDateSplit20Code(strDate);
        return a;
    }

    public final int[] getDateCodeMMDDYY19(String strDate) {
        format = "MMDDYY";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 100 + 1900;
        a[1] = (dateCode / 10000) % 100;
        a[0] = (dateCode / 100) % 100;
        return a;
    }

    public final int[] getDateCodeMMDDYY20(String strDate) {
        format = "MMDDYY";
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 100 + 2000;
        a[1] = (dateCode / 10000) % 100;
        a[0] = (dateCode / 100) % 100;
        return a;
    }

    public final int[] getDateDDMonYYYY(String strDate) {
        format = "DD Mon YYYY";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[1] = getReplaceDay(dateStr[1]);
        a[0] = Integer.parseInt(dateStr[0]);
        a[1] = getMon(dateStr[1]);
        a[2] = Integer.parseInt(dateStr[2]);
        return a;
    }

    public final int[] getDateMonDDYYYY(String strDate) {
        format = "Mon DD YYYY";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[1] = getReplaceDay(dateStr[1]);
        a[0] = Integer.parseInt(dateStr[1]);
        a[1] = getMon(dateStr[0]);
        a[2] = Integer.parseInt(dateStr[2]);
        return a;
    }

    public final int[] getDateYYYYMonDD(String strDate) {
        format = "YYYY Mon DD";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[2] = getReplaceDay(dateStr[2]);
        a[0] = Integer.parseInt(dateStr[2]);
        a[1] = getMonth(dateStr[1]);
        a[2] = Integer.parseInt(dateStr[0]);
        return a;
    }

    public final int[] getDateDDMonthYYYY(String strDate) {
        format = "DD Month YYYY";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[0] = getReplaceDay(dateStr[0]);
        a[0] = Integer.parseInt(dateStr[0]);
        a[1] = getMonth(dateStr[1]);
        a[2] = Integer.parseInt(dateStr[2]);
        return a;
    }

    public final int[] getDateYYYYMonthDD(String strDate) {
        format = "YYYY Month DD";
        int[] a = new int[3];
        String[] dateStr = strDate.split(" ");
        dateStr[2] = getReplaceDay(dateStr[2]);
        a[0] = Integer.parseInt(dateStr[2]);
        a[1] = getMonth(dateStr[1]);
        a[2] = Integer.parseInt(dateStr[0]);
        return a;
    }

    public final String putDateDDMMYYYY(int a[]) {
        format = "DD/MM/YYYY";
        return String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%04d", a[2]);
    }

    public final String putDateMMDDYYYY(int a[]) {
        format = "MM/DD/YYYY";
        return String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%04d", a[2]);
    }

    public final String putDateYYYYMMDD(int a[]) {
        format = "YYYY/MM/DD";
        return String.format("%04d", a[2]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]);
    }

    public final String putDateYYYYDDMM(int a[]) {
        format = "YYYY/DD/MM";
        return String.format("%04d", a[2]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]);
    }

    public final String putDateMMDDYY20(int a[]) {
        format = "MM/DD/YY";
        return String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[2] - 2000);
    }

    public final String putDateMMDDYY19(int a[]) {
        format = "MM/DD/YY";
        return String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[2] - 1900);
    }

    public final String putDateDDMMYY20(int a[]) {
        format = "DD/MM/YY";
        return String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[2] - 2000);
    }

    public final String putDateDDMMYY19(int a[]) {
        format = "DD/MM/YY";
        return String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[2] - 1900);
    }

    public final String putDateCodeMMDDYYYY(int a[]) {
        format = "MMDDYYYY";
        return String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%04d", a[2]);
    }

    public final String putDateCodeDDMMYYYY(int a[]) {
        format = "DDMMYYYY";
        return String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%04d", a[2]);
    }

    public final String putDateCodeYYYYDDMM(int a[]) {
        format = "YYYYDDMM";
        return String.format("%04d", a[2]) + String.format("%02d", a[0]) + String.format("%02d", a[1]);
    }

    public final String putDateCodeYYYYMMDD(int a[]) {
        format = "YYYYMMDD";
        return String.format("%04d", a[2]) + String.format("%02d", a[1]) + String.format("%02d", a[0]);
    }

    public final String putDateCodeMMDDYY20(int a[]) {
        format = "MMDDYY";
        return String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%02d", (a[2] - 2000));
    }

    public final String putDateCodeDDMMYY20(int a[]) {
        format = "DDMMYY";
        return String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%02d", (a[2] - 2000));
    }

    public final String putDateCodeMMDDYY19(int a[]) {
        format = "MMDDYY";
        return String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%02d", (a[2] - 1900));
    }

    public final String putDateCodeDDMMYY19(int a[]) {
        format = "DDMMYY";
        return String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%02d", (a[2] - 2000));
    }

    public final String putDateMonDDYYYY(int a[]) {
        format = "Mon DD YYYY";
        return putMon(a[1]) + " " + a[0] + " " + a[2];
    }

    public final String putDateDDMonYYYY(int a[]) {
        format = "DD Mon YYYY";
        return a[0] + " " + putMon(a[1]) + " " + a[2];
    }

    public final String putDateYYYYMonDD(int a[]) {
        format = "YYYY Mon DD";
        return a[2] + " " + putMon(a[1]) + " " + a[0];
    }

    public final String putDateDDMonthYYYY(int a[]) {
        format = "DD Month YYYY";
        return a[0] + putReplaceDay(a[0]) + " " + putMonth(a[1]) + " " + a[2];
    }

    public final String putDateYYYYMonthDD(int a[]) {
        format = "YYYY Month DD";
        return a[2]+ " " + putMonth(a[1]) + " " + a[0] + putReplaceDay(a[0]);
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
        return a > 0 ? true : false;
    }

    public final boolean toCheckValidDate(int a[]) {
        int d = toUnivno(a);
        return d > 0 ? true : false;
    }

    public final int toGetDaysBetweenDates(int a, int b) {
        return a >= b ? a - b : b - a;
    }

    public final int toGetDaysBetweenDates(int d1[], int d2[]) {
        int a = toUnivno(d1);
        int b = toUnivno(d2);
        return toGetDaysBetweenDates( a,  b);
    }

    public final int[] toFindDate(int d1[], int n) {
        int a = toUnivno(d1);
        int b = a + n;
        return toDate(b);
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
