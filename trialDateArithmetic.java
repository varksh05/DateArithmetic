
import java.io.*;
import java.util.*;

class trialDateArithmetic {

    public static void main(String[] args) {
        DateArithmetic a = new DateArithmetic();

        //get Methods

        System.out.println("DD MM YYYY" + a.getDateDDMMYYYY("01/02/2010"));
        System.out.println("MM DD YYYY" + a.getDateMMDDYYYY("02/01/2010"));
        System.out.println("YYYY DD MM" + a.getDateYYYYDDMM("2010/01/02"));
        System.out.println("YYYY MM DD" + a.getDateYYYYMMDD("2010/02/01"));
        System.out.println("DD MM YY20" + a.getDateDDMMYY20("01/02/10"));
        System.out.println("DD MM YY19" + a.getDateDDMMYY19("01/02/10"));
        System.out.println("MM DD YY20" + a.getDateMMDDYY20("02/01/10"));
        System.out.println("MM DD YY19" + a.getDateMMDDYY19("02/01/10"));

        //put Methods

        System.out.println("DD MM YYYY " + a.putDateDDMMYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YYYY " + a.putDateMMDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY MM DD " + a.putDateYYYYMMDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY DD MM " + a.putDateYYYYDDMM(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY20 " + a.putDateMMDDYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY19 " + a.putDateMMDDYY19(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY20 " + a.putDateDDMMYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY19 " + a.putDateDDMMYY19(a.getDateDDMMYYYY("01/02/2010")));

        //put Methods Code

        System.out.println("DD MM YYYY " + a.putDateCodeDDMMYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YYYY " + a.putDateCodeMMDDYYYY(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY MM DD " + a.putDateCodeYYYYMMDD(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("YYYY DD MM " + a.putDateCodeYYYYDDMM(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY20 " + a.putDateCodeDDMMYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("DD MM YY19 " + a.putDateCodeDDMMYY19(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY20 " + a.putDateCodeMMDDYY20(a.getDateDDMMYYYY("01/02/2010")));
        System.out.println("MM DD YY19 " + a.putDateCodeMMDDYY19(a.getDateDDMMYYYY("01/02/2010")));

    }
}
