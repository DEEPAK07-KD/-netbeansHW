
package transportmanagement;

public class LuxuryBus extends Transport {

    @Override
    void calculateFare() {
        fare=(dis*10)+200;
    }

}
