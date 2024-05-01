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
}