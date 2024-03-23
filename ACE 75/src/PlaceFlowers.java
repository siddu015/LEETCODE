public class PlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeros = 0, spots = 0,size = 0, length = flowerbed.length;

        for(var flower: flowerbed) {
            if (flower == 1){
                 spots += zeros/2;
                 zeros = -1;
            }
            else
                zeros++;

            size += flower;
        }

        if(zeros>0) spots += (zeros/2) + 1;

        //If all the elements in the bed are zero
        if(size == 0)
            spots = length % 2 == 0 ? length/2 : ( length/2 + 1) ;

        return spots >= n;
    }

}
