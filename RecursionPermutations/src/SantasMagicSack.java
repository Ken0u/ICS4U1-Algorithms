public class SantasMagicSack {
    public static void main(String[] args) {
        System.out.println(maxVolume(new int[]{650001, 5550002, 2220004, 1750008, 800016}, 0));
        System.out.println(maxVolume(new int[]{2000000, 1500000, 1000000, 500000}, 0));
        System.out.println(maxVolume(new int[]{1550001, 2655002, 4355004, 125008, 6543516, 3555032}, 0));

    }

    final static int CAPACITY = 8000000;
    public static int maxVolume(int[] gifts, int volumeSoFar) {

        int maxVolume = volumeSoFar;
        for (int i = 0; i < gifts.length; i++) {
            int giftVolume = gifts[i];
            if (giftVolume != -1 && volumeSoFar + giftVolume <= CAPACITY) {

                gifts[i] = -1;

                int maxVolumeFromHere = maxVolume(gifts, volumeSoFar + giftVolume);
                maxVolume = Math.max(maxVolume, maxVolumeFromHere);

                gifts[i] = giftVolume;

            }
        }

        return maxVolume;
    }
}
