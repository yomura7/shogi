package item;

import koma.Fu;
import koma.Gin;
import koma.Hisha;
import koma.Kaku;
import koma.Keima;
import koma.Kin;
import koma.Koma;
import koma.Kyosha;

public class KomaGenerator {


	public KomaGenerator(){

	}

	public Koma genKoma(int num){

		Koma k;
		switch (num){
			case 0:
				k = new Fu(true);
				break;
			case 1:
				k = new Kyosha(true);
				break;
			case 2:
				k = new Keima(true);
				break;
			case 3:
				k = new Gin(true);
				break;
			case 4:
				k = new Kin(true);
				break;
			case 5:
				k = new Kaku(true);
				break;
			case 6:
				k = new Hisha(true);
				break;
			default:
				System.out.println("Koma Gen Error");
				k = null;
				break;
		}
		return k;
	}

	public Koma genKoma(String str){
		int i=0;
		String nameArr[] = {"歩", "香", "桂", "銀", "金", "角", "飛"};
		for (String name: nameArr){
			if (str == name) {
				return genKoma(i);
			}
			i++;
		}
		System.out.println("Koma Gen Error");
		return null;
	}

	public String genKomaName(int num){

		Koma k;
		switch (num){
			case 0:
				k = new Fu(true);
				break;
			case 1:
				k = new Kyosha(true);
				break;
			case 2:
				k = new Keima(true);
				break;
			case 3:
				k = new Gin(true);
				break;
			case 4:
				k = new Kin(true);
				break;
			case 5:
				k = new Kaku(true);
				break;
			case 6:
				k = new Hisha(true);
				break;
			default:
				System.out.println("Koma Gen Error");
				k = null;
				break;
		}
		return k.getKomaName();
	}

}
