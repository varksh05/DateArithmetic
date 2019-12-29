DateArithmetic Class
This DateArithmetic Class is Designed to work All the Date Calculations After Christ(AC). *February 1st 2010* is used as the Common date below for Example purposes

# To Change the Date format

     getDate -> putDate

# To Check a Valid Date

     getDate -> toCheckValidDate
     getDate -> toUnivno -> toCheckValidDate

# To Find Day of the Day

     getDate -> toUnivno -> toDay

# To Add or Subtract a date to arrive at new date

     getDate -> toUnivno (returns integer d).
     Add or Subtract a number to d and store it in newDate
      newDate = d + anynumber;
     toDate(newDate) -> putDate

# To get Difference between two Dates

     d1 = getDate
     d2 = getDate
     daysBetweenDates(d1,d2)

    (or)

     d1 = getDate -> toUnivno
     d2 = getDate -> toUnivno
     daysBetweenDates(d1,d2)

# To get Dates and Sort Dates

     get Multiples Value in String Arrays
     sortDate(String a[])


# getDate Methods
  You can get Dates from various Formats. getDate Methods take a String Value as arguments. getDate Methods returns in Arrays Integer.


    int[] getDateDDMMYYYY(String strDate)  01/02/2010
    int[] getDateMMDDYYYY(String strDate)  02/01/2010  
    int[] getDateYYYYDDMM(String strDate)  2010/01/02
    int[] getDateYYYYMMDD(String strDate)  2010/02/01
    int[] getDateMMDDYY19(String strDate)  10/02/01 (it works only if the a[3](year) is between 1900 - 1999)
    int[] getDateMMDDYY20(String strDate)  10/02/01 (it works only if the a[3](year) is between 2000 - 2099)
    int[] getDateDDMMYY19(String strDate)  02/01/10 (it works only if the a[3](year) is between 1900 - 1999)
    int[] getDateDDMMYY20(String strDate)  02/01/10 (it works only if the a[3](year) is between 2000 - 2099)

   getDate Methods take a String Value as arguments. getDate Methods returns in Arrays Integer.
   * *a[0] - Day   // 01*
   * *a[1] - Month // 02*
   * *a[2] - Year  //2010*

# putDate Methods
putMethod prints Dates in various Different Formats
    putDateDDMMYYYY(int a[]) - 01/02/2010
    putDateMMDDYYYY(int a[]) - 02/01/2010
    putDateYYYYMMDD(int a[]) - 2010/02/01
    putDateYYYYDDMM(int a[]) - 2010/01/02
    putDateMMDDYY19(int a[]) - 02/01/10 (it works only if the a[3](year) is between 1900 - 1999)
    putDateMMDDYY20(int a[]) - 02/01/10 (it works only if the a[3](year) is between 2000 - 2099)
    putDateDDMMYY19(int a[]) - 01/02/10 (it works only if the a[3](year) is between 1900 - 1999)
    putDateDDMMYY20(int a[]) - 01/02/10 (it works only if the a[3](year) is between 2000 - 2099)

    putDateCodeMMDDYYYY(int a[]) - 02012010
    putDateCodeDDMMYYYY(int a[]) - 01022010
    putDateCodeYYYYDDMM(int a[]) - 01022010
    putDateCodeYYYYMMDD(int a[]) - 01022010
    putDateCodeMMDDYY19(int a[]) - 020110 (it works only if the a[3](year) is between 1900 - 1999)
    putDateCodeMMDDYY20(int a[]) - 020110 (it works only if the a[3](year) is between 2000 - 2099)
    putDateCodeDDMMYY19(int a[]) - 010210 (it works only if the a[3](year) is between 1900 - 1999)
    putDateCodeDDMMYY20(int a[]) - 010210 (it works only if the a[3](year) is between 2000 - 2099)

    putDateMonDDYYYY(int a[]) - Feb 1 2010
    putDateDDMonYYYY(int a[]) - 1 Feb 2010
    putDateYYYYMonDD(int a[]) - 2010 Feb 1
    putDateDDMonthYYYY(int a[]) - 1st February 2010
    putDateYYYYMonthDD(int a[]) - 2010 February 1st
