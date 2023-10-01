import java.util.Objects;
import java.util.TreeMap;
public class format {

    public static String rim(String str) {

        String[] arr = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        for(int i=0;i<arr.length;i++){
            if(Objects.equals(str, arr[i])){
                i++;
                str = String.valueOf(i);
                break;
            }
        }
        return str;
    }

    public static boolean valid(String str){
        if(!Main.isNumeric(str)){
            return true;
        }else{
            return false;
        }
    }
    public static String rimResult(String str){
        String[] rim = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        return str;
    }

    public class RomanNumber {

        private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        static {

            map.put(1000, "M");
            map.put(900, "CM");
            map.put(500, "D");
            map.put(400, "CD");
            map.put(100, "C");
            map.put(90, "XC");
            map.put(50, "L");
            map.put(40, "XL");
            map.put(10, "X");
            map.put(9, "IX");
            map.put(5, "V");
            map.put(4, "IV");
            map.put(1, "I");
            map.put(0, "NULLA");

        }

        public final static String toRoman(int number) {
            int l =  map.floorKey(number);
            if ( number == l ) {
                return map.get(number);
            }
            return map.get(l) + toRoman(number-l);
        }

    }
}
