DateArithmetic Class
This DateArithmetic Class is Designed to work All the Date Calculations After Christ(AC). *February 1st 2010* is used as the Common date below for Example purposes. Here DD/MM/YYYY is used as Default Date Format.

# To Change the Date format

     getDate -> putDate

# To Check a Valid Date

     getDate -> toUnivno -> toCheckValidDate
     getDate -> toCheckValidDate

# To Find Day of the Day

     getDate -> toUnivno -> toDay
     getDate -> toDay

# To Find a new date

     getDate, Integer -> toFindNewDate  -> putDate

# To get Dates and Sort Dates

     get Multiples Value in String Arrays
     sortDate(String a[])

# getDate Methods
  You can get Dates from various Formats. getDate Methods takes *String Value* as arguments. getDate Methods returns in *Integer Array Values*.If Invalid Date is given it  returns a *array "b" with a value of {0, 0, 0}* .
```java
    int[] getDateDDMMYYYY(String strDate)         //     01/02/2010
    int[] getDateMMDDYYYY(String strDate)         //     02/01/2010  
    int[] getDateYYYYDDMM(String strDate)         //     2010/01/02
    int[] getDateYYYYMMDD(String strDate)         //     2010/02/01
    int[] getDateMMDDYY19(String strDate)         //     02/01/10 (it works only if the a[3](year) is between 1900 - 1999)
    int[] getDateMMDDYY20(String strDate)         //     02/01/10 (it works only if the a[3](year) is between 2000 - 2099)
    int[] getDateDDMMYY19(String strDate)         //     01/02/10 (it works only if the a[3](year) is between 1900 - 1999)
    int[] getDateDDMMYY20(String strDate)         //     01/02/10 (it works only if the a[3](year) is between 2000 - 2099)

    int[] getDateCodeDDMMYYYY(String strDate)     //     01022010
    int[] getDateCodeMMDDYYYY(String strDate)     //     02012010  
    int[] getDateCodeYYYYDDMM(String strDate)     //     20100102
    int[] getDateCodeYYYYMMDD(String strDate)     //     20100201
    int[] getDateCodeMMDDYY19(String strDate)     //     020110 (it works only if the a[3](year) is between 1900 - 1999)
    int[] getDateCodeMMDDYY20(String strDate)     //     020110 (it works only if the a[3](year) is between 2000 - 2099)
    int[] getDateCodeDDMMYY19(String strDate)     //     010210 (it works only if the a[3](year) is between 1900 - 1999)
    int[] getDateCodeDDMMYY20(String strDate)     //     010210 (it works only if the a[3](year) is between 2000 - 2099)
/*
   a[0] - Day   // 01
   a[1] - Month // 02
   a[2] - Year  // 2010
*/
```
# putDate Methods
  You can print Dates from various Formats using putDate Methods. putDate Methods takes *Integer Array Value* as arguments. putDate Methods returns in *String Value*.If Invalid Date is given it  returns *"Invalid Date"* .
```java
    String putDateDDMMYYYY(int a[])     //     01/02/2010
    String putDateMMDDYYYY(int a[])     //     02/01/2010
    String putDateYYYYMMDD(int a[])     //     2010/02/01
    String putDateYYYYDDMM(int a[])     //     2010/01/02
    String putDateMMDDYY19(int a[])     //     02/01/10 (it works only if the a[3](year) is between 1900 - 1999)
    String putDateMMDDYY20(int a[])     //     02/01/10 (it works only if the a[3](year) is between 2000 - 2099)
    String putDateDDMMYY19(int a[])     //     01/02/10 (it works only if the a[3](year) is between 1900 - 1999)
    String putDateDDMMYY20(int a[])     //     01/02/10 (it works only if the a[3](year) is between 2000 - 2099)

    String putDateCodeMMDDYYYY(int a[]) //     02012010
    String putDateCodeDDMMYYYY(int a[]) //     01022010
    String putDateCodeYYYYDDMM(int a[]) //     01022010
    String putDateCodeYYYYMMDD(int a[]) //     01022010
    String putDateCodeMMDDYY19(int a[]) //     020110 (it works only if the a[3](year) is between 1900 - 1999)
    String putDateCodeMMDDYY20(int a[]) //     020110 (it works only if the a[3](year) is between 2000 - 2099)
    String putDateCodeDDMMYY19(int a[]) //     010210 (it works only if the a[3](year) is between 1900 - 1999)
    String putDateCodeDDMMYY20(int a[]) //     010210 (it works only if the a[3](year) is between 2000 - 2099)

    String putDateMonDDYYYY(int a[])    //     Feb 1 2010
    String putDateDDMonYYYY(int a[])    //     1 Feb 2010
    String putDateYYYYMonDD(int a[])    //     2010 Feb 1
    String putDateDDMonthYYYY(int a[])  //     1st February 2010
    String putDateYYYYMonthDD(int a[])  //     2010 February 1st
```
# toSortDate Method

  * It is supported only with *DD/MM/YYYY* Formats.
  * It is used to get the Dates Sorted in Ascending Order.
  * *toSortDate()* Method takes *String Array Value* as arguments to get dates.
  * Each date is converted to *Integer Array* using *getDateDDMMYYYY()* Method for Converting it into Universal Number using *toUnivno()* and stored in *Integer Array Variable*
  * It sorts the date and each date is converted back into *Integer Array Value* using *toDate()* Method and using *getDateDDMMYYYY()* Method for Converting it back into *String Array Value* by using *putDateDDMMYYYY()* Method


# toUnivno Method

  * *toUnivno()* Method is used for finding Day, finding difference between two Dates, sorting multiple Dates, to check valid date from an Array so it is also known as Universal Number.
  * This number represents the total number of Days from 01/01/0000 to the given *Integer Array Value* given by *getDateDDMMYYYY()*.

# toDate Method

  It is used to Convert the Universal Number from *toUnivno()* Method to *Integer Array Variable* by *toDate()* Method.

# toDay Method

  It is used to Find the Day of Date by Converting the Universal Number from *toUnivno()* Method to *String* by *toDay()* Method.
