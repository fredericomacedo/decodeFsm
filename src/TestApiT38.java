/*
 * This program intended to test the functionality of GAO TEK decodeToFsm function
 * This is a virtual test environment and does not represent the reality
 */
public class TestApiT38 {

	public static void main(String[] args) {
		
		//declaration
		String returnResult = "";
		DecoderT38 decoder1 = new DecoderT38();
		
		
		//set value to decoder1
		//decoder1.setTypeIFP("T30_DATA");
		
		decoder1.setTypeIFP("T30_DATA");
		
		
		//decoder1.setDataType("T38_HDLC_DATA");
		//decoder1.setDataType("T38_HDLC_FCS_OK");
		//decoder1.setDataType("T38_HDLC_FCS_BAD");
		decoder1.setDataType("T38_HDLC_SIG_END");
		
		
		
		decoder1.setDataMessage("V.21 Channel 2");
		
		
		//Call Decode function and atribute result to variable returnResult
		
		returnResult = decoder1.decodeToFsm();
		
		//output
		System.out.println(returnResult);
		
		
		

	}

}
