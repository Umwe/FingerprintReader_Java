
import com.fingerprint.sdk.FingerprintDevice;
import com.fingerprint.sdk.FingerprintData;

public class FingerprintReader {

    public static void main(String[] args) {
        FingerprintDevice device = new FingerprintDevice();

        // Initialize the fingerprint scanner
        device.initialize();

        // Capture a fingerprint
        FingerprintData fingerprint = device.capture();

        if (fingerprint != null) {
            System.out.println("Fingerprint captured successfully!");

            // Process the fingerprint data (e.g., verification)
            boolean isVerified = device.verify(fingerprint);
            if (isVerified) {
                System.out.println("Fingerprint verified!");
            } else {
                System.out.println("Fingerprint verification failed.");
            }

            
        } else {
            System.out.println("Failed to capture fingerprint.");
        }

        // Close the device
        device.close();
    }
}
