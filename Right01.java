package ��Դ��Ŀ;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Right01 {
	
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		Input input =new Input();
		System.out.println("�������¼�����");
		input.setThing_name(s.nextLine());
		System.out.println("�����������¼�ʱ��eg:2023(��) 4(��) 6(��) 12(ʱ) 12(��) 0(��)");
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
		System.out.println("��һ��ʱ������ʱ��Ϊ"+input.toString());
		Date date[] = new Date[4];
		for( int i =0;i<4;i++) {
			
			date[i] = new Date();

			String strDate1 = sdf1.format(date[i]);
			System.out.println(strDate1);
			input.toString_Time();
			
			if(strDate1.equals(input.toString())) {
				System.out.println("����"+input.getThing_name()+"��ʼ����15����");
				System.out.println("�Ƿ���Ҫȡ������(yes/no)");
				if(s.next().equals("yes")) {
					input.setOn(false);
					System.out.println("�¼���ȡ��");
					System.exit(0);
				}else {
					System.out.println("ʮ����Ӻ��ٴ�����");
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
					System.out.println("�����õġ�"+input.getThing_name()+"���¼�ʱ���ѵ�");
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
