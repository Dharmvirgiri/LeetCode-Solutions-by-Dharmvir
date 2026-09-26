class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closeX = Integer.MAX_VALUE;
        int closeY = Integer.MAX_VALUE;
        if(xCenter < x1){
            closeX = x1;
        }else if(xCenter > x2){
            closeX = x2;
        }else{
            closeX = xCenter;
        }
        if(yCenter < y1){
            closeY = y1; 
        }else if(yCenter > y2){
            closeY = y2;
        }else{
            closeY = yCenter;
        }
        int dx = closeX - xCenter;
        int dy = closeY - yCenter;

        return dx * dx + dy * dy <= radius * radius;
    }
}