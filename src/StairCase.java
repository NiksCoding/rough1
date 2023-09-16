public class StairCase {
    public int solution(int num){

        if(num==1) return 1;
        int[] rec = new int[num+1];
        rec[1]=1;
        rec[2]=2;
        for(int i=3;i< rec.length;i++){
            rec[i]= rec[i-1] + rec[i - 2];
           // System.out.println(rec[i]);
        }
        return rec[num];
    }

    public static void main(String[] args) {
        StairCase obj = new StairCase();
        System.out.println(obj.solution(43));
    }

}
