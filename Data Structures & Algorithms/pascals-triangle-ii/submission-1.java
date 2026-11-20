class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr=new ArrayList<>();
        long ans=1;
        arr.add(1);
        for(int i=1;i<=rowIndex;i++){
            ans=ans*(rowIndex-i+1)/i;
            arr.add((int)ans);
        }
        return arr;
    }
}