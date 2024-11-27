package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BasicPrograms
{

	public static void main(String[] args)
	{
		//Number is even or odd
		/*
		int a = 22;
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		*/
		//WAP for ascending order
		/*
		int[] a = new int[] {5,2,27,19,55};
		int temp = 0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print( a[i] + " ");
		}
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print( a[i] + " ");
		}
		*/
		//WAP for descnding order
		/*
		int[] a = new int[] {5,2,27,19,55};
		int temp = 0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print( a[i] + " ");
		}
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print( a[i] + " ");
		}
		*/
		//WAP to reverse string(characters)
		/*
		String s = "Snehal";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		*/
		//WAP to reverse string(sentence)
		/*
		String a = "This is JAVA language";
		String b = " ";
		String c[] = a.split(b);
		for(int i=c.length-1;i>=0;i--) 
		{
			 b = c[i]+" ";
			System.out.print(b);
		}
		*/
		//WAP to remove duplicate characters from string
		/*
		String s = "abcdeabd";
		String s2 = "";
		for(int i=0;i<s.length()-1;i++)
		{
			Boolean found = false;
			for(int j=0;j<s2.length();j++)
			{
				if(s.charAt(i)==s2.charAt(j))
				{
				    found = true;
					break;
				}
			}
			if(found==false)
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
		*/
		//WAP to remove special characters from string
		/*
		String a = "This%is#java*language&";
		a = a.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(a);
		*/
		//WAP to remove alphabets from string
		/*
			String a = "123hi56there89";
			a = a.replaceAll("[^a-zA-Z]", "");
			System.out.println(a);
		*/
		//WAP to remove numbers from string
			/*
			String a = "123hi56there89";
			a = a.replaceAll("[^0-9]", "");
			System.out.println(a);
		*/
		//WAP to print fibonacci series	
		/*
		int n1 = 0,n2 = 1,n3,count=10;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		*/
		//WAP to check if number is palindrome
		/*
		int r,sum=0,temp;
		int n = 343;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Number is palindrome");
			else
			System.out.println("Number is not palindrome");
			*/
		/*
			String s = "121";
			StringBuilder str = new StringBuilder(s).reverse();
			String s1 = str.toString();
			if(s.equals(s1)) {
				System.out.println("Number is palindrome");
			}
			else {
				System.out.println("Number is not palindrome");
			}
		*/
		
		//WAP to find the factorial
		/*
		int b = 1;
		int a = 4;
		for(int i=1;i<=a;i++)
		{
			 b=b*i;
		}
		System.out.println(b);
		*/
		//WAP to switch values without using third variable
		/*
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a :" + a);
		System.out.println("value of b :" + b);
		*/
		//WAP to switch values
		/*
		int x=50;
		int y=40;
		int z;
		z=x+y;
		x=z-x;
		y=z-y;
		System.out.println("value of x :" + x);
		System.out.println("value of y :" + y);
		*/
		//To find avg of array
		/*
		float sum = 0;
		int[] ages = {10,12,17,35,8};
		int length = ages.length;
		for(int age:ages) {
			sum += age;
		}
		float avg = sum/length;
		System.out.println(avg);
		*/
		//prime or not
		/*
		int n = 55;
		boolean isprime = true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isprime = false;
				break;
			}
		}
		System.out.println(isprime);
		*/
		//Count vowels and consonants
		/*
		String s = "This is java language";
		s=s.toLowerCase();
		int vCount = 0;
		int cCount = 0;
		for(int i=0;i<s.length()-1;i++) {
			
		if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'  ) {
			vCount++;
		}
		else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
			cCount++;
		}
		}
		System.out.println("Number of vowels "+vCount);
		System.out.println("Number of vowels "+cCount);
		*/
		//Sort array
		/*
		int[] a = {2,6,3,9,3};
		Arrays.sort(a);
		String str = Arrays.toString(a);
		System.out.println(str);
		*/
		//Merge array
		/*
		 int[] arr1 = {1, 3, 5};
		 int[] arr2 = {2, 4, 6};
		 int[] merged = new int[arr1.length + arr2.length];
		 System.arraycopy(arr1, 0, merged, 0, arr1.length);
		 System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
		 System.out.println(Arrays.toString(merged));
		*/
		//Duplicate using array
		/*
		int[] a = {1,3,4,3,8,1};
		HashSet<Integer> set = new HashSet<>();
		for(int num:a) {
			set.add(num);
		}
		System.out.println(set);
		*/
		//Count the numbers
		/*
		int num = 123456;
		int count = String.valueOf(num).length();
		System.out.println(count);
		*/
		//Occurrence of characters
		/*
		int count[] = new int[256];
		String s = "ltimindtree";
		for(int i=0;i<=s.length()-1;i++) {
			count[s.charAt(i)]++;
		}
		for(int i=0;i<256;i++) {
			if(count[i]!=0) {
				System.out.println((char)i + "-->" +count[i]);
			}
		}
		*/
		//print prime numbers in range
		/*
		int start = 10;
		int end = 50;
		for(int num=start;num<=end;num++) {
			boolean isPrime = true;
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime&&num>1) {
				System.out.println(num+" ");
			}
		}
		*/
		//find second largest element in array
		/*
		int[] arr = {23,95,63,36,35};
		int l = arr.length;
		Arrays.sort(arr);
		String sort = Arrays.toString(arr);
		System.out.println(sort);
		System.out.println(arr[l-2]);
		*/
		//find sum of digits of number
		/*
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {2,3,6,7};
		HashSet<Integer> set = new HashSet<>();
		for(int num:arr1) {
			set.add(num);
		}
		for(int num:arr2) {
			if(set.contains(num)) {
				System.out.print(num+" ");
			}
		}
		*/
		//Remove duplicate using list
		/*
		List<Integer> a = new ArrayList<>();
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(2);
		a.add(0);
		
		System.out.println(a);
		List<Integer> unique = new ArrayList<>(new HashSet<>(a));
		System.out.println(unique);
		*/
	
		
	}
}
