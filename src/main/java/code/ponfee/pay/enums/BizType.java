package code.ponfee.pay.enums;

/**
 * 业务类型
 */
public enum BizType {
	
    BUS(0, "Q","汽车票"), 
    
    TOURISM(1, "L","旅游专线"),
    
    INTERCITY(2,"Z", "城际专线"),
    
    AIRPORT(3, "J","机场大巴"), 
    
    GANGAO(4, "G","港澳专线"), 
    
    RENTAL(6, "Y","约租车"),
    
    STEAMER(7, "C","船票"), 
    
    AIRLINE(8, "F","飞机票"), 
    
    CHARTER(9, "B","包车"),
    
    TRAIN(10, "H","火车票"),
    
    PURSE(90, "P","钱包");
	
	/**======= Fields and Methods =======**/
	
	private int code;

	private String letter; //业务字母代号 
	
	private String description;
	
	BizType(int code, String letter, String description){
		this.code = code;
		this.letter = letter;
		this.description = description;
	}
	
	public int getCode(){
		return this.code;
	}
	
	public String getLetter(){
		return this.letter;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public static boolean exists(int code){
		return getEnum(code) != null;
	}
	
	public static BizType getEnum(int code){
		BizType destBizType = null;
		for(BizType tmp : BizType.values()){
			if(tmp.getCode() == code){
				destBizType = tmp;
				break;
			}
		}
		return destBizType;
	}
}
