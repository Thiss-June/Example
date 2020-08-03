package OOPEx;

public class CardID {

	public static void main(String[] args) {
		cardID01 ownerNameLee = new cardID01();
		ownerNameLee.setOwnerName("이건준");
		System.out.println(ownerNameLee.serialNum);
		System.out.println(ownerNameLee.ownerName+" 카드 고유 번호:"+ownerNameLee.serialNum);
		
		cardID01 ownerNameKim = new cardID01();
		ownerNameKim.setOwnerName("김용");
		System.out.println(ownerNameKim.serialNum);
		System.out.println(ownerNameKim.ownerName+" 카드 고유 번호:"+ownerNameKim.serialNum);
		
	}

}

