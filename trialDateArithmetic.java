
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;


class Date {

    public static void main(String[] args) {
        DateArithmetic a = new DateArithmetic();

        //getDate Methods
        System.out.println("\ngetDate Methods\n");
        System.out.println("DD MM YYYY" + Arrays.toString(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YYYY" + Arrays.toString(a.getDateMMDDYYYY("02/01/2010")));
        System.out.println("YYYY DD MM" + Arrays.toString(a.getDateYYYYDDMM("2010/01/02")));
        System.out.println("YYYY MM DD" + Arrays.toString(a.getDateYYYYMMDD("2010/02/01")));
        System.out.println("DD MM YY20" + Arrays.toString(a.getDateDDMMYY20("01/02/10")));
        System.out.println("DD MM YY19" + Arrays.toString(a.getDateDDMMYY19("01/02/10")));
        System.out.println("MM DD YY20" + Arrays.toString(a.getDateMMDDYY20("02/01/10")));
        System.out.println("MM DD YY19" + Arrays.toString(a.getDateMMDDYY19("02/01/10")));

        //getDateCode Methods
        System.out.println("\ngetDateCode Methods\n");
        System.out.println("DDMMYYYY" + Arrays.toString(a.getDateCodeDDMMYYYY("01022010")));
        System.out.println("MMDDYYYY" + Arrays.toString(a.getDateCodeMMDDYYYY("02012010")));
        System.out.println("YYYYDDMM " + Arrays.toString(a.getDateCodeYYYYDDMM("20100102")));
        System.out.println("YYYYMMDD " + Arrays.toString(a.getDateCodeYYYYMMDD("20100201")));
        System.out.println("DDMMYY20 " + Arrays.toString(a.getDateCodeDDMMYY20("010210")));
        System.out.println("DDMMYY19 " + Arrays.toString(a.getDateCodeDDMMYY19("010210")));
        System.out.println("MMDDYY20 " + Arrays.toString(a.getDateCodeMMDDYY20("020110")));
        System.out.println("MMDDYY19 " + Arrays.toString(a.getDateCodeMMDDYY19("020110")));

        //putDate Methods
        System.out.println("\nputDate Methods\n");
        System.out.println("DD MM YYYY " + a.putDateDDMMYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YYYY " + a.putDateMMDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY MM DD " + a.putDateYYYYMMDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY DD MM " + a.putDateYYYYDDMM(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY20 " + a.putDateMMDDYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY19 " + a.putDateMMDDYY19(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY20 " + a.putDateDDMMYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY19 " + a.putDateDDMMYY19(a.getDateDDMMYYYY("01/02/2010")));

        //putDateCode Methods
        System.out.println("\nputDateCode Methods\n");
        System.out.println("DDMMYYYY " + a.putDateCodeDDMMYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYYYY " + a.putDateCodeMMDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYYMMDD " + a.putDateCodeYYYYMMDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYYDDMM " + a.putDateCodeYYYYDDMM(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DDMMYY20 " + a.putDateCodeDDMMYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DDMMYY19 " + a.putDateCodeDDMMYY19(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYY20 " + a.putDateCodeMMDDYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MMDDYY19 " + a.putDateCodeMMDDYY19(a.getDateDDMMYYYY("01/02/2010")));

    }
}
