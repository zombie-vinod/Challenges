package Challenges;

public class ChallengeOne {
    public static String main(String[] args) {
        String getDurationString (String minutes, String seconds){

            int min = (int) minutes;
            int sec = ()
            if(!((min>=0)&&((seconds>=0)&&(seconds<=59)))){
                System.out.println("Invalid Value");

            }

            int hours = minutes/60;
            minutes =minutes-(hours*60);
            return hours+" "+minutes+" "+ seconds;



        }
        getDurationString(75,12);


    }

    private static void getDurationString(int i, int j) {
    }
    
}
