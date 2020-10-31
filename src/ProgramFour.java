/*User defined methods and variables are introduced below as per requirements to calculate
days in months and leap year*/

public class ProgramFour {
    public static boolean isLeapYear( int year){
        if(year>0&& year<=9999){
            return (year%4==0&&year%100!=0||year%400==0&&year% 100 ==0);
        }

         else{return false;} }
    public static int getDaysInMonth(int month,int year){
        if(month<1||month>12){
            return -1;
        }
        else if(year<1 || year>9999){
            return -1;
        }
        else{
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 2: {
                    if(isLeapYear(year)){
                        return 29;
                    }
                    else{return 28;}}

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;

                default:
                    return -1;
            }
        }
    }

}


