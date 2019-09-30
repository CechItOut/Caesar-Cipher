//Daniel Rossano

package COM260Assignment;

import javax.swing.JOptionPane;

public class com260assignment
{//begin class

   
    public static void main(String[] args) 
    {//begin main
        String ciphertext,s;
        char plaintext[];
        int k;
        
        
        ciphertext = "";
        
        
        
        s = JOptionPane.showInputDialog("Enter the message to be encrypted, ending with the special character ''$''");
        
        
        //Loop to ensure that the message input ends with the special character
        while (s.charAt(s.length()-1) !='$') 
        {
            JOptionPane.showMessageDialog(null,"The message entered did not end with the special character ''$''."
                    + "\nPlease try again, and make sure to include ''$'' at the end of your message.");
            s = JOptionPane.showInputDialog("Enter the message to be encrypted, ending with the special character ''$''");
        }
        
        
        
        plaintext = new char[s.length()]; //declare an array to store each char of the message
        s.getChars(0, s.length(), plaintext, 0); //copy each char of the message to the array
        
        
        
        s = JOptionPane.showInputDialog("Enter the shift for the cipher"); //now input and parse the shift for the cipher
        k = Integer.parseInt(s);
        
        
        //for loop to take each char from the message, shift it, and construct the ciphertext
        for (int i = 0; i<plaintext.length; i++)
        {
        ciphertext = ciphertext+ (char) (plaintext[i]+k);
        }   
 JOptionPane.showMessageDialog(null,"The encrypted message is \n" + ciphertext);
        
    }//end main
    
}//end class