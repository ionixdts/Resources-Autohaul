package acme.resources.autohaul;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SuppressWarnings("hiding")
@SpringBootApplication
public class Application<WorkOrderComplete> {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	//private static final String  = null;

	@Autowired
	private StreamBridge streamBridge;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Consumer<WorkOrderComplete> acmeResourcesOpsAutohaulWorkOrderCompleteV1TrainIdConsumer() {
		return WorkOrderComplete -> {
			// Add business logic here.	
			//logger.info(data.toString());
			 System.out.println("WorkOrderComplete received" + WorkOrderComplete);
		};
	}



	public void sendAcmeResourcesOpsAutohaulHotBearingDetectedV1TrainIdBearingId(
		HotBearingDetected payload, String trainId, String bearingId
		) {
		String topic = String.format("acmeResources/ops/autohaul/hotBearingDetected/v1/%s/%s",
			trainId, bearingId);
		streamBridge.send(topic, payload);
	}
	public void sendAcmeResourcesOpsTrainTrakGpsV2RouteTrainIdLatLonDirStatus(
		AssetLocation payload, String route, String trainId, String lat, String lon, String dir, String status
		) {
		String topic = String.format("acmeResources/ops/train_trak/gps/v2/%s/%s/%s/%s/%s/%s",
			route, trainId, lat, lon, dir, status);
		streamBridge.send(topic, payload);
	}
}
