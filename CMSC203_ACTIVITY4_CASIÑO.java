import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
 System.out.print("MONTH : ");
  int month = s.nextInt();

  System.out.print("DATE : ");
  int date = s.nextInt();

  System.out.print("YEAR : ");
  int year = s.nextInt();

  String Months="";

 switch (month){
      case 1:
          Months = "JANUARY";
          break;

     case 2:
          Months = "FEBRUARY";
          break;

     case 3:
          Months = "MARCH";
          break;

     case 4:
          Months = "APRIL";
          break;
     case 5:
          Months = "MAY";
          break;

     case 6:
          Months = "JUNE";
          break;

     case 7:
          Months = "JULY";
          break;

     case 8:
          Months = "AUGUST";
          break;
     
     case 9:
          Months = "SEPTEMBER";
          break;

     case 10:
          Months = "OCTOBER";
          break;

     case 11:
          Months = "NOVEMBER";
          break; 
            
     case 12:
          Months = "DECEMBER";
          break;   

          default: System.out.println("MONTH IS INVALID");
 }
 System.out.println("");
 System.out.println("");
System.out.println(Months +" "+ date + ","+ year);
System.out.println("");
System.out.println("");
    }
}
