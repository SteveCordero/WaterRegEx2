public class WaterRegExDriver2 {
    public static void main(String args[])
    {
        WaterRegEx2 watone = new WaterRegEx2();
        watone.setWaterID("0000000");

        //watone.validateInfo();

        String temp = "long";
        if(temp.matches("(long)?"))
        {
            System.out.println("Congrats1");
        }

        temp = "longlonglong";
        if(temp.matches("(long)+"))// has to match the previous "long" if string isn't all long then no congrats
        {
            System.out.println("Congrats2");
        }

        temp = "longadfasdfadf";
        if(temp.matches("(long).*")) //only works for the character at the beginning of the string. The "." needs to be paired with*
        {
            System.out.println("Congrats3");
        }

        temp = "jasdlfjlajsdlkfjl1234567890ajskdfljsaljdflk";
        if(temp.matches("[^0-9]{0,}[0-9]{10}[^0-9]{0,}"))//this will check for a 10 digit number in the middle of the string
        {
            System.out.println("Congrats4");
        }

        temp = "long long";
        if(temp.matches("(long)+"))
        {
            System.out.println("Congrats5");
        }

    }//end driver method
}
