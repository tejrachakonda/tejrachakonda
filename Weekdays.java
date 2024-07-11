import java.util.*;
    class Weekdays
      {
        public static void main(String args[])
         {
           Scanner sc=new Scanner(System.in);
              String monday,tuesday,wednesday,thursday,friday,saturday,sunday;
               String weekday_number;
           
             System.out.println("********weekdays*******");
             System.out.println("1:monday");
             System.out.println("2:tuesday");
             System.out.println("3:wednesday");
             System.out.println("4:thursday");
             System.out.println("5:friday");
             System.out.println("6:saturday");
             System.out.println("7:sunday");
          
             System.out.println("enter the value of weekday number");
                weekday_number=sc.next();
     
             switch(weekday_number)
                {
                  case "1":
                       weekday_number="monday";
                       System.out.println("weekday_number="+weekday_number);
                       break;
                  case "2":
                       weekday_number="tuesday";
                       break;
                  case "3":
                       weekday_number="wednesday";
                       break;
                  case "4":
                       weekday_number="thursday";
                       break;
                  case "5":
                       weekday_number="friday";
                       break;
                  case "6":
                       weekday_number="saturday";
                       break;
                  case "7":
                       weekday_number="sunday";
                       break;
                  default:
                       weekday_number="invalid";
                }
          }
       }