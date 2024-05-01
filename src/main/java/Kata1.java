public class Kata1 {

    // Using Test-Driven Development, create a class which has a method
    // to sum all the numbers of a given array, except for the lowest and highest elements.
    public int sumArray(int[] ints){
        // initiate two variables to hold highest and lowest
        int highest = 0;
        int total = 0;
        // exclude arrays less than length three
        if(ints.length < 3){
            return 0;
        }
        // iterate through array, finding the highest and lowest numbers and assigning them whilst updating sum varibale
        //subtract highest + lowest
        else{

            int lowest = ints[0];
            for (int num : ints){
                if(num > highest){
                    highest = num;
                }
                if(num < lowest){
                    lowest = num;
                }
                total += num;
            }
        return total - (highest + lowest);
        }
    }



    // function to calculate mean
    //input -- int []
    //output -- int
    public double calcMean(int[] input){
        ///sum of all numbers in aee/ nr

        if(input.length<1){
            return 0;
        }else {
            //declare a sum,
            int sum =0;
            for(int num: input){
                sum += num;
            }
            return (double) sum/input.length;
        }
    }
    // sum ascii values
    //Your method must take a String and calculate the sum total of ASCII values for the String. Assume that
    // your String will only include the 52 uppercase/lowercase letters and digits 0-9.
    // input = string
    // output = int

    public int sumAscii(String str) {

        //could filter / replace characters in the string that are not desired.

        //initiate a value to hold the sum
        int sum = 0;
        // iterate through the string as a char array
        for (char ch : str.toCharArray()) {
            // add ascii values to the sum
            sum += (int) ch;
        }
        // return sum
        return sum;
    }










}