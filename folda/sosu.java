/*oooooooooooooooooooooooooooooooooo
11�E7
java3/�Q�ltext[�ۑ�F�f���v
�[�[�f���P�O�O�\���[�[
���V�@
*/
class sosu{
	public static void main(String args[]){
		
		boolean f;			//���Z����ׂ̕ϐ����w��
		for(int i = 1; i <= 1000;i++){			//1����100�̒��Ō���
			f = true;			//���[�v�����J�n
			for(int j = 2; j <= i / 2;j++){		//2�Ŋ���鐔�̌v�Z
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