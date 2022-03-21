public class SecondsAndMinutes {
    public static void getDurationString(long minutes, long seconds){
        if ((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            long hours = (minutes / 60);
            long remainingMinutes = (minutes % 60);
//            remainingMinutes += (int) (seconds / 60);
//            long remainingSeconds = (seconds % 60);

            //bonus challenge adding a leading 0 if the number is < 10:

            String hoursString = hours + "h";
            if(hours < 10)
                hoursString = "0" + hoursString;

            String minutesString = remainingMinutes + "m";
            if(remainingMinutes < 10)
                minutesString = "0" + minutesString;

            String secondsString = seconds + "s";
            if(seconds < 10)
                secondsString = "0" + secondsString;

//            System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
              System.out.println(hoursString + " " + minutesString + " " + secondsString);
        } else {
            System.out.println("Invalid Value");;
        }

    }
    public static void getDurationString(long seconds){
        if (seconds >= 0){
            long minutes = (seconds / 60);
            long remainingSeconds = (seconds % 60);
            getDurationString(minutes, remainingSeconds);
        } else{
            System.out.println("invalid Value");
        }
    }




    public static void main(String[] args) {
        getDurationString(65L, 45L);
        getDurationString(3600L);

    }
}
