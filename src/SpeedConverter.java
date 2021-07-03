public class SpeedConverter {

    public long toMilesPerHour(double kilometersPerHour){

        if(kilometersPerHour < 0 ){
           return -1;
        }
        else{
            return Math.round(kilometersPerHour * 0.6214);
        }
    }


    public void printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println( kilometersPerHour + " km/h " + "= " +  Math.round(kilometersPerHour * (1/1.609)) + " mi/h");
        }

    }
}
