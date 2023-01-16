package bitcamp.bootapp.vo;

public class Delivery {

	public int no; // 번호

	// 발송인
	public String senderName; // 이름
	public String senderTel; // 연락처
	public String senderPostNo; // 우편번호
	public String senderRoadAddress; // 도로명주소
	public String senderOldAddress; // 지번주소
	public String senderDetailAddress; // 상세주소
	public String senderNote; // 참고항목

	// 수취인
	public String reciverName; // 이름
	public String reciverTel; // 연락처
	public String reciverPostNo; // 우편번호
	public String reciverRoadAddress; // 도로명주소
	public String reciverOldAddress; // 지번주소
	public String reciverDetailAddress; // 상세주소
	public String reciverNote; // 참고항목

	public int paym; // 운임 0: 무료배송, 1: 선불, 2: 착불
	public int item; // 배송물품 0: 의류, 1: 서신/서류, 2: 전자제품, 3: 식품류, 4: 잡화/서적
	public int status; // 비고 0: 배송 준비, 1: 발송중, 2: 배송 완료
	public String msg; // 배송요청사항


}
