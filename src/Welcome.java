import java.util.Scanner;
import java.lang.*;

class Member {
    private String name;
    private String phoneNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
public class Welcome {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Member member = new Member();
        System.out.print("당신의 이름을 입력하세요 : ");
        member.setName(scanner.next());
        System.out.print("연락처를 입력하세요 : ");
        member.setPhoneNum(scanner.next());
        boolean quit = false;
        while (!quit) {
            menuIntroduction();

            System.out.print("메뉴 번호를 선택해주세요 ");
            int selectedMenu = scanner.nextInt();
            System.out.println(selectedMenu + "번을 선택했습니다");
            if (selectedMenu < 1 || selectedMenu > 8) {
                System.out.println("메뉴는 1부터 8까지의 숫자로 입력해 주세요!");
            } else {
                switch (selectedMenu) {
                    case 1 :
                        menuGuestInfo(member);
                        break;
                    case 2 :
                        menuCartItemList();
                        break;
                    case 3 :
                        menuCartClear();
                        break;
                    case 4 :
                        menuCartAddItem();
                        break;
                    case 5 :
                        menuCartRemoveItemCount();
                        break;
                    case 6 :
                        menuCartRemoveItemCount();
                        break;
                    case 7 :
                        menuCartBill();
                        break;
                    case 8 :
                        menuExit();
                        quit = true;
                        break;
                }
            }

        }
    }

    public static void menuIntroduction() {
        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";
        String select1 = "1. 고객 정보 확인하기";
        String select2 = "2. 장바구니 상품 목록 보기";
        String select3 = "3. 장바구니 비우기";
        String select4 = "4. 장바구니에 항목 추가하기";
        String select5 = "5. 장바구니의 항목 수량 줄이기";
        String select6 = "6. 장바구니의 항목 삭제하기";
        String select7 = "7. 영수증 표시하기";
        String select8 = "8. 종료";
        System.out.println("************************************************************"); // * 60개
        System.out.println("\t\t\t" + greeting);
        System.out.println("\t\t\t" + tagline);
        System.out.println("************************************************************");
        System.out.println(select1 + "\t\t" + select4);
        System.out.println(select2 + "\t" + select5);
        System.out.println(select3 + "\t\t\t" + select6);
        System.out.println(select7 + "\t\t\t" + select8);
        System.out.println("************************************************************");
    }

    private static void menuGuestInfo(Member member) {
        System.out.println("현재 고객의 정보 : " + member.getName() + "   연락처:" + member.getPhoneNum());
    }

    private static void menuCartItemList() {
    }

    private static void menuCartClear() {
    }

    private static void menuCartAddItem() {
    }

    private static void menuCartRemoveItemCount() {
    }

    private static void menuCartBill() {
    }

    private static void menuExit() {
    }
}