class Solution {
    public boolean isHappy(int n) {
        int h = n;
        Set<Integer> s = new HashSet<>();
        while(h != 1){
              if(s.contains(h)) return false;
                    s.add(h);
            h = sum(h);
        }
        return true;
    }
    
    int sum(int j){
        int sum1 = 0;
        while(j != 0){
        int d = j%10;
        sum1 += d*d;
        j = j/10;
        }
    return sum1;
    }
}