public class TwelveDays
{
    public static void main(String[] args)
    {
        twelveDays(12);
    }//end main method
    public static void twelveDays(int day)
    {
        if(day>0)
        {
            twelveDays(day-1);
        }
        switch (day)
        {
            case 12:
                System.out.println("\nOn the twelfth day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 11:
                System.out.println("\nOn the eleventh day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 10:
                System.out.println("\nOn the tenth day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 9:
                System.out.println("\nOn the ninth day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 8:
                System.out.println("\nOn the eighth day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 7:
                System.out.println("\nOn the seventh day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 6:
                System.out.println("\nOn the sixth day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 5:
                System.out.println("\nOn the fifth day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 4:
                System.out.println("\nOn the fourth day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 3:
                System.out.println("\nOn the third day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 2:
                System.out.println("\nOn the second day of Christmas," +
                        "\nMy true love gave to me");
                break;
            case 1:
                System.out.println("\nOn the first day of Christmas," +
                        "\nMy true love gave to me");
                break;
        }//end switch block to print day
        switch (day)
        {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("FIVE GOLDEN RINGS");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.print("Two turtle doves \nAnd ");
            case 1:
                System.out.println("a partridge in a pear tree!");
        }//end switch block to print gifits
    }//end method to print out song
}//end class for the Twelve Days of Christmas
