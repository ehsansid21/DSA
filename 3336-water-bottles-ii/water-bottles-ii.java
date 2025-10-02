class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int empties = numBottles;

        while (empties >= numExchange) {
            empties -= numExchange;
            numExchange++;     
            totalDrunk++;        
            empties++;           
        }

        return totalDrunk;
    }
}
