public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       System.out.println(capVowelsLowRest("One two tHRee world"));
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String retString = "";
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != 32){
                if (string.charAt(i) >= 'a'){
                    switch (string.charAt(i)){
                        case 'a':
                            retString += 'A';
                            break;
                        case 'e':
                            retString += 'E';
                            break;
                        case 'i':
                            retString += 'I';
                            break;
                        case 'o':
                            retString += 'O';
                            break;
                        case 'u':
                            retString += 'U';
                            break;
                        default:
                            retString += (char)string.charAt(i);                      
                    }
                } else if (string.charAt(i) != 'A' && string.charAt(i) != 'E' && string.charAt(i) != 'I' && string.charAt(i) != 'O' && string.charAt(i) != 'U' ) {
                    retString += ((char)(string.charAt(i) + 32));
                }else{
                    retString += (char)(string.charAt(i));  
                }
                

            }else{
                retString += " ";
            }
        }
        return retString;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String retString = "";
        int j = 0;
        while (j < string.length() && string.charAt(j) == 32 ){
            j++;
        }
        while (j < string.length() && string.charAt(j) != 32){
            if (string.charAt(j) >= 'a'){
                retString += (char)string.charAt(j);
            }else{
                retString += (char)(string.charAt(j) + 32);
            }
            j++;
        }
        
        for (int i = j; i < string.length(); i++){
            if (string.charAt(i) != 32){
                    if (string.charAt(i - 1) != 32){
                        if (string.charAt(i) >= 'a'){
                            retString += (char)string.charAt(i);
                        }else{
                            retString += (char)(string.charAt(i) + 32);
                        }
                    }else{
                        if (string.charAt(i) >= 'a'){
                            retString += (char)(string.charAt(i) - 32);
                        }else{
                            retString += (char)(string.charAt(i));
                        
                        } 
                    }
            }
        }
        return retString;
    }


    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int chrAmount = 0;
        int j = 0;
        int[] chrIndx;
        chrIndx = new int[string.length()];
        for (int i = 0; i < string.length(); i++){
            if ( string.charAt(i) == chr){
                chrAmount++;
            }
        }
        chrIndx = new int[chrAmount];
        for (int i = 0; i < string.length(); i++){
            if ( string.charAt(i) == chr){
                chrIndx[j] = i;
                j++;
            }
            
        }
        return chrIndx;
    }
}
