import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Working directory for file baby ranking locations
public class Project4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for year and gender and name.
        
        System.out.print("Enter the year: ");
       
        try{
        int year = input.nextInt();
        
        
        System.out.print("Enter the gender: ");
        String genderstr = input.next();
        char gender = genderstr.charAt(0);
        input.nextLine();
        System.out.print("Enter the name: ");
        String name = input.nextLine();
        name = name.trim();
        

        
        String fileName = ""; // file is accessed based on year.
        // JA: fileName = "babyranking" + year + ".txt"
        switch(year) {
        
        case 2001:
         fileName = "babyrankings2001.txt"; 
        break;
        case 2002:
         fileName = "babyrankings2002.txt";
        break;
        case 2003:
        fileName = "babyrankings2003.txt";
        break;
        case 2004:
        fileName = "babyrankings2004.txt";
        break;
        case 2005:
        fileName = "babyrankings2005.txt";
        break;
        case 2006:
        fileName = "babyrankings2006.txt";
        break;
        case 2007:
        fileName = "babyrankings2007.txt";
        break;
        case 2008:
        fileName = "babyrankings2008.txt";
        break;
        case 2009:
        fileName = "babyrankings2009.txt";
        break;
        case 2010:
        fileName = "babyrankings2010.txt";
        break;
          }
        
        


          // JA: How do you handle different genders?
          BabyName babyName = findName(name, year, loadNames(fileName)); // Access object methods
          // get baby name().

          
        if (babyName == null){ // if the find name method returns null, user name input does not exist.
            System.out.println("The name " + name + " is not ranked in the year " + year);
            
        }
        else if (gender == 'm' || gender == 'M'){ // The name is found and based on male
            System.out.println("The name " + name +  " is ranked #" + babyName.getRank() + " in the year " + babyName.getYear());
        }
        else if (gender == 'f' || gender == 'F') {// The name is found and based on female
            System.out.println("The name " +  name + " is ranked #" + babyName.getRank() + " in the year " + babyName.getYear());
        }
        input.close();
         
    }
    
    catch (Exception ex){ // If user does not enter year as integer.
        System.out.println("not an integer number!");
        System.exit(1);
    }
        
        
    
    }
    private static  ArrayList<BabyName> loadNames (String filename)  {
        
        
        ArrayList<BabyName> babyArray = new ArrayList<>();
        
        try{
        File file = new File(filename);
        Scanner readNames = new Scanner(file);
        while(readNames.hasNext()) {
            String  rankNumber = readNames.next(); 
            String babyNameMale = readNames.next();
            String babyNameFemale = readNames.next();
            
            // adds rank number and names, male and female into the object constructor.
            babyArray.add(new BabyName(babyNameMale,babyNameFemale,rankNumber));
            
        }
        readNames.close();
         
        
        }

        catch(FileNotFoundException ex) {
            System.out.println("Unknown file");
        }

        
            return babyArray; 
        
    }
    private static BabyName findName(String name, int year, ArrayList<BabyName> names) {
        

        for(int i = 0 ; i < names.size(); i++) { // loop based on male names
            names.get(i).setYear(year); // sets year based on user input.
            
            // if the name is either a male or female name, return the object, otherwise return null.
            if((names.get(i)).getBabyNameMale().equals(name) || (names.get(i)).getBabyNameFemale().equals(name)) {
                return names.get(i);
            }
        }
        

        return null;

    }

   
}



class BabyName {
    // data fields
    private String babyNameMale; // <Baby name as Male>
    private String babyNameFemale; // Baby name as Female.
    private String rank;
    public int year; //default year 


    // constructor
    public BabyName(String babyNameMale, String babyNameFemale, String rank) {
        

        this.babyNameMale = babyNameMale;
        this.babyNameFemale = babyNameFemale;
        this.rank = rank;
    
    }

    // getter methods
    public String getBabyNameMale(){
        return babyNameMale;
    }
    public String getBabyNameFemale() {
        return babyNameFemale;
    }
    public String getRank(){
        return rank;
    }
    public int getYear(){
        return year;
    }

    //setter method of year

    public void setYear(int year) {
        this.year = year;
    }

}