public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double radiusMiles = radiusKm / 1.6; // convert to miles

        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm);
        System.out.println("The volume of earth in cubic miles is " + volumeMiles);
    }
}
