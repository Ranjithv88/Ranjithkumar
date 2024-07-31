//find the Scond highest array
public class RTT19 {
    public static int findSecondHighest(int[] array){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i: array){
            if(i>highest){
                secondHighest=highest;
                highest=i;
            }else if (i>secondHighest){
                secondHighest=i;
            }
        }
        return secondHighest;
    }
    public static void main(String[] args){
      int[] array={1,2,3,4,5,6};
        System.out.println(findSecondHighest(array));
    }
}
