
public class StringHandler
{
    
    
    public String reverse(String string)
    {
        String revStr = "";
        for(int i=0; i < string.length(); ++i)
        {
            revStr += string.charAt(string.length()-1-i);
        }
        return revStr;
    }
    
    public String charValues(String string)
    {
        int val;
        
        String output = "";
        for(int i=0; i < string.length(); ++i)
        {
            val = string.charAt(i);
            output += val + " ";
        }
        return output;
    }
    
    public String valSum(String string)
    {
        int sum = 0;
        char c;
        for(int i=0; i < string.length(); ++i)
        {
            c = string.charAt(i);
            sum += c;          
        }
        return Integer.toString(sum);
    }
    
    public boolean istPalindrom(String string)
    {
        string = string.toLowerCase();
        for(int i=0; i < (string.length()/2); ++i)
        {
            if(string.charAt(i)!=string.charAt(string.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    
    
    public String displayVowels(String string)
    {
        string = string.toLowerCase();
        char c;
        int acount = 0;
        int ecount = 0;
        int icount = 0; 
        int ocount = 0;
        int ucount = 0;
        int sum = 0;
        
        for(int i=0; i < string.length(); ++i)
        {
            c = string.charAt(i);
            switch(c){
            case 'a': 
                acount++;
                sum++;
                break;
            
            case 'e': 
                ecount++;
                sum++;
                break;
            
            case 'i': 
                icount++;
                sum++;
                break;
            
            case 'o': 
                ocount++;
                sum++;
                break;
            
            case 'u': 
                ucount++;
                sum++;
                break;
            
            default:
                break;
            }   
            
        }
        return "Total: " + sum + ", a: " + acount + ", e: " + ecount + ", i: " + icount + ", o: " + ocount + ", u: " + ucount;
        
       
    }
    
   
}
