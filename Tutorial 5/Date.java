/**
 * The Date class models a calendar date, with day, month and year.
 */
public class Date {  // Save as "Date.java"
   // private instance variable, not accessible from outside this class
   private int day;
   private int month;
   private int year;
   
   // Constructors (overloaded)
   /** Constructs a Date instance with the given day, month and year */
   public Date(int d, int m, int y) {  // 1st constructor
      day = d;
      month = m;
      year = y;
   }
   
   /** Returns the day */
   public int getDay() {
     return day; 
   }

   /** Returns the month */
   public int getMonth() {
     return month; 
   }

   /** Returns the year */
   public int getYear() {
     return year; 
   }

   /** Sets the day to the given value */
   public void setDay(int day) {
     this.day = day;   // "this.day" refers to the instance variable
                       // "day" refers to the method's argument
   }

   /** Sets the month to the given value */
   public void setMonth(int month) {
     this.month = month;   // "this.month" refers to the instance variable
                           // "month" refers to the method's argument
   }

   /** Sets the year to the given value */
   public void setYear(int year) {
     this.year = year;   // "this.year" refers to the instance variable
                         // "year" refers to the method's argument
   }

   /** Sets the date to the given values */
   public void setDate(int day, int month, int year) {
     this.day = day;   // "this.day" refers to the instance variable
                       // "day" refers to the method's argument
     this.month = month;   // "this.month" refers to the instance variable
                           // "month" refers to the method's argument
     this.year = year;   // "this.year" refers to the instance variable
                         // "year" refers to the method's argument
   }

   /** Return a self-descriptive string of this instance in the form of "dd/mm/yyyy" with leading zero */
   public String toString() {
      return String.format("%02d/%02d/%04d", day, month, year);  // return a String
   }
}