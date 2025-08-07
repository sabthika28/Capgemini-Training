package training;

import java.time.ZoneId;
import java.util.Set;

public class Zone {
	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(allZoneIds);


	}

}
