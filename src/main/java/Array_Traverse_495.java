public class Array_Traverse_495 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        int totalTime = duration;
        int futureTime = timeSeries[0] + duration -1;
        for (int time: timeSeries){
            int newFutureTime = time + duration - 1;
            if (time > futureTime){
                totalTime += duration;
            } else {
                totalTime = totalTime + newFutureTime - futureTime;
            }
            futureTime = newFutureTime;
        }
        return totalTime;
    }

    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,4}, 2));
    }
}
