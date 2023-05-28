package org.altbeacon.beacon.distance;

import org.altbeacon.beacon.logging.LogManager;

public class CurveFittedDistanceCalculator implements DistanceCalculator {
    private double mCoefficient1;
    private double mCoefficient2;
    private double mCoefficient3;

    public CurveFittedDistanceCalculator(double d, double d2, double d3) {
        this.mCoefficient1 = d;
        this.mCoefficient2 = d2;
        this.mCoefficient3 = d3;
    }

    public double calculateDistance(int i, double d) {
        double d2;
        if (d == 0.0d) {
            return -1.0d;
        }
        LogManager.m14725d("CurveFittedDistanceCalculator", "calculating distance based on mRssi of %s and txPower of %s", Double.valueOf(d), Integer.valueOf(i));
        double d3 = (d * 1.0d) / ((double) i);
        if (d3 < 1.0d) {
            d2 = Math.pow(d3, 10.0d);
        } else {
            d2 = (this.mCoefficient1 * Math.pow(d3, this.mCoefficient2)) + this.mCoefficient3;
        }
        LogManager.m14725d("CurveFittedDistanceCalculator", "avg mRssi: %s distance: %s", Double.valueOf(d), Double.valueOf(d2));
        return d2;
    }
}
