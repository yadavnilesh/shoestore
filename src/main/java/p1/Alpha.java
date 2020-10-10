//package p1;
//
//import java.util.Scanner;
//
//public class Alpha {
//
//	static void  doprint(int[] a)
//	{
//		for(int i:a)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//
//	}
//
//
//	public static void main(String[] args) {
//		/*
//		 * int[] a= {1,7,90,345,900}; //sort(a,0,a.length-1);
//		 * System.out.println(binary(a,0,a.length-1,0)); doprint(a);
//		 */
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		while(n>0)
//		{
//			int count=0;
//			int len=sc.nextInt();
//			String s=sc.next();
//			for(int i=0;i<len;i++)
//			{
//				if(s.charAt(i)=='1')
//				{
//					count++;
//				}
//			}
//			System.out.println(count*(count+1)/2);
//			n--;
//		}
//		
//	}
//
//	private static int binary(int[] a, int l, int r,int k) {
//		int m=(l+r)/2;
//		if(l>r)
//		{
//		return -1;
//		}
//		if(a[m]==k)
//			return m;
//		else if(k<a[m])
//		{
//			return binary(a,l,m-1,k);
//		}
//		else
//		{
//			return binary(a,m+1,r,k);
//		}
//	}
//
//
//	private static void sort(int[] a, int l, int r) {
//		int m=(l+r)/2;
//		if(l<r)
//		{
//			sort(a,l,m);
//			sort(a,m+1,r);
//			merge(a,l,m,r);
//		}
//	}
//
//	private static void merge(int[] a, int l, int m, int r) {
//
//		int n1=m-l+1;
//		int n2=r-m;
//		int[] L=new int[n1];
//		int[] R=new int[n2];
//		
//		for(int i=0;i<n1;i++)
//		{
//			L[i]=a[l+i];
//		}
//		for(int j=0;j<n2;j++)
//		{
//			R[j]=a[m+1+j];
//		}
//		int i=0,j=0,k=l;
//		while(i<n1&&j<n2)
//		{
//			if(L[i]<=R[j])
//			{
//				a[k]=L[i];
//				i++;
//			}
//			else
//			{
//				a[k]=R[j];
//				j++;
//			}
//			k++;
//		}
//		while(i<n1)
//		{
//			a[k]=L[i];
//			i++;
//			k++;
//		}
//		while(j<n2)
//		{
//			
//			a[k]=R[j];
//			j++;
//			k++;
//		}
//	}
//}
