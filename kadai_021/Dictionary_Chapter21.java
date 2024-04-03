package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
	public void Dictionary(String[] searchWords) {	
		HashMap<String,String> fruitDic = new HashMap<String,String>();
		
		fruitDic.put("apple", "りんご");
		fruitDic.put("peach", "桃");
		fruitDic.put("banana", "バナナ");
		fruitDic.put("lemon", "レモン");
		fruitDic.put("pear", "梨");
		fruitDic.put("kiwi", "キウィ");
		fruitDic.put("strawberry", "いちご");
		fruitDic.put("grape", "ぶどう");
		fruitDic.put("muscat", "マスカット");
		fruitDic.put("cherry", "さくらんぼ");
		
		for( int i = 0; i < searchWords.length; i++) {
			if(fruitDic.containsKey(searchWords[i])) {
				System.out.println(searchWords[i] + "の意味は" + fruitDic.get(searchWords[i]));
				
			}else {
				System.out.println(searchWords[i] + "は辞書に存在しません");
			}
		}
			
		
}
}