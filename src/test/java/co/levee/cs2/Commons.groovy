package co.levee.cs2

/**
 * Created by Dominic Moorman on 10/19/16.
 */
class Commons {
    def static int[] PolyFill(int count) {
        Random ran = new Random()
        def poly = []
        for (int i = 0; i < count; i++) {
            poly << ran.nextInt(100) + 1
        }
        return poly
    }
}
