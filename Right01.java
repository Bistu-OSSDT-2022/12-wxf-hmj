package 开源项目;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Right01 {
	
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		Input input =new Input();
		System.out.println("请输入事件名称");
		input.setThing_name(s.nextLine());
		System.out.println("请输入提醒事件时间eg:2023(年) 4(月) 6(日) 12(时) 12(分) 0(秒)");
		int[] time  =new int[6];
		
		for(int i=0;i<6;i++) {
		 time[i]=s.nextInt();
		}
		
		if(time[4]>15) {
			time[4] = time[4]-15;
		}else {
			time[3]=time[3]-1;
			time[4]=time[4]+45;
		}
		input.setTime(time);
		input.toString_Time();
		System.out.println("第一次时间提醒时间为"+input.toString());
		Date date[] = new Date[4];
		for( int i =0;i<4;i++) {
			
			date[i] = new Date();

			String strDate1 = sdf1.format(date[i]);
			System.out.println(strDate1);
			input.toString_Time();
			
			if(strDate1.equals(input.toString())) {
				System.out.println("距离"+input.getThing_name()+"开始还有15分钟");
				System.out.println("是否需要取消提醒(yes/no)");
				if(s.next().equals("yes")) {
					input.setOn(false);
					System.out.println("事件已取消");
					System.exit(0);
				}else {
					System.out.println("十五分钟后再次提醒");
				}
				break;
			}
			if(i==3) {
				i=0;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(time[4]>=45) {
			time[4]=time[4]-45;
			time[3]=time[3]+1;
		}else {
			time[4] = time[4]+15;
		}
		input.setTime(time);
		for( int i =0;i<4;i++) {
			date[i]  = new Date();
			String strDate1 = sdf1.format(date[i]);
			System.out.println(strDate1);
			input.toString_Time();
			if(strDate1.equals(input.toString())) {
					System.out.println("所设置的”"+input.getThing_name()+"“事件时间已到");
				break;
			}
			if(i==3) {
				i=0;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		s.close();
		
		
		
	}


	

}
