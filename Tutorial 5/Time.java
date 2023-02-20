/**
 * The Time class models a time instance, with hour, minute and second.
 */
public class Time {  // Save as "Time.java"
   // private instance variable, not accessible from outside this class
   private int hour;
   private int minute;
   private int second;
   
   // Constructors (overloaded)
   /** Constructs a Time instance with the given hour, minute and second */
   public Time(int h, int m, int s) {  // 1st constructor
      hour = h;
      minute = m;
      second = s;
   }
   
   /** Returns the hour */
   public int getHour() {
     return hour; 
   }

   /** Returns the minute */
   public int getMinute() {
     return minute; 
   }

   /** Returns the second */
   public int getSecond() {
     return second; 
   }

   /** Sets the hour to the given value */
   public void setHour(int hour) {
     this.hour = hour;   // "this.hour" refers to the instance variable
                         // "hour" refers to the method's argument
   }

   /** Sets the minute to the given value */
   public void setMinute(int minute) {
     this.minute = minute;   // "this.minute" refers to the instance variable
                             // "minute" refers to the method's argument
   }

   /** Sets the second to the given value */
   public void setSecond(int second) {
     this.second = second;   // "this.second" refers to the instance variable
                             // "second" refers to the method's argument
   }

   /** Sets the time to the given values */
   public void setTime(int hour, int minute, int second) {
     this.hour = hour;   // "this.hour" refers to the instance variable
                         // "hour" refers to the method's argument
     this.minute = minute;   // "this.minute" refers to the instance variable
                           // "minute" refers to the method's argument
     this.second = second;   // "this.second" refers to the instance variable
                         // "second" refers to the method's argument
   }

   /** Return a self-descriptive string of this instance in the form of "hh:mm:ss" with leading zero */
   public String toString() {
      
      return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second);
   }

   // Advance "this" instance by 1 second and return "this" instance
   public Time nextSecond() {  // to return a Time instance
      ++second;
      if (second == 60) {
         second = 0;
         ++minute;
         if (minute == 60) {
            minute = 0;
            ++hour;
            if (hour == 24) {
               hour = 0;
            }
         }
      }
      return this;  // return this instance to support chaining operation
   }

   // Retreat "this" instance by 1 second and return "this" instance
   public Time previousSecond() {  // to return a Time instance
      --second;
      if (second < 0) {
         second = 59;
         --minute;
         if (minute < 0) {
            minute = 59;
            --hour;
            if (hour < 0) {
               hour = 23;
            }
         }
      }
      return this;  // return this instance to support chaining operation
   }
}