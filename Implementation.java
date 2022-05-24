package com.StringInbuiltMethods;
import java.util.*;
public class Implementation {
	Scanner scn=new Scanner(System.in);
public static void main(String[] args)  {
	Implementation obj=new Implementation("NITHIS KUMAR");
	System.out.println(obj.charAt(2));
	System.out.println(obj.length());
	System.out.println(obj.toCharArray());
	System.out.println(obj.concat("karthik"));
	System.out.println(obj.isEmpty());
	System.out.println(obj.toLowerCase());
	System.out.println(obj.toUpperCase());
	System.out.println(obj.equals("NITHIS kumar"));
	System.out.println(obj.equalsIgnoreCase("nithis KUMAR"));
	System.out.println(obj.startsWith("NITHIS"));
	System.out.println(obj.endsWith("kumar"));
	System.out.println(obj.compareTo("nithis kumar"));
	System.out.println(obj.compareToIgnoreCase("nithis kumar"));
	System.out.println(obj.substring(1,4));
	System.out.println(obj.trim());
	System.out.println(obj.replace(2,'r'));
	System.out.println(obj.contains("kua"));
}
char ch[];
String str;
public Implementation(String name) {
	this.str=name;
	this.ch=str.toCharArray();
}
public char charAt(int a) {
	int n=str.length();
	for(int i=0;i<n;i++) {
		if(i==a) {
			return ch[i];
		}
	}
	return ' ';
}
public int length() {
	int count=0;
	for(int i=0;i<ch.length;i++) {
		char ch1=ch[i];
		count++;
	}
	return count;
}
public char[] toCharArray() {
	char ch[]=new char[str.length()];
	for(int i=0;i<ch.length;i++) {
		ch[i]=str.charAt(i);
	}
	return ch;
}
public String concat(String str1) {
	String str2=str+str1;
	return str2;
}
public boolean isEmpty() {
	if(str.length()==0) {
		return true;
	}
	return false;
}
public String toLowerCase(){
	String lower="";
	for(int i=0;i<ch.length;i++) {
	if(ch[i]>='A'&&ch[i]<='Z') {
		char ch1=(char)(ch[i]+32);
		lower=lower+ch1;
	}
	else lower+=ch[i];
	}
	return lower;
}	
public String toUpperCase(){
	String Upper="";
	for(int i=0;i<ch.length;i++) {
	if(ch[i]>='a'&&ch[i]<='z') {
		char ch2=(char)(ch[i]-32);
		Upper=Upper+ch2;
	}
	else Upper+=ch[i];	
	}
	return Upper;
}

public boolean equals(String s) {
	if(str==null || s==null){
        return false;
    }
    if(str.length()!=s.length())
        return false;
    for (int i = 0; i <str.length() ; i++) {
        if(str.charAt(i)!=s.charAt(i))
            return false;
    }
    return true;
}
public boolean equalsIgnoreCase(String s2) {
	String arr1=str.toUpperCase();
	String arr2=s2.toUpperCase();
	if(arr1==null || arr2==null){
        return false;
    }
    if(arr1.length()!=arr2.length())
        return false;
    for (int i = 0; i <arr1.length() ; i++) {
        if(arr1.charAt(i)!=arr2.charAt(i))
            return false;
    }
    return true;
}
public boolean startsWith(String substr1) {
	char ch1[]=substr1.toCharArray();
	boolean flag=false;
	for(int i=0;i<substr1.length();i++) {
		if(ch[i]==ch1[i]) {
			flag=true;
		}
		else {
			return false;
		}
	}
	return flag;
}
public boolean endsWith(String substr2) {
	char ch2[]=substr2.toCharArray();
	boolean flag=false;
	int m=ch.length-ch2.length;
	for(int i=m;i<substr2.length()+m;i++) {
		if(ch[i]==ch2[i-m]) {
			flag=true;
		}
		else {
			return false;
		}
	}
	return flag;
}
public int compareTo(String str1) {
	char arr1[]=str1.toCharArray();
	int len1=str.length();
	int len2=str1.length();
	int min=len1>len2?len2:len1;
	for(int i=0;i<min;i++) {
	if(ch[i]<arr1[i]) {
		return -1;
	}
	else if(ch[i]>arr1[i]) {
		return 1;
		}
	}
	if(len1==len2) {
		return 0;
	}
	else
	return len1>len2?1:-1;
}
public int compareToIgnoreCase(String str2){
	char arr1[]=str2.toCharArray();
	String str1=str.toUpperCase();
	String s1=str2.toUpperCase();
	int len1=str.length();
	int len2=str2.length();
	int min=len1>len2?len2:len1;
	for(int i=0;i<min;i++) {
	if(ch[i]<arr1[i]) {
		return -1;
	}
	else if(ch[i]>arr1[i]) {
		return 1;
		}
	}
	if(len1==len2) {
		return 0;
	}
	else
	return len1>len2?1:-1;
}
public String substring(int x,int y) {
	String s="";
	for(int i=x;i<y;i++) {
		s+=String.valueOf(str.charAt(i));
	}
	return s;
}
public String trim() {
	String str1="";
	int c=str.length();
	int start=0,end=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!=' ') {
			start=i;
			break;
		}
	}
	for(int i=ch.length-1;i>=0;i--) {
		if(ch[i]!=' ') {
			end=i;
			break;
		}
	}
	return(str.substring(start,end+1));
}
public String replace(int a,char b){
	String last=str.substring(0,a) + b + str.substring(a+1);
	   return last;
	}
public boolean contains(String str1) {
	char ch1[]=str1.toCharArray();
	boolean flag=false;
	for(int i=0;i<ch.length;i++) {
		for(int j=0;j<ch1.length;j++) {
		ch[i]=ch1[j];
			flag=true;
		}
	}
		return flag;
}
}
