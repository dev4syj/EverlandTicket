package everlandTicket;

public class LanguageClass {
	public static String LAGUAGE;
	public static String TICKET_TYPE_QUESTION;	
	public static String BIRTH_DATE_QUESTION;
	public static String CONTINUE_QUESTION;
	public static String ERROR_MESSAGE;
	public static String AMOUNT_QUESTION;
	public static String DISCOUNT_TYPE_QUESTION;
	public static String THANK_YOU_MESSAGE;
	public static String HEADER_LINE;
	public static String PURCHASE_NOTICE;
	public static String PURCHASE_DATE;
	public static String TICKET_TYPE_A;
	public static String TICKET_TYPE_B;
	public static String TICKET_TYPE_C;
	public static String TICKET_TYPE_D;
	public static String AGE_GROUP_BABY;
	public static String AGE_GROUP_SOIN;
	public static String AGE_GROUP_DAEIN;
	public static String CURRENCY_UNIT;
	public static String DISCOUNT_TYPE_DISABLED_APPLIED;
	public static String DISCOUNT_TYPE_NATIONAL_MERIT_APPLIED;
	public static String DISCOUNT_TYPE_MULTI_CHILD_APPLIED;
	public static String DISCOUNT_TYPE_PREGNANT_APPLIED;
	public static String TOTAL_PRICE;

	public static void languageSelect(String country) {	
		LanguageClass.LAGUAGE = country;
		if (LAGUAGE.equals("US")) {
			TICKET_TYPE_QUESTION = "\nChoose your ticket type!" +
					"\n1.Type A  2.Type B  3.Type C  4.Type D" +
					"\n => ";		
			BIRTH_DATE_QUESTION = "\nPlease enter your birth date in the format yyyy-mm-dd: ";
			CONTINUE_QUESTION = "\nDo you want to order more?" +
					"\n0.YES  1.NO" +
					"\n => ";
			AMOUNT_QUESTION = "\n* Max amount is 10 *" + 
					"\nHow many tickets do you want?  => "; 
			DISCOUNT_TYPE_QUESTION = "\nChoose your discount type!(Age benefits applied automatically)" +
					"\n1.None  2.The disabled  3.National Merit  4.Multi-child  5.Pregnant" + 
					"\n => ";

			THANK_YOU_MESSAGE = "\nThank you for your order!\n";
			HEADER_LINE = "================Everland=================";
			PURCHASE_NOTICE = "Valid only on purchase day";
			PURCHASE_DATE = "Purchase date:";

			TICKET_TYPE_A = "TicketA";
			TICKET_TYPE_B = "TicketB";
			TICKET_TYPE_C = "TicketC";
			TICKET_TYPE_D = "TicketD";

			AGE_GROUP_BABY = "Baby";
			AGE_GROUP_SOIN = "Soin/Old";
			AGE_GROUP_DAEIN = "Daein/Youth";

			CURRENCY_UNIT = "won";

			DISCOUNT_TYPE_DISABLED_APPLIED = "*Discount applied(type:The disabled)\n";
			DISCOUNT_TYPE_NATIONAL_MERIT_APPLIED = "*Discount applied(type:National Merit)\n";
			DISCOUNT_TYPE_MULTI_CHILD_APPLIED = "*Discount applied(type:Multi-child)\n";
			DISCOUNT_TYPE_PREGNANT_APPLIED = "*Discount applied(type:Pregnant)\n";

			TOTAL_PRICE = "Total price";					
			ERROR_MESSAGE = "* Invalid input *";
		} else if (LAGUAGE.equals("KR")) {
			TICKET_TYPE_QUESTION = "\n티켓 종류를 선택하세요" +
					"\n1. A 타입   " + "2. B 타입   " + "3. C 타입   " + "4. D 타입";
			BIRTH_DATE_QUESTION = "\n생년월일 8자리를 입력하세요(형식: yyyy-mm-dd) => ";
			CONTINUE_QUESTION = "\n주문을 추가하시겠습니까?\n" +
					"0.네  1.아니오";
			AMOUNT_QUESTION = "\n* 최대 수량은 10장 입니다 *\n" + 
					"필요한 티켓 수량을 입력하세요"; 
			DISCOUNT_TYPE_QUESTION = "\n해당되는 할인 유형을 선택하세요(나이우대는 자동으로 적용됩니다)" +
					"\n1.해당 없음  2.장애인  3.국가유공자  4.다자녀  5.임산부";

			THANK_YOU_MESSAGE = "\n주문해주셔서 감사합니다\n";
			HEADER_LINE = "=================에버랜드==================";
			PURCHASE_NOTICE = "티켓은 구매 당일에만 유효합니다";
			PURCHASE_DATE = "구매 날짜:";

			TICKET_TYPE_A = "티켓A";
			TICKET_TYPE_B = "티켓B";
			TICKET_TYPE_C = "티켓C";
			TICKET_TYPE_D = "티켓D";

			AGE_GROUP_BABY = "유아";
			AGE_GROUP_SOIN = "소인/경로";
			AGE_GROUP_DAEIN = "대인/청소년";

			CURRENCY_UNIT = "원";

			DISCOUNT_TYPE_DISABLED_APPLIED = "*장애인 우대 할인이 적용되었습니다\n";
			DISCOUNT_TYPE_NATIONAL_MERIT_APPLIED = "*국가유공자 우대 할인이 적용되었습니다\n";
			DISCOUNT_TYPE_MULTI_CHILD_APPLIED = "*다자녀 우대 할인이 적용되었습니다\n";
			DISCOUNT_TYPE_PREGNANT_APPLIED = "*임산부 우대 할인이 적용되었습니다\n";

			TOTAL_PRICE = "총 합계";					
			ERROR_MESSAGE = "* 잘못된 입력입니다. *";
		} else if (LAGUAGE.equals("JP")) {
			TICKET_TYPE_QUESTION = "\nチケットの種類を選択してください" +
					"\n1. A タイプ   " + "2. B タイプ   " + "3. C タイプ   " + "4. D タイプ";
			BIRTH_DATE_QUESTION = "\n生年月日8桁を入力してください(形式: yyyy-mm-dd) => ";
			CONTINUE_QUESTION = "\n注文を追加しますか？\n" +
					"0.はい  1.いいえ";
			AMOUNT_QUESTION = "\n* 最大数量は10枚です。 *\n" + 
					"必要なチケット数量を入力してください"; 
			DISCOUNT_TYPE_QUESTION = "\n該当する割引タイプを選択してください(年齢優遇は自動的に適用されます)" +
					"\n1.該当なし 2.障害者 3.国家有功者 4.多子家庭 5.妊婦";

			THANK_YOU_MESSAGE = "\nご注文ありがとうございました\n";
			HEADER_LINE = "================エバーランド=================";
			PURCHASE_NOTICE = "チケットは購入当日のみ有効です";
			PURCHASE_DATE = "購入日：";

			TICKET_TYPE_A = "チケットA";
			TICKET_TYPE_B = "チケットB";
			TICKET_TYPE_C = "チケットC";
			TICKET_TYPE_D = "チケットD";

			AGE_GROUP_BABY = "幼児";
			AGE_GROUP_SOIN = "小人/経路";
			AGE_GROUP_DAEIN = "大人/青少年";

			CURRENCY_UNIT = "ワン";

			DISCOUNT_TYPE_DISABLED_APPLIED = "*障害者優待割引が適用されました\n";
			DISCOUNT_TYPE_NATIONAL_MERIT_APPLIED = "*国家有功者優遇割引が適用されました\n";
			DISCOUNT_TYPE_MULTI_CHILD_APPLIED = "*多子葉優待割引が適用されました\n";
			DISCOUNT_TYPE_PREGNANT_APPLIED = "*妊婦優待割引が適用されました\n";

			TOTAL_PRICE = "総計";					
			ERROR_MESSAGE = "* 間違った入力です。 *";
		}
	}
}
