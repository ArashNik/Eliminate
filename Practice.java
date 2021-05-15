package practice;

public class Practice {

    public static void main(String[] args) {
        String x = "10444087997361";
        String o = "";
        char prev = '~';
        char curr = '~';
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < x.length(); i++){
                char c = x.charAt(i);        
                //Process char
                curr = c;
                if(curr != prev) {
                    o += Character.toString(curr);
                }
                else{
                    String a = o.substring(o.length() - 1);
                    String b = Character.toString(curr);
                    if(a.equals(b)) {
                       o = o.substring(0, o.length() - 1); 
                    }

                }
            System.out.print(prev); 
            System.out.println(curr);
            prev = curr;
            
            }

            System.out.println(o);
            x = o;
            o = "";
            prev = '~';
            curr = '~';
        
        }
    
    }
}