package com.fedex.utility;

public interface KafkaConstants {
	//public static String KAFKA_BROKERS = "localhost:9092";

	public static String KAFKA_BROKERS = "35.239.122.192:9092";

	//public static Integer MESSAGE_COUNT=10;

	public static String CLIENT_ID="0";

	//public static String TOPIC_NAME="k8spoc1";

	public static String TOPIC_NAME="cvmtopic";

	public static String GROUP_ID_CONFIG="consumerGroup10";

	public static Integer MAX_NO_MESSAGE_FOUND_COUNT=100;

	public static String OFFSET_RESET_LATEST="latest";

	public static String OFFSET_RESET_EARLIER="earliest";

	public static Integer MAX_POLL_RECORDS=10;

	//public static Integer requesttimeoutms=30000;
}


