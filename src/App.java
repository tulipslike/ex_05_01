public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr = { 10, 20, 30, 40, 50 };
        // int sum = 0;

        // for (int i = 0; i < arr.length; i++) {
        // sum +=arr[i];
        // }
        // System.out.println("sum=" + sum);

        // . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
        int[] coinUnit = { 500, 100, 50, 10 };
        int money = 2680;
        int t;
        System.out.println("money=" + money);

        for (int i = 0; i < coinUnit.length; i++) {
            t = money / coinUnit[i];
            money %= coinUnit[i];
            System.out.println(coinUnit[i] + "원" + t);
        }
    }
}
// for (int j = i + 1; j < coinUnit.length; j++) {
// if (coinUnit[i] < coinUnit[j]) {
// int t = coinUnit[i];
// coinUnit[i] = coinUnit[j];
// coinUnit[j] = t;
// }
// }