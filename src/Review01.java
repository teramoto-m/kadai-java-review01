
public class Review01 {

    public static void main(String[] args) {
        //変数の宣言・初期化
        int price = 1500;
        int taxRate = 10;
        int result;
        result = tax(price,taxRate); //taxメソッドを呼び出す
        
        //結果の表示
        System.out.println(price +"円の商品の税込価格は"+(price+result)+"円(消費税は"+result+"円)です。");
    }

        public static int tax(int price,int taxRate){
        //消費税の計算
        int result = price * taxRate / 100;
        return result;
    }
}
