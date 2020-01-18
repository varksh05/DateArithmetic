
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Date {

    public static void main(String[] args) {
        DateArithmetic a = new DateArithmetic();

//      getDate Methods
        System.out.println("\ngetDate Methods\n");
        System.out.println("DD MM YYYY \t\t\t\t\t" + Arrays.toString(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YYYY \t\t\t\t\t" + Arrays.toString(a.getDateMMDDYYYY("2/1/2010")));
        System.out.println("YYYY DD MM \t\t\t\t\t" + Arrays.toString(a.getDateYYYYDDMM("2010/1/2")));
        System.out.println("YYYY MM DD \t\t\t\t\t" + Arrays.toString(a.getDateYYYYMMDD("2010/02/01")));
        System.out.println("DD MM YY20 \t\t\t\t\t" + Arrays.toString(a.getDateDDMMYY20("01/02/10")));
        System.out.println("DD MM YY19 \t\t\t\t\t" + Arrays.toString(a.getDateDDMMYY19("01/02/10")));
        System.out.println("MM DD YY20 \t\t\t\t\t" + Arrays.toString(a.getDateMMDDYY20("02/01/10")));
        System.out.println("MM DD YY19 \t\t\t\t\t" + Arrays.toString(a.getDateMMDDYY19("02/01/10")));
        System.out.println("MM DD YY19 \t\t\t\t\t" + Arrays.toString(a.getDateMMDDYY19("02/01/10")));

//      getDateCode Methods
        System.out.println("\ngetDateCode Methods\n");
        System.out.println("DDMMYYYY \t\t\t\t\t" + Arrays.toString(a.getDateCodeDDMMYYYY("01022010")));
        System.out.println("MMDDYYYY \t\t\t\t\t" + Arrays.toString(a.getDateCodeMMDDYYYY("02012010")));
        System.out.println("YYYYDDMM \t\t\t\t\t" + Arrays.toString(a.getDateCodeYYYYDDMM("20100102")));
        System.out.println("YYYYMMDD \t\t\t\t\t" + Arrays.toString(a.getDateCodeYYYYMMDD("20100201")));
        System.out.println("DDMMYY20 \t\t\t\t\t" + Arrays.toString(a.getDateCodeDDMMYY20("010210")));
        System.out.println("DDMMYY19 \t\t\t\t\t" + Arrays.toString(a.getDateCodeDDMMYY19("010210")));
        System.out.println("MMDDYY20 \t\t\t\t\t" + Arrays.toString(a.getDateCodeMMDDYY20("020110")));
        System.out.println("MMDDYY19 \t\t\t\t\t" + Arrays.toString(a.getDateCodeMMDDYY19("020110")));

//      getDateMonth Method
        System.out.println("\ngetDate with Mon/Months Methods\n");
        System.out.println("DD Mon YYYY \t\t\t\t\t" + Arrays.toString(a.getDateDDMonYYYY("01 Feb 2010")));
        System.out.println("Mon DD YYYY \t\t\t\t\t" + Arrays.toString(a.getDateMonDDYYYY("Feb 01 2010")));
        System.out.println("YYYY Mon DD \t\t\t\t\t" + Arrays.toString(a.getDateYYYYMonDD("2010 Feb 01")));
        System.out.println("DD Month YYYY \t\t\t\t\t" + Arrays.toString(a.getDateDDMonthYYYY("1st February 2010")));
        System.out.println("YYYY Month DD \t\t\t\t\t" + Arrays.toString(a.getDateYYYYMonthDD("2010 February 1st")));

//      putDate Methods
        System.out.println("\nputDate Methods\n");
        System.out.println("DD MM YYYY \t\t\t\t\t" + a.putDateDDMMYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YYYY \t\t\t\t\t" + a.putDateMMDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY MM DD \t\t\t\t\t" + a.putDateYYYYMMDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY DD MM \t\t\t\t\t" + a.putDateYYYYDDMM(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY20 \t\t\t\t\t" + a.putDateMMDDYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY19 \t\t\t\t\t" + a.putDateMMDDYY19(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY20 \t\t\t\t\t" + a.putDateDDMMYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY19 \t\t\t\t\t" + a.putDateDDMMYY19(a.getDateDDMMYYYY("01/02/2010")));

//      putDateCode Methods
        System.out.println("\nputDateCode Methods\n");
        System.out.println("DDMMYYYY \t\t\t\t\t" + a.putDateCodeDDMMYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYYYY \t\t\t\t\t" + a.putDateCodeMMDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYYMMDD \t\t\t\t\t" + a.putDateCodeYYYYMMDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYYDDMM \t\t\t\t\t" + a.putDateCodeYYYYDDMM(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DDMMYY20 \t\t\t\t\t" + a.putDateCodeDDMMYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DDMMYY19 \t\t\t\t\t" + a.putDateCodeDDMMYY19(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYY20 \t\t\t\t\t" + a.putDateCodeMMDDYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYY19 \t\t\t\t\t" + a.putDateCodeMMDDYY19(a.getDateDDMMYYYY("01/02/2010")));

//      putDateMonth Method
        System.out.println("\nputDate with Mon/Months Methods\n");
        System.out.println("DD Mon YYYY \t\t\t\t\t" + a.putDateDDMonYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("Mon DD YYYY \t\t\t\t\t" + a.putDateMonDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY Mon DD \t\t\t\t\t" + a.putDateYYYYMonDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD Month YYYY \t\t\t\t\t" + a.putDateDDMonthYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY Month DD \t\t\t\t\t" + a.putDateYYYYMonthDD(a.getDateDDMMYYYY("01/02/2010")));

//      toUnivno
        System.out.println("\ntoUniv() \t\t\t\t\t" + a.toUnivno(a.getDateDDMMYYYY("01/02/2010")));

//      toDay
        System.out.println("\ntoDate() \t\t\t\t\t" +a.putDateDDMMYYYY(a.toDate(a.toUnivno(a.getDateDDMMYYYY("01/02/2010")))));

//      toFindDate
        System.out.println("\ntoFindNewDate() \t\t\t\t" +a.putDateDDMMYYYY(a.toFindNewDate(a.getDateDDMMYYYY("01/02/2010"),100)));

//      toGetDaysBetweenDates
        System.out.println("\ntoGetDaysBetweenDates() from Univarsal Number \t"+a.toGetDaysBetween2Dates(a.getDateDDMMYYYY("01/02/2010"), a.getDateDDMMYYYY("12/05/2010")));
        System.out.println("toGetDaysBetweenDates() from Date \t\t"+a.toGetDaysBetween2Dates(a.toUnivno(a.getDateDDMMYYYY("01/02/2010")), a.toUnivno(a.getDateDDMMYYYY("12/05/2010"))));

//      toCheck
        System.out.println("\ntoCheckValidDate() from Univarsal Number \t" + a.toCheckValidDate(a.toUnivno(a.getDateDDMMYYYY("01/02/2010"))));
        System.out.println("toCheckValidDate() from Date \t\t\t" + a.toCheckValidDate(a.getDateDDMMYYYY("01/02/2010")));

//      toSortDates
        String[] unSortDates = { "12/10/2011", "13/11/2015", "02/05/2009", "09/08/2019", "19/04/1971", "26/12/2012" };
        System.out.println("\nunSortDates \t\t\t\t\t" + Arrays.toString(unSortDates));
        System.out.println("sortDays() \t\t\t\t\t" + Arrays.toString(a.toSortDates(unSortDates)));
    }
}
