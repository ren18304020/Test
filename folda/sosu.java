/*oooooooooooooooooooooooooooooooooo
11・7
java3/参考text[課題：素数」
ーー素数１００表示ーー
中澤蓮
*/
class sosu{
	public static void main(String args[]){
		
		boolean f;			//演算する為の変数を指定
		for(int i = 1; i <= 1000;i++){			//1から100の中で検証
			f = true;			//ループ処理開始
			for(int j = 2; j <= i / 2;j++){		//2で割れる数の計算
				if(i % j == 0){
					f = false;
				}
			}
			if(f){
				System.out.print(i + " / ");
			}
		}System.out.println();
	}
}