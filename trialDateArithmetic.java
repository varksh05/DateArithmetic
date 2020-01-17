
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Date {

    public static void main(String[] args) {
        DateArithmetic a = new DateArithmetic();

//      getDate Methods
        System.out.println("\ngetDate Methods\n");
        System.out.println("DD MM YYYY " + Arrays.toString(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YYYY " + Arrays.toString(a.getDateMMDDYYYY("2/1/2010")));
        System.out.println("YYYY DD MM " + Arrays.toString(a.getDateYYYYDDMM("2010/1/2")));
        System.out.println("YYYY MM DD " + Arrays.toString(a.getDateYYYYMMDD("2010/02/01")));
        System.out.println("DD MM YY20 " + Arrays.toString(a.getDateDDMMYY20("01/02/10")));
        System.out.println("DD MM YY19 " + Arrays.toString(a.getDateDDMMYY19("01/02/10")));
        System.out.println("MM DD YY20 " + Arrays.toString(a.getDateMMDDYY20("02/01/10")));
        System.out.println("MM DD YY19 " + Arrays.toString(a.getDateMMDDYY19("02/01/10")));
        System.out.println("MM DD YY19 " + Arrays.toString(a.getDateMMDDYY19("02/01/10")));

//      getDateCode Methods
        System.out.println("\ngetDateCode Methods\n");
        System.out.println("DDMMYYYY " + Arrays.toString(a.getDateCodeDDMMYYYY("01022010")));
        System.out.println("MMDDYYYY " + Arrays.toString(a.getDateCodeMMDDYYYY("02012010")));
        System.out.println("YYYYDDMM " + Arrays.toString(a.getDateCodeYYYYDDMM("20100102")));
        System.out.println("YYYYMMDD " + Arrays.toString(a.getDateCodeYYYYMMDD("20100201")));
        System.out.println("DDMMYY20 " + Arrays.toString(a.getDateCodeDDMMYY20("010210")));
        System.out.println("DDMMYY19 " + Arrays.toString(a.getDateCodeDDMMYY19("010210")));
        System.out.println("MMDDYY20 " + Arrays.toString(a.getDateCodeMMDDYY20("020110")));
        System.out.println("MMDDYY19 " + Arrays.toString(a.getDateCodeMMDDYY19("020110")));

//      getDateMonth Method
        System.out.println("\ngetDate with Mon/Months Methods\n");
        System.out.println("DD Mon YYYY " + Arrays.toString(a.getDateDDMonYYYY("01 Feb 2010")));
        System.out.println("Mon DD YYYY " + Arrays.toString(a.getDateMonDDYYYY("Feb 01 2010")));
        System.out.println("YYYY Mon DD " + Arrays.toString(a.getDateYYYYMonDD("2010 Feb 01")));
        System.out.println("DD Month YYYY " + Arrays.toString(a.getDateDDMonthYYYY("01 February 2010")));
        System.out.println("YYYY Month DD " + Arrays.toString(a.getDateYYYYMonthDD("2010 February 01")));

//      putDate Methods
        System.out.println("\nputDate Methods\n");
        System.out.println("DD MM YYYY " + a.putDateDDMMYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YYYY " + a.putDateMMDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY MM DD " + a.putDateYYYYMMDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY DD MM " + a.putDateYYYYDDMM(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY20 " + a.putDateMMDDYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY19 " + a.putDateMMDDYY19(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY20 " + a.putDateDDMMYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY19 " + a.putDateDDMMYY19(a.getDateDDMMYYYY("01/02/2010")));

//      putDateCode Methods
        System.out.println("\nputDateCode Methods\n");
        System.out.println("DDMMYYYY " + a.putDateCodeDDMMYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYYYY " + a.putDateCodeMMDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYYMMDD " + a.putDateCodeYYYYMMDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYYDDMM " + a.putDateCodeYYYYDDMM(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DDMMYY20 " + a.putDateCodeDDMMYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DDMMYY19 " + a.putDateCodeDDMMYY19(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYY20 " + a.putDateCodeMMDDYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYY19 " + a.putDateCodeMMDDYY19(a.getDateDDMMYYYY("01/02/2010")));

//      putDateMonth Method
        System.out.println("\nputDate with Mon/Months Methods\n");
        System.out.println("DD Mon YYYY " + a.putDateDDMonYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("Mon DD YYYY " + a.putDateMonDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY Mon DD " + a.putDateYYYYMonDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD Month YYYY " + a.putDateDDMonthYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY Month DD " + a.putDateYYYYMonthDD(a.getDateDDMMYYYY("01/02/2010")));

//      toUnivno
        System.out.println("\ntoUniv() " + a.toUnivno(a.getDateDDMMYYYY("01/02/2010")));

//      toDay
        System.out.println("\ntoDate() " +(a.toUnivno(a.getDateDDMMYYYY("01/02/2010"))));

//      toDate
        System.out.println("\nAdded 100 days to 01/02/2010");
        System.out.println("\ntoDate() " + Arrays.toString(a.toDate(a.toUnivno(a.getDateDDMMYYYY("01/02/2010"))+100)));

//      toCheck
        System.out.println("\ntoCheckValidDate() from Univarsal Number " + a.toCheckValidDate(a.toUnivno(a.getDateDDMMYYYY("01/02/2010"))));
        System.out.println("toCheckValidDate() from Date " + a.toCheckValidDate(a.getDateDDMMYYYY("01/02/2010")));

//      daysBetweenDates
        System.out.println((a.daysBetweenDates(a.getDateDDMMYYYY("03/02/1981"), a.getDateDDMMYYYY("05/07/1998"))));

//      toSortDates
        String[] unSortDates = { "12/10/2011", "13/11/2015", "02/05/2009", "09/08/2019", "19/04/1971", "26/12/2012" };
        System.out.println("\nunSortDates " + Arrays.toString(unSortDates));
        System.out.println("toSortDays() ");
        System.out.println("sortDays() "+ Arrays.toString(a.toSortDates(unSortDates)));
    }
}
