package advance;

import java.util.HashMap;
import java.util.Map;

public class PrintCharactertFrequencyCountInDesc {
    public static void main(String[] args) {

        String str="abbcccdddd";
        //d=4c=3b=2a=1
        arrangeCharInDesc(str);

    }

    public static void arrangeCharInDesc(String str){
        char ch[]=str.toCharArray();

        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<ch.length;i++){

            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }
            else {
                map.put(ch[i], 1);
            }

        }

        map.entrySet()
                .stream()
                .sorted(Map.Entry.<Character,Integer>comparingByValue()
                        .reversed())
                .forEach(System.out::print);
    }
}
