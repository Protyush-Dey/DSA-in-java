class Solution {
    public double angleClock(int hour, int minutes) {
        double a=0;
        a= Math.abs((30*hour)-(5.5*minutes));
        return Math.min(a, 360-a);
    }
}
