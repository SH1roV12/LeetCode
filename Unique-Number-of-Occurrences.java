1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        HashMap<Integer, Integer> numsCount = new HashMap<>();
4        for(int num:arr){
5            numsCount.put(num, numsCount.getOrDefault(num,0)+1);
6           
7        }
8
9        HashSet<Integer> uniqCount = new HashSet<>();
10        for(int count:numsCount.values()){
11            
12            if(uniqCount.contains(count)) {
13                return false;
14            }else {
15                uniqCount.add(count);
16            }
17        }
18        
19        return true;
20    }
21}