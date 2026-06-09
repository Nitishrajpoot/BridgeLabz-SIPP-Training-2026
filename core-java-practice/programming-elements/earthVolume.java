package programmingElement;

public class earthVolume {
   
    public static void main(String[] args) {
        double radiusKm = 6378; // radius of Earth in kilometers
        double volumeKm3 = (4.0/3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles (1 mile = 1.6 km)
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles3 = (4.0/3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.3f km^3%n", volumeKm3);
        System.out.printf("The volume of Earth in cubic miles is %.3f miles^3%n", volumeMiles3);
    }
}


