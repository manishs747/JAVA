package enumerators;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println(GatewayIds.valueOf("").getGatewayIds());
	}
	
	
	
	 public static enum GatewayIds {
	        AXIS(1),
	        HDFC(2),
	        ICICI(3),
	        CITI(4),
	        AMEX(5),
	        EBS(11),
	        PAYU(12),
	        CCAVENUE(13),
	        CITRUS(14),
	        ATOM(15),
	        CCAVENUE_V2(16),
	        TPSL(17),
	        PAYTM(18),
	        HDFC_EBS_VAS(21),
	        RAZORPAY(23),
	        FSS_ATM_PIN(24),
	        EBS_V3(25),
	        MOBIKWIK(31),
	        OLAMONEY(32),
	        FREECHARGE(33),
	        DUMMY(100),
	        HDFC_IVR(201);

	        private final int gatewayId;

	        private GatewayIds(int gatewayId) {
	            this.gatewayId = gatewayId;
	        }

	        public int getGatewayIds() {
	            return this.gatewayId;
	        }
	    }

}
