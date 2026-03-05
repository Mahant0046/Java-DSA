package StriverDSA.src.LogicBuilding;

public class CountCharctersInString {
    public static void main(String[] args) {
        String s="Hello Hi";
        boolean []visit=new boolean[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            int count=1;
            if (visit[i])
                continue;
            for (int j = i+1; j <s.length() ; j++) {
                if (s.charAt(i)==s.charAt(j)){
                    count++;
                    visit[j]=true;
                }
            }
            System.out.println(s.charAt(i)+""+count);
        }

        // OR USING HASHMAP
//        HashMap<Character,Integer> hashMap=new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
//        }
//
//        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
//            System.out.print(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        //OR USING HASHING
        int []hash=new int[256];
        for (int i = 0; i <s.length() ; i++) {
            hash[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            System.out.println(hash[s.charAt(i)]);
        }
    }



}
