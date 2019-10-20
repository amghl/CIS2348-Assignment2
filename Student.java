import java.util.Arrays;
import javax.swing.JOptionPane;
public class Student {
    public static void main(String[] args) {
        
        

        String number = JOptionPane.showInputDialog("How many students' data are to be entered: ");
        int count = 0;
        count = Integer.parseInt(number); ///
        


        getInfo(count);
        

    }

    public static void getInfo(int count) { //validate data under each statement
        int count1 = count;


        String fName;

        String lName;

        String Id;
        

        String cStandings;

        String email;

        String address1;

        String city;

        String state;

        String zipCode;

        

        String re = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
        String idre = /*"^\\d{7}(\\d{2})?$";*/"^[0-9]{1,7}$";
        String[] standing = new String[]{"Freshman", "freshman", "Sophmore", "sophmore", "Junior","junior","Senior","senior"}; 
        String email1 = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        String addr = "^\\d+\\s[A-z]+\\s[A-z]+";
        String cityy = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
        String[] st = new String[]{"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND","NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"};
        String sta = "^((A[LKZR])|(C[AOT])|(D[EC])|(FL)|(GA)|(HI)|(I[DLNA])|(K[SY])|(LA)|(M[EDAINSOT])|(N[EVHJMYCD])|(O[HKR])|(PA)|(RI)|(S[CD])|(T[NX])|(UT)|(V[TA])|(W[AVIY]))$";
        /*"^(?:(A[KLRZ]|C[AOT]|D[CE]|FL|GA|HI|I[ADLN]|K[SY]|LA|M[ADEINOST]|N[CDEHJMVY]|O[HKR]|P[AR]|RI|S[CD]|T[NX]|UT|V[AIT]|W[AIVY]))$";*/

        /*^((A[LKZR])|(C[AOT])|(D[EC])|(FL)|(GA)|(HI)|(I[DLNA])|(K[SY])|(LA)|(M[EDAINSOT])|(N[EVHJMYCD])|(O[HKR])|(PA)|(RI)|(S[CD])|(T[NX])|(UT)|(V[TA])|(W[AVIY]))$ */

        String zi = "^[0-9]{9}$";
        /*"([^0-9])(?:11(1\\d)1(\\d{4}))([^0-9])$";"^\\d{5}[-\\s]?(?:\\d{4})?$";*/

        
        System.out.println("Student Details, Department of ILT");
        System.out.println();


        for (int x = 0; x < count; x++) {

            fName = JOptionPane.showInputDialog("Enter First Name: ");
            while(!(fName.matches(re))){
                fName = JOptionPane.showInputDialog("Invalid Name, Enter First Name: ");
            }
            
        

            lName = JOptionPane.showInputDialog("Enter Last Name: ");
            while(!(lName.matches(re))){
                lName = JOptionPane.showInputDialog("Invalid Name, Enter Last Name: ");
            }
            


            Id = JOptionPane.showInputDialog("Enter PeopleSoft ID: ");
            while(!(Id.matches(idre))){
                Id = JOptionPane.showInputDialog("Invalid ID, Enter PeopleSoft ID: ");
            }
            /*id = Integer.parseInt(Id);*/
            

            cStandings = JOptionPane.showInputDialog("Enter Class Standings: ");
            while(!(Arrays.asList(standing).contains(cStandings))){
                cStandings = JOptionPane.showInputDialog("Invalid Class Standing, Enter Class Standing: ");
                
            }
            
                 


            email = JOptionPane.showInputDialog("Enter Email Address: ");
            while(!(email.matches(email1))){
                email = JOptionPane.showInputDialog("Invalid Email Address, Enter Email Address: ");
            }
            


            address1 = JOptionPane.showInputDialog("Enter Address Line 1 (House# Street Name): ");
            while(!(address1.matches(addr))){
                address1 = JOptionPane.showInputDialog("Invalid Address line, Enter Address Line: ");
            }
            

            city = JOptionPane.showInputDialog("Enter City: ");                 /*accepts names like San Diego, San-Francisco */
            while(!(city.matches(cityy))){
                city = JOptionPane.showInputDialog("Invalid City, Enter City: ");
            }
            


            state = JOptionPane.showInputDialog("Enter State: ");  /*!(Arrays.asList(st).contains(state))    !(state.matches(sta))           */
            while(!(Arrays.asList(st).contains(state))){
                state = JOptionPane.showInputDialog("Invalid State, Enter State: ");
                
            }
            

            zipCode = JOptionPane.showInputDialog("Enter Zip Code: ");
            /*zip = Integer.parseInt(zipCode);*/
            while(!(zipCode.matches(zi))){
                zipCode = JOptionPane.showInputDialog("Invalid Zip Code, Enter Zip Code: ");
            }
            
            

            displayInfo(fName, lName, Id, cStandings, email, address1, city, state, zipCode, count);


        }
        System.out.println();
        
        System.out.println("Number of Students: " + count);

    


    }
    public static void displayInfo(String data1,String data2,String data3,String data4,String data5,String data6,String data7,String data8,String data9, int count){
        String datafname = data1;
        String datalname = data2;
        String dataId = data3;
        String datacStandings = data4;
        String dataemail = data5;
        String dataaddress1 = data6;
        String datacity = data7;
        String datastate = data8;
        String datazipCode = data9;

       
        String[] info = new String[]{datafname, datalname, dataId, datacStandings, dataemail, dataaddress1, datacity, datastate, datazipCode};

    
        for(int w = 0; w < info.length; w++){
            System.out.print(info[w] + "\t");
            

        }
        System.out.println();

  

    }
    
    
}

