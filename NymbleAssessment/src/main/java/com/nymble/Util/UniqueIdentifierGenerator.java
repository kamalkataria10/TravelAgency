package com.nymble.Util;

/**
 * This class generates unique identifiers for packages, activities, passengers, and destinations.
 * It uses a singleton pattern to ensure that the identifiers are unique across the application.
 */
public class UniqueIdentifierGenerator {
    private static int packageUniqueId = 0;
    private static int activityUniqueId = 0;
    private static int passengerUniqueId = 0;
    private static int destinationUniqueId = 0;

    /**
     * This method generates a unique identifier for a package.
     *
     * @return The unique identifier for the package.
     */
    public static synchronized int generateUniquePackageNumber() {
        return ++packageUniqueId;
    }

    /**
     * This method generates a unique identifier for an activity.
     *
     * @return The unique identifier for the activity.
     */
    public static synchronized int generateUniqueActivityNumber() {
        return ++activityUniqueId;
    }

    /**
     * This method generates a unique identifier for a passenger.
     *
     * @return The unique identifier for the passenger.
     */
    public static synchronized int generateUniquePassengerNumber() {
        return ++passengerUniqueId;
    }

    /**
     * This method generates a unique identifier for a destination.
     *
     * @return The unique identifier for the destination.
     */
    public static synchronized int generateUniqueDestinationNumber() {
        return ++destinationUniqueId;
    }


}
