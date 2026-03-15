/* This program is to verify that Employees in a company to work for the given target hour */
class leet3 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i =0; i<hours.length;i++){
            if(hours[i]>=target){
                count ++;
            }

        }
        return count ;
    }
}