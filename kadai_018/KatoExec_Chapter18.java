package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.setGivenName("太郎");
		taro.execIntroduce();
		System.out.println("");
		
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.setGivenName("一郎");
		ichiro.execIntroduce();
		System.out.println("");
		
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setGivenName("花子");
		hanako.execIntroduce();
		System.out.println("");
	}

}
