class Result {

    /*
     * Complete the 'circles' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY info as parameter.
     */

    public static List<String> circles(List<String> info) {
    // Write your code here
        List<String> list = new ArrayList<>();
        int len = info.size();
        for(int i=0;i<len;i++)
        {
            String[] integerStrings = info.get(i).split(" "); 
            int leng = integerStrings.length;
            int[] integers = new int[leng];
            for (int j = 0; j < leng; j++)
            {
                integers[j] = Integer.parseInt(integerStrings[j]);
            }
            if((integers[0]==integers[3]) && (integers[1]==integers[4]))
            {
                list.add("Concentric");
            }
            else
            {
                double dist = Math.sqrt((integers[0]-integers[3])*(integers[0]-integers[3]) + (integers[1]-integers[4])*(integers[1]-integers[4]));
                double rad_sum = (integers[2]+integers[5]);
                if((rad_sum == dist) || Math.abs(integers[2]-integers[5])==dist)
                {
                    list.add("Touching");
                }
                else if(Math.abs(integers[2]-integers[5]) > dist)
                {
                    list.add("Disjoint-Inside");
                }
                else if(rad_sum > dist)
                {
                    list.add("Intersecting");
                }
                else if(rad_sum < dist)
                {
                    list.add("Disjoint-Outside");
                }
            }
        }
        
        return list;
    }

}
