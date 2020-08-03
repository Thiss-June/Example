package OOPEx;

public class cardID01 {
		public static int serialNum = 100;
		public int cardID;
		public String ownerName;

		
		public cardID01() {
			serialNum++;
			cardID = serialNum;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String name) {
			ownerName = name;
		}
}
