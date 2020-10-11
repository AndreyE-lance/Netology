package Codewars;

public class task3 {
    static int find(int[] integers) {
        int odd=0;
        for(int i=0;i<3;i++){
            if(integers[i]%2==0) odd--; else odd++;
        }
        if(odd<0){
            for (int i: integers) {
                if(i%2!=0) return i;
            }
        } else {
            for (int i: integers) {
                if(i%2==0) return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{206847681,1056521,4,17,1901,21104421,7,1,35521,1,7781}));
    }
}
