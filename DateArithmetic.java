
import java.util.Arrays;
import java.util.Scanner;

public class DateArithmetic {

    private final int[] getDateSplit(String codeDate){

      int dateCode = Integer.parseInt(codeDate);
      int[] a = new int[3];
      a[2] = dateCode % 10000;
      a[1] = (dateCode / 10000) % 100;
      a[0] = (dateCode / 1000000) % 100;
      return a;
    }

    private final int[] getDateSplit20(String codeDate){

      int dateCode = Integer.parseInt(codeDate);
      int[] a = new int[3];
      a[2] = dateCode % 100 + 2000;
      a[1] = (dateCode / 100) % 100;
      a[0] = (dateCode / 10000) % 100;

      return a;
    }

    private final int[] getDateSplit19(String codeDate){

      int dateCode = Integer.parseInt(codeDate);
      int[] a = new int[3];
      a[2] = dateCode % 100 + 1900;
      a[1] = (dateCode / 100) % 100;
      a[0] = (dateCode / 10000) % 100;
      return a;
    }

    public final int[] getDateDDMMYYYY(String strDate) {
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[0] + DateStr[1] + DateStr[2];
        int[] a = getDateSplit(codeDate);
        return a;
    }

    public final int[] getDateMMDDYYYY(String strDate) {
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[1] + DateStr[0] + DateStr[2];
        int[] a = getDateSplit(codeDate);
        return a;
    }

    public final int[] getDateYYYYDDMM(String strDate) {
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[1] + DateStr[2] + DateStr[0];
        int[] a = getDateSplit(codeDate);
        return a;
    }

    public final int[] getDateYYYYMMDD(String strDate) {
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[2] + DateStr[1] + DateStr[0];
        int[] a = getDateSplit(codeDate);
        return a;
    }



    public final int[] getDateDDMMYY19(String strDate) {
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[0] + DateStr[1] + DateStr[2];
        int[] a = getDateSplit19(codeDate);
        return a;
    }

    public final int[] getDateDDMMYY20(String strDate) {
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[0] + DateStr[1] + DateStr[2];
        int[] a = getDateSplit20(codeDate);
        return a;
    }

    public final int[] getDateMMDDYY19(String strDate) {
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[1] + DateStr[0] + DateStr[2];
        int[] a = getDateSplit19(codeDate);
        return a;
    }

    public final int[] getDateMMDDYY20(String strDate) {
        String[] DateStr = strDate.split("/", 3);
        String codeDate = DateStr[1] + DateStr[0] + DateStr[2];
        int[] a = getDateSplit20(codeDate);
        return a;
    }

    public final int[] getDateCodeDDMMYYYY(String strDate) {
        int[] a = getDateSplit(strDate);
        return a;
    }

    public final int[] getDateCodeMMDDYYYY(String strDate) {
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 10000;
        a[0] = (dateCode / 10000) % 100;
        a[1] = (dateCode / 1000000) % 100;
        return a;
    }

    public final int[] getDateCodeYYYYDDMM(String strDate) {
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode / 10000;
        a[0] = (dateCode % 10000) / 100;
        a[1] = dateCode % (dateCode / 1000000);
        return a;
    }

    public final int[] getDateCodeYYYYMMDD(String strDate) {
       int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode / 10000;
        a[1] = (dateCode % 10000) / 100;
        a[0] = dateCode % (dateCode / 1000000);
        return a;
    }

    public final int[] getDateCodeDDMMYY19(String strDate) {
        int[] a = getDateSplit19(strDate);
        return a;
    }

    public final int[] getDateCodeDDMMYY20(String strDate) {
        int[] a = getDateSplit20(strDate);
        return a;
    }

    public final int[] getDateCodeMMDDYY19(String strDate) {
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 100 + 1900;
        a[0] = (dateCode / 100) % 100;
        a[1] = (dateCode / 10000) % 100;
        return a;
    }

    public final int[] getDateCodeMMDDYY20(String strDate) {
        int dateCode = Integer.parseInt(strDate);
        int[] a = new int[3];
        a[2] = dateCode % 100 + 2000;
        a[0] = (dateCode / 100) % 100;
        a[1] = (dateCode / 10000) % 100;
        return a;
    }

    public final String[] toSortDate(String a[]) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = toUnivno(getDateDDMMYYYY(a[i]));
        }
        Arrays.sort(c);
        for (int i = 0; i < a.length; i++) {
            a[i] = putDateDDMMYYYY(toDate(c[i]));
        }
        return a;
    }

    public final String putDateDDMMYYYY(int a[]) {
        String strDate = String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%04d", a[2]);
        return strDate;
    }

    public final String putDateMMDDYYYY(int a[]) {
        String strDate = String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%04d", a[2]);
        return strDate;
    }

    public final String putDateYYYYMMDD(int a[]) {
        String strDate = String.format("%04d", a[2]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]);
        return strDate;
    }

    public final String putDateYYYYDDMM(int a[]) {
        String strDate = String.format("%04d", a[2]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]);
        return strDate;
    }

    public final String putDateMMDDYY20(int a[]) {
        String strDate = String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[2] - 2000);
        return strDate;
    }

    public final String putDateMMDDYY19(int a[]) {
        String strDate = String.format("%02d", a[1]) + "/" + String.format("%02d", a[0]) + "/" + String.format("%02d", a[2] - 1900);
        return strDate;
    }

    public final String putDateDDMMYY20(int a[]) {
        String strDate = String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[2] - 2000);
        return strDate;
    }

    public final String putDateDDMMYY19(int a[]) {
        String strDate = String.format("%02d", a[0]) + "/" + String.format("%02d", a[1]) + "/" + String.format("%02d", a[2] - 1900);
        return strDate;
    }

    public final String putDateCodeMMDDYYYY(int a[]) {
        String strDate = String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%04d", a[2]);
        return strDate;
    }

    public final String putDateCodeDDMMYYYY(int a[]) {
        String strDate = String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%04d", a[2]);
        return strDate;
    }

    public final String putDateCodeYYYYDDMM(int a[]) {
        String strDate = String.format("%04d", a[2]) + String.format("%02d", a[0]) + String.format("%02d", a[1]);
        return strDate;
    }

    public final String putDateCodeYYYYMMDD(int a[]) {
        String strDate = String.format("%04d", a[2]) + String.format("%02d", a[1]) + String.format("%02d", a[0]);
        return strDate;
    }

    public final String putDateCodeMMDDYY20(int a[]) {
        String strDate = String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%02d", (a[2] - 2000));
        return strDate;
    }

    public final String putDateCodeDDMMYY20(int a[]) {
        String strDate = String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%02d", (a[2] - 2000));
        return strDate;
    }

    public final String putDateCodeMMDDYY19(int a[]) {
        String strDate = String.format("%02d", a[1]) + String.format("%02d", a[0]) + String.format("%02d", (a[2] - 1900));
        return strDate;
    }

    public final String putDateCodeDDMMYY19(int a[]) {
        String strDate = String.format("%02d", a[0]) + String.format("%02d", a[1]) + String.format("%02d", (a[2] - 2000));
        return strDate;
    }

    public final String putDateMonDDYYYY(int a[]) {
        String mon = new String();
        switch (a[1]) {
            case 1:
                mon = "Jan";
                break;
            case 2:
                mon = "Feb";
                break;
            case 3:
                mon = "Mar";
                break;
            case 4:
                mon = "Apr";
                break;
            case 5:
                mon = "May";
                break;
            case 6:
                mon = "Jun";
                break;
            case 7:
                mon = "Jul";
                break;
            case 8:
                mon = "Aug";
                break;
            case 9:
                mon = "Sep";
                break;
            case 10:
                mon = "Oct";
                break;
            case 11:
                mon = "Nov";
                break;
            case 12:
                mon = "Dec";
                break;
        }
        String strDate = mon + " " + a[0] + " " + a[2];
        return strDate;
    }

    public final String putDateDDMonYYYY(int a[]) {
        String mon = new String();
        switch (a[1]) {
            case 1:
                mon = "Jan";
                break;
            case 2:
                mon = "Feb";
                break;
            case 3:
                mon = "Mar";
                break;
            case 4:
                mon = "Apr";
                break;
            case 5:
                mon = "May";
                break;
            case 6:
                mon = "Jun";
                break;
            case 7:
                mon = "Jul";
                break;
            case 8:
                mon = "Aug";
                break;
            case 9:
                mon = "Sep";
                break;
            case 10:
                mon = "Oct";
                break;
            case 11:
                mon = "Nov";
                break;
            case 12:
                mon = "Dec";
                break;
        }
        String strDate = a[0] + " " + mon + " " + a[2];
        return strDate;
    }

    public final String putDateYYYYMonDD(int a[]) {
        String mon = new String();
        switch (a[1]) {
            case 1:
                mon = "Jan";
                break;
            case 2:
                mon = "Feb";
                break;
            case 3:
                mon = "Mar";
                break;
            case 4:
                mon = "Apr";
                break;
            case 5:
                mon = "May";
                break;
            case 6:
                mon = "Jun";
                break;
            case 7:
                mon = "Jul";
                break;
            case 8:
                mon = "Aug";
                break;
            case 9:
                mon = "Sep";
                break;
            case 10:
                mon = "Oct";
                break;
            case 11:
                mon = "Nov";
                break;
            case 12:
                mon = "Dec";
                break;
        }
        String strDate = a[2] + " " + mon + " " + a[0];
        return strDate;
    }

    public final String putDateDDMonthYYYY(int a[]) {
        String month = new String();
        switch (a[1]) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
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
        String month = new String();
        switch (a[1]) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
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
        if (d != 0) {
            return (a[2] - 1) * 365 + (a[2] - 1) / 4 + d;
        } else {
            return 0;
        }
    }

    public final boolean toCheckValidDate(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean toCheckValidDate(int a[]) {
        int d = toUnivno(a);
        if (d > 0) {
            return true;
        } else {
            return false;
        }
    }

    public final int daysBetweenDates(int a, int b) {
        if (a > b) {
            return a - b;
        } else if (a == b) {
            return 0;
        } else {
            return b - a;
        }
    }

    public final int daysBetweenDates(int d1[], int d2[]) {
        int a = toUnivno(d1);
        int b = toUnivno(d2);
        if (a > b) {
            return a - b;
        } else if (a == b) {
            return 0;
        } else {
            return b - a;
        }
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
                d = "Sunday";
                break;
            case 2:
                d = "Monday";
                break;
            case 3:
                d = "Tuesday";
                break;
            case 4:
                d = "Wednesday";
                break;
            case 5:
                d = "Thursday";
                break;
            case 6:
                d = "Friday";
                break;
            case 0:
                d = "Saturday";
                break;
        }
        return d;
    }
}
