
public class DecoderT38 {
	private String typeIFP = "";
	private String dataType = "";
	private String dataMessage = "";
	
	DecoderT38(){
		
	}
	
	
	public DecoderT38(String typeIFP, String dataType, String dataMessage) {
		super();
		this.typeIFP = typeIFP;
		this.dataType = dataType;
		this.dataMessage = dataMessage;
	}




	public String getTypeIFP() {
		return typeIFP;
	}


	public void setTypeIFP(String typeIFP) {
		this.typeIFP = typeIFP;
	}


	public String getDataType() {
		return dataType;
	}


	public void setDataType(String dataType) {
		this.dataType = dataType;
	}


	public String getDataMessage() {
		return dataMessage;
	}


	public void setDataMessage(String dataMessage) {
		this.dataMessage = dataMessage;
	}


	public String decodeToFsm() {
		String result = "";
		
		
			if (typeIFP == "T30_DATA") {
			
				
				
				switch (dataType) {
					
					case "T38_HDLC_DATA":
						result = "Write to TO38 RxBuff: " + dataType + " -- " + dataMessage;
						break;
					
					case "T38_HDLC_FCS_OK":
						if (dataMessage.length() == 0) {
							result = "Write to TO38 RxBuff: BDT_HDLC_OK  -- The lenght message is empty " + dataMessage.length();
						} else {
							result = "Write to TO38 RxBuff: BDT_HDLC_DATA_OK:  "  + dataMessage;
						}
						break;
						
					case "T38_HDLC_FCS_BAD":
						if (dataMessage.length() == 0) {
							result = "Write to TO38 RxBuff: BDT_HDLC_BAD  -- The lenght message is empty " + dataMessage.length();
						} else {
							result = "Write to TO38 RxBuff: BDT_HDLC_DATA_BAD:  "  + dataMessage;
						}
						break;
						
					case "T38_HDLC_SIG_END":
						if (dataMessage == "V34") {
							result = "My output is: "+ dataType + "the message is empty: " + dataMessage.length();
						} else {
							result = "My output is: " + dataType + "the message is: " + dataMessage;
						}
						break;
					
					
				}
					
			} else {
				result = "I am  "+ typeIFP + " and I go to T38_ProcessIndicator()";
				
			}
		
		
		return result;
		
	}

}
