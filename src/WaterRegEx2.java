import java.sql.SQLOutput;
import java.util.Scanner;

public class WaterRegEx2 {

    //instantiate variables
    private Scanner input = new Scanner(System.in);
    private String waterID;
    private String waterAge;
    private boolean hasMineral;
    private boolean isLiquid;
    private String name;

    public WaterRegEx2()
    {
        waterID ="";
        waterAge = "";
        hasMineral = false;
        isLiquid = false;
        name = "";
    }

    public void setWaterID(String waterID) {
        this.waterID = waterID;
    }

    public String getWaterID() {
        return waterID;
    }

    public void setWaterAge(String waterAge) {
        this.waterAge = waterAge;
    }

    public String getWaterAge() {
        return waterAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void validateInfo()
    {
        // this line is "[0-9] will check for only integers while {6} checks to see if it is 6 in length
        if(!waterID.matches("[0-9]{6}"))
        {
            System.out.println("Invalid ID");
        }//this while loop will make sure that the 6 digit water ID is 6 digits in length and only integers

        if(!name.matches("([a-zA-Z])+"))
        {
            System.out.println("Invalid Name ");
        }//this while loop willmake sure that the water name is a proper name with only characters from the alphabet

        if(!waterAge.matches("([0-9]){0,10}"))
        {
            System.out.println("Invalid Age");
        }
        System.out.println("Thank You For Entering Your Information");
    }//end validate info method

    public void isWaterPresent(String random)
    {
        if(random.matches("[w]{1}"))
        {
            System.out.println("The word water is present in the string, disregarding any characters in between the characters of water");

            //(w){1}[^w]{0,}(a){1}([^w][^a]){0,}(t){1}([^w][^a][^t]){0,}(e){1}([^w][^a][^t][^e]){0,}
            //(w){1}[^water]{0,}(a){1}([^water]){0,}(t){1}([^water]){0,}(e){1}([water]){0,}
        }
    }

    @Override
    public String toString(){
        return "WaterRegEx2{" +
                "waterID='" + waterID + '\'' +
                ", waterAge=" + waterAge +
                ", hasMineral=" + hasMineral +
                ", isLiquid=" + isLiquid +
                ", name='" + name + '\'' +
                '}';
    }

}
