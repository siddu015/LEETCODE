public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int h, w, area, max =0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            w = right - left;
            h = Math.min(height[left] , height[right]) ;
            area = h * w;
            max = Math.max(max , area);
            if(height[left] < height[right])  left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }

//    public int maxArea(int[] height) {
//        int minHeight, volume, max =0, l = 0, r = height.length - 1;
//
//        while(l < r) {
//            minHeight = Math.min(height[l], height[r]);
//            volume = (r-l) * minHeight;
//            if(volume > max) {
//                max = volume;
//            }
//            while(l < r && height[l] <= minHeight) {
//                l++;
//            }
//            while(l < r && height[r] <= minHeight) {
//                r--;
//            }
//        }
//        return max;
//    }
}
